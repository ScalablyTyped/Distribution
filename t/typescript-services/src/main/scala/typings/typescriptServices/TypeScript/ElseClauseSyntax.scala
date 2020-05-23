package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElseClauseSyntax extends SyntaxNode {
  var elseKeyword: ISyntaxToken = js.native
  var statement: IStatementSyntax = js.native
  def update(elseKeyword: ISyntaxToken, statement: IStatementSyntax): ElseClauseSyntax = js.native
  def withElseKeyword(elseKeyword: ISyntaxToken): ElseClauseSyntax = js.native
  def withStatement(statement: IStatementSyntax): ElseClauseSyntax = js.native
}

