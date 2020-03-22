package typings.v8ToIstanbul.mod

import typings.istanbulLibCoverage.mod.CoverageMapData
import typings.node.inspectorMod.Profiler.FunctionCoverage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V8ToIstanbul extends js.Object {
  def applyCoverage(blocks: js.Array[FunctionCoverage]): Unit
  def load(): js.Promise[Unit]
  def toIstanbul(): CoverageMapData
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
}

