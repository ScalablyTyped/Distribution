package typings.typescriptDashServices.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxTree")
@js.native
class SyntaxTree protected ()
  extends typings.typescriptDashServices.TypeScript.SyntaxTree {
  def this(
    sourceUnit: typings.typescriptDashServices.TypeScript.SourceUnitSyntax,
    isDeclaration: Boolean,
    diagnostics: js.Array[typings.typescriptDashServices.TypeScript.Diagnostic],
    fileName: String,
    lineMap: typings.typescriptDashServices.TypeScript.LineMap,
    parseOtions: typings.typescriptDashServices.TypeScript.ParseOptions
  ) = this()
}

