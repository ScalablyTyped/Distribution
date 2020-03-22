package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteCommandOptions extends WorkDoneProgressOptions {
  /**
    * The commands to be executed on the server
    */
  var commands: js.Array[String]
}

object ExecuteCommandOptions {
  @scala.inline
  def apply(commands: js.Array[String], workDoneProgress: js.UndefOr[Boolean] = js.undefined): ExecuteCommandOptions = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
    if (!js.isUndefined(workDoneProgress)) __obj.updateDynamic("workDoneProgress")(workDoneProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteCommandOptions]
  }
}

