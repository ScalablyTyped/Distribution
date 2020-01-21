package typings.webpackServe.mod

import typings.webpackServe.AnonCompiler
import typings.webpackServe.AnonCompilerStats
import typings.webpackServe.AnonCompilerStatsAny
import typings.webpackServe.AnonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var `build-finished`: AnonCompilerStats
  var `build-started`: AnonCompiler
  var `compiler-error`: AnonCompilerStatsAny
  var `compiler-warning`: AnonCompilerStatsAny
  var listening: AnonOptions
}

object EventMap {
  @scala.inline
  def apply(
    `build-finished`: AnonCompilerStats,
    `build-started`: AnonCompiler,
    `compiler-error`: AnonCompilerStatsAny,
    `compiler-warning`: AnonCompilerStatsAny,
    listening: AnonOptions
  ): EventMap = {
    val __obj = js.Dynamic.literal(listening = listening.asInstanceOf[js.Any])
    __obj.updateDynamic("build-finished")(`build-finished`.asInstanceOf[js.Any])
    __obj.updateDynamic("build-started")(`build-started`.asInstanceOf[js.Any])
    __obj.updateDynamic("compiler-error")(`compiler-error`.asInstanceOf[js.Any])
    __obj.updateDynamic("compiler-warning")(`compiler-warning`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
}

