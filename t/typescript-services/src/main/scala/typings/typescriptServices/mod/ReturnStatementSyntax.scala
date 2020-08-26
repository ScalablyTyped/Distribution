package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IExpressionSyntax
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ReturnStatementSyntax")
@js.native
class ReturnStatementSyntax protected ()
  extends typings.typescriptServices.TypeScript.ReturnStatementSyntax {
  def this(
    returnKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ReturnStatementSyntax")
@js.native
object ReturnStatementSyntax extends js.Object {
  def create(returnKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): typings.typescriptServices.TypeScript.ReturnStatementSyntax = js.native
  def create1(): typings.typescriptServices.TypeScript.ReturnStatementSyntax = js.native
}

