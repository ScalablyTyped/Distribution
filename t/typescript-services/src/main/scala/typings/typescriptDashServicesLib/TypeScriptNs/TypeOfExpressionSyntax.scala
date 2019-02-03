package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TypeOfExpressionSyntax")
@js.native
class TypeOfExpressionSyntax protected ()
  extends SyntaxNode
     with IUnaryExpressionSyntax {
  def this(typeOfKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax, parsedInStrictMode: scala.Boolean) = this()
  var expression: IUnaryExpressionSyntax = js.native
  var typeOfKeyword: ISyntaxToken = js.native
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
  def update(typeOfKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): TypeOfExpressionSyntax = js.native
  /* CompleteClass */
  override def width(): scala.Double = js.native
  def withExpression(expression: IUnaryExpressionSyntax): TypeOfExpressionSyntax = js.native
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  def withTypeOfKeyword(typeOfKeyword: ISyntaxToken): TypeOfExpressionSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.TypeOfExpressionSyntax")
@js.native
object TypeOfExpressionSyntax extends js.Object {
  def create1(expression: typescriptDashServicesLib.TypeScriptNs.IUnaryExpressionSyntax): typescriptDashServicesLib.TypeScriptNs.TypeOfExpressionSyntax = js.native
}

