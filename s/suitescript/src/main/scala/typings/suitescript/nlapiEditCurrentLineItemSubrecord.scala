package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiEditCurrentLineItemSubrecord")
@js.native
object nlapiEditCurrentLineItemSubrecord extends js.Object {
  /**
    * edit a subrecord on a sublist field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @retun {nlobjSubrecord}
    *
    * @since 2011.2
    * @param type
    * @param fldnam
    */
  def apply(`type`: String, fldnam: String): Unit = js.native
}

