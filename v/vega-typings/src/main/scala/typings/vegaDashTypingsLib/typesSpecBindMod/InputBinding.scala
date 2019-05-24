package typings
package vegaDashTypingsLib.typesSpecBindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputBinding
  extends BaseBinding
     with Binding {
  var autocomplete: js.UndefOr[java.lang.String] = js.undefined
  var input: js.UndefOr[java.lang.String] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
}

object InputBinding {
  @scala.inline
  def apply(
    autocomplete: java.lang.String = null,
    debounce: scala.Int | scala.Double = null,
    element: Element = null,
    input: java.lang.String = null,
    name: java.lang.String = null,
    placeholder: java.lang.String = null,
    `type`: java.lang.String = null
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

