package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.DoStatementSyntax")
@js.native
class DoStatementSyntax protected ()
  extends SyntaxNode
     with IIterationStatementSyntax {
  def this(doKeyword: ISyntaxToken, statement: IStatementSyntax, whileKeyword: ISyntaxToken, openParenToken: ISyntaxToken, condition: IExpressionSyntax, closeParenToken: ISyntaxToken, semicolonToken: ISyntaxToken, parsedInStrictMode: scala.Boolean) = this()
  var closeParenToken: ISyntaxToken = js.native
  var condition: IExpressionSyntax = js.native
  var doKeyword: ISyntaxToken = js.native
  var openParenToken: ISyntaxToken = js.native
  var semicolonToken: ISyntaxToken = js.native
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
    doKeyword: ISyntaxToken,
    statement: IStatementSyntax,
    whileKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    semicolonToken: ISyntaxToken
  ): DoStatementSyntax = js.native
  /* CompleteClass */
  override def width(): scala.Double = js.native
  def withCloseParenToken(closeParenToken: ISyntaxToken): DoStatementSyntax = js.native
  def withCondition(condition: IExpressionSyntax): DoStatementSyntax = js.native
  def withDoKeyword(doKeyword: ISyntaxToken): DoStatementSyntax = js.native
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  def withOpenParenToken(openParenToken: ISyntaxToken): DoStatementSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): DoStatementSyntax = js.native
  def withStatement(statement: IStatementSyntax): DoStatementSyntax = js.native
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  def withWhileKeyword(whileKeyword: ISyntaxToken): DoStatementSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.DoStatementSyntax")
@js.native
object DoStatementSyntax extends js.Object {
  def create1(
    statement: typescriptDashServicesLib.TypeScriptNs.IStatementSyntax,
    condition: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax
  ): typescriptDashServicesLib.TypeScriptNs.DoStatementSyntax = js.native
}

