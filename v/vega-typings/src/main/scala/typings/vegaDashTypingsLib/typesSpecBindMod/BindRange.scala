package typings
package vegaDashTypingsLib.typesSpecBindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindRange
  extends BaseBinding
     with Binding {
  var input: vegaDashTypingsLib.vegaDashTypingsLibStrings.range
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
}

object BindRange {
  @scala.inline
  def apply(
    input: vegaDashTypingsLib.vegaDashTypingsLibStrings.range,
    debounce: scala.Int | scala.Double = null,
    element: Element = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    step: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): BindRange = {
    val __obj = js.Dynamic.literal(input = input)
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BindRange]
  }
}

