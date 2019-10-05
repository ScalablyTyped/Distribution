package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiFindLineItemMatrixValue")
@js.native
object nlapiFindLineItemMatrixValue extends js.Object {
  /**
    * Return the 1st line number that a matrix field value appears in
    *
    * @param {string}    type sublist name
    * @param {string}    fldnam matrix field name
    * @param {int}    column matrix column index (1-based)
    * @param {string}    val the value being queried for in a matrix field
    * @return {int}
    *
    * @since 2009.2
    * @param type
    * @param fldnam
    * @param column
    * @param val
    * @return
    */
  def apply(`type`: String, fldnam: String, column: js.Any, `val`: String): js.Any = js.native
}

