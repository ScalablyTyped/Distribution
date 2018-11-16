package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.IfStatementSyntax")
@js.native
class IfStatementSyntax protected ()
  extends SyntaxNode
     with IStatementSyntax {
  def this(ifKeyword: ISyntaxToken, openParenToken: ISyntaxToken, condition: IExpressionSyntax, closeParenToken: ISyntaxToken, statement: IStatementSyntax, elseClause: ElseClauseSyntax, parsedInStrictMode: scala.Boolean) = this()
  var closeParenToken: ISyntaxToken = js.native
  var condition: IExpressionSyntax = js.native
  var elseClause: ElseClauseSyntax = js.native
  var ifKeyword: ISyntaxToken = js.native
  var openParenToken: ISyntaxToken = js.native
  var statement: IStatementSyntax = js.native
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
    ifKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax,
    elseClause: ElseClauseSyntax
  ): IfStatementSyntax = js.native
  /* CompleteClass */
  override def width(): scala.Double = js.native
  def withCloseParenToken(closeParenToken: ISyntaxToken): IfStatementSyntax = js.native
  def withCondition(condition: IExpressionSyntax): IfStatementSyntax = js.native
  def withElseClause(elseClause: ElseClauseSyntax): IfStatementSyntax = js.native
  def withIfKeyword(ifKeyword: ISyntaxToken): IfStatementSyntax = js.native
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  def withOpenParenToken(openParenToken: ISyntaxToken): IfStatementSyntax = js.native
  def withStatement(statement: IStatementSyntax): IfStatementSyntax = js.native
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
}

@JSGlobal("TypeScript.IfStatementSyntax")
@js.native
object IfStatementSyntax extends js.Object {
  def create(
    ifKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    condition: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    statement: typescriptDashServicesLib.TypeScriptNs.IStatementSyntax
  ): typescriptDashServicesLib.TypeScriptNs.IfStatementSyntax = js.native
  def create1(
    condition: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    statement: typescriptDashServicesLib.TypeScriptNs.IStatementSyntax
  ): typescriptDashServicesLib.TypeScriptNs.IfStatementSyntax = js.native
}

