package typings.webpackHotMiddleware.mod

import typings.webpackHotMiddleware.webpackHotMiddlewareBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiddlewareOptions extends js.Object {
  var heartbeat: js.UndefOr[Double] = js.undefined
  var log: js.UndefOr[`false` | Logger] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object MiddlewareOptions {
  @scala.inline
  def apply(heartbeat: js.UndefOr[Double] = js.undefined, log: `false` | Logger = null, path: String = null): MiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(heartbeat)) __obj.updateDynamic("heartbeat")(heartbeat.get.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiddlewareOptions]
  }
}

