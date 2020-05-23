package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebuggerStatementSyntax
  extends SyntaxNode
     with IStatementSyntax {
  var debuggerKeyword: ISyntaxToken = js.native
  var semicolonToken: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  def update(debuggerKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): DebuggerStatementSyntax = js.native
  def withDebuggerKeyword(debuggerKeyword: ISyntaxToken): DebuggerStatementSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): DebuggerStatementSyntax = js.native
}

