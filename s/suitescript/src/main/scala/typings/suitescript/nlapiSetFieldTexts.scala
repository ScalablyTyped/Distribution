package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiSetFieldTexts")
@js.native
object nlapiSetFieldTexts extends js.Object {
  /**
    * Set the values (via display text) of a multiselect field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @restriction synchronous arg is only supported in client SuiteScript
    *
    * @param {string}        fldnam field name
    * @param {string[]}    texts array of strings containing display values for field
    * @param {boolean}        [firefieldchanged]    if false then the field change event is suppressed (defaults to true)
    * @param {boolean}    [synchronous] if true then sourcing and field change execution happens synchronously (defaults to false).
    * @return {void}
    *
    * @since    2009.1
    * @param fldnam
    * @param texts
    * @param firefieldchanged?
    * @param synchronous?
    * @return
    */
  def apply(fldnam: String, texts: js.Any): js.Any = js.native
  def apply(fldnam: String, texts: js.Any, firefieldchanged: Boolean): js.Any = js.native
  def apply(fldnam: String, texts: js.Any, firefieldchanged: Boolean, synchronous: Boolean): js.Any = js.native
}

