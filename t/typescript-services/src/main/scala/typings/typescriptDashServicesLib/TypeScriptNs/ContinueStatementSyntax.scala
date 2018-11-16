package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ContinueStatementSyntax")
@js.native
class ContinueStatementSyntax protected ()
  extends SyntaxNode
     with IStatementSyntax {
  def this(continueKeyword: ISyntaxToken, identifier: ISyntaxToken, semicolonToken: ISyntaxToken, parsedInStrictMode: scala.Boolean) = this()
  var continueKeyword: ISyntaxToken = js.native
  var identifier: ISyntaxToken = js.native
  var semicolonToken: ISyntaxToken = js.native
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
  def update(continueKeyword: ISyntaxToken, identifier: ISyntaxToken, semicolonToken: ISyntaxToken): ContinueStatementSyntax = js.native
  /* CompleteClass */
  override def width(): scala.Double = js.native
  def withContinueKeyword(continueKeyword: ISyntaxToken): ContinueStatementSyntax = js.native
  def withIdentifier(identifier: ISyntaxToken): ContinueStatementSyntax = js.native
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): ContinueStatementSyntax = js.native
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
}

@JSGlobal("TypeScript.ContinueStatementSyntax")
@js.native
object ContinueStatementSyntax extends js.Object {
  def create(
    continueKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ContinueStatementSyntax = js.native
  def create1(): typescriptDashServicesLib.TypeScriptNs.ContinueStatementSyntax = js.native
}

