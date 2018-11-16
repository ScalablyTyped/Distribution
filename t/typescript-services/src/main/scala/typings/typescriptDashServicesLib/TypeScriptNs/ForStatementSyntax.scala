package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ForStatementSyntax")
@js.native
class ForStatementSyntax protected ()
  extends SyntaxNode
     with IIterationStatementSyntax {
  def this(forKeyword: ISyntaxToken, openParenToken: ISyntaxToken, variableDeclaration: VariableDeclarationSyntax, initializer: IExpressionSyntax, firstSemicolonToken: ISyntaxToken, condition: IExpressionSyntax, secondSemicolonToken: ISyntaxToken, incrementor: IExpressionSyntax, closeParenToken: ISyntaxToken, statement: IStatementSyntax, parsedInStrictMode: scala.Boolean) = this()
  var closeParenToken: ISyntaxToken = js.native
  var condition: IExpressionSyntax = js.native
  var firstSemicolonToken: ISyntaxToken = js.native
  var forKeyword: ISyntaxToken = js.native
  var incrementor: IExpressionSyntax = js.native
  var initializer: IExpressionSyntax = js.native
  var openParenToken: ISyntaxToken = js.native
  var secondSemicolonToken: ISyntaxToken = js.native
  var statement: IStatementSyntax = js.native
  var variableDeclaration: VariableDeclarationSyntax = js.native
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
    forKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    variableDeclaration: VariableDeclarationSyntax,
    initializer: IExpressionSyntax,
    firstSemicolonToken: ISyntaxToken,
    condition: IExpressionSyntax,
    secondSemicolonToken: ISyntaxToken,
    incrementor: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): ForStatementSyntax = js.native
  /* CompleteClass */
  override def width(): scala.Double = js.native
  def withCloseParenToken(closeParenToken: ISyntaxToken): ForStatementSyntax = js.native
  def withCondition(condition: IExpressionSyntax): ForStatementSyntax = js.native
  def withFirstSemicolonToken(firstSemicolonToken: ISyntaxToken): ForStatementSyntax = js.native
  def withForKeyword(forKeyword: ISyntaxToken): ForStatementSyntax = js.native
  def withIncrementor(incrementor: IExpressionSyntax): ForStatementSyntax = js.native
  def withInitializer(initializer: IExpressionSyntax): ForStatementSyntax = js.native
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  def withOpenParenToken(openParenToken: ISyntaxToken): ForStatementSyntax = js.native
  def withSecondSemicolonToken(secondSemicolonToken: ISyntaxToken): ForStatementSyntax = js.native
  def withStatement(statement: IStatementSyntax): ForStatementSyntax = js.native
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  def withVariableDeclaration(variableDeclaration: VariableDeclarationSyntax): ForStatementSyntax = js.native
}

@JSGlobal("TypeScript.ForStatementSyntax")
@js.native
object ForStatementSyntax extends js.Object {
  def create(
    forKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    firstSemicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    secondSemicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    statement: typescriptDashServicesLib.TypeScriptNs.IStatementSyntax
  ): typescriptDashServicesLib.TypeScriptNs.ForStatementSyntax = js.native
  def create1(statement: typescriptDashServicesLib.TypeScriptNs.IStatementSyntax): typescriptDashServicesLib.TypeScriptNs.ForStatementSyntax = js.native
}

