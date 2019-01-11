package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services")
@js.native
object ^ extends js.Object {
  def copyDataObject(dst: js.Any, src: js.Any): js.Any = js.native
  def forwardJSONCall(
    logger: typescriptDashServicesLib.TypeScriptNs.ILogger,
    actionDescription: java.lang.String,
    action: js.Function0[_]
  ): java.lang.String = js.native
  def logInternalError(logger: typescriptDashServicesLib.TypeScriptNs.ILogger, err: stdLib.Error): scala.Unit = js.native
  def simpleForwardCall(
    logger: typescriptDashServicesLib.TypeScriptNs.ILogger,
    actionDescription: java.lang.String,
    action: js.Function0[_]
  ): js.Any = js.native
}

