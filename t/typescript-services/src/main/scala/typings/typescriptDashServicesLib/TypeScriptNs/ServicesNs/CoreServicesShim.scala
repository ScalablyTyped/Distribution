package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.CoreServicesShim")
@js.native
class CoreServicesShim protected () extends ShimBase {
  def this(factory: IShimFactory, host: ICoreServicesHost) = this()
  var host: ICoreServicesHost = js.native
  var logger: typescriptDashServicesLib.TypeScriptNs.ILogger = js.native
  var services: CoreServices = js.native
  def dumpMemory(dummy: js.Any): java.lang.String = js.native
  /* private */ def forwardJSONCall(actionDescription: js.Any, action: js.Any): js.Any = js.native
  def getDefaultCompilationSettings(): java.lang.String = js.native
  def getMemoryInfo(dummy: js.Any): java.lang.String = js.native
  def getPreProcessedFileInfo(fileName: java.lang.String, sourceText: typescriptDashServicesLib.TypeScriptNs.IScriptSnapshot): java.lang.String = js.native
}

