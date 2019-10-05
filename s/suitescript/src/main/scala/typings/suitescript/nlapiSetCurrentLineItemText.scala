package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiSetCurrentLineItemText")
@js.native
object nlapiSetCurrentLineItemText extends js.Object {
  /**
    * Set the value of a field on the currently selected line using it's label.
    * @restriction synchronous arg is only supported in client SuiteScript
    *
    * @param {string} type sublist name
    * @param {string} fldnam sublist field name
    * @param {string} txt string containing display value or search text.
    * @param {boolean} [firefieldchanged]    if false then the field change event is suppressed (defaults to true)
    * @param {boolean} [synchronous] if true then sourcing and field change execution happens synchronously (defaults to false).
    * @return {void}
    *
    * @since 2005.0
    * @param type
    * @param fldnam
    * @param txt
    * @param firefieldchanged?
    * @param synchronous?
    * @return
    */
  def apply(`type`: String, fldnam: String, txt: String): js.Any = js.native
  def apply(`type`: String, fldnam: String, txt: String, firefieldchanged: Boolean): js.Any = js.native
  def apply(`type`: String, fldnam: String, txt: String, firefieldchanged: Boolean, synchronous: Boolean): js.Any = js.native
}

