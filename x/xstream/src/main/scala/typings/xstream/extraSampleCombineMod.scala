package typings.xstream

import typings.xstream.mod.InternalListener
import typings.xstream.mod.Operator
import typings.xstream.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extraSampleCombineMod {
  
  @JSImport("xstream/extra/sampleCombine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("xstream/extra/sampleCombine", JSImport.Default)
  @js.native
  def default: SampleCombineSignature = js.native
  
  @JSImport("xstream/extra/sampleCombine", "SampleCombineListener")
  @js.native
  open class SampleCombineListener[T] protected ()
    extends StObject
       with InternalListener[T] {
    def this(i: Double, p: SampleCombineOperator[Any]) = this()
    
    /* CompleteClass */
    override def _c(): Unit = js.native
    
    /* CompleteClass */
    override def _e(err: Any): Unit = js.native
    
    /* CompleteClass */
    override def _n(v: T): Unit = js.native
    
    /* private */ var i: Any = js.native
    
    /* private */ var p: Any = js.native
  }
  
  @JSImport("xstream/extra/sampleCombine", "SampleCombineOperator")
  @js.native
  open class SampleCombineOperator[T] protected ()
    extends StObject
       with Operator[T, js.Array[Any]] {
    def this(ins: Stream[T], streams: js.Array[Stream[Any]]) = this()
    
    var Nn: Double = js.native
    
    /* CompleteClass */
    override def _c(): Unit = js.native
    
    /* CompleteClass */
    override def _e(err: Any): Unit = js.native
    
    /* CompleteClass */
    override def _n(v: T): Unit = js.native
    
    /* CompleteClass */
    override def _start(listener: InternalListener[js.Array[Any]]): Unit = js.native
    /* CompleteClass */
    override def _start(out: Stream[js.Array[Any]]): Unit = js.native
    
    /* CompleteClass */
    override def _stop(): Unit = js.native
    
    def down(i: Double, l: SampleCombineListener[Any]): Unit = js.native
    
    var ils: js.Array[SampleCombineListener[Any]] = js.native
    
    /* CompleteClass */
    var ins: Stream[T] = js.native
    
    var others: js.Array[Stream[Any]] = js.native
    
    /* CompleteClass */
    var out: Stream[js.Array[Any]] = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
    
    def up(t: Any, i: Double): Unit = js.native
    
    var vals: js.Array[Any] = js.native
  }
  
  inline def default_=(x: SampleCombineSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  @js.native
  trait SampleCombineSignature extends StObject {
    
    def apply(): js.Function1[/* s */ Stream[Any], Stream[js.Array[Any]]] = js.native
    def apply(streams: Stream[Any]*): js.Function1[/* s */ Stream[Any], Stream[js.Array[Any]]] = js.native
    def apply[T1](s1: Stream[T1]): js.Function1[/* s */ Stream[Any], Stream[js.Tuple2[Any, T1]]] = js.native
    def apply[T1, T2](s1: Stream[T1], s2: Stream[T2]): js.Function1[/* s */ Stream[Any], Stream[js.Tuple3[Any, T1, T2]]] = js.native
    def apply[T1, T2, T3](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3]): js.Function1[/* s */ Stream[Any], Stream[js.Tuple4[Any, T1, T2, T3]]] = js.native
    def apply[T1, T2, T3, T4](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4]): js.Function1[/* s */ Stream[Any], Stream[js.Tuple5[Any, T1, T2, T3, T4]]] = js.native
    def apply[T1, T2, T3, T4, T5](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4], s5: Stream[T5]): js.Function1[/* s */ Stream[Any], Stream[js.Tuple6[Any, T1, T2, T3, T4, T5]]] = js.native
    def apply[T1, T2, T3, T4, T5, T6](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4], s5: Stream[T5], s6: Stream[T6]): js.Function1[/* s */ Stream[Any], Stream[js.Tuple7[Any, T1, T2, T3, T4, T5, T6]]] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7](
      s1: Stream[T1],
      s2: Stream[T2],
      s3: Stream[T3],
      s4: Stream[T4],
      s5: Stream[T5],
      s6: Stream[T6],
      s7: Stream[T7]
    ): js.Function1[/* s */ Stream[Any], Stream[js.Tuple8[Any, T1, T2, T3, T4, T5, T6, T7]]] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7, T8](
      s1: Stream[T1],
      s2: Stream[T2],
      s3: Stream[T3],
      s4: Stream[T4],
      s5: Stream[T5],
      s6: Stream[T6],
      s7: Stream[T7],
      s8: Stream[T8]
    ): js.Function1[/* s */ Stream[Any], Stream[js.Tuple9[Any, T1, T2, T3, T4, T5, T6, T7, T8]]] = js.native
  }
}
