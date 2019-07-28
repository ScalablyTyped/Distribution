package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TryStatementSyntax")
@js.native
class TryStatementSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.TryStatementSyntax {
  def this(
    tryKeyword: ISyntaxToken,
    block: typings.typescriptDashServices.TypeScriptNs.BlockSyntax,
    catchClause: typings.typescriptDashServices.TypeScriptNs.CatchClauseSyntax,
    finallyClause: typings.typescriptDashServices.TypeScriptNs.FinallyClauseSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "TryStatementSyntax")
@js.native
object TryStatementSyntax extends js.Object {
  def create(tryKeyword: ISyntaxToken, block: typings.typescriptDashServices.TypeScriptNs.BlockSyntax): typings.typescriptDashServices.TypeScriptNs.TryStatementSyntax = js.native
  def create1(): typings.typescriptDashServices.TypeScriptNs.TryStatementSyntax = js.native
}

