package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmptyStatementSyntax
  extends SyntaxNode
     with IStatementSyntax {
  var semicolonToken: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  def update(semicolonToken: ISyntaxToken): EmptyStatementSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): EmptyStatementSyntax = js.native
}

