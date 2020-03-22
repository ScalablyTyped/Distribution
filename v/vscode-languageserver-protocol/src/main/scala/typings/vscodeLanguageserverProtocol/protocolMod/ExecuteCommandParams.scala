package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.ProgressToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteCommandParams extends WorkDoneProgressParams {
  /**
    * Arguments that the command should be invoked with.
    */
  var arguments: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The identifier of the actual command handler.
    */
  var command: String
}

object ExecuteCommandParams {
  @scala.inline
  def apply(command: String, arguments: js.Array[_] = null, workDoneToken: ProgressToken = null): ExecuteCommandParams = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (workDoneToken != null) __obj.updateDynamic("workDoneToken")(workDoneToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteCommandParams]
  }
}

