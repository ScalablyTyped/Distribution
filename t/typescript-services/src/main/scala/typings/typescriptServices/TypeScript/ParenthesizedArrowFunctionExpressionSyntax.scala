package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParenthesizedArrowFunctionExpressionSyntax
  extends IArrowFunctionExpressionSyntax
     with SyntaxNode {
  
  var callSignature: CallSignatureSyntax = js.native
  
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  
  def update(
    callSignature: CallSignatureSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    block: BlockSyntax,
    expression: IExpressionSyntax
  ): ParenthesizedArrowFunctionExpressionSyntax = js.native
  
  def withBlock(block: BlockSyntax): ParenthesizedArrowFunctionExpressionSyntax = js.native
  
  def withCallSignature(callSignature: CallSignatureSyntax): ParenthesizedArrowFunctionExpressionSyntax = js.native
  
  def withEqualsGreaterThanToken(equalsGreaterThanToken: ISyntaxToken): ParenthesizedArrowFunctionExpressionSyntax = js.native
  
  def withExpression(expression: IExpressionSyntax): ParenthesizedArrowFunctionExpressionSyntax = js.native
}
