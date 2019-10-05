package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiRefreshLineItems")
@js.native
object nlapiRefreshLineItems extends js.Object {
  /**
    * Refresh the sublist table.
    * @restriction Only supported for sublists of type inlineeditor, editor, and staticlist
    * @restriction Client SuiteScript only.
    *
    * @param {string} type sublist name
    * @return{void}
    *
    * @since 2005.0
    * @param type
    */
  def apply(`type`: String): Unit = js.native
}

