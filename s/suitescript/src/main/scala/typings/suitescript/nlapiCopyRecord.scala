package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiCopyRecord")
@js.native
object nlapiCopyRecord extends js.Object {
  /**
    * Return a new record using values from an existing record.
    * @governance 10 units for transactions, 2 for custom records, 4 for all other records
    *
    * @param {string}    type The record type name.
    * @param {int}    id The internal ID for the record.
    * @param {Object}    initializeValues Contains an array of name/value pairs of defaults to be used during record initialization.
    * @return {nlobjRecord}  Returns an nlobjRecord object of a copied record.
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

