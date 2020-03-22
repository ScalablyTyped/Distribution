package typings.webdriverio.WebdriverIOAsync

import typings.webdriverio.TouchActionSync
import typings.webdriverio.WebdriverIO.ActionTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchAction extends TouchActionSync {
  var element: js.UndefOr[Element] = js.undefined
}

object TouchAction {
  @scala.inline
  def apply(
    action: ActionTypes,
    element: Element = null,
    ms: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): TouchAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (ms != null) __obj.updateDynamic("ms")(ms.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchAction]
  }
}

