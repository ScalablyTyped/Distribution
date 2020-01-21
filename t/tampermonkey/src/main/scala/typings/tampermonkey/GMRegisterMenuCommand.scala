package typings.tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GM_registerMenuCommand")
@js.native
object GMRegisterMenuCommand extends js.Object {
  // Menu commands
  /**
    * Register a menu to be displayed at the Tampermonkey menu at pages where this
    * script runs and returns a menu command ID.
    */
  def apply(name: String, onClick: js.Function0[Unit]): Double = js.native
  def apply(name: String, onClick: js.Function0[Unit], accessKey: String): Double = js.native
}

