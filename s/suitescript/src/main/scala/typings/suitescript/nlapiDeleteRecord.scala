package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiDeleteRecord")
@js.native
object nlapiDeleteRecord extends js.Object {
  /**
    * Delete a record from the system.
    * @governance 20 units for transactions, 4 for custom records, 8 for all other records
    *
    * @param {string}    type The record type name.
    * @param {int}    id The internal ID for the record.
    * @return {void}
    *
    * @exception {SSS_INVALID_RECORD_TYPE}
    * @exception {SSS_TYPE_ARG_REQD}
    * @exception {SSS_INVALID_INTERNAL_ID}
    * @exception {SSS_ID_ARG_REQD}
    *
    * @since    2007.0
    * @param type
    * @param id
    * @return
    */
  def apply(`type`: String, id: js.Any): Unit = js.native
}

