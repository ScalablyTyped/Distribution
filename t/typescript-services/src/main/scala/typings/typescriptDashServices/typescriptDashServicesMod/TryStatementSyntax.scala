package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TryStatementSyntax")
@js.native
class TryStatementSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.TryStatementSyntax {
  def this(
    tryKeyword: ISyntaxToken,
    block: typings.typescriptDashServices.TypeScript.BlockSyntax,
    catchClause: typings.typescriptDashServices.TypeScript.CatchClauseSyntax,
    finallyClause: typings.typescriptDashServices.TypeScript.FinallyClauseSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "TryStatementSyntax")
@js.native
object TryStatementSyntax extends js.Object {
  def create(tryKeyword: ISyntaxToken, block: typings.typescriptDashServices.TypeScript.BlockSyntax): typings.typescriptDashServices.TypeScript.TryStatementSyntax = js.native
  def create1(): typings.typescriptDashServices.TypeScript.TryStatementSyntax = js.native
}

