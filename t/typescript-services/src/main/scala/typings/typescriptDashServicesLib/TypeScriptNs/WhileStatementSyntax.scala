package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.WhileStatementSyntax")
@js.native
class WhileStatementSyntax protected ()
  extends SyntaxNode
     with IIterationStatementSyntax {
  def this(whileKeyword: ISyntaxToken, openParenToken: ISyntaxToken, condition: IExpressionSyntax, closeParenToken: ISyntaxToken, statement: IStatementSyntax, parsedInStrictMode: scala.Boolean) = this()
  var closeParenToken: ISyntaxToken = js.native
  var condition: IExpressionSyntax = js.native
  var openParenToken: ISyntaxToken = js.native
  var statement: IStatementSyntax = js.native
  var whileKeyword: ISyntaxToken = js.native
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
  override def isIncrementallyUnusable(): scala.Boolean = js.native
  /* CompleteClass */
  override def isIterationStatement(): scala.Boolean = js.native
  /* CompleteClass */
  override def isList(): scala.Boolean = js.native
  /* CompleteClass */
  override def isNode(): scala.Boolean = js.native
  /* CompleteClass */
  override def isSeparatedList(): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def isStatement(): scala.Boolean = js.native
  /* CompleteClass */
  override def isToken(): scala.Boolean = js.native
  /* CompleteClass */
  override def isTypeScriptSpecific(): scala.Boolean = js.native
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
    whileKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): WhileStatementSyntax = js.native
  /* CompleteClass */
  override def width(): scala.Double = js.native
  def withCloseParenToken(closeParenToken: ISyntaxToken): WhileStatementSyntax = js.native
  def withCondition(condition: IExpressionSyntax): WhileStatementSyntax = js.native
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  def withOpenParenToken(openParenToken: ISyntaxToken): WhileStatementSyntax = js.native
  def withStatement(statement: IStatementSyntax): WhileStatementSyntax = js.native
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  def withWhileKeyword(whileKeyword: ISyntaxToken): WhileStatementSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.WhileStatementSyntax")
@js.native
object WhileStatementSyntax extends js.Object {
  def create1(
    condition: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    statement: typescriptDashServicesLib.TypeScriptNs.IStatementSyntax
  ): typescriptDashServicesLib.TypeScriptNs.WhileStatementSyntax = js.native
}

