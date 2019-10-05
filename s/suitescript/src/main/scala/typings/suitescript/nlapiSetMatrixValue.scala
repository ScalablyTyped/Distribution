package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiSetMatrixValue")
@js.native
object nlapiSetMatrixValue extends js.Object {
  /**
    * Set the value of a matrix header field
    * @restriction synchronous arg is only supported in client SuiteScript
    *
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @param {int}    column matrix column index (1-based)
    * @param {string}    value field value for matrix field
    * @param {boolean} [firefieldchanged]    if false then the field change event is suppressed (defaults to true)
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

