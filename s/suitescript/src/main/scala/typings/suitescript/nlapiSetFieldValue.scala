package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiSetFieldValue")
@js.native
object nlapiSetFieldValue extends js.Object {
  /**
    * Set the value of a field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @restriction synchronous arg is only supported in client SuiteScript
    *
    * @param {string}    fldnam the field name
    * @param {string}    value value used to set field
    * @param {boolean} [firefieldchanged]    if false then the field change event is suppressed (defaults to true)
    * @param {boolean} [synchronous] if true then sourcing and field change execution happens synchronously (defaults to false).
    * @return {void}
    *
    * @since    2005.0
    * @param fldnam
    * @param value
    * @param firefieldchanged?
    * @param synchronous?
    * @return
    */
  def apply(fldnam: String, value: String): js.Any = js.native
  def apply(fldnam: String, value: String, firefieldchanged: Boolean): js.Any = js.native
  def apply(fldnam: String, value: String, firefieldchanged: Boolean, synchronous: Boolean): js.Any = js.native
}

