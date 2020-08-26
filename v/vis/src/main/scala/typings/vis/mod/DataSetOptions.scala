package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSetOptions extends DataSetQueueOptions {
  /**
    * The name of the field containing the id of the items.
    * When data is fetched from a server which uses some specific field to identify items,
    * this field name can be specified in the DataSet using the option fieldId.
    * For example CouchDB uses the field "_id" to identify documents.
    */
  var fieldId: js.UndefOr[String] = js.native
  /**
    * An object containing field names as key, and data types as value.
    * By default, the type of the properties of items are left unchanged.
    * Item properties can be normalized by specifying a field type.
    * This is useful for example to automatically convert stringified dates coming
    * from a server into JavaScript Date objects.
    * The available data types are listed in section Data Types.
    */
  var `type`: js.UndefOr[js.Any] = js.native
}

object DataSetOptions {
  @scala.inline
  def apply(): DataSetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSetOptions]
  }
  @scala.inline
  implicit class DataSetOptionsOps[Self <: DataSetOptions] (val x: Self) extends AnyVal {
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
    def setFieldId(value: String): Self = this.set("fieldId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldId: Self = this.set("fieldId", js.undefined)
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

