package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiGetFieldTexts")
@js.native
object nlapiGetFieldTexts extends js.Object {
  /**
    * Return the values (via display text) of a multiselect field on the current record.
    * @restriction supported in client and user event scripts only.
    * @param {string} fldnam field name
    * @return {string[]}
    *
    * @since    2009.1
    * @param fldnam
    */
  def apply(fldnam: String): Unit = js.native
}

