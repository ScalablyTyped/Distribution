package typings.typescriptDashServices.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxTreeToAstVisitor")
@js.native
class SyntaxTreeToAstVisitor protected ()
  extends typings.typescriptDashServices.TypeScript.SyntaxTreeToAstVisitor {
  def this(
    fileName: String,
    lineMap: typings.typescriptDashServices.TypeScript.LineMap,
    compilationSettings: typings.typescriptDashServices.TypeScript.ImmutableCompilationSettings
  ) = this()
}

/* static members */
@JSImport("typescript-services", "SyntaxTreeToAstVisitor")
@js.native
object SyntaxTreeToAstVisitor extends js.Object {
  def visit(
    syntaxTree: typings.typescriptDashServices.TypeScript.SyntaxTree,
    fileName: String,
    compilationSettings: typings.typescriptDashServices.TypeScript.ImmutableCompilationSettings,
    incrementalAST: Boolean
  ): typings.typescriptDashServices.TypeScript.SourceUnit = js.native
}

