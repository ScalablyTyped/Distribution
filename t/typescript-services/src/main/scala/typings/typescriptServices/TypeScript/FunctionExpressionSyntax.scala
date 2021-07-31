package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionExpressionSyntax
  extends StObject
     with SyntaxNode
     with IPrimaryExpressionSyntax {
  
  var block: BlockSyntax = js.native
  
  var callSignature: CallSignatureSyntax = js.native
  
  var functionKeyword: ISyntaxToken = js.native
  
  var identifier: ISyntaxToken = js.native
  
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  
  def update(
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: CallSignatureSyntax,
    block: BlockSyntax
  ): FunctionExpressionSyntax = js.native
  
  def withBlock(block: BlockSyntax): FunctionExpressionSyntax = js.native
  
  def withCallSignature(callSignature: CallSignatureSyntax): FunctionExpressionSyntax = js.native
  
  def withFunctionKeyword(functionKeyword: ISyntaxToken): FunctionExpressionSyntax = js.native
  
  def withIdentifier(identifier: ISyntaxToken): FunctionExpressionSyntax = js.native
}
