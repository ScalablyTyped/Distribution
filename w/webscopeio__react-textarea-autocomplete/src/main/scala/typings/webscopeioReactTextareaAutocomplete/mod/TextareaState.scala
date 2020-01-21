package typings.webscopeioReactTextareaAutocomplete.mod

import typings.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextareaState[TItem] extends js.Object {
  var actualToken: String
  var component: js.UndefOr[SFC[ItemComponentProps[TItem]]] = js.undefined
  var currentTrigger: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Array[TItem]] = js.undefined
  var dataLoading: Boolean
  var left: js.UndefOr[Double] = js.undefined
  var selectionEnd: Double
  var selectionStart: Double
  var top: js.UndefOr[Double] = js.undefined
  var value: String
}

object TextareaState {
  @scala.inline
  def apply[TItem](
    actualToken: String,
    dataLoading: Boolean,
    selectionEnd: Double,
    selectionStart: Double,
    value: String,
    component: SFC[ItemComponentProps[TItem]] = null,
    currentTrigger: String = null,
    data: js.Array[TItem] = null,
    left: Int | Double = null,
    top: Int | Double = null
  ): TextareaState[TItem] = {
    val __obj = js.Dynamic.literal(actualToken = actualToken.asInstanceOf[js.Any], dataLoading = dataLoading.asInstanceOf[js.Any], selectionEnd = selectionEnd.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (currentTrigger != null) __obj.updateDynamic("currentTrigger")(currentTrigger.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextareaState[TItem]]
  }
}

