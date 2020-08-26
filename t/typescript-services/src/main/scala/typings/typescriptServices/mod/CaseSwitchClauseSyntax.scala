package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IExpressionSyntax
import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "CaseSwitchClauseSyntax")
@js.native
class CaseSwitchClauseSyntax protected ()
  extends typings.typescriptServices.TypeScript.CaseSwitchClauseSyntax {
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
  def create(caseKeyword: ISyntaxToken, expression: IExpressionSyntax, colonToken: ISyntaxToken): typings.typescriptServices.TypeScript.CaseSwitchClauseSyntax = js.native
  def create1(expression: IExpressionSyntax): typings.typescriptServices.TypeScript.CaseSwitchClauseSyntax = js.native
}

