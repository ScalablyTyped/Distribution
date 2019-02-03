package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.MemberAccessExpressionSyntax")
@js.native
class MemberAccessExpressionSyntax protected ()
  extends SyntaxNode
     with IMemberExpressionSyntax {
  def this(expression: IExpressionSyntax, dotToken: ISyntaxToken, name: ISyntaxToken, parsedInStrictMode: scala.Boolean) = this()
  var dotToken: ISyntaxToken = js.native
  var expression: IExpressionSyntax = js.native
  var name: ISyntaxToken = js.native
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
  def update(expression: IExpressionSyntax, dotToken: ISyntaxToken, name: ISyntaxToken): MemberAccessExpressionSyntax = js.native
  /* CompleteClass */
  override def width(): scala.Double = js.native
  def withDotToken(dotToken: ISyntaxToken): MemberAccessExpressionSyntax = js.native
  def withExpression(expression: IExpressionSyntax): MemberAccessExpressionSyntax = js.native
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  def withName(name: ISyntaxToken): MemberAccessExpressionSyntax = js.native
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
}

/* static members */
@JSGlobal("TypeScript.MemberAccessExpressionSyntax")
@js.native
object MemberAccessExpressionSyntax extends js.Object {
  def create1(
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    name: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.MemberAccessExpressionSyntax = js.native
}

