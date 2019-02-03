package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxTreeToAstVisitor")
@js.native
class SyntaxTreeToAstVisitor protected ()
  extends typescriptDashServicesLib.TypeScriptNs.SyntaxTreeToAstVisitor {
  def this(fileName: java.lang.String, lineMap: typescriptDashServicesLib.TypeScriptNs.LineMap, compilationSettings: typescriptDashServicesLib.TypeScriptNs.ImmutableCompilationSettings) = this()
}

/* static members */
@JSImport("typescript-services", "SyntaxTreeToAstVisitor")
@js.native
object SyntaxTreeToAstVisitor extends js.Object {
  def visit(
    syntaxTree: typescriptDashServicesLib.TypeScriptNs.SyntaxTree,
    fileName: java.lang.String,
    compilationSettings: typescriptDashServicesLib.TypeScriptNs.ImmutableCompilationSettings,
    incrementalAST: scala.Boolean
  ): typescriptDashServicesLib.TypeScriptNs.SourceUnit = js.native
}

