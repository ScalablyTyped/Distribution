package typings.atWebscopeioReactDashTextareaDashAutocomplete.atWebscopeioReactDashTextareaDashAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextToReplaceType extends js.Object {
  var caretPosition: CaretPositionType
  var key: js.UndefOr[String] = js.undefined
  var text: String
}

object TextToReplaceType {
  @scala.inline
  def apply(caretPosition: CaretPositionType, text: String, key: String = null): TextToReplaceType = {
    val __obj = js.Dynamic.literal(caretPosition = caretPosition.asInstanceOf[js.Any], text = text)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[TextToReplaceType]
  }
}

