package typings
package atWebscopeioReactDashTextareaDashAutocompleteLib.atWebscopeioReactDashTextareaDashAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextareaState[TItem] extends js.Object {
  var actualToken: java.lang.String
  var component: js.UndefOr[reactLib.reactMod.SFC[ItemComponentProps[TItem]]] = js.undefined
  var currentTrigger: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Array[TItem]] = js.undefined
  var dataLoading: scala.Boolean
  var left: js.UndefOr[scala.Double] = js.undefined
  var selectionEnd: scala.Double
  var selectionStart: scala.Double
  var top: js.UndefOr[scala.Double] = js.undefined
  var value: java.lang.String
}

object TextareaState {
  @scala.inline
  def apply[TItem](
    actualToken: java.lang.String,
    dataLoading: scala.Boolean,
    selectionEnd: scala.Double,
    selectionStart: scala.Double,
    value: java.lang.String,
    component: reactLib.reactMod.SFC[ItemComponentProps[TItem]] = null,
    currentTrigger: java.lang.String = null,
    data: js.Array[TItem] = null,
    left: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null
  ): TextareaState[TItem] = {
    val __obj = js.Dynamic.literal(actualToken = actualToken, dataLoading = dataLoading, selectionEnd = selectionEnd, selectionStart = selectionStart, value = value)
    if (component != null) __obj.updateDynamic("component")(component)
    if (currentTrigger != null) __obj.updateDynamic("currentTrigger")(currentTrigger)
    if (data != null) __obj.updateDynamic("data")(data)
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextareaState[TItem]]
  }
}

