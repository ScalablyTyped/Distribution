package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.CaseSwitchClauseSyntax")
@js.native
class CaseSwitchClauseSyntax protected ()
  extends SyntaxNode
     with ISwitchClauseSyntax {
  def this(caseKeyword: ISyntaxToken, expression: IExpressionSyntax, colonToken: ISyntaxToken, statements: ISyntaxList, parsedInStrictMode: scala.Boolean) = this()
  var caseKeyword: ISyntaxToken = js.native
  var colonToken: ISyntaxToken = js.native
  var expression: IExpressionSyntax = js.native
  /* CompleteClass */
  override var statements: ISyntaxList = js.native
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
  override def isSwitchClause(): scala.Boolean = js.native
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
    caseKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    colonToken: ISyntaxToken,
    statements: ISyntaxList
  ): CaseSwitchClauseSyntax = js.native
  /* CompleteClass */
  override def width(): scala.Double = js.native
  def withCaseKeyword(caseKeyword: ISyntaxToken): CaseSwitchClauseSyntax = js.native
  def withColonToken(colonToken: ISyntaxToken): CaseSwitchClauseSyntax = js.native
  def withExpression(expression: IExpressionSyntax): CaseSwitchClauseSyntax = js.native
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  def withStatement(statement: IStatementSyntax): CaseSwitchClauseSyntax = js.native
  def withStatements(statements: ISyntaxList): CaseSwitchClauseSyntax = js.native
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
}

@JSGlobal("TypeScript.CaseSwitchClauseSyntax")
@js.native
object CaseSwitchClauseSyntax extends js.Object {
  def create(
    caseKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    colonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.CaseSwitchClauseSyntax = js.native
  def create1(expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax): typescriptDashServicesLib.TypeScriptNs.CaseSwitchClauseSyntax = js.native
}

