package typings.xstream

import typings.xstream.mod.InternalListener
import typings.xstream.mod.Operator
import typings.xstream.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sampleCombineMod {
  
  @JSImport("xstream/extra/sampleCombine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("xstream/extra/sampleCombine", JSImport.Default)
  @js.native
  def default: SampleCombineSignature = js.native
  
  @JSImport("xstream/extra/sampleCombine", "SampleCombineListener")
  @js.native
  class SampleCombineListener[T] protected () extends InternalListener[T] {
    def this(i: Double, p: SampleCombineOperator[_]) = this()
    
    var i: js.Any = js.native
    
    var p: js.Any = js.native
  }
  
  @JSImport("xstream/extra/sampleCombine", "SampleCombineOperator")
  @js.native
  class SampleCombineOperator[T] protected ()
    extends Operator[T, js.Array[js.Any]] {
    def this(ins: Stream[T], streams: js.Array[Stream[_]]) = this()
    
    var Nn: Double = js.native
    
    def down(i: Double, l: SampleCombineListener[_]): Unit = js.native
    
    var ils: js.Array[SampleCombineListener[_]] = js.native
    
    var others: js.Array[Stream[_]] = js.native
    
    @JSName("out")
    var out_SampleCombineOperator: Stream[js.Array[_]] = js.native
    
    def up(t: js.Any, i: Double): Unit = js.native
    
    var vals: js.Array[_] = js.native
  }
  
  @scala.inline
  def default_=(x: SampleCombineSignature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  @js.native
  trait SampleCombineSignature extends StObject {
    
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
}
