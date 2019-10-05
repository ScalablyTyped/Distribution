package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiGetCurrentLineItemMatrixValue")
@js.native
object nlapiGetCurrentLineItemMatrixValue extends js.Object {
  /**
    * Get the current value of a sublist field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @param {int}    column matrix column index (1-based)
    * @return {string} value
    *
    * @since    2009.2
    * @param type
    * @param fldnam
    * @param column
    * @return
    */
  def apply(`type`: String, fldnam: String, column: js.Any): String = js.native
}

