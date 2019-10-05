package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiGetLineItemField")
@js.native
object nlapiGetLineItemField extends js.Object {
  /**
    * Return field definition for a sublist field.
    *
    * @param {string}    type    sublist name
    * @param {string}    fldnam sublist field name
    * @param {int}    [linenum] line number for sublist field (1-based) and only valid for sublists of type staticlist and list
    * @return {nlobjField}
    *
    * @since    2009.1
    * @param type
    * @param fldnam
    * @param linenum?
    * @return
    */
  def apply(`type`: String, fldnam: String): js.Any = js.native
  def apply(`type`: String, fldnam: String, linenum: js.Any): js.Any = js.native
}

