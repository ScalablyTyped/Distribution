package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IExpressionSyntax
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ReturnStatementSyntax")
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
@JSGlobal("TypeScript.ReturnStatementSyntax")
@js.native
object ReturnStatementSyntax extends js.Object {
  def create(returnKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): typings.typescriptServices.TypeScript.ReturnStatementSyntax = js.native
  def create1(): typings.typescriptServices.TypeScript.ReturnStatementSyntax = js.native
}

