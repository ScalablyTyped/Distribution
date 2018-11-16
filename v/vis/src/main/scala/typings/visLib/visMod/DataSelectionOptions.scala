package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DataSelectionOptions[T] extends js.Object {
  /**
     * An array with field names, or an object with current field name
     * and new field name that the field is returned as.
     * By default, all properties of the items are emitted.
     * When fields is defined, only the properties whose name is specified
     * in fields will be included in the returned items.
     */
  var fields: js.UndefOr[js.Array[java.lang.String] | js.Any] = js.undefined
  /**
     * Items can be filtered on specific properties by providing a filter function.
     * A filter function is executed for each of the items in the DataSet,
     * and is called with the item as parameter.
     * The function must return a boolean.
     * All items for which the filter function returns true will be emitted.
     * See section Data Filtering.
     */
  var filter: js.UndefOr[js.Function1[/* item */ T, scala.Boolean]] = js.undefined
  /**
     * Order the items by a field name or custom sort function.
     */
  var order: js.UndefOr[java.lang.String | js.Any] = js.undefined
  /**
     * Determine the type of output of the get function.
     * Allowed values are 'Array' | 'Object'.
     * The default returnType is an Array.
     * The Object type will return a JSON object with the ID's as keys.
     */
  var returnType: js.UndefOr[java.lang.String] = js.undefined
  /**
     * An object containing field names as key, and data types as value.
     * By default, the type of the properties of an item are left unchanged.
     * When a field type is specified, this field in the items will be converted to the specified type.
     * This can be used for example to convert ISO strings containing a date to a JavaScript Date object,
     * or convert strings to numbers or vice versa. The available data types are listed in section Data Types.
     */
  var `type`: js.UndefOr[js.Any] = js.undefined
}

