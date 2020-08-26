package typings.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SyntaxTreeToAstVisitor")
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
@JSGlobal("TypeScript.SyntaxTreeToAstVisitor")
@js.native
object SyntaxTreeToAstVisitor extends js.Object {
  def visit(
    syntaxTree: typings.typescriptServices.TypeScript.SyntaxTree,
    fileName: String,
    compilationSettings: typings.typescriptServices.TypeScript.ImmutableCompilationSettings,
    incrementalAST: Boolean
  ): typings.typescriptServices.TypeScript.SourceUnit = js.native
}

