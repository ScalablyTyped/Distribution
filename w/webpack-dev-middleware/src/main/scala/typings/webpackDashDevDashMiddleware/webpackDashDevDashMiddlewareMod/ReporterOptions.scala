package typings.webpackDashDevDashMiddleware.webpackDashDevDashMiddlewareMod

import typings.webpack.webpackMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReporterOptions extends js.Object {
  var log: Logger
  var state: Boolean
  var stats: js.UndefOr[Stats] = js.undefined
}

object ReporterOptions {
  @scala.inline
  def apply(log: Logger, state: Boolean, stats: Stats = null): ReporterOptions = {
    val __obj = js.Dynamic.literal(log = log, state = state)
    if (stats != null) __obj.updateDynamic("stats")(stats)
    __obj.asInstanceOf[ReporterOptions]
  }
}

