package typings.vis.mod

import typings.vis.visStrings.Array
import typings.vis.visStrings.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSelectionOptions[T] extends js.Object {
  /**
    * An array with field names, or an object with current field name
    * and new field name that the field is returned as.
    * By default, all properties of the items are emitted.
    * When fields is defined, only the properties whose name is specified
    * in fields will be included in the returned items.
    */
  var fields: js.UndefOr[js.Array[String] | js.Any] = js.native
  /**
    * Items can be filtered on specific properties by providing a filter function.
    * A filter function is executed for each of the items in the DataSet,
    * and is called with the item as parameter.
    * The function must return a boolean.
    * All items for which the filter function returns true will be emitted.
    * See section Data Filtering.
    */
  var filter: js.UndefOr[js.Function1[/* item */ T, Boolean]] = js.native
  /**
    * Order the items by a field name or custom sort function.
    */
  var order: js.UndefOr[String | (js.Function2[/* a */ T, /* b */ T, Double])] = js.native
  /**
    * Determine the type of output of the get function.
    * Allowed values are 'Array' | 'Object'.
    * The default returnType is an Array.
    * The Object type will return a JSON object with the ID's as keys.
    */
  var returnType: js.UndefOr[Array | Object] = js.native
  /**
    * An object containing field names as key, and data types as value.
    * By default, the type of the properties of an item are left unchanged.
    * When a field type is specified, this field in the items will be converted to the specified type.
    * This can be used for example to convert ISO strings containing a date to a JavaScript Date object,
    * or convert strings to numbers or vice versa. The available data types are listed in section Data Types.
    */
  var `type`: js.UndefOr[js.Any] = js.native
}

object DataSelectionOptions {
  @scala.inline
  def apply[T](): DataSelectionOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSelectionOptions[T]]
  }
  @scala.inline
  implicit class DataSelectionOptionsOps[Self <: DataSelectionOptions[_], T] (val x: Self with DataSelectionOptions[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[String] | js.Any): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setFilter(value: /* item */ T => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setOrderFunction2(value: (/* a */ T, /* b */ T) => Double): Self = this.set("order", js.Any.fromFunction2(value))
    @scala.inline
    def setOrder(value: String | (js.Function2[/* a */ T, /* b */ T, Double])): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setReturnType(value: Array | Object): Self = this.set("returnType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnType: Self = this.set("returnType", js.undefined)
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

