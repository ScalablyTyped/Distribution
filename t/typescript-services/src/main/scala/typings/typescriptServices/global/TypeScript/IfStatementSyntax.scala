package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IExpressionSyntax
import typings.typescriptServices.TypeScript.IStatementSyntax
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.IfStatementSyntax")
@js.native
class IfStatementSyntax protected ()
  extends typings.typescriptServices.TypeScript.IfStatementSyntax {
  def this(
    ifKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax,
    elseClause: typings.typescriptServices.TypeScript.ElseClauseSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSGlobal("TypeScript.IfStatementSyntax")
@js.native
object IfStatementSyntax extends js.Object {
  def create(
    ifKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): typings.typescriptServices.TypeScript.IfStatementSyntax = js.native
  def create1(condition: IExpressionSyntax, statement: IStatementSyntax): typings.typescriptServices.TypeScript.IfStatementSyntax = js.native
}

