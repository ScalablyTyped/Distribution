package typings.xstream

import typings.xstream.mod.MemoryStream
import typings.xstream.mod.Operator
import typings.xstream.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstream/extra/flattenConcurrentlyAtMost", JSImport.Namespace)
@js.native
object flattenConcurrentlyAtMostMod extends js.Object {
  @js.native
  class FlattenConcAMOperator[T] protected () extends Operator[Stream[T], T] {
    def this(n: Double, ins: Stream[Stream[T]]) = this()
    var _d: js.Any = js.native
    var _l: js.Any = js.native
    var _seq: js.Any = js.native
    var n: Double = js.native
    def less(): Unit = js.native
  }
  
  def default[T](n: Double): js.Function1[/* ins */ Stream[Stream[T] | MemoryStream[T]], Stream[T]] = js.native
}

