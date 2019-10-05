package typings.tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GM_saveTab")
@js.native
object GM_saveTab extends js.Object {
  // Tabs
  /** Saves the tab object to reopen it after a page unload */
  def apply(obj: js.Object): Unit = js.native
}

