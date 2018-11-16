package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "DoStatementSyntax")
@js.native
class DoStatementSyntax protected ()
  extends typescriptDashServicesLib.TypeScriptNs.DoStatementSyntax {
  def this(doKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, statement: typescriptDashServicesLib.TypeScriptNs.IStatementSyntax, whileKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, condition: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, parsedInStrictMode: scala.Boolean) = this()
}

@JSImport("typescript-services", "DoStatementSyntax")
@js.native
object DoStatementSyntax extends js.Object {
  def create1(
    statement: typescriptDashServicesLib.TypeScriptNs.IStatementSyntax,
    condition: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax
  ): typescriptDashServicesLib.TypeScriptNs.DoStatementSyntax = js.native
}

