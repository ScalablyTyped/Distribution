package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ArrayLiteralExpressionSyntax")
@js.native
class ArrayLiteralExpressionSyntax protected ()
  extends SyntaxNode
     with IPrimaryExpressionSyntax {
  def this(openBracketToken: ISyntaxToken, expressions: ISeparatedSyntaxList, closeBracketToken: ISyntaxToken, parsedInStrictMode: scala.Boolean) = this()
  var closeBracketToken: ISyntaxToken = js.native
  var expressions: ISeparatedSyntaxList = js.native
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
  def update(openBracketToken: ISyntaxToken, expressions: ISeparatedSyntaxList, closeBracketToken: ISyntaxToken): ArrayLiteralExpressionSyntax = js.native
  /* CompleteClass */
  override def width(): scala.Double = js.native
  def withCloseBracketToken(closeBracketToken: ISyntaxToken): ArrayLiteralExpressionSyntax = js.native
  def withExpression(expression: IExpressionSyntax): ArrayLiteralExpressionSyntax = js.native
  def withExpressions(expressions: ISeparatedSyntaxList): ArrayLiteralExpressionSyntax = js.native
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  def withOpenBracketToken(openBracketToken: ISyntaxToken): ArrayLiteralExpressionSyntax = js.native
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
}

/* static members */
@JSGlobal("TypeScript.ArrayLiteralExpressionSyntax")
@js.native
object ArrayLiteralExpressionSyntax extends js.Object {
  def create(
    openBracketToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    closeBracketToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ArrayLiteralExpressionSyntax = js.native
  def create1(): typescriptDashServicesLib.TypeScriptNs.ArrayLiteralExpressionSyntax = js.native
}

