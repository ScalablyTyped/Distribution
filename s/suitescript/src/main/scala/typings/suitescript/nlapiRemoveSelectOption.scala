package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiRemoveSelectOption")
@js.native
object nlapiRemoveSelectOption extends js.Object {
  /**
    * Removes a select option (or all if value is null) from a scripted select or multiselect field.
    * @restriction Client SuiteScript only
    *
    * @param {string} fldnam field name
    * @param {string} value internal ID of select option to remove
    * @return {void}
    *
    * @since 2008.2
    * @param fldnam
    * @param value
    * @return
    */
  def apply(fldnam: String, value: String): js.Any = js.native
}

