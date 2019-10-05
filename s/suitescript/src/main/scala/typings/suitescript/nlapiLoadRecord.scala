package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiLoadRecord")
@js.native
object nlapiLoadRecord extends js.Object {
  /**
    * Load an existing record from the system.
    * @governance 10 units for transactions, 2 for custom records, 4 for all other records
    *
    * @param {string}    type The record type name.
    * @param {int}    id The internal ID for the record.
    * @param {Object}    initializeValues Contains an array of name/value pairs of defaults to be used during record initialization.
    * @return {nlobjRecord}  Returns an nlobjRecord object of an existing NetSuite record.
    *
    * @exception {SSS_INVALID_RECORD_TYPE}
    * @exception {SSS_TYPE_ARG_REQD}
    * @exception {SSS_INVALID_INTERNAL_ID}
    * @exception {SSS_ID_ARG_REQD}
    *
    * @since    2007.0
    * @param type
    * @param id
    * @param initializeValues
    * @return
    */
  def apply(`type`: String, id: js.Any): nlobjRecord = js.native
  def apply(`type`: String, id: js.Any, initializeValues: js.Any): nlobjRecord = js.native
}

