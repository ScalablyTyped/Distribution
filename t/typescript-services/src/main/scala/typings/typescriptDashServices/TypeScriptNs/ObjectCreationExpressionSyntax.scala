package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ObjectCreationExpressionSyntax")
@js.native
class ObjectCreationExpressionSyntax protected ()
  extends SyntaxNode
     with IMemberExpressionSyntax {
  def this(
    newKeyword: ISyntaxToken,
    expression: IMemberExpressionSyntax,
    argumentList: ArgumentListSyntax,
    parsedInStrictMode: Boolean
  ) = this()
  var argumentList: ArgumentListSyntax = js.native
  var expression: IMemberExpressionSyntax = js.native
  var newKeyword: ISyntaxToken = js.native
  /* CompleteClass */
  override def accept(visitor: ISyntaxVisitor): js.Any = js.native
  /* CompleteClass */
  override def childAt(index: Double): ISyntaxElement = js.native
  /* CompleteClass */
  override def childCount(): Double = js.native
  /* CompleteClass */
  override def collectTextElements(elements: js.Array[String]): Unit = js.native
  /* CompleteClass */
  override def firstToken(): ISyntaxToken = js.native
  /* CompleteClass */
  override def fullText(): String = js.native
  /* CompleteClass */
  override def fullWidth(): Double = js.native
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  /* CompleteClass */
  override def isIncrementallyUnusable(): Boolean = js.native
  /* CompleteClass */
  override def isList(): Boolean = js.native
  /* CompleteClass */
  override def isMemberExpression(): Boolean = js.native
  /* CompleteClass */
  override def isNode(): Boolean = js.native
  /* CompleteClass */
  override def isPostfixExpression(): Boolean = js.native
  /* CompleteClass */
  override def isSeparatedList(): Boolean = js.native
  /* CompleteClass */
  override def isToken(): Boolean = js.native
  /* CompleteClass */
  override def isTypeScriptSpecific(): Boolean = js.native
  /* CompleteClass */
  override def isUnaryExpression(): Boolean = js.native
  /* CompleteClass */
  override def kind(): SyntaxKind = js.native
  /* CompleteClass */
  override def lastToken(): ISyntaxToken = js.native
  /* CompleteClass */
  override def leadingTrivia(): ISyntaxTriviaList = js.native
  /* CompleteClass */
  override def leadingTriviaWidth(): Double = js.native
  /* CompleteClass */
  override def trailingTrivia(): ISyntaxTriviaList = js.native
  /* CompleteClass */
  override def trailingTriviaWidth(): Double = js.native
  def update(newKeyword: ISyntaxToken, expression: IMemberExpressionSyntax, argumentList: ArgumentListSyntax): ObjectCreationExpressionSyntax = js.native
  /* CompleteClass */
  override def width(): Double = js.native
  def withArgumentList(argumentList: ArgumentListSyntax): ObjectCreationExpressionSyntax = js.native
  def withExpression(expression: IMemberExpressionSyntax): ObjectCreationExpressionSyntax = js.native
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  def withNewKeyword(newKeyword: ISyntaxToken): ObjectCreationExpressionSyntax = js.native
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
}

/* static members */
@JSGlobal("TypeScript.ObjectCreationExpressionSyntax")
@js.native
object ObjectCreationExpressionSyntax extends js.Object {
  def create(newKeyword: ISyntaxToken, expression: IMemberExpressionSyntax): ObjectCreationExpressionSyntax = js.native
  def create1(expression: IMemberExpressionSyntax): ObjectCreationExpressionSyntax = js.native
}

