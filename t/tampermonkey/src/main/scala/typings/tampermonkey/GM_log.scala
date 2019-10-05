package typings.tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GM_log")
@js.native
object GM_log extends js.Object {
  // Utils
  /** Log a message to the console */
  def apply(message: js.Any*): Unit = js.native
}

