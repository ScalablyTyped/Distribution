package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyntaxElement extends js.Object {
  def childAt(index: scala.Double): ISyntaxElement
  def childCount(): scala.Double
  def collectTextElements(elements: js.Array[java.lang.String]): scala.Unit
  def firstToken(): ISyntaxToken
  def fullText(): java.lang.String
  def fullWidth(): scala.Double
  def isIncrementallyUnusable(): scala.Boolean
  def isList(): scala.Boolean
  def isNode(): scala.Boolean
  def isSeparatedList(): scala.Boolean
  def isToken(): scala.Boolean
  def isTypeScriptSpecific(): scala.Boolean
  def kind(): SyntaxKind
  def lastToken(): ISyntaxToken
  def leadingTrivia(): ISyntaxTriviaList
  def leadingTriviaWidth(): scala.Double
  def trailingTrivia(): ISyntaxTriviaList
  def trailingTriviaWidth(): scala.Double
  def width(): scala.Double
}

object ISyntaxElement {
  @scala.inline
  def apply(
    childAt: scala.Double => ISyntaxElement,
    childCount: () => scala.Double,
    collectTextElements: js.Array[java.lang.String] => scala.Unit,
    firstToken: () => ISyntaxToken,
    fullText: () => java.lang.String,
    fullWidth: () => scala.Double,
    isIncrementallyUnusable: () => scala.Boolean,
    isList: () => scala.Boolean,
    isNode: () => scala.Boolean,
    isSeparatedList: () => scala.Boolean,
    isToken: () => scala.Boolean,
    isTypeScriptSpecific: () => scala.Boolean,
    kind: () => SyntaxKind,
    lastToken: () => ISyntaxToken,
    leadingTrivia: () => ISyntaxTriviaList,
    leadingTriviaWidth: () => scala.Double,
    trailingTrivia: () => ISyntaxTriviaList,
    trailingTriviaWidth: () => scala.Double,
    width: () => scala.Double
  ): ISyntaxElement = {
    val __obj = js.Dynamic.literal(childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), collectTextElements = js.Any.fromFunction1(collectTextElements), firstToken = js.Any.fromFunction0(firstToken), fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), isIncrementallyUnusable = js.Any.fromFunction0(isIncrementallyUnusable), isList = js.Any.fromFunction0(isList), isNode = js.Any.fromFunction0(isNode), isSeparatedList = js.Any.fromFunction0(isSeparatedList), isToken = js.Any.fromFunction0(isToken), isTypeScriptSpecific = js.Any.fromFunction0(isTypeScriptSpecific), kind = js.Any.fromFunction0(kind), lastToken = js.Any.fromFunction0(lastToken), leadingTrivia = js.Any.fromFunction0(leadingTrivia), leadingTriviaWidth = js.Any.fromFunction0(leadingTriviaWidth), trailingTrivia = js.Any.fromFunction0(trailingTrivia), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), width = js.Any.fromFunction0(width))
  
    __obj.asInstanceOf[ISyntaxElement]
  }
}

