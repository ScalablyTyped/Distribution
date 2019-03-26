package typings
package webpackDashPluginDashServeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug extends js.Object {
  var level: webpackDashPluginDashServeLib.webpackDashPluginDashServeLibStrings.trace | webpackDashPluginDashServeLib.webpackDashPluginDashServeLibStrings.debug | webpackDashPluginDashServeLib.webpackDashPluginDashServeLibStrings.info | webpackDashPluginDashServeLib.webpackDashPluginDashServeLibStrings.warn | webpackDashPluginDashServeLib.webpackDashPluginDashServeLibStrings.error
  var timestamp: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Debug {
  @scala.inline
  def apply(
    level: webpackDashPluginDashServeLib.webpackDashPluginDashServeLibStrings.trace | webpackDashPluginDashServeLib.webpackDashPluginDashServeLibStrings.debug | webpackDashPluginDashServeLib.webpackDashPluginDashServeLibStrings.info | webpackDashPluginDashServeLib.webpackDashPluginDashServeLibStrings.warn | webpackDashPluginDashServeLib.webpackDashPluginDashServeLibStrings.error,
    timestamp: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Debug = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[Anon_Debug]
  }
}

