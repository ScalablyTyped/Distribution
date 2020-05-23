package typings.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "CompileResult")
@js.native
class CompileResult ()
  extends typings.typescriptServices.TypeScript.CompileResult {
  /* CompleteClass */
  override var diagnostics: js.Array[typings.typescriptServices.TypeScript.Diagnostic] = js.native
  /* CompleteClass */
  override var outputFiles: js.Array[typings.typescriptServices.TypeScript.OutputFile] = js.native
}

/* static members */
@JSImport("typescript-services", "CompileResult")
@js.native
object CompileResult extends js.Object {
  def fromDiagnostics(diagnostics: js.Array[typings.typescriptServices.TypeScript.Diagnostic]): typings.typescriptServices.TypeScript.CompileResult = js.native
  def fromOutputFiles(outputFiles: js.Array[typings.typescriptServices.TypeScript.OutputFile]): typings.typescriptServices.TypeScript.CompileResult = js.native
}

