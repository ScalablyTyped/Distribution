package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SyntaxNode")
@js.native
class SyntaxNode protected () extends ISyntaxNodeOrToken {
  def this(parsedInStrictMode: Boolean) = this()
  var _data: js.Any = js.native
  /* CompleteClass */
  override def accept(visitor: ISyntaxVisitor): js.Any = js.native
  /* CompleteClass */
  override def childAt(index: Double): ISyntaxElement = js.native
  /* CompleteClass */
  override def childCount(): Double = js.native
  /* CompleteClass */
  override def collectTextElements(elements: js.Array[String]): Unit = js.native
  /* private */ def computeData(): js.Any = js.native
  /* private */ def data(): js.Any = js.native
  def findCompleteTokenOnLeft(position: Double): PositionedToken = js.native
  def findCompleteTokenOnLeft(position: Double, includeSkippedTokens: Boolean): PositionedToken = js.native
  def findToken(position: Double): PositionedToken = js.native
  def findToken(position: Double, includeSkippedTokens: Boolean): PositionedToken = js.native
  /* private */ def findTokenInternal(parent: js.Any, position: js.Any, fullStart: js.Any): js.Any = js.native
  def findTokenOnLeft(position: Double): PositionedToken = js.native
  def findTokenOnLeft(position: Double, includeSkippedTokens: Boolean): PositionedToken = js.native
  /* CompleteClass */
  override def firstToken(): ISyntaxToken = js.native
  /* CompleteClass */
  override def fullText(): String = js.native
  /* CompleteClass */
  override def fullWidth(): Double = js.native
  def hasLeadingTrivia(): Boolean = js.native
  def hasTrailingTrivia(): Boolean = js.native
  def insertChildrenInto(array: js.Array[ISyntaxElement], index: Double): Unit = js.native
  def isClassElement(): Boolean = js.native
  def isExpression(): Boolean = js.native
  /* CompleteClass */
  override def isIncrementallyUnusable(): Boolean = js.native
  /* CompleteClass */
  override def isList(): Boolean = js.native
  def isModuleElement(): Boolean = js.native
  /* CompleteClass */
  override def isNode(): Boolean = js.native
  /* CompleteClass */
  override def isSeparatedList(): Boolean = js.native
  def isStatement(): Boolean = js.native
  def isSwitchClause(): Boolean = js.native
  /* CompleteClass */
  override def isToken(): Boolean = js.native
  def isTypeMember(): Boolean = js.native
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
  def parsedInStrictMode(): Boolean = js.native
  def replaceToken(token1: ISyntaxToken, token2: ISyntaxToken): SyntaxNode = js.native
  def structuralEquals(node: SyntaxNode): Boolean = js.native
  def toJSON(key: js.Any): js.Any = js.native
  /* CompleteClass */
  override def trailingTrivia(): ISyntaxTriviaList = js.native
  /* CompleteClass */
  override def trailingTriviaWidth(): Double = js.native
  /* private */ def tryGetEndOfFileAt(position: js.Any): js.Any = js.native
  /* CompleteClass */
  override def width(): Double = js.native
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
}

