package typings.v8ToIstanbul.mod

import typings.istanbulLibCoverage.mod.CoverageMapData
import typings.node.inspectorMod.Profiler.FunctionCoverage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait V8ToIstanbul extends js.Object {
  def applyCoverage(blocks: js.Array[FunctionCoverage]): Unit = js.native
  def load(): js.Promise[Unit] = js.native
  def toIstanbul(): CoverageMapData = js.native
}

object V8ToIstanbul {
  @scala.inline
  def apply(
    applyCoverage: js.Array[FunctionCoverage] => Unit,
    load: () => js.Promise[Unit],
    toIstanbul: () => CoverageMapData
  ): V8ToIstanbul = {
    val __obj = js.Dynamic.literal(applyCoverage = js.Any.fromFunction1(applyCoverage), load = js.Any.fromFunction0(load), toIstanbul = js.Any.fromFunction0(toIstanbul))
    __obj.asInstanceOf[V8ToIstanbul]
  }
  @scala.inline
  implicit class V8ToIstanbulOps[Self <: V8ToIstanbul] (val x: Self) extends AnyVal {
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
    def setApplyCoverage(value: js.Array[FunctionCoverage] => Unit): Self = this.set("applyCoverage", js.Any.fromFunction1(value))
    @scala.inline
    def setLoad(value: () => js.Promise[Unit]): Self = this.set("load", js.Any.fromFunction0(value))
    @scala.inline
    def setToIstanbul(value: () => CoverageMapData): Self = this.set("toIstanbul", js.Any.fromFunction0(value))
  }
  
}

