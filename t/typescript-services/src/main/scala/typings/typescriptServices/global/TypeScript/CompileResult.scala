package typings.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.CompileResult")
@js.native
class CompileResult ()
  extends StObject
     with typings.typescriptServices.TypeScript.CompileResult {
  
  /* CompleteClass */
  var diagnostics: js.Array[typings.typescriptServices.TypeScript.Diagnostic] = js.native
  
  /* CompleteClass */
  var outputFiles: js.Array[typings.typescriptServices.TypeScript.OutputFile] = js.native
}
object CompileResult {
  
  @JSGlobal("TypeScript.CompileResult")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromDiagnostics(diagnostics: js.Array[typings.typescriptServices.TypeScript.Diagnostic]): typings.typescriptServices.TypeScript.CompileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDiagnostics")(diagnostics.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.CompileResult]
  
  /* static member */
  inline def fromOutputFiles(outputFiles: js.Array[typings.typescriptServices.TypeScript.OutputFile]): typings.typescriptServices.TypeScript.CompileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOutputFiles")(outputFiles.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.CompileResult]
}
