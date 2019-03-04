package typings
package webpackDashDevDashMiddlewareLib.webpackDashDevDashMiddlewareMod.WebpackDevMiddlewareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReporterOptions extends js.Object {
  var log: Logger
  var state: scala.Boolean
  var stats: js.UndefOr[webpackLib.webpackMod.Stats] = js.undefined
}

object ReporterOptions {
  @scala.inline
  def apply(log: Logger, state: scala.Boolean, stats: webpackLib.webpackMod.Stats = null): ReporterOptions = {
    val __obj = js.Dynamic.literal(log = log, state = state)
    if (stats != null) __obj.updateDynamic("stats")(stats)
    __obj.asInstanceOf[ReporterOptions]
  }
}

