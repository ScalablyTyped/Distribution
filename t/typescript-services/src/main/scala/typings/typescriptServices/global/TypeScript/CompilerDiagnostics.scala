package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.CompilerDiagnostics.IDiagnosticWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.CompilerDiagnostics")
@js.native
object CompilerDiagnostics extends js.Object {
  
  def Alert(output: String): Unit = js.native
  
  var analysisPass: Double = js.native
  
  def assert(condition: Boolean, s: String): Unit = js.native
  
  var debug: Boolean = js.native
  
  def debugPrint(s: String): Unit = js.native
  
  var diagnosticWriter: IDiagnosticWriter = js.native
}
