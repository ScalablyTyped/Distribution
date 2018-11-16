package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ElementAccessExpressionSyntax")
@js.native
class ElementAccessExpressionSyntax protected ()
  extends SyntaxNode
     with IMemberExpressionSyntax {
  def this(expression: IExpressionSyntax, openBracketToken: ISyntaxToken, argumentExpression: IExpressionSyntax, closeBracketToken: ISyntaxToken, parsedInStrictMode: scala.Boolean) = this()
  var argumentExpression: IExpressionSyntax = js.native
  var closeBracketToken: ISyntaxToken = js.native
  var expression: IExpressionSyntax = js.native
  var openBracketToken: ISyntaxToken = js.native
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
    expression: IExpressionSyntax,
    openBracketToken: ISyntaxToken,
    argumentExpression: IExpressionSyntax,
    closeBracketToken: ISyntaxToken
  ): ElementAccessExpressionSyntax = js.native
  /* CompleteClass */
  override def width(): scala.Double = js.native
  def withArgumentExpression(argumentExpression: IExpressionSyntax): ElementAccessExpressionSyntax = js.native
  def withCloseBracketToken(closeBracketToken: ISyntaxToken): ElementAccessExpressionSyntax = js.native
  def withExpression(expression: IExpressionSyntax): ElementAccessExpressionSyntax = js.native
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  def withOpenBracketToken(openBracketToken: ISyntaxToken): ElementAccessExpressionSyntax = js.native
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
}

@JSGlobal("TypeScript.ElementAccessExpressionSyntax")
@js.native
object ElementAccessExpressionSyntax extends js.Object {
  def create1(
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    argumentExpression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax
  ): typescriptDashServicesLib.TypeScriptNs.ElementAccessExpressionSyntax = js.native
}

