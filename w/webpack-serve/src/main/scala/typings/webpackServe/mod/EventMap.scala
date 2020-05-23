package typings.webpackServe.mod

import typings.webpackServe.anon.Compiler
import typings.webpackServe.anon.CompilerStats
import typings.webpackServe.anon.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var `build-finished`: Stats
  var `build-started`: Compiler
  var `compiler-error`: CompilerStats
  var `compiler-warning`: CompilerStats
  var listening: typings.webpackServe.anon.Options
}

object EventMap {
  @scala.inline
  def apply(
    `build-finished`: Stats,
    `build-started`: Compiler,
    `compiler-error`: CompilerStats,
    `compiler-warning`: CompilerStats,
    listening: typings.webpackServe.anon.Options
  ): EventMap = {
    val __obj = js.Dynamic.literal(listening = listening.asInstanceOf[js.Any])
    __obj.updateDynamic("build-finished")(`build-finished`.asInstanceOf[js.Any])
    __obj.updateDynamic("build-started")(`build-started`.asInstanceOf[js.Any])
    __obj.updateDynamic("compiler-error")(`compiler-error`.asInstanceOf[js.Any])
    __obj.updateDynamic("compiler-warning")(`compiler-warning`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
}

