package typings.typescriptDashServices.TypeScriptNs.ServicesNs

import typings.typescriptDashServices.TypeScriptNs.ILogger
import typings.typescriptDashServices.TypeScriptNs.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.CoreServicesShim")
@js.native
class CoreServicesShim protected () extends ShimBase {
  def this(factory: IShimFactory, host: ICoreServicesHost) = this()
  var host: ICoreServicesHost = js.native
  var logger: ILogger = js.native
  var services: CoreServices = js.native
  def dumpMemory(dummy: js.Any): String = js.native
  /* private */ def forwardJSONCall(actionDescription: js.Any, action: js.Any): js.Any = js.native
  def getDefaultCompilationSettings(): String = js.native
  def getMemoryInfo(dummy: js.Any): String = js.native
  def getPreProcessedFileInfo(fileName: String, sourceText: IScriptSnapshot): String = js.native
}

