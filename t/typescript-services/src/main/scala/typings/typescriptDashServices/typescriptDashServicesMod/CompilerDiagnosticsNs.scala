package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.CompilerDiagnosticsNs.IDiagnosticWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "CompilerDiagnostics")
@js.native
object CompilerDiagnosticsNs extends js.Object {
  var analysisPass: Double = js.native
  var debug: Boolean = js.native
  var diagnosticWriter: IDiagnosticWriter = js.native
  def Alert(output: String): Unit = js.native
  def assert(condition: Boolean, s: String): Unit = js.native
  def debugPrint(s: String): Unit = js.native
}

