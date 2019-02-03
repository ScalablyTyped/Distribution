package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ForInStatementSyntax")
@js.native
class ForInStatementSyntax protected ()
  extends SyntaxNode
     with IIterationStatementSyntax {
  def this(forKeyword: ISyntaxToken, openParenToken: ISyntaxToken, variableDeclaration: VariableDeclarationSyntax, left: IExpressionSyntax, inKeyword: ISyntaxToken, expression: IExpressionSyntax, closeParenToken: ISyntaxToken, statement: IStatementSyntax, parsedInStrictMode: scala.Boolean) = this()
  var closeParenToken: ISyntaxToken = js.native
  var expression: IExpressionSyntax = js.native
  var forKeyword: ISyntaxToken = js.native
  var inKeyword: ISyntaxToken = js.native
  var left: IExpressionSyntax = js.native
  var openParenToken: ISyntaxToken = js.native
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
    left: IExpressionSyntax,
    inKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): ForInStatementSyntax = js.native
  /* CompleteClass */
  override def width(): scala.Double = js.native
  def withCloseParenToken(closeParenToken: ISyntaxToken): ForInStatementSyntax = js.native
  def withExpression(expression: IExpressionSyntax): ForInStatementSyntax = js.native
  def withForKeyword(forKeyword: ISyntaxToken): ForInStatementSyntax = js.native
  def withInKeyword(inKeyword: ISyntaxToken): ForInStatementSyntax = js.native
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  def withLeft(left: IExpressionSyntax): ForInStatementSyntax = js.native
  def withOpenParenToken(openParenToken: ISyntaxToken): ForInStatementSyntax = js.native
  def withStatement(statement: IStatementSyntax): ForInStatementSyntax = js.native
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  def withVariableDeclaration(variableDeclaration: VariableDeclarationSyntax): ForInStatementSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.ForInStatementSyntax")
@js.native
object ForInStatementSyntax extends js.Object {
  def create(
    forKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    inKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    statement: typescriptDashServicesLib.TypeScriptNs.IStatementSyntax
  ): typescriptDashServicesLib.TypeScriptNs.ForInStatementSyntax = js.native
  def create1(
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    statement: typescriptDashServicesLib.TypeScriptNs.IStatementSyntax
  ): typescriptDashServicesLib.TypeScriptNs.ForInStatementSyntax = js.native
}

