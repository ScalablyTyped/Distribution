package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SimpleArrowFunctionExpressionSyntax")
@js.native
class SimpleArrowFunctionExpressionSyntax protected ()
  extends SyntaxNode
     with IArrowFunctionExpressionSyntax {
  def this(identifier: ISyntaxToken, equalsGreaterThanToken: ISyntaxToken, block: BlockSyntax, expression: IExpressionSyntax, parsedInStrictMode: scala.Boolean) = this()
  /* CompleteClass */
  override var block: BlockSyntax = js.native
  /* CompleteClass */
  override var equalsGreaterThanToken: ISyntaxToken = js.native
  /* CompleteClass */
  override var expression: IExpressionSyntax = js.native
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
    identifier: ISyntaxToken,
    equalsGreaterThanToken: ISyntaxToken,
    block: BlockSyntax,
    expression: IExpressionSyntax
  ): SimpleArrowFunctionExpressionSyntax = js.native
  /* CompleteClass */
  override def width(): scala.Double = js.native
  def withBlock(block: BlockSyntax): SimpleArrowFunctionExpressionSyntax = js.native
  def withEqualsGreaterThanToken(equalsGreaterThanToken: ISyntaxToken): SimpleArrowFunctionExpressionSyntax = js.native
  def withExpression(expression: IExpressionSyntax): SimpleArrowFunctionExpressionSyntax = js.native
  def withIdentifier(identifier: ISyntaxToken): SimpleArrowFunctionExpressionSyntax = js.native
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
}

@JSGlobal("TypeScript.SimpleArrowFunctionExpressionSyntax")
@js.native
object SimpleArrowFunctionExpressionSyntax extends js.Object {
  def create(
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    equalsGreaterThanToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.SimpleArrowFunctionExpressionSyntax = js.native
  def create1(identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken): typescriptDashServicesLib.TypeScriptNs.SimpleArrowFunctionExpressionSyntax = js.native
}

