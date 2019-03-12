package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISeparatedSyntaxList extends ISyntaxElement {
  def insertChildrenInto(array: js.Array[ISyntaxElement], index: scala.Double): scala.Unit
  def nonSeparatorAt(index: scala.Double): ISyntaxNodeOrToken
  def nonSeparatorCount(): scala.Double
  def separatorAt(index: scala.Double): ISyntaxToken
  def separatorCount(): scala.Double
  def toArray(): js.Array[ISyntaxNodeOrToken]
  def toNonSeparatorArray(): js.Array[ISyntaxNodeOrToken]
}

object ISeparatedSyntaxList {
  @scala.inline
  def apply(
    childAt: scala.Double => ISyntaxNodeOrToken,
    childCount: () => scala.Double,
    collectTextElements: js.Array[java.lang.String] => scala.Unit,
    firstToken: () => ISyntaxToken,
    fullText: () => java.lang.String,
    fullWidth: () => scala.Double,
    insertChildrenInto: (js.Array[ISyntaxElement], scala.Double) => scala.Unit,
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
    nonSeparatorAt: scala.Double => ISyntaxNodeOrToken,
    nonSeparatorCount: () => scala.Double,
    separatorAt: scala.Double => ISyntaxToken,
    separatorCount: () => scala.Double,
    toArray: () => js.Array[ISyntaxNodeOrToken],
    toNonSeparatorArray: () => js.Array[ISyntaxNodeOrToken],
    trailingTrivia: () => ISyntaxTriviaList,
    trailingTriviaWidth: () => scala.Double,
    width: () => scala.Double
  ): ISeparatedSyntaxList = {
    val __obj = js.Dynamic.literal(childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), collectTextElements = js.Any.fromFunction1(collectTextElements), firstToken = js.Any.fromFunction0(firstToken), fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), insertChildrenInto = js.Any.fromFunction2(insertChildrenInto), isIncrementallyUnusable = js.Any.fromFunction0(isIncrementallyUnusable), isList = js.Any.fromFunction0(isList), isNode = js.Any.fromFunction0(isNode), isSeparatedList = js.Any.fromFunction0(isSeparatedList), isToken = js.Any.fromFunction0(isToken), isTypeScriptSpecific = js.Any.fromFunction0(isTypeScriptSpecific), kind = js.Any.fromFunction0(kind), lastToken = js.Any.fromFunction0(lastToken), leadingTrivia = js.Any.fromFunction0(leadingTrivia), leadingTriviaWidth = js.Any.fromFunction0(leadingTriviaWidth), nonSeparatorAt = js.Any.fromFunction1(nonSeparatorAt), nonSeparatorCount = js.Any.fromFunction0(nonSeparatorCount), separatorAt = js.Any.fromFunction1(separatorAt), separatorCount = js.Any.fromFunction0(separatorCount), toArray = js.Any.fromFunction0(toArray), toNonSeparatorArray = js.Any.fromFunction0(toNonSeparatorArray), trailingTrivia = js.Any.fromFunction0(trailingTrivia), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), width = js.Any.fromFunction0(width))
  
    __obj.asInstanceOf[ISeparatedSyntaxList]
  }
}

