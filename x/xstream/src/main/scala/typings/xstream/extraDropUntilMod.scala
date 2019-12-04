package typings.xstream

import typings.xstream.xstreamMod.InternalListener
import typings.xstream.xstreamMod.Operator
import typings.xstream.xstreamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstream/extra/dropUntil", JSImport.Namespace)
@js.native
object extraDropUntilMod extends js.Object {
  @js.native
  class DropUntilOperator[T] protected () extends Operator[T, T] {
    def this( // o = other
    o: Stream[_], ins: Stream[T]) = this()
    /* CompleteClass */
    override var ins: Stream[T] = js.native
    var o: Stream[_] = js.native
    var oil: js.Any = js.native
    var on: js.Any = js.native
    /* CompleteClass */
    override var out: Stream[T] = js.native
    /* CompleteClass */
    override var `type`: String = js.native
    /* CompleteClass */
    override def _c(): Unit = js.native
    /* CompleteClass */
    override def _e(err: js.Any): Unit = js.native
    /* CompleteClass */
    override def _n(v: T): Unit = js.native
    /* CompleteClass */
    override def _start(listener: InternalListener[T]): Unit = js.native
    /* CompleteClass */
    override def _start(out: Stream[T]): Unit = js.native
    /* CompleteClass */
    override def _stop(): Unit = js.native
    def up(): Unit = js.native
  }
  
  def default[T](other: Stream[_]): js.Function1[/* ins */ Stream[T], Stream[T]] = js.native
}

