package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.FunctionExpressionSyntax")
@js.native
class FunctionExpressionSyntax protected ()
  extends SyntaxNode
     with IPrimaryExpressionSyntax {
  def this(functionKeyword: ISyntaxToken, identifier: ISyntaxToken, callSignature: CallSignatureSyntax, block: BlockSyntax, parsedInStrictMode: scala.Boolean) = this()
  var block: BlockSyntax = js.native
  var callSignature: CallSignatureSyntax = js.native
  var functionKeyword: ISyntaxToken = js.native
  var identifier: ISyntaxToken = js.native
  /* CompleteClass */
  override def accept(visitor: ISyntaxVisitor): js.Any = js.native
  /* CompleteClass */
  override def childAt(index: scala.Double): ISyntaxElement = js.native
  /* CompleteClass */
  override def childCount(): scala.Double = js.native
  /* CompleteClass */
  override def collectTextElements(elements: js.Array[java.lang.String]): scala.Unit = js.native
  /* CompleteClass */
  override def firstToken(): ISyntaxToken = js.native
  /* CompleteClass */
  override def fullText(): java.lang.String = js.native
  /* CompleteClass */
  override def fullWidth(): scala.Double = js.native
  /* InferMemberOverrides */
  override def isExpression(): scala.Boolean = js.native
  /* CompleteClass */
  override def isIncrementallyUnusable(): scala.Boolean = js.native
  /* CompleteClass */
  override def isList(): scala.Boolean = js.native
  /* CompleteClass */
  override def isMemberExpression(): scala.Boolean = js.native
  /* CompleteClass */
  override def isNode(): scala.Boolean = js.native
  /* CompleteClass */
  override def isPostfixExpression(): scala.Boolean = js.native
  /* CompleteClass */
  override def isPrimaryExpression(): scala.Boolean = js.native
  /* CompleteClass */
  override def isSeparatedList(): scala.Boolean = js.native
  /* CompleteClass */
  override def isToken(): scala.Boolean = js.native
  /* CompleteClass */
  override def isTypeScriptSpecific(): scala.Boolean = js.native
  /* CompleteClass */
  override def isUnaryExpression(): scala.Boolean = js.native
  /* CompleteClass */
  override def kind(): SyntaxKind = js.native
  /* CompleteClass */
  override def lastToken(): ISyntaxToken = js.native
  /* CompleteClass */
  override def leadingTrivia(): ISyntaxTriviaList = js.native
  /* CompleteClass */
  override def leadingTriviaWidth(): scala.Double = js.native
  /* CompleteClass */
  override def trailingTrivia(): ISyntaxTriviaList = js.native
  /* CompleteClass */
  override def trailingTriviaWidth(): scala.Double = js.native
  def update(
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: CallSignatureSyntax,
    block: BlockSyntax
  ): FunctionExpressionSyntax = js.native
  /* CompleteClass */
  override def width(): scala.Double = js.native
  def withBlock(block: BlockSyntax): FunctionExpressionSyntax = js.native
  def withCallSignature(callSignature: CallSignatureSyntax): FunctionExpressionSyntax = js.native
  def withFunctionKeyword(functionKeyword: ISyntaxToken): FunctionExpressionSyntax = js.native
  def withIdentifier(identifier: ISyntaxToken): FunctionExpressionSyntax = js.native
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
}

/* static members */
@JSGlobal("TypeScript.FunctionExpressionSyntax")
@js.native
object FunctionExpressionSyntax extends js.Object {
  def create(
    functionKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    callSignature: typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax,
    block: typescriptDashServicesLib.TypeScriptNs.BlockSyntax
  ): typescriptDashServicesLib.TypeScriptNs.FunctionExpressionSyntax = js.native
  def create1(): typescriptDashServicesLib.TypeScriptNs.FunctionExpressionSyntax = js.native
}

