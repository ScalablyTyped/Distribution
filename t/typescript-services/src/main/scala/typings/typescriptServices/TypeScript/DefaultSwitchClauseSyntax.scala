package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.DefaultSwitchClauseSyntax")
@js.native
class DefaultSwitchClauseSyntax protected ()
  extends SyntaxNode
     with ISwitchClauseSyntax {
  def this(
    defaultKeyword: ISyntaxToken,
    colonToken: ISyntaxToken,
    statements: ISyntaxList,
    parsedInStrictMode: Boolean
  ) = this()
  var colonToken: ISyntaxToken = js.native
  var defaultKeyword: ISyntaxToken = js.native
  /* CompleteClass */
  override var statements: ISyntaxList = js.native
  /* CompleteClass */
  override def accept(visitor: ISyntaxVisitor): js.Any = js.native
  /* CompleteClass */
  override def childAt(index: Double): ISyntaxElement = js.native
  /* CompleteClass */
  override def childCount(): Double = js.native
  /* CompleteClass */
  override def collectTextElements(elements: js.Array[String]): Unit = js.native
  /* CompleteClass */
  override def firstToken(): ISyntaxToken = js.native
  /* CompleteClass */
  override def fullText(): String = js.native
  /* CompleteClass */
  override def fullWidth(): Double = js.native
  /* CompleteClass */
  override def isIncrementallyUnusable(): Boolean = js.native
  /* CompleteClass */
  override def isList(): Boolean = js.native
  /* CompleteClass */
  override def isNode(): Boolean = js.native
  /* CompleteClass */
  override def isSeparatedList(): Boolean = js.native
  /* InferMemberOverrides */
  override def isSwitchClause(): Boolean = js.native
  /* CompleteClass */
  override def isToken(): Boolean = js.native
  /* CompleteClass */
  override def isTypeScriptSpecific(): Boolean = js.native
  /* CompleteClass */
  override def kind(): SyntaxKind = js.native
  /* CompleteClass */
  override def lastToken(): ISyntaxToken = js.native
  /* CompleteClass */
  override def leadingTrivia(): ISyntaxTriviaList = js.native
  /* CompleteClass */
  override def leadingTriviaWidth(): Double = js.native
  /* CompleteClass */
  override def trailingTrivia(): ISyntaxTriviaList = js.native
  /* CompleteClass */
  override def trailingTriviaWidth(): Double = js.native
  def update(defaultKeyword: ISyntaxToken, colonToken: ISyntaxToken, statements: ISyntaxList): DefaultSwitchClauseSyntax = js.native
  /* CompleteClass */
  override def width(): Double = js.native
  def withColonToken(colonToken: ISyntaxToken): DefaultSwitchClauseSyntax = js.native
  def withDefaultKeyword(defaultKeyword: ISyntaxToken): DefaultSwitchClauseSyntax = js.native
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  def withStatement(statement: IStatementSyntax): DefaultSwitchClauseSyntax = js.native
  def withStatements(statements: ISyntaxList): DefaultSwitchClauseSyntax = js.native
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
}

/* static members */
@JSGlobal("TypeScript.DefaultSwitchClauseSyntax")
@js.native
object DefaultSwitchClauseSyntax extends js.Object {
  def create(defaultKeyword: ISyntaxToken, colonToken: ISyntaxToken): DefaultSwitchClauseSyntax = js.native
  def create1(): DefaultSwitchClauseSyntax = js.native
}

