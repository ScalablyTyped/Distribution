package typings.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.SyntaxTree")
@js.native
class SyntaxTree protected ()
  extends typings.typescriptServices.TypeScript.SyntaxTree {
  def this(
    sourceUnit: typings.typescriptServices.TypeScript.SourceUnitSyntax,
    isDeclaration: Boolean,
    diagnostics: js.Array[typings.typescriptServices.TypeScript.Diagnostic],
    fileName: String,
    lineMap: typings.typescriptServices.TypeScript.LineMap,
    parseOtions: typings.typescriptServices.TypeScript.ParseOptions
  ) = this()
}
