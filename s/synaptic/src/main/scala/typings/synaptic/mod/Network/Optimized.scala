package typings.synaptic.mod.Network

import typings.std.Float64Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Optimized extends js.Object {
  var memory: Float64Array
  def ownership(memoryBuffer: Float64Array): Unit
}

object Optimized {
  @scala.inline
  def apply(memory: Float64Array, ownership: Float64Array => Unit): Optimized = {
    val __obj = js.Dynamic.literal(memory = memory.asInstanceOf[js.Any], ownership = js.Any.fromFunction1(ownership))
  
    __obj.asInstanceOf[Optimized]
  }
}

