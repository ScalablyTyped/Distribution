package typings.typescriptDashServices.TypeScriptNs.ServicesNs

import typings.std.Error
import typings.typescriptDashServices.TypeScriptNs.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services")
@js.native
object ^ extends js.Object {
  def copyDataObject(dst: js.Any, src: js.Any): js.Any = js.native
  def forwardJSONCall(logger: ILogger, actionDescription: String, action: js.Function0[_]): String = js.native
  def logInternalError(logger: ILogger, err: Error): Unit = js.native
  def simpleForwardCall(logger: ILogger, actionDescription: String, action: js.Function0[_]): js.Any = js.native
}

