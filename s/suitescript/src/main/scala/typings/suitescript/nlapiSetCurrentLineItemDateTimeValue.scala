package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiSetCurrentLineItemDateTimeValue")
@js.native
object nlapiSetCurrentLineItemDateTimeValue extends js.Object {
  /**
    * Set the value of a field on the currently selected line.
    * @restriction synchronous arg is only supported in client SuiteScript
    *
    * @param {string} type sublist name
    * @param {string} fldnam sublist field name
    * @param {string} value field value
    * @param {string} timezone value
    * @return {void}
    *
    * @since 2013.2
    * @param type
    * @param fldnam
    * @param value
    * @param timezone
    * @return
    */
  def apply(`type`: String, fldnam: String, value: String, timezone: String): js.Any = js.native
}

