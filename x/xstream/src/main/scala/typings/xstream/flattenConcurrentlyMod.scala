package typings.xstream

import typings.xstream.mod.InternalListener
import typings.xstream.mod.MemoryStream
import typings.xstream.mod.Operator
import typings.xstream.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstream/extra/flattenConcurrently", JSImport.Namespace)
@js.native
object flattenConcurrentlyMod extends js.Object {
  @js.native
  class FlattenConcOperator[T] protected () extends Operator[Stream[T], T] {
    def this(ins: Stream[Stream[T]]) = this()
    var active: js.Any = js.native
    /* CompleteClass */
    override var ins: Stream[Stream[T]] = js.native
    /* CompleteClass */
    override var out: Stream[T] = js.native
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

