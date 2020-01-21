package typings.vegaTypings.bindMod

import typings.vegaTypings.vegaTypingsStrings.radio
import typings.vegaTypings.vegaTypingsStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindRadioSelect
  extends BaseBinding
     with Binding {
  var input: radio | select
  var labels: js.UndefOr[js.Array[String]] = js.undefined
  var options: js.Array[_]
}

object BindRadioSelect {
  @scala.inline
  def apply(
    input: radio | select,
    options: js.Array[_],
    debounce: Int | Double = null,
    element: Element = null,
    labels: js.Array[String] = null,
    name: String = null,
    `type`: String = null
  ): BindRadioSelect = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindRadioSelect]
  }
}

