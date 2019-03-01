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
    childAt: js.Function1[scala.Double, ISyntaxElement],
    childCount: js.Function0[scala.Double],
    collectTextElements: js.Function1[js.Array[java.lang.String], scala.Unit],
    firstToken: js.Function0[ISyntaxToken],
    fullText: js.Function0[java.lang.String],
    fullWidth: js.Function0[scala.Double],
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
    trailingTrivia: js.Function0[ISyntaxTriviaList],
    trailingTriviaWidth: js.Function0[scala.Double],
    width: js.Function0[scala.Double]
  ): ISyntaxElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("childAt")(childAt)
    __obj.updateDynamic("childCount")(childCount)
    __obj.updateDynamic("collectTextElements")(collectTextElements)
    __obj.updateDynamic("firstToken")(firstToken)
    __obj.updateDynamic("fullText")(fullText)
    __obj.updateDynamic("fullWidth")(fullWidth)
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
    __obj.updateDynamic("trailingTrivia")(trailingTrivia)
    __obj.updateDynamic("trailingTriviaWidth")(trailingTriviaWidth)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ISyntaxElement]
  }
}

