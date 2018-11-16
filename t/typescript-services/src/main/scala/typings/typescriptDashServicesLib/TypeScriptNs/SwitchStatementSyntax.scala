package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SwitchStatementSyntax")
@js.native
class SwitchStatementSyntax protected ()
  extends SyntaxNode
     with IStatementSyntax {
  def this(switchKeyword: ISyntaxToken, openParenToken: ISyntaxToken, expression: IExpressionSyntax, closeParenToken: ISyntaxToken, openBraceToken: ISyntaxToken, switchClauses: ISyntaxList, closeBraceToken: ISyntaxToken, parsedInStrictMode: scala.Boolean) = this()
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
    switchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    switchClauses: ISyntaxList,
    closeBraceToken: ISyntaxToken
  ): SwitchStatementSyntax = js.native
  /* CompleteClass */
  override def width(): scala.Double = js.native
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

@JSGlobal("TypeScript.SwitchStatementSyntax")
@js.native
object SwitchStatementSyntax extends js.Object {
  def create(
    switchKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    closeBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.SwitchStatementSyntax = js.native
  def create1(expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax): typescriptDashServicesLib.TypeScriptNs.SwitchStatementSyntax = js.native
}

