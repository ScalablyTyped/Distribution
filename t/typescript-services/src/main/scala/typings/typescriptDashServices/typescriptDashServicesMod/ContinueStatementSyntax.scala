package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ContinueStatementSyntax")
@js.native
class ContinueStatementSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.ContinueStatementSyntax {
  def this(
    continueKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ContinueStatementSyntax")
@js.native
object ContinueStatementSyntax extends js.Object {
  def create(continueKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): typings.typescriptDashServices.TypeScriptNs.ContinueStatementSyntax = js.native
  def create1(): typings.typescriptDashServices.TypeScriptNs.ContinueStatementSyntax = js.native
}

