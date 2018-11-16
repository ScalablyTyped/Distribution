package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "CompileResult")
@js.native
class CompileResult ()
  extends typescriptDashServicesLib.TypeScriptNs.CompileResult

@JSImport("typescript-services", "CompileResult")
@js.native
object CompileResult extends js.Object {
  def fromDiagnostics(diagnostics: js.Array[typescriptDashServicesLib.TypeScriptNs.Diagnostic]): typescriptDashServicesLib.TypeScriptNs.CompileResult = js.native
  def fromOutputFiles(outputFiles: js.Array[typescriptDashServicesLib.TypeScriptNs.OutputFile]): typescriptDashServicesLib.TypeScriptNs.CompileResult = js.native
}

