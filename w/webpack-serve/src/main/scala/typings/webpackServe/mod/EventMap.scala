package typings.webpackServe.mod

import typings.webpackServe.anon.Compiler
import typings.webpackServe.anon.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventMap extends js.Object {
  var `build-finished`: Stats = js.native
  var `build-started`: Compiler = js.native
  var `compiler-error`: Stats = js.native
  var `compiler-warning`: Stats = js.native
  var listening: typings.webpackServe.anon.Options = js.native
}

object EventMap {
  @scala.inline
  def apply(
    `build-finished`: Stats,
    `build-started`: Compiler,
    `compiler-error`: Stats,
    `compiler-warning`: Stats,
    listening: typings.webpackServe.anon.Options
  ): EventMap = {
    val __obj = js.Dynamic.literal(listening = listening.asInstanceOf[js.Any])
    __obj.updateDynamic("build-finished")(`build-finished`.asInstanceOf[js.Any])
    __obj.updateDynamic("build-started")(`build-started`.asInstanceOf[js.Any])
    __obj.updateDynamic("compiler-error")(`compiler-error`.asInstanceOf[js.Any])
    __obj.updateDynamic("compiler-warning")(`compiler-warning`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
  @scala.inline
  implicit class EventMapOps[Self <: EventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setBuild-finished`(value: Stats): Self = this.set("build-finished", value.asInstanceOf[js.Any])
    @scala.inline
    def `setBuild-started`(value: Compiler): Self = this.set("build-started", value.asInstanceOf[js.Any])
    @scala.inline
    def `setCompiler-error`(value: Stats): Self = this.set("compiler-error", value.asInstanceOf[js.Any])
    @scala.inline
    def `setCompiler-warning`(value: Stats): Self = this.set("compiler-warning", value.asInstanceOf[js.Any])
    @scala.inline
    def setListening(value: typings.webpackServe.anon.Options): Self = this.set("listening", value.asInstanceOf[js.Any])
  }
  
}

