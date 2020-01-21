package typings.webpackPluginServe

import typings.webpackPluginServe.webpackPluginServeStrings.debug
import typings.webpackPluginServe.webpackPluginServeStrings.error
import typings.webpackPluginServe.webpackPluginServeStrings.info
import typings.webpackPluginServe.webpackPluginServeStrings.trace
import typings.webpackPluginServe.webpackPluginServeStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDebug extends js.Object {
  var level: trace | debug | info | warn | error
  var timestamp: js.UndefOr[Boolean] = js.undefined
}

object AnonDebug {
  @scala.inline
  def apply(level: trace | debug | info | warn | error, timestamp: js.UndefOr[Boolean] = js.undefined): AnonDebug = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDebug]
  }
}

