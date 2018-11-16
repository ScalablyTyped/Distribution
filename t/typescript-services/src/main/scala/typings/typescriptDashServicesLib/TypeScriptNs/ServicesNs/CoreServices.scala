package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.CoreServices")
@js.native
class CoreServices protected () extends js.Object {
  def this(host: ICoreServicesHost) = this()
  var host: ICoreServicesHost = js.native
  def collectGarbage(): scala.Unit = js.native
  def dumpMemory(): java.lang.String = js.native
  def getDefaultCompilationSettings(): typescriptDashServicesLib.TypeScriptNs.CompilationSettings = js.native
  def getMemoryInfo(): js.Array[_] = js.native
  def getPreProcessedFileInfo(fileName: java.lang.String, sourceText: typescriptDashServicesLib.TypeScriptNs.IScriptSnapshot): typescriptDashServicesLib.TypeScriptNs.IPreProcessedFileInfo = js.native
}

