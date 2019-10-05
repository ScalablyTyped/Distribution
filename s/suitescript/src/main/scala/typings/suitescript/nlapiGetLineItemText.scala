package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiGetLineItemText")
@js.native
object nlapiGetLineItemText extends js.Object {
  /**
    * Return the label of a select field's current selection for a particular line.
    *
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @param {int}    linenum line number (1-based)
    * @return {string}
    *
    * @since 2005.0
    * @param type
    * @param fldnam
    * @param linenum
    * @return
    */
  def apply(`type`: String, fldnam: String, linenum: js.Any): String = js.native
}

