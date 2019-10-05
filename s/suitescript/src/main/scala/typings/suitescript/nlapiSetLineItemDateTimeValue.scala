package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiSetLineItemDateTimeValue")
@js.native
object nlapiSetLineItemDateTimeValue extends js.Object {
  /**
    * Set the value of a sublist field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @param {int}    linenum line number (1-based)
    * @param {string} datetime value
    * @param {string} timezone value
    * @retun {void}
    *
    * @since 2013.2
    * @param type
    * @param fldnam
    * @param linenum
    * @param value
    * @param timezone
    */
  def apply(`type`: String, fldnam: String, linenum: js.Any, value: js.Any, timezone: String): Unit = js.native
}

