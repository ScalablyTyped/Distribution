package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiGetMatrixValue")
@js.native
object nlapiGetMatrixValue extends js.Object {
  /**
    * Get the value of a matrix header field
    *
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @param {int}    column matrix column index (1-based)
    * @return {string}
    *
    * @since    2009.2
    * @param type
    * @param fldnam
    * @param column
    * @return
    */
  def apply(`type`: String, fldnam: String, column: js.Any): String = js.native
}

