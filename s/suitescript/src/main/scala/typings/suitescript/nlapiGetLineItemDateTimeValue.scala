package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiGetLineItemDateTimeValue")
@js.native
object nlapiGetLineItemDateTimeValue extends js.Object {
  /**
    * Return the value of a sublist field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @param {int}    linenum line number (1-based)
    * @param {string}    timezone value
    * @return {string}
    *
    * @since 2013.2
    * @param type
    * @param fldnam
    * @param linenum
    * @param timezone
    * @return
    */
  def apply(`type`: String, fldnam: String, linenum: js.Any, timezone: String): String = js.native
}

