package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiGetLineItemMatrixValue")
@js.native
object nlapiGetLineItemMatrixValue extends js.Object {
  /**
    * Return the value of a sublist matrix field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @param {int}    linenum line number (1-based)
    * @param {int}    column column index (1-based)
    * @param {string} value
    *
    * @since    2009.2
    * @param type
    * @param fldnam
    * @param linenum
    * @param column
    */
  def apply(`type`: String, fldnam: String, linenum: js.Any, column: js.Any): Unit = js.native
}

