package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.LabeledStatementSyntax")
@js.native
class LabeledStatementSyntax protected ()
  extends SyntaxNode
     with IStatementSyntax {
  def this(identifier: ISyntaxToken, colonToken: ISyntaxToken, statement: IStatementSyntax, parsedInStrictMode: scala.Boolean) = this()
  var colonToken: ISyntaxToken = js.native
  var identifier: ISyntaxToken = js.native
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
  def update(identifier: ISyntaxToken, colonToken: ISyntaxToken, statement: IStatementSyntax): LabeledStatementSyntax = js.native
  /* CompleteClass */
  override def width(): scala.Double = js.native
  def withColonToken(colonToken: ISyntaxToken): LabeledStatementSyntax = js.native
  def withIdentifier(identifier: ISyntaxToken): LabeledStatementSyntax = js.native
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  def withStatement(statement: IStatementSyntax): LabeledStatementSyntax = js.native
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
}

@JSGlobal("TypeScript.LabeledStatementSyntax")
@js.native
object LabeledStatementSyntax extends js.Object {
  def create1(
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    statement: typescriptDashServicesLib.TypeScriptNs.IStatementSyntax
  ): typescriptDashServicesLib.TypeScriptNs.LabeledStatementSyntax = js.native
}

