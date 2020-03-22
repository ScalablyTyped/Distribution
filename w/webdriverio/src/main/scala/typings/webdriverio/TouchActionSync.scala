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
  def apply(action: ActionTypes, ms: Int | Double = null, x: Int | Double = null, y: Int | Double = null): TouchActionSync = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (ms != null) __obj.updateDynamic("ms")(ms.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchActionSync]
  }
}

