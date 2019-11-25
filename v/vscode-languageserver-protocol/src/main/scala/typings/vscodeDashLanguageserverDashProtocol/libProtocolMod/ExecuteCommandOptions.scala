package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteCommandOptions extends js.Object {
  /**
    * The commands to be executed on the server
    */
  var commands: js.Array[String]
}

object ExecuteCommandOptions {
  @scala.inline
  def apply(commands: js.Array[String]): ExecuteCommandOptions = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExecuteCommandOptions]
  }
}

