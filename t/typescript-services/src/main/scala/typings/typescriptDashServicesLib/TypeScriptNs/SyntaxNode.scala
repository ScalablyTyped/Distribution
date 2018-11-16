package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SyntaxNode")
@js.native
class SyntaxNode protected () extends ISyntaxNodeOrToken {
  def this(parsedInStrictMode: scala.Boolean) = this()
  var _data: js.Any = js.native
  /* CompleteClass */
  override def accept(visitor: ISyntaxVisitor): js.Any = js.native
  /* CompleteClass */
  override def childAt(index: scala.Double): ISyntaxElement = js.native
  /* CompleteClass */
  override def childCount(): scala.Double = js.native
  /* CompleteClass */
  override def collectTextElements(elements: js.Array[java.lang.String]): scala.Unit = js.native
  /* private */ def computeData(): js.Any = js.native
  /* private */ def data(): js.Any = js.native
  def findCompleteTokenOnLeft(position: scala.Double): PositionedToken = js.native
  def findCompleteTokenOnLeft(position: scala.Double, includeSkippedTokens: scala.Boolean): PositionedToken = js.native
  def findToken(position: scala.Double): PositionedToken = js.native
  def findToken(position: scala.Double, includeSkippedTokens: scala.Boolean): PositionedToken = js.native
  /* private */ def findTokenInternal(parent: js.Any, position: js.Any, fullStart: js.Any): js.Any = js.native
  def findTokenOnLeft(position: scala.Double): PositionedToken = js.native
  def findTokenOnLeft(position: scala.Double, includeSkippedTokens: scala.Boolean): PositionedToken = js.native
  /* CompleteClass */
  override def firstToken(): ISyntaxToken = js.native
  /* CompleteClass */
  override def fullText(): java.lang.String = js.native
  /* CompleteClass */
  override def fullWidth(): scala.Double = js.native
  def hasLeadingTrivia(): scala.Boolean = js.native
  def hasTrailingTrivia(): scala.Boolean = js.native
  def insertChildrenInto(array: js.Array[ISyntaxElement], index: scala.Double): scala.Unit = js.native
  def isClassElement(): scala.Boolean = js.native
  def isExpression(): scala.Boolean = js.native
  /* CompleteClass */
  override def isIncrementallyUnusable(): scala.Boolean = js.native
  /* CompleteClass */
  override def isList(): scala.Boolean = js.native
  def isModuleElement(): scala.Boolean = js.native
  /* CompleteClass */
  override def isNode(): scala.Boolean = js.native
  /* CompleteClass */
  override def isSeparatedList(): scala.Boolean = js.native
  def isStatement(): scala.Boolean = js.native
  def isSwitchClause(): scala.Boolean = js.native
  /* CompleteClass */
  override def isToken(): scala.Boolean = js.native
  def isTypeMember(): scala.Boolean = js.native
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
  def parsedInStrictMode(): scala.Boolean = js.native
  def replaceToken(token1: ISyntaxToken, token2: ISyntaxToken): SyntaxNode = js.native
  def structuralEquals(node: SyntaxNode): scala.Boolean = js.native
  def toJSON(key: js.Any): js.Any = js.native
  /* CompleteClass */
  override def trailingTrivia(): ISyntaxTriviaList = js.native
  /* CompleteClass */
  override def trailingTriviaWidth(): scala.Double = js.native
  /* private */ def tryGetEndOfFileAt(position: js.Any): js.Any = js.native
  /* CompleteClass */
  override def width(): scala.Double = js.native
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
}

