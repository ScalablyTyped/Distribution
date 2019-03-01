package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyntaxList extends ISyntaxElement {
  def insertChildrenInto(array: js.Array[ISyntaxElement], index: scala.Double): scala.Unit
  def toArray(): js.Array[ISyntaxNodeOrToken]
}

object ISyntaxList {
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
    toArray: js.Function0[js.Array[ISyntaxNodeOrToken]],
    trailingTrivia: js.Function0[ISyntaxTriviaList],
    trailingTriviaWidth: js.Function0[scala.Double],
    width: js.Function0[scala.Double]
  ): ISyntaxList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("childAt")(childAt)
    __obj.updateDynamic("childCount")(childCount)
    __obj.updateDynamic("collectTextElements")(collectTextElements)
    __obj.updateDynamic("firstToken")(firstToken)
    __obj.updateDynamic("fullText")(fullText)
    __obj.updateDynamic("fullWidth")(fullWidth)
    __obj.updateDynamic("insertChildrenInto")(insertChildrenInto)
    __obj.updateDynamic("isIncrementallyUnusable")(isIncrementallyUnusable)
    __obj.updateDynamic("isList")(isList)
    __obj.updateDynamic("isNode")(isNode)
    __obj.updateDynamic("isSeparatedList")(isSeparatedList)
    __obj.updateDynamic("isToken")(isToken)
    __obj.updateDynamic("isTypeScriptSpecific")(isTypeScriptSpecific)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("lastToken")(lastToken)
    __obj.updateDynamic("leadingTrivia")(leadingTrivia)
    __obj.updateDynamic("leadingTriviaWidth")(leadingTriviaWidth)
    __obj.updateDynamic("toArray")(toArray)
    __obj.updateDynamic("trailingTrivia")(trailingTrivia)
    __obj.updateDynamic("trailingTriviaWidth")(trailingTriviaWidth)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ISyntaxList]
  }
}

