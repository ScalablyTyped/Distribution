package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiSetCurrentLineItemValue")
@js.native
object nlapiSetCurrentLineItemValue extends js.Object {
  /**
    * Set the value of a field on the currently selected line.
    * @restriction synchronous arg is only supported in client SuiteScript
    *
    * @param {string} type sublist name
    * @param {string} fldnam sublist field name
    * @param {string} value field value
    * @param {boolean} [firefieldchanged]    if false then the field change event is suppressed (defaults to true)
    * @param {boolean} [synchronous] if true then sourcing and field change execution happens synchronously (defaults to false).
    * @return {void}
    *
    * @since 2005.0
    * @param type
    * @param fldnam
    * @param value
    * @param firefieldchanged?
    * @param synchronous?
    * @return
    */
  def apply(`type`: String, fldnam: String, value: String): Unit = js.native
  def apply(`type`: String, fldnam: String, value: String, firefieldchanged: Boolean): Unit = js.native
  def apply(`type`: String, fldnam: String, value: String, firefieldchanged: Boolean, synchronous: Boolean): Unit = js.native
  def apply(`type`: String, fldnam: String, value: Double): Unit = js.native
  def apply(`type`: String, fldnam: String, value: Double, firefieldchanged: Boolean): Unit = js.native
  def apply(`type`: String, fldnam: String, value: Double, firefieldchanged: Boolean, synchronous: Boolean): Unit = js.native
}

