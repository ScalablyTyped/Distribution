package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TryStatementSyntax")
@js.native
class TryStatementSyntax protected ()
  extends SyntaxNode
     with IStatementSyntax {
  def this(tryKeyword: ISyntaxToken, block: BlockSyntax, catchClause: CatchClauseSyntax, finallyClause: FinallyClauseSyntax, parsedInStrictMode: scala.Boolean) = this()
  var block: BlockSyntax = js.native
  var catchClause: CatchClauseSyntax = js.native
  var finallyClause: FinallyClauseSyntax = js.native
  var tryKeyword: ISyntaxToken = js.native
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
    tryKeyword: ISyntaxToken,
    block: BlockSyntax,
    catchClause: CatchClauseSyntax,
    finallyClause: FinallyClauseSyntax
  ): TryStatementSyntax = js.native
  /* CompleteClass */
  override def width(): scala.Double = js.native
  def withBlock(block: BlockSyntax): TryStatementSyntax = js.native
  def withCatchClause(catchClause: CatchClauseSyntax): TryStatementSyntax = js.native
  def withFinallyClause(finallyClause: FinallyClauseSyntax): TryStatementSyntax = js.native
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  def withTryKeyword(tryKeyword: ISyntaxToken): TryStatementSyntax = js.native
}

@JSGlobal("TypeScript.TryStatementSyntax")
@js.native
object TryStatementSyntax extends js.Object {
  def create(
    tryKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    block: typescriptDashServicesLib.TypeScriptNs.BlockSyntax
  ): typescriptDashServicesLib.TypeScriptNs.TryStatementSyntax = js.native
  def create1(): typescriptDashServicesLib.TypeScriptNs.TryStatementSyntax = js.native
}

