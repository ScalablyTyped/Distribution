package typings.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "SyntaxTreeToAstVisitor")
@js.native
class SyntaxTreeToAstVisitor protected ()
  extends typings.typescriptServices.TypeScript.SyntaxTreeToAstVisitor {
  def this(
    fileName: String,
    lineMap: typings.typescriptServices.TypeScript.LineMap,
    compilationSettings: typings.typescriptServices.TypeScript.ImmutableCompilationSettings
  ) = this()
}
/* static members */
@JSImport("typescript-services", "SyntaxTreeToAstVisitor")
@js.native
object SyntaxTreeToAstVisitor extends js.Object {
  
  def visit(
    syntaxTree: typings.typescriptServices.TypeScript.SyntaxTree,
    fileName: String,
    compilationSettings: typings.typescriptServices.TypeScript.ImmutableCompilationSettings,
    incrementalAST: Boolean
  ): typings.typescriptServices.TypeScript.SourceUnit = js.native
}
