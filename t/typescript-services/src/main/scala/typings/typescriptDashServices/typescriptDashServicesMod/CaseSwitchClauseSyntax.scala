package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.IExpressionSyntax
import typings.typescriptDashServices.TypeScript.ISyntaxList
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "CaseSwitchClauseSyntax")
@js.native
class CaseSwitchClauseSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.CaseSwitchClauseSyntax {
  def this(
    caseKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    colonToken: ISyntaxToken,
    statements: ISyntaxList,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "CaseSwitchClauseSyntax")
@js.native
object CaseSwitchClauseSyntax extends js.Object {
  def create(caseKeyword: ISyntaxToken, expression: IExpressionSyntax, colonToken: ISyntaxToken): typings.typescriptDashServices.TypeScript.CaseSwitchClauseSyntax = js.native
  def create1(expression: IExpressionSyntax): typings.typescriptDashServices.TypeScript.CaseSwitchClauseSyntax = js.native
}

