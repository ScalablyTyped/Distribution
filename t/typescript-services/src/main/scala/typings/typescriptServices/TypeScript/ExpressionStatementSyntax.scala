package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpressionStatementSyntax
  extends SyntaxNode
     with IStatementSyntax {
  
  var expression: IExpressionSyntax = js.native
  
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  
  var semicolonToken: ISyntaxToken = js.native
  
  def update(expression: IExpressionSyntax, semicolonToken: ISyntaxToken): ExpressionStatementSyntax = js.native
  
  def withExpression(expression: IExpressionSyntax): ExpressionStatementSyntax = js.native
  
  def withSemicolonToken(semicolonToken: ISyntaxToken): ExpressionStatementSyntax = js.native
}
