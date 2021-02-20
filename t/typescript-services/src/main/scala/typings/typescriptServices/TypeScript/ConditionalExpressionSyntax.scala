package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalExpressionSyntax
  extends SyntaxNode
     with IExpressionSyntax {
  
  var colonToken: ISyntaxToken = js.native
  
  var condition: IExpressionSyntax = js.native
  
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  
  var questionToken: ISyntaxToken = js.native
  
  def update(
    condition: IExpressionSyntax,
    questionToken: ISyntaxToken,
    whenTrue: IExpressionSyntax,
    colonToken: ISyntaxToken,
    whenFalse: IExpressionSyntax
  ): ConditionalExpressionSyntax = js.native
  
  var whenFalse: IExpressionSyntax = js.native
  
  var whenTrue: IExpressionSyntax = js.native
  
  def withColonToken(colonToken: ISyntaxToken): ConditionalExpressionSyntax = js.native
  
  def withCondition(condition: IExpressionSyntax): ConditionalExpressionSyntax = js.native
  
  def withQuestionToken(questionToken: ISyntaxToken): ConditionalExpressionSyntax = js.native
  
  def withWhenFalse(whenFalse: IExpressionSyntax): ConditionalExpressionSyntax = js.native
  
  def withWhenTrue(whenTrue: IExpressionSyntax): ConditionalExpressionSyntax = js.native
}
