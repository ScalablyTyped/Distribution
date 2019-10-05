package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiTransformRecord")
@js.native
object nlapiTransformRecord extends js.Object {
  /**
    * Create a new record using values from an existing record of a different type.
    * @governance 10 units for transactions, 2 for custom records, 4 for all other records
    *
    * @param {string}    type The record type name.
    * @param {int}    id The internal ID for the record.
    * @param {string}    transformType The recordType you are transforming the existing record into.
    * @param {Object}    [transformValues] An object containing transform default option/value pairs used to pre-configure transformed record
    * @return {nlobjRecord}
    *
    * @exception {SSS_INVALID_URL_CATEGORY}
    * @exception {SSS_CATEGORY_ARG_REQD}
    * @exception {SSS_INVALID_TASK_ID}
    * @exception {SSS_TASK_ID_REQD}
    * @exception {SSS_INVALID_INTERNAL_ID}
    * @exception {SSS_INVALID_EDITMODE_ARG}
    *
    * @since    2007.0
    * @param type
    * @param id
    * @param transformType
    * @param transformValues?
    * @return
    */
  def apply(`type`: String, id: js.Any, transformType: String): nlobjRecord = js.native
  def apply(`type`: String, id: js.Any, transformType: String, transformValues: js.Any): nlobjRecord = js.native
}

