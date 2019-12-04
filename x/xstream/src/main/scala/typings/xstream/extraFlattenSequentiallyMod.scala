package typings.xstream

import typings.xstream.xstreamMod.InternalListener
import typings.xstream.xstreamMod.MemoryStream
import typings.xstream.xstreamMod.Operator
import typings.xstream.xstreamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstream/extra/flattenSequentially", JSImport.Namespace)
@js.native
object extraFlattenSequentiallyMod extends js.Object {
  @js.native
  class FlattenSeqOperator[T] protected () extends Operator[Stream[T], T] {
    def this(ins: Stream[Stream[T]]) = this()
    var active: js.Any = js.native
    var activeIL: js.Any = js.native
    /* CompleteClass */
    override var ins: Stream[Stream[T]] = js.native
    var open: js.Any = js.native
    /* CompleteClass */
    override var out: Stream[T] = js.native
    var seq: js.Any = js.native
    /* CompleteClass */
    override var `type`: String = js.native
    /* CompleteClass */
    override def _c(): Unit = js.native
    /* CompleteClass */
    override def _e(err: js.Any): Unit = js.native
    /* CompleteClass */
    override def _n(v: Stream[T]): Unit = js.native
    /* CompleteClass */
    override def _start(listener: InternalListener[T]): Unit = js.native
    /* CompleteClass */
    override def _start(out: Stream[T]): Unit = js.native
    /* CompleteClass */
    override def _stop(): Unit = js.native
    def less(): Unit = js.native
  }
  
  def default[T](ins: Stream[Stream[T] | MemoryStream[T]]): Stream[T] = js.native
}

