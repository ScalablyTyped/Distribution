package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreakStatementSyntax
  extends SyntaxNode
     with IStatementSyntax {
  var breakKeyword: ISyntaxToken = js.native
  var identifier: ISyntaxToken = js.native
  var semicolonToken: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  def update(breakKeyword: ISyntaxToken, identifier: ISyntaxToken, semicolonToken: ISyntaxToken): BreakStatementSyntax = js.native
  def withBreakKeyword(breakKeyword: ISyntaxToken): BreakStatementSyntax = js.native
  def withIdentifier(identifier: ISyntaxToken): BreakStatementSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): BreakStatementSyntax = js.native
}

