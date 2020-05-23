package typings.vegaTypings.bindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseBinding extends js.Object {
  var debounce: js.UndefOr[Double] = js.undefined
  var element: js.UndefOr[Element] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object BaseBinding {
  @scala.inline
  def apply(
    debounce: js.UndefOr[Double] = js.undefined,
    element: Element = null,
    name: String = null,
    `type`: String = null
  ): BaseBinding = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debounce)) __obj.updateDynamic("debounce")(debounce.get.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseBinding]
  }
}

