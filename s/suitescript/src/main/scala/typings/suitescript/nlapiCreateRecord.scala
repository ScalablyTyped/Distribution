package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiCreateRecord")
@js.native
object nlapiCreateRecord extends js.Object {
  /**
    * Instantiate a new nlobjRecord object containing all the default field data for that record type.
    * @governance 10 units for transactions, 2 for custom records, 4 for all other records
    *
    * @param {string} type record type ID.
    * @param {Object} initializeValues Contains an array of name/value pairs of defaults to be used during record initialization.
    * @return {nlobjRecord}   Returns an nlobjRecord object of a new record from the system.
    *
    * @exception {SSS_INVALID_RECORD_TYPE}
    * @exception {SSS_TYPE_ARG_REQD}
    *
    * @since    2007.0
    * @param type
    * @param initializeValues
    * @return
    */
  def apply(`type`: String): nlobjRecord = js.native
  def apply(`type`: String, initializeValues: js.Any): nlobjRecord = js.native
}

