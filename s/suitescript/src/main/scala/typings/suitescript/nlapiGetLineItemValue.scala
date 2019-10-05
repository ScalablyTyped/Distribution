package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiGetLineItemValue")
@js.native
object nlapiGetLineItemValue extends js.Object {
  /**
    * Return the value of a sublist field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @param {int}    linenum line number (1-based)
    * @return {string}
    *
    * @since 2005.0
    * @param type
    * @param fldnam
    * @param linenum
    * @return
    */
  def apply(`type`: String, fldnam: String, linenum: js.Any): String = js.native
}

