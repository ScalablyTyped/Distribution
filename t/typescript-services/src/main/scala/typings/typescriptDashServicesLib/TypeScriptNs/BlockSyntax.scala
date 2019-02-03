package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.BlockSyntax")
@js.native
class BlockSyntax protected ()
  extends SyntaxNode
     with IStatementSyntax {
  def this(openBraceToken: ISyntaxToken, statements: ISyntaxList, closeBraceToken: ISyntaxToken, parsedInStrictMode: scala.Boolean) = this()
  var closeBraceToken: ISyntaxToken = js.native
  var openBraceToken: ISyntaxToken = js.native
  var statements: ISyntaxList = js.native
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
  def update(openBraceToken: ISyntaxToken, statements: ISyntaxList, closeBraceToken: ISyntaxToken): BlockSyntax = js.native
  /* CompleteClass */
  override def width(): scala.Double = js.native
  def withCloseBraceToken(closeBraceToken: ISyntaxToken): BlockSyntax = js.native
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  def withOpenBraceToken(openBraceToken: ISyntaxToken): BlockSyntax = js.native
  def withStatement(statement: IStatementSyntax): BlockSyntax = js.native
  def withStatements(statements: ISyntaxList): BlockSyntax = js.native
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
}

/* static members */
@JSGlobal("TypeScript.BlockSyntax")
@js.native
object BlockSyntax extends js.Object {
  def create(
    openBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    closeBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.BlockSyntax = js.native
  def create1(): typescriptDashServicesLib.TypeScriptNs.BlockSyntax = js.native
}

