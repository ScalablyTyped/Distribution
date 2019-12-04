package typings.xstream

import typings.xstream.extraSampleCombineMod.SampleCombineListener
import typings.xstream.extraSampleCombineMod.SampleCombineOperator
import typings.xstream.extraSampleCombineMod.SampleCombineSignature
import typings.xstream.xstreamMod.InternalListener
import typings.xstream.xstreamMod.Operator
import typings.xstream.xstreamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstream/extra/sampleCombine", JSImport.Namespace)
@js.native
object extraSampleCombineMod extends js.Object {
  @js.native
  class SampleCombineListener[T] protected () extends InternalListener[T] {
    def this(i: Double, p: SampleCombineOperator[_]) = this()
    var i: js.Any = js.native
    var p: js.Any = js.native
    /* CompleteClass */
    override def _c(): Unit = js.native
    /* CompleteClass */
    override def _e(err: js.Any): Unit = js.native
    /* CompleteClass */
    override def _n(v: T): Unit = js.native
  }
  
  @js.native
  class SampleCombineOperator[T] protected ()
    extends Operator[T, js.Array[js.Any]] {
    def this(ins: Stream[T], streams: js.Array[Stream[_]]) = this()
    var Nn: Double = js.native
    var ils: js.Array[SampleCombineListener[_]] = js.native
    /* CompleteClass */
    override var ins: Stream[T] = js.native
    var others: js.Array[Stream[_]] = js.native
    /* CompleteClass */
    override var out: Stream[js.Array[js.Any]] = js.native
    @JSName("out")
    var out_SampleCombineOperator: Stream[js.Array[_]] = js.native
    /* CompleteClass */
    override var `type`: String = js.native
    var vals: js.Array[_] = js.native
    /* CompleteClass */
    override def _c(): Unit = js.native
    /* CompleteClass */
    override def _e(err: js.Any): Unit = js.native
    /* CompleteClass */
    override def _n(v: T): Unit = js.native
    /* CompleteClass */
    override def _start(listener: InternalListener[js.Array[js.Any]]): Unit = js.native
    /* CompleteClass */
    override def _start(out: Stream[js.Array[js.Any]]): Unit = js.native
    /* CompleteClass */
    override def _stop(): Unit = js.native
    def down(i: Double, l: SampleCombineListener[_]): Unit = js.native
    def up(t: js.Any, i: Double): Unit = js.native
  }
  
  @js.native
  trait SampleCombineSignature extends js.Object {
    def apply(): js.Function1[/* s */ Stream[_], Stream[js.Array[_]]] = js.native
    def apply(streams: Stream[_]*): js.Function1[/* s */ Stream[_], Stream[js.Array[_]]] = js.native
    def apply[T1](s1: Stream[T1]): js.Function1[/* s */ Stream[_], Stream[js.Tuple2[_, T1]]] = js.native
    def apply[T1, T2](s1: Stream[T1], s2: Stream[T2]): js.Function1[/* s */ Stream[_], Stream[js.Tuple3[_, T1, T2]]] = js.native
    def apply[T1, T2, T3](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3]): js.Function1[/* s */ Stream[_], Stream[js.Tuple4[_, T1, T2, T3]]] = js.native
    def apply[T1, T2, T3, T4](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4]): js.Function1[/* s */ Stream[_], Stream[js.Tuple5[_, T1, T2, T3, T4]]] = js.native
    def apply[T1, T2, T3, T4, T5](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4], s5: Stream[T5]): js.Function1[/* s */ Stream[_], Stream[js.Tuple6[_, T1, T2, T3, T4, T5]]] = js.native
    def apply[T1, T2, T3, T4, T5, T6](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4], s5: Stream[T5], s6: Stream[T6]): js.Function1[/* s */ Stream[_], Stream[js.Tuple7[_, T1, T2, T3, T4, T5, T6]]] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7](
      s1: Stream[T1],
      s2: Stream[T2],
      s3: Stream[T3],
      s4: Stream[T4],
      s5: Stream[T5],
      s6: Stream[T6],
      s7: Stream[T7]
    ): js.Function1[/* s */ Stream[_], Stream[js.Tuple8[_, T1, T2, T3, T4, T5, T6, T7]]] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7, T8](
      s1: Stream[T1],
      s2: Stream[T2],
      s3: Stream[T3],
      s4: Stream[T4],
      s5: Stream[T5],
      s6: Stream[T6],
      s7: Stream[T7],
      s8: Stream[T8]
    ): js.Function1[/* s */ Stream[_], Stream[js.Tuple9[_, T1, T2, T3, T4, T5, T6, T7, T8]]] = js.native
  }
  
  var default: SampleCombineSignature = js.native
}

