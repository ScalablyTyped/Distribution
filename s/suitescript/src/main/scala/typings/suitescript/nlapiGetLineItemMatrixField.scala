package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiGetLineItemMatrixField")
@js.native
object nlapiGetLineItemMatrixField extends js.Object {
  /**
    * Return an nlobjField containing sublist field metadata.
    *
    * @param {string}    type    matrix sublist name
    * @param {string}    fldnam matrix field name
    * @param {int}    linenum line number (1-based)
    * @param {int}    column matrix column index (1-based)
    * @return {nlobjField}
    *
    * @since    2009.2
    * @param type
    * @param fldnam
    * @param linenum
    * @param column
    * @return
    */
  def apply(`type`: String, fldnam: String, linenum: js.Any, column: js.Any): js.Any = js.native
}

