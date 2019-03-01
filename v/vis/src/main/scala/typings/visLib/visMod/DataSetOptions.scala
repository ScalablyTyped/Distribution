package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSetOptions extends DataSetQueueOptions {
  /**
    * The name of the field containing the id of the items.
    * When data is fetched from a server which uses some specific field to identify items,
    * this field name can be specified in the DataSet using the option fieldId.
    * For example CouchDB uses the field "_id" to identify documents.
    */
  var fieldId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An object containing field names as key, and data types as value.
    * By default, the type of the properties of items are left unchanged.
    * Item properties can be normalized by specifying a field type.
    * This is useful for example to automatically convert stringified dates coming
    * from a server into JavaScript Date objects.
    * The available data types are listed in section Data Types.
    */
  var `type`: js.UndefOr[js.Any] = js.undefined
}

object DataSetOptions {
  @scala.inline
  def apply(fieldId: java.lang.String = null, queue: js.Any | scala.Boolean = null, `type`: js.Any = null): DataSetOptions = {
    val __obj = js.Dynamic.literal()
    if (fieldId != null) __obj.updateDynamic("fieldId")(fieldId)
    if (queue != null) __obj.updateDynamic("queue")(queue.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DataSetOptions]
  }
}

