package typings
package vegaDashTypingsLib.typesSpecBindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindCheckbox
  extends BaseBinding
     with Binding {
  var input: vegaDashTypingsLib.vegaDashTypingsLibStrings.checkbox
}

object BindCheckbox {
  @scala.inline
  def apply(
    input: vegaDashTypingsLib.vegaDashTypingsLibStrings.checkbox,
    debounce: scala.Int | scala.Double = null,
    element: Element = null,
    name: java.lang.String = null,
    `type`: java.lang.String = null
  ): BindCheckbox = {
    val __obj = js.Dynamic.literal(input = input)
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BindCheckbox]
  }
}

