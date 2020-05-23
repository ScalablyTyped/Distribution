package typings.webdriverio

import typings.webdriverio.WebdriverIO.ActionTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Properties of TouchAction which are similar in sync and async mode
/* Inlined std.Omit<webdriverio.WebdriverIO.TouchAction, 'element'> */
trait TouchActionSync extends js.Object {
  var action: ActionTypes
  var ms: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object TouchActionSync {
  @scala.inline
  def apply(
    action: ActionTypes,
    ms: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): TouchActionSync = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (!js.isUndefined(ms)) __obj.updateDynamic("ms")(ms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchActionSync]
  }
}

