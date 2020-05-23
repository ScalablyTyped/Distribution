package typings.webpackPluginServe.anon

import typings.webpackPluginServe.webpackPluginServeStrings.debug
import typings.webpackPluginServe.webpackPluginServeStrings.error
import typings.webpackPluginServe.webpackPluginServeStrings.info
import typings.webpackPluginServe.webpackPluginServeStrings.trace
import typings.webpackPluginServe.webpackPluginServeStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Level extends js.Object {
  var level: trace | debug | info | warn | error
  var timestamp: js.UndefOr[Boolean] = js.undefined
}

object Level {
  @scala.inline
  def apply(level: trace | debug | info | warn | error, timestamp: js.UndefOr[Boolean] = js.undefined): Level = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
}

