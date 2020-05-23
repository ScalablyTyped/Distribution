package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyntaxNode extends ISyntaxNodeOrToken {
  var _data: js.Any = js.native
  /* private */ def computeData(): js.Any = js.native
  /* private */ def data(): js.Any = js.native
  def findCompleteTokenOnLeft(position: Double): PositionedToken = js.native
  def findCompleteTokenOnLeft(position: Double, includeSkippedTokens: Boolean): PositionedToken = js.native
  def findToken(position: Double): PositionedToken = js.native
  def findToken(position: Double, includeSkippedTokens: Boolean): PositionedToken = js.native
  /* private */ def findTokenInternal(parent: js.Any, position: js.Any, fullStart: js.Any): js.Any = js.native
  def findTokenOnLeft(position: Double): PositionedToken = js.native
  def findTokenOnLeft(position: Double, includeSkippedTokens: Boolean): PositionedToken = js.native
  def hasLeadingTrivia(): Boolean = js.native
  def hasTrailingTrivia(): Boolean = js.native
  def insertChildrenInto(array: js.Array[ISyntaxElement], index: Double): Unit = js.native
  def isClassElement(): Boolean = js.native
  def isExpression(): Boolean = js.native
  def isModuleElement(): Boolean = js.native
  def isStatement(): Boolean = js.native
  def isSwitchClause(): Boolean = js.native
  def isTypeMember(): Boolean = js.native
  def parsedInStrictMode(): Boolean = js.native
  def replaceToken(token1: ISyntaxToken, token2: ISyntaxToken): SyntaxNode = js.native
  def structuralEquals(node: SyntaxNode): Boolean = js.native
  def toJSON(key: js.Any): js.Any = js.native
  /* private */ def tryGetEndOfFileAt(position: js.Any): js.Any = js.native
}

