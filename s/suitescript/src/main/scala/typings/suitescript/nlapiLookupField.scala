package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiLookupField")
@js.native
object nlapiLookupField extends js.Object {
  /**
    * Fetch the value of one or more fields on a record. This API uses search to look up the fields and is much
    * faster than loading the record in order to get the field.
    * @governance 10 units for transactions, 2 for custom records, 4 for all other records
    *
    * @param {string}    type The record type name.
    * @param {int}    id The internal ID for the record.
    * @param {string, string[]} fields - field or fields to look up.
    * @param {boolean} [text] If set then the display value is returned instead for select fields.
    * @return {string, Object} single value or an Object of field name/value pairs depending on the fields argument.
    *
    * @since    2008.1
    * @param type
    * @param id
    * @param fields
    * @param text?
    */
  def apply(`type`: String, id: Double, fields: String): String = js.native
  def apply(`type`: String, id: Double, fields: String, text: Boolean): String = js.native
  def apply(`type`: String, id: Double, fields: js.Array[String]): js.Any = js.native
  def apply(`type`: String, id: Double, fields: js.Array[String], text: Boolean): js.Any = js.native
}

