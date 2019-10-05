package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiRemoveLineItemOption")
@js.native
object nlapiRemoveLineItemOption extends js.Object {
  /**
    * Removes a select option (or all if value is null) from a scripted select or multiselect sublist field.
    * @restriction Client SuiteScript only
    *
    * @param {string} type    sublist name
    * @param {string} fldnam sublist field name
    * @param {string} value internal ID for select option to remove
    * @return {void}
    *
    * @since 2008.2
    * @param type
    * @param fldnam
    * @param value
    * @return
    */
  def apply(`type`: String, fldnam: String, value: String): js.Any = js.native
}

