package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiInsertSelectOption")
@js.native
object nlapiInsertSelectOption extends js.Object {
  /**
    * Adds a select option to a scripted select or multiselect field.
    * @restriction Client SuiteScript only
    *
    * @param {string} fldnam field name
    * @param {string} value internal ID for select option
    * @param {string} text display text for select option
    * @param {boolean} [selected] if true then option will be selected by default
    * @return {void}
    *
    * @since 2008.2
    * @param fldnam
    * @param value
    * @param text
    * @param selected?
    * @return
    */
  def apply(fldnam: String, value: String, text: String): js.Any = js.native
  def apply(fldnam: String, value: String, text: String, selected: Boolean): js.Any = js.native
}

