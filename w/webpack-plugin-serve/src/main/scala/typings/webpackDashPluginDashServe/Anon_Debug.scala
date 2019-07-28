package typings.webpackDashPluginDashServe

import typings.webpackDashPluginDashServe.webpackDashPluginDashServeStrings.debug
import typings.webpackDashPluginDashServe.webpackDashPluginDashServeStrings.error
import typings.webpackDashPluginDashServe.webpackDashPluginDashServeStrings.info
import typings.webpackDashPluginDashServe.webpackDashPluginDashServeStrings.trace
import typings.webpackDashPluginDashServe.webpackDashPluginDashServeStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug extends js.Object {
  var level: trace | debug | info | warn | error
  var timestamp: js.UndefOr[Boolean] = js.undefined
}

object Anon_Debug {
  @scala.inline
  def apply(level: trace | debug | info | warn | error, timestamp: js.UndefOr[Boolean] = js.undefined): Anon_Debug = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[Anon_Debug]
  }
}

