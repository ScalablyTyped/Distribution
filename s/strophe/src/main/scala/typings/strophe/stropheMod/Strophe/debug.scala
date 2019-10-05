package typings.strophe.stropheMod.Strophe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("strophe", "Strophe.debug")
@js.native
object debug extends js.Object {
  /** Functions: debug, info, warn, error
    *  Log a message at the appropriate Strophe.LogLevel
    *
    *  Parameters:
    *    (String) msg - The log message.
    */
  def apply(msg: String): Unit = js.native
}

