package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteCommandOptions extends js.Object {
  /**
    * The commands to be executed on the server
    */
  var commands: js.Array[java.lang.String]
}

object ExecuteCommandOptions {
  @scala.inline
  def apply(commands: js.Array[java.lang.String]): ExecuteCommandOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("commands")(commands)
    __obj.asInstanceOf[ExecuteCommandOptions]
  }
}

