package typings.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "CompileResult")
@js.native
class CompileResult ()
  extends typings.typescriptServices.TypeScript.CompileResult
object CompileResult {
  
  /* static member */
  @JSImport("typescript-services", "CompileResult.fromDiagnostics")
  @js.native
  def fromDiagnostics(diagnostics: js.Array[typings.typescriptServices.TypeScript.Diagnostic]): typings.typescriptServices.TypeScript.CompileResult = js.native
  
  /* static member */
  @JSImport("typescript-services", "CompileResult.fromOutputFiles")
  @js.native
  def fromOutputFiles(outputFiles: js.Array[typings.typescriptServices.TypeScript.OutputFile]): typings.typescriptServices.TypeScript.CompileResult = js.native
}
