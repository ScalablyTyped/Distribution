package typings.webpackDashServe.webpackDashServeMod

import typings.webpackDashServe.Anon_Compiler
import typings.webpackDashServe.Anon_CompilerStats
import typings.webpackDashServe.Anon_CompilerStatsAny
import typings.webpackDashServe.Anon_Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var `build-finished`: Anon_CompilerStats
  var `build-started`: Anon_Compiler
  var `compiler-error`: Anon_CompilerStatsAny
  var `compiler-warning`: Anon_CompilerStatsAny
  var listening: Anon_Options
}

object EventMap {
  @scala.inline
  def apply(
    `build-finished`: Anon_CompilerStats,
    `build-started`: Anon_Compiler,
    `compiler-error`: Anon_CompilerStatsAny,
    `compiler-warning`: Anon_CompilerStatsAny,
    listening: Anon_Options
  ): EventMap = {
    val __obj = js.Dynamic.literal(listening = listening.asInstanceOf[js.Any])
    __obj.updateDynamic("build-finished")(`build-finished`.asInstanceOf[js.Any])
    __obj.updateDynamic("build-started")(`build-started`.asInstanceOf[js.Any])
    __obj.updateDynamic("compiler-error")(`compiler-error`.asInstanceOf[js.Any])
    __obj.updateDynamic("compiler-warning")(`compiler-warning`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
}

