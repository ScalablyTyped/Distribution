package typings
package webpackDashServeLib.webpackDashServeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var `build-finished`: webpackDashServeLib.Anon_CompilerStats
  var `build-started`: webpackDashServeLib.Anon_Compiler
  var `compiler-error`: webpackDashServeLib.Anon_CompilerStatsAny
  var `compiler-warning`: webpackDashServeLib.Anon_CompilerStatsAny
  var listening: webpackDashServeLib.Anon_Options
}

object EventMap {
  @scala.inline
  def apply(
    `build-finished`: webpackDashServeLib.Anon_CompilerStats,
    `build-started`: webpackDashServeLib.Anon_Compiler,
    `compiler-error`: webpackDashServeLib.Anon_CompilerStatsAny,
    `compiler-warning`: webpackDashServeLib.Anon_CompilerStatsAny,
    listening: webpackDashServeLib.Anon_Options
  ): EventMap = {
    val __obj = js.Dynamic.literal(listening = listening)
    __obj.updateDynamic("build-finished")(`build-finished`)
    __obj.updateDynamic("build-started")(`build-started`)
    __obj.updateDynamic("compiler-error")(`compiler-error`)
    __obj.updateDynamic("compiler-warning")(`compiler-warning`)
    __obj.asInstanceOf[EventMap]
  }
}

