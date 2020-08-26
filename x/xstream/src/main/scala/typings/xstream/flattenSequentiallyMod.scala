package typings.xstream

import typings.xstream.mod.MemoryStream
import typings.xstream.mod.Operator
import typings.xstream.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstream/extra/flattenSequentially", JSImport.Namespace)
@js.native
object flattenSequentiallyMod extends js.Object {
  @js.native
  class FlattenSeqOperator[T] protected () extends Operator[Stream[T], T] {
    def this(ins: Stream[Stream[T]]) = this()
    var active: js.Any = js.native
    var activeIL: js.Any = js.native
    var open: js.Any = js.native
    var seq: js.Any = js.native
    def less(): Unit = js.native
  }
  
  def default[T](ins: Stream[Stream[T] | MemoryStream[T]]): Stream[T] = js.native
}

