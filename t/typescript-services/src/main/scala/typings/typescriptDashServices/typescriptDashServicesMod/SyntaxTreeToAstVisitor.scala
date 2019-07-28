package typings.typescriptDashServices.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxTreeToAstVisitor")
@js.native
class SyntaxTreeToAstVisitor protected ()
  extends typings.typescriptDashServices.TypeScriptNs.SyntaxTreeToAstVisitor {
  def this(
    fileName: String,
    lineMap: typings.typescriptDashServices.TypeScriptNs.LineMap,
    compilationSettings: typings.typescriptDashServices.TypeScriptNs.ImmutableCompilationSettings
  ) = this()
}

/* static members */
@JSImport("typescript-services", "SyntaxTreeToAstVisitor")
@js.native
object SyntaxTreeToAstVisitor extends js.Object {
  def visit(
    syntaxTree: typings.typescriptDashServices.TypeScriptNs.SyntaxTree,
    fileName: String,
    compilationSettings: typings.typescriptDashServices.TypeScriptNs.ImmutableCompilationSettings,
    incrementalAST: Boolean
  ): typings.typescriptDashServices.TypeScriptNs.SourceUnit = js.native
}

