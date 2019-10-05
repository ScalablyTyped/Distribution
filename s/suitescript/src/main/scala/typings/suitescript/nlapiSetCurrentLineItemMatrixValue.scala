package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiSetCurrentLineItemMatrixValue")
@js.native
object nlapiSetCurrentLineItemMatrixValue extends js.Object {
  /**
    * Set the current value of a sublist field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @restriction synchronous arg is only supported in Client SuiteScript
    *
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @param {int}    column matrix column index (1-based)
    * @param {string}    value matrix field value
    * @param {boolean} [firefieldchanged] if false then the field change event is suppressed (defaults to true)
    * @param {boolean} [synchronous] if true then sourcing and field change execution happens synchronously (defaults to false).
    * @return {void}
    *
    * @since    2009.2
    * @param type
    * @param fldnam
    * @param column
    * @param value
    * @param firefieldchanged?
    * @param synchronous?
    * @return
    */
  def apply(`type`: String, fldnam: String, column: js.Any, value: String): js.Any = js.native
  def apply(`type`: String, fldnam: String, column: js.Any, value: String, firefieldchanged: Boolean): js.Any = js.native
  def apply(
    `type`: String,
    fldnam: String,
    column: js.Any,
    value: String,
    firefieldchanged: Boolean,
    synchronous: Boolean
  ): js.Any = js.native
}

