package typings
package atWebscopeioReactDashTextareaDashAutocompleteLib.atWebscopeioReactDashTextareaDashAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextToReplaceType extends js.Object {
  var caretPosition: CaretPositionType
  var key: js.UndefOr[java.lang.String] = js.undefined
  var text: java.lang.String
}

object TextToReplaceType {
  @scala.inline
  def apply(caretPosition: CaretPositionType, text: java.lang.String, key: java.lang.String = null): TextToReplaceType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("caretPosition")(caretPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("text")(text)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[TextToReplaceType]
  }
}

