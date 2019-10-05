package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiCreateForm")
@js.native
object nlapiCreateForm extends js.Object {
  /**
    * Return a new entry form page.
    * @restriction Suitelets only
    *
    * @param {string}    title page title
    * @param {boolean} [hideHeader] true to hide the page header (false by default)
    * @return {nlobjForm}
    *
    * @since 2008.2
    * @param title
    * @param hideHeader?
    * @return
    */
  def apply(title: String): nlobjForm = js.native
  def apply(title: String, hideHeader: Boolean): nlobjForm = js.native
}

