package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TryStatementSyntax
  extends SyntaxNode
     with IStatementSyntax {
  var block: BlockSyntax = js.native
  var catchClause: CatchClauseSyntax = js.native
  var finallyClause: FinallyClauseSyntax = js.native
  var tryKeyword: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  def update(
    tryKeyword: ISyntaxToken,
    block: BlockSyntax,
    catchClause: CatchClauseSyntax,
    finallyClause: FinallyClauseSyntax
  ): TryStatementSyntax = js.native
  def withBlock(block: BlockSyntax): TryStatementSyntax = js.native
  def withCatchClause(catchClause: CatchClauseSyntax): TryStatementSyntax = js.native
  def withFinallyClause(finallyClause: FinallyClauseSyntax): TryStatementSyntax = js.native
  def withTryKeyword(tryKeyword: ISyntaxToken): TryStatementSyntax = js.native
}

