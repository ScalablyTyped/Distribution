package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiGetLineItemMandatory")
@js.native
object nlapiGetLineItemMandatory extends js.Object {
  /**
    * Return sublist field mandatoriness.
    * @restriction Only supported on sublists of type inlineeditor or editor (current field only)
    *
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @return {boolean}
    *
    * @since 2009.1
    * @param type
    * @param fldnam
    * @return
    */
  def apply(`type`: String, fldnam: String): Boolean = js.native
}

