package typings.vegaDashTypings.typesSpecBindMod

import typings.vegaDashTypings.vegaDashTypingsStrings.checkbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindCheckbox
  extends BaseBinding
     with Binding {
  var input: checkbox
}

object BindCheckbox {
  @scala.inline
  def apply(
    input: checkbox,
    debounce: Int | Double = null,
    element: Element = null,
    name: String = null,
    `type`: String = null
  ): BindCheckbox = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindCheckbox]
  }
}

