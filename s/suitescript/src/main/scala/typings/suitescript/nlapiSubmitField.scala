package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiSubmitField")
@js.native
object nlapiSubmitField extends js.Object {
  /**
    * Submit the values of a field or set of fields for an existing record.
    * @governance 10 units for transactions, 2 for custom records, 4 for all other records
    * @restriction only supported for records and fields where DLE (Direct List Editing) is supported
    *
    * @param {string}        type The record type name.
    * @param {int}        id The internal ID for the record.
    * @param {string, string[]} fields field or fields being updated.
    * @param {string, string[]} values field value or field values used for updating.
    * @param {boolean}    [doSourcing] If not set, this argument defaults to false and field sourcing does not occur.
    * @return {void}
    *
    * @since    2008.1
    * @param type
    * @param id
    * @param fields
    * @param values
    * @param doSourcing?
    * @return
    */
  def apply(`type`: String, id: js.Any, fields: js.Any, values: js.Any): Unit = js.native
  def apply(`type`: String, id: js.Any, fields: js.Any, values: js.Any, doSourcing: Boolean): Unit = js.native
}

