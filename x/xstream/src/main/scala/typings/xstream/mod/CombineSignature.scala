package typings.xstream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CombineSignature extends js.Object {
  
  def apply(): Stream[js.Array[_]] = js.native
  def apply(stream: Stream[_]*): Stream[js.Array[_]] = js.native
  def apply[T1](s1: Stream[T1]): Stream[js.Array[T1]] = js.native
  def apply[T1, T2](s1: Stream[T1], s2: Stream[T2]): Stream[js.Tuple2[T1, T2]] = js.native
  def apply[T1, T2, T3](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3]): Stream[js.Tuple3[T1, T2, T3]] = js.native
  def apply[T1, T2, T3, T4](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4]): Stream[js.Tuple4[T1, T2, T3, T4]] = js.native
  def apply[T1, T2, T3, T4, T5](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4], s5: Stream[T5]): Stream[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
  def apply[T1, T2, T3, T4, T5, T6](s1: Stream[T1], s2: Stream[T2], s3: Stream[T3], s4: Stream[T4], s5: Stream[T5], s6: Stream[T6]): Stream[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
  def apply[T1, T2, T3, T4, T5, T6, T7](
    s1: Stream[T1],
    s2: Stream[T2],
    s3: Stream[T3],
    s4: Stream[T4],
    s5: Stream[T5],
    s6: Stream[T6],
    s7: Stream[T7]
  ): Stream[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
  def apply[T1, T2, T3, T4, T5, T6, T7, T8](
    s1: Stream[T1],
    s2: Stream[T2],
    s3: Stream[T3],
    s4: Stream[T4],
    s5: Stream[T5],
    s6: Stream[T6],
    s7: Stream[T7],
    s8: Stream[T8]
  ): Stream[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
  def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    s1: Stream[T1],
    s2: Stream[T2],
    s3: Stream[T3],
    s4: Stream[T4],
    s5: Stream[T5],
    s6: Stream[T6],
    s7: Stream[T7],
    s8: Stream[T8],
    s9: Stream[T9]
  ): Stream[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
  def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    s1: Stream[T1],
    s2: Stream[T2],
    s3: Stream[T3],
    s4: Stream[T4],
    s5: Stream[T5],
    s6: Stream[T6],
    s7: Stream[T7],
    s8: Stream[T8],
    s9: Stream[T9],
    s10: Stream[T10]
  ): Stream[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
}
