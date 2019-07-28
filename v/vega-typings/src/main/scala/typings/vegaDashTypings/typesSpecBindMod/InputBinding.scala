package typings.vegaDashTypings.typesSpecBindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputBinding
  extends BaseBinding
     with Binding {
  var autocomplete: js.UndefOr[String] = js.undefined
  var input: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
}

object InputBinding {
  @scala.inline
  def apply(
    autocomplete: String = null,
    debounce: Int | Double = null,
    element: Element = null,
    input: String = null,
    name: String = null,
    placeholder: String = null,
    `type`: String = null
  ): InputBinding = {
    val __obj = js.Dynamic.literal()
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(autocomplete)
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element)
    if (input != null) __obj.updateDynamic("input")(input)
    if (name != null) __obj.updateDynamic("name")(name)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[InputBinding]
  }
}

