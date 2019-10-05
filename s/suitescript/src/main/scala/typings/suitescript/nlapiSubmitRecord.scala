package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiSubmitRecord")
@js.native
object nlapiSubmitRecord extends js.Object {
  /**
    * Submit a record to the system for creation or update.
    * @governance 20 units for transactions, 4 for custom records, 8 for all other records
    *
    * @param {nlobjRecord} record nlobjRecord object containing the data record.
    * @param {boolean}    [doSourcing] If not set, this argument defaults to false.
    * @param {boolean}    [ignoreMandatoryFields] Disables mandatory field validation for this submit operation.
    * @return {string} internal ID for committed record.
    *
    * @exception {SSS_INVALID_RECORD_OBJ}
    * @exception {SSS_RECORD_OBJ_REQD}
    * @exception {SSS_INVALID_SOURCE_ARG}
    *
    * @since    2007.0
    * @param record
    * @param doSourcing?
    * @param ignoreMandatoryFields?
    * @return
    */
  def apply(record: js.Any): js.Any = js.native
  def apply(record: js.Any, doSourcing: Boolean): js.Any = js.native
  def apply(record: js.Any, doSourcing: Boolean, ignoreMandatoryFields: Boolean): js.Any = js.native
}

