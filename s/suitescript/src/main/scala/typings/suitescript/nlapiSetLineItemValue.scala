package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiSetLineItemValue")
@js.native
object nlapiSetLineItemValue extends js.Object {
  /**
    * Set the value of a sublist field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @param {int}    linenum line number (1-based)
    * @param {string} value
    * @retun {void}
    *
    * @since 2005.0
    * @param type
    * @param fldnam
    * @param linenum
    * @param value
    */
  def apply(`type`: String, fldnam: String, linenum: js.Any, value: String): Unit = js.native
  def apply(`type`: String, fldnam: String, linenum: js.Any, value: Double): Unit = js.native
}

