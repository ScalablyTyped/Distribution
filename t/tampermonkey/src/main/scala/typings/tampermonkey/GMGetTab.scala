package typings.tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GM_getTab")
@js.native
object GMGetTab extends js.Object {
  /** Gets a object that is persistent as long as this tab is open */
  def apply(callback: js.Function1[/* obj */ js.Any, Unit]): Unit = js.native
}

