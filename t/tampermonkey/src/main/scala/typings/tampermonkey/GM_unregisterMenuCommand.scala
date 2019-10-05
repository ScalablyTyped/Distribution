package typings.tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GM_unregisterMenuCommand")
@js.native
object GM_unregisterMenuCommand extends js.Object {
  /**
    *  Unregister a menu command that was previously registered by
    * `GM_registerMenuCommand` with the given menu command ID.
    */
  def apply(menuCommandId: Double): Unit = js.native
}

