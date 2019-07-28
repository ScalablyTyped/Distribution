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
    val __obj = js.Dynamic.literal(input = input)
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BindCheckbox]
  }
}

