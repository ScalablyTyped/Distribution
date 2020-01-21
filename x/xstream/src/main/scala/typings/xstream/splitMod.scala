package typings.xstream

import typings.xstream.mod.InternalListener
import typings.xstream.mod.Operator
import typings.xstream.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstream/extra/split", JSImport.Namespace)
@js.native
object splitMod extends js.Object {
  @js.native
  class SplitOperator[T] protected () extends Operator[T, Stream[T]] {
    def this( // s = separator
    s: Stream[_], ins: Stream[T]) = this()
    var curr: Stream[T] = js.native
    /* CompleteClass */
    override var ins: Stream[T] = js.native
    /* CompleteClass */
    override var out: Stream[Stream[T]] = js.native
    var s: Stream[_] = js.native
    var sil: js.Any = js.native
    /* CompleteClass */
    override var `type`: String = js.native
    /* CompleteClass */
    override def _c(): Unit = js.native
    /* CompleteClass */
    override def _e(err: js.Any): Unit = js.native
    /* CompleteClass */
    override def _n(v: T): Unit = js.native
    /* CompleteClass */
    override def _start(listener: InternalListener[Stream[T]]): Unit = js.native
    /* CompleteClass */
    override def _start(out: Stream[Stream[T]]): Unit = js.native
    /* CompleteClass */
    override def _stop(): Unit = js.native
    def up(): Unit = js.native
  }
  
  def default[T](separator: Stream[_]): js.Function1[/* ins */ Stream[T], Stream[Stream[T]]] = js.native
}

