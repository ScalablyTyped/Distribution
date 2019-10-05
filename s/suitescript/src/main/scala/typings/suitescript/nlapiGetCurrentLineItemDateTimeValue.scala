package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiGetCurrentLineItemDateTimeValue")
@js.native
object nlapiGetCurrentLineItemDateTimeValue extends js.Object {
  /**
    * Return the value of a field on the currently selected line.
    *
    * @param {string} type sublist name
    * @param {string} fldnam sublist field name
    * @param {string} timezone value
    * @return {string}
    *
    * @since 2013.2
    * @param type
    * @param fldnam
    * @param timezone
    * @return
    */
  def apply(`type`: String, fldnam: String, timezone: String): String = js.native
}

