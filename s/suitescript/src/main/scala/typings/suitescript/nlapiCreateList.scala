package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiCreateList")
@js.native
object nlapiCreateList extends js.Object {
  /**
    * Return a new list page.
    * @restriction Suitelets only
    *
    * @param {string}    title page title
    * @param {boolean} [hideHeader] true to hide the page header (false by default)
    * @return {nlobjList}
    *
    * @since 2008.2
    * @param title
    * @param hideHeader?
    * @return
    */
  def apply(title: String): js.Any = js.native
  def apply(title: String, hideHeader: Boolean): js.Any = js.native
}

