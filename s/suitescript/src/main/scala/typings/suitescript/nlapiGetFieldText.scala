package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiGetFieldText")
@js.native
object nlapiGetFieldText extends js.Object {
  /**
    * Return the display value of a select field's current selection on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string} fldnam the field name
    * @return {string}
    *
    * @since    2005.0
    * @param fldnam
    * @return
    */
  def apply(fldnam: String): String = js.native
}

