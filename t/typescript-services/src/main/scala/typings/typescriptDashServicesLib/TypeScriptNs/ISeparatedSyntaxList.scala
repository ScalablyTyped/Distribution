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
    childAt: js.Function1[scala.Double, ISyntaxNodeOrToken],
    childCount: js.Function0[scala.Double],
    collectTextElements: js.Function1[js.Array[java.lang.String], scala.Unit],
    firstToken: js.Function0[ISyntaxToken],
    fullText: js.Function0[java.lang.String],
    fullWidth: js.Function0[scala.Double],
    insertChildrenInto: js.Function2[js.Array[ISyntaxElement], scala.Double, scala.Unit],
    isIncrementallyUnusable: js.Function0[scala.Boolean],
    isList: js.Function0[scala.Boolean],
    isNode: js.Function0[scala.Boolean],
    isSeparatedList: js.Function0[scala.Boolean],
    isToken: js.Function0[scala.Boolean],
    isTypeScriptSpecific: js.Function0[scala.Boolean],
    kind: js.Function0[SyntaxKind],
    lastToken: js.Function0[ISyntaxToken],
    leadingTrivia: js.Function0[ISyntaxTriviaList],
    leadingTriviaWidth: js.Function0[scala.Double],
    nonSeparatorAt: js.Function1[scala.Double, ISyntaxNodeOrToken],
    nonSeparatorCount: js.Function0[scala.Double],
    separatorAt: js.Function1[scala.Double, ISyntaxToken],
    separatorCount: js.Function0[scala.Double],
    toArray: js.Function0[js.Array[ISyntaxNodeOrToken]],
    toNonSeparatorArray: js.Function0[js.Array[ISyntaxNodeOrToken]],
    trailingTrivia: js.Function0[ISyntaxTriviaList],
    trailingTriviaWidth: js.Function0[scala.Double],
    width: js.Function0[scala.Double]
  ): ISeparatedSyntaxList = {
    val __obj = js.Dynamic.literal(childAt = childAt, childCount = childCount, collectTextElements = collectTextElements, firstToken = firstToken, fullText = fullText, fullWidth = fullWidth, insertChildrenInto = insertChildrenInto, isIncrementallyUnusable = isIncrementallyUnusable, isList = isList, isNode = isNode, isSeparatedList = isSeparatedList, isToken = isToken, isTypeScriptSpecific = isTypeScriptSpecific, kind = kind, lastToken = lastToken, leadingTrivia = leadingTrivia, leadingTriviaWidth = leadingTriviaWidth, nonSeparatorAt = nonSeparatorAt, nonSeparatorCount = nonSeparatorCount, separatorAt = separatorAt, separatorCount = separatorCount, toArray = toArray, toNonSeparatorArray = toNonSeparatorArray, trailingTrivia = trailingTrivia, trailingTriviaWidth = trailingTriviaWidth, width = width)
  
    __obj.asInstanceOf[ISeparatedSyntaxList]
  }
}

