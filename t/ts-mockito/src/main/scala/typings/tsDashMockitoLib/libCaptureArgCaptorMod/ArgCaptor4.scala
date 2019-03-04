package typings
package tsDashMockitoLib.libCaptureArgCaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgCaptor4[T0, T1, T2, T3] extends js.Object {
  def beforeLast(): js.Tuple4[T0, T1, T2, T3]
  def byCallIndex(index: scala.Double): js.Tuple4[T0, T1, T2, T3]
  def first(): js.Tuple4[T0, T1, T2, T3]
  def last(): js.Tuple4[T0, T1, T2, T3]
  def second(): js.Tuple4[T0, T1, T2, T3]
  def third(): js.Tuple4[T0, T1, T2, T3]
}

object ArgCaptor4 {
  @scala.inline
  def apply[T0, T1, T2, T3](
    beforeLast: js.Function0[js.Tuple4[T0, T1, T2, T3]],
    byCallIndex: js.Function1[scala.Double, js.Tuple4[T0, T1, T2, T3]],
    first: js.Function0[js.Tuple4[T0, T1, T2, T3]],
    last: js.Function0[js.Tuple4[T0, T1, T2, T3]],
    second: js.Function0[js.Tuple4[T0, T1, T2, T3]],
    third: js.Function0[js.Tuple4[T0, T1, T2, T3]]
  ): ArgCaptor4[T0, T1, T2, T3] = {
    val __obj = js.Dynamic.literal(beforeLast = beforeLast, byCallIndex = byCallIndex, first = first, last = last, second = second, third = third)
  
    __obj.asInstanceOf[ArgCaptor4[T0, T1, T2, T3]]
  }
}

