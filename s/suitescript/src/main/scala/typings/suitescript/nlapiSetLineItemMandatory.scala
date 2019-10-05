package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiSetLineItemMandatory")
@js.native
object nlapiSetLineItemMandatory extends js.Object {
  /**
    * Make a sublist field mandatory.
    * @restriction Only supported on sublists of type inlineeditor or editor (current field only)
    *
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @param {boolean} mandatory if true then field is made mandatory
    * @return {void}
    *
    * @since 2009.2
    * @param type
    * @param fldnam
    * @param mandatory
    * @return
    */
  def apply(`type`: String, fldnam: String, mandatory: Boolean): js.Any = js.native
}

