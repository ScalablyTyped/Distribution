package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ParenthesizedArrowFunctionExpressionSyntax")
@js.native
class ParenthesizedArrowFunctionExpressionSyntax protected ()
  extends SyntaxNode
     with IArrowFunctionExpressionSyntax {
  def this(callSignature: CallSignatureSyntax, equalsGreaterThanToken: ISyntaxToken, block: BlockSyntax, expression: IExpressionSyntax, parsedInStrictMode: scala.Boolean) = this()
  /* CompleteClass */
  override var block: BlockSyntax = js.native
  var callSignature: CallSignatureSyntax = js.native
  /* CompleteClass */
  override var equalsGreaterThanToken: ISyntaxToken = js.native
  /* CompleteClass */
  override var expression: IExpressionSyntax = js.native
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
  /* CompleteClass */
  override def isArrowFunctionExpression(): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def isExpression(): scala.Boolean = js.native
  /* CompleteClass */
  override def isIncrementallyUnusable(): scala.Boolean = js.native
  /* CompleteClass */
  override def isList(): scala.Boolean = js.native
  /* CompleteClass */
  override def isNode(): scala.Boolean = js.native
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
    callSignature: CallSignatureSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    block: BlockSyntax,
    expression: IExpressionSyntax
  ): ParenthesizedArrowFunctionExpressionSyntax = js.native
  /* CompleteClass */
  override def width(): scala.Double = js.native
  def withBlock(block: BlockSyntax): ParenthesizedArrowFunctionExpressionSyntax = js.native
  def withCallSignature(callSignature: CallSignatureSyntax): ParenthesizedArrowFunctionExpressionSyntax = js.native
  def withEqualsGreaterThanToken(equalsGreaterThanToken: ISyntaxToken): ParenthesizedArrowFunctionExpressionSyntax = js.native
  def withExpression(expression: IExpressionSyntax): ParenthesizedArrowFunctionExpressionSyntax = js.native
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
}

@JSGlobal("TypeScript.ParenthesizedArrowFunctionExpressionSyntax")
@js.native
object ParenthesizedArrowFunctionExpressionSyntax extends js.Object {
  def create(
    callSignature: typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax,
    equalsGreaterThanToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ParenthesizedArrowFunctionExpressionSyntax = js.native
  def create1(): typescriptDashServicesLib.TypeScriptNs.ParenthesizedArrowFunctionExpressionSyntax = js.native
}

