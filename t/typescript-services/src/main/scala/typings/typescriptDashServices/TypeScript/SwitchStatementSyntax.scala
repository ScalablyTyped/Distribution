package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SwitchStatementSyntax")
@js.native
class SwitchStatementSyntax protected ()
  extends SyntaxNode
     with IStatementSyntax {
  def this(
    switchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    switchClauses: ISyntaxList,
    closeBraceToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
  var closeBraceToken: ISyntaxToken = js.native
  var closeParenToken: ISyntaxToken = js.native
  var expression: IExpressionSyntax = js.native
  var openBraceToken: ISyntaxToken = js.native
  var openParenToken: ISyntaxToken = js.native
  var switchClauses: ISyntaxList = js.native
  var switchKeyword: ISyntaxToken = js.native
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
  /* CompleteClass */
  override def isIncrementallyUnusable(): Boolean = js.native
  /* CompleteClass */
  override def isList(): Boolean = js.native
  /* CompleteClass */
  override def isNode(): Boolean = js.native
  /* CompleteClass */
  override def isSeparatedList(): Boolean = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  /* CompleteClass */
  override def isToken(): Boolean = js.native
  /* CompleteClass */
  override def isTypeScriptSpecific(): Boolean = js.native
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
  def update(
    switchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    switchClauses: ISyntaxList,
    closeBraceToken: ISyntaxToken
  ): SwitchStatementSyntax = js.native
  /* CompleteClass */
  override def width(): Double = js.native
  def withCloseBraceToken(closeBraceToken: ISyntaxToken): SwitchStatementSyntax = js.native
  def withCloseParenToken(closeParenToken: ISyntaxToken): SwitchStatementSyntax = js.native
  def withExpression(expression: IExpressionSyntax): SwitchStatementSyntax = js.native
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  def withOpenBraceToken(openBraceToken: ISyntaxToken): SwitchStatementSyntax = js.native
  def withOpenParenToken(openParenToken: ISyntaxToken): SwitchStatementSyntax = js.native
  def withSwitchClause(switchClause: ISwitchClauseSyntax): SwitchStatementSyntax = js.native
  def withSwitchClauses(switchClauses: ISyntaxList): SwitchStatementSyntax = js.native
  def withSwitchKeyword(switchKeyword: ISyntaxToken): SwitchStatementSyntax = js.native
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
}

/* static members */
@JSGlobal("TypeScript.SwitchStatementSyntax")
@js.native
object SwitchStatementSyntax extends js.Object {
  def create(
    switchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    closeBraceToken: ISyntaxToken
  ): SwitchStatementSyntax = js.native
  def create1(expression: IExpressionSyntax): SwitchStatementSyntax = js.native
}

