package typings.webpackDevMiddleware.mod

import typings.webpack.mod.Stats
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
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReporterOptions]
  }
}

