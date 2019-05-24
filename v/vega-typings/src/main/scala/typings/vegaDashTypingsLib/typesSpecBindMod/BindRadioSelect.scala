package typings
package vegaDashTypingsLib.typesSpecBindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindRadioSelect
  extends BaseBinding
     with Binding {
  var input: vegaDashTypingsLib.vegaDashTypingsLibStrings.radio | vegaDashTypingsLib.vegaDashTypingsLibStrings.select
  var options: js.Array[_]
}

object BindRadioSelect {
  @scala.inline
  def apply(
    input: vegaDashTypingsLib.vegaDashTypingsLibStrings.radio | vegaDashTypingsLib.vegaDashTypingsLibStrings.select,
    options: js.Array[_],
    debounce: scala.Int | scala.Double = null,
    element: Element = null,
    name: java.lang.String = null,
    `type`: java.lang.String = null
  ): BindRadioSelect = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], options = options)
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BindRadioSelect]
  }
}

