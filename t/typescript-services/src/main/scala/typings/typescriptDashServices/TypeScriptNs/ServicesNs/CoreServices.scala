package typings.typescriptDashServices.TypeScriptNs.ServicesNs

import typings.typescriptDashServices.TypeScriptNs.CompilationSettings
import typings.typescriptDashServices.TypeScriptNs.IPreProcessedFileInfo
import typings.typescriptDashServices.TypeScriptNs.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.CoreServices")
@js.native
class CoreServices protected () extends js.Object {
  def this(host: ICoreServicesHost) = this()
  var host: ICoreServicesHost = js.native
  def collectGarbage(): Unit = js.native
  def dumpMemory(): String = js.native
  def getDefaultCompilationSettings(): CompilationSettings = js.native
  def getMemoryInfo(): js.Array[_] = js.native
  def getPreProcessedFileInfo(fileName: String, sourceText: IScriptSnapshot): IPreProcessedFileInfo = js.native
}

