package typings.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "CompileResult")
@js.native
class CompileResult ()
  extends typings.typescriptServices.TypeScript.CompileResult
/* static members */
@JSImport("typescript-services", "CompileResult")
@js.native
object CompileResult extends js.Object {
  
  def fromDiagnostics(diagnostics: js.Array[typings.typescriptServices.TypeScript.Diagnostic]): typings.typescriptServices.TypeScript.CompileResult = js.native
  
  def fromOutputFiles(outputFiles: js.Array[typings.typescriptServices.TypeScript.OutputFile]): typings.typescriptServices.TypeScript.CompileResult = js.native
}
