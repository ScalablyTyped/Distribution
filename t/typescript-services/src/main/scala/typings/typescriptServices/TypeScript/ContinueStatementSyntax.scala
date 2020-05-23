package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContinueStatementSyntax
  extends SyntaxNode
     with IStatementSyntax {
  var continueKeyword: ISyntaxToken = js.native
  var identifier: ISyntaxToken = js.native
  var semicolonToken: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  def update(continueKeyword: ISyntaxToken, identifier: ISyntaxToken, semicolonToken: ISyntaxToken): ContinueStatementSyntax = js.native
  def withContinueKeyword(continueKeyword: ISyntaxToken): ContinueStatementSyntax = js.native
  def withIdentifier(identifier: ISyntaxToken): ContinueStatementSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): ContinueStatementSyntax = js.native
}

