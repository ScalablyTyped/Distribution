package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiSetLineItemDisabled")
@js.native
object nlapiSetLineItemDisabled extends js.Object {
  /**
    * Disable a sublist field.
    * @restriction Only supported on sublists of type inlineeditor, editor and list (current field only)
    *
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @param {boolean} disable if true then field is disabled
    * @param {int} linenum line number for sublist field (1-based) and only valid for sublists of type list
    * @return {void}
    *
    * @since 2009.1
    * @param type
    * @param fldnam
    * @param disable
    * @param linenum
    * @return
    */
  def apply(`type`: String, fldnam: String, disable: Boolean, linenum: js.Any): js.Any = js.native
}

