package typings
package webdriverioLib.WebdriverIONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchAction extends js.Object {
  var action: ActionTypes
  var element: js.UndefOr[Element] = js.undefined
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

object TouchAction {
  @scala.inline
  def apply(
    action: ActionTypes,
    element: Element = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): TouchAction = {
    val __obj = js.Dynamic.literal(action = action)
    if (element != null) __obj.updateDynamic("element")(element)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchAction]
  }
}

