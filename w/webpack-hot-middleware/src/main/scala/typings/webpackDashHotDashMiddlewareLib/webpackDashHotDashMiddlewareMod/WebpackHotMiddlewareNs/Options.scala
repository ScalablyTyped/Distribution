package typings
package webpackDashHotDashMiddlewareLib.webpackDashHotDashMiddlewareMod.WebpackHotMiddlewareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var heartbeat: js.UndefOr[scala.Double] = js.undefined
  var log: js.UndefOr[
    webpackDashHotDashMiddlewareLib.webpackDashHotDashMiddlewareLibNumbers.`false` | Logger
  ] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var reload: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    heartbeat: scala.Int | scala.Double = null,
    log: webpackDashHotDashMiddlewareLib.webpackDashHotDashMiddlewareLibNumbers.`false` | Logger = null,
    path: java.lang.String = null,
    reload: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (heartbeat != null) __obj.updateDynamic("heartbeat")(heartbeat.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(reload)) __obj.updateDynamic("reload")(reload)
    __obj.asInstanceOf[Options]
  }
}

