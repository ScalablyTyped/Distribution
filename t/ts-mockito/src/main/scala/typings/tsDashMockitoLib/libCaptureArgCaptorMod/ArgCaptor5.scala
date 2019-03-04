package typings
package tsDashMockitoLib.libCaptureArgCaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgCaptor5[T0, T1, T2, T3, T4] extends js.Object {
  def beforeLast(): js.Tuple5[T0, T1, T2, T3, T4]
  def byCallIndex(index: scala.Double): js.Tuple5[T0, T1, T2, T3, T4]
  def first(): js.Tuple5[T0, T1, T2, T3, T4]
  def last(): js.Tuple5[T0, T1, T2, T3, T4]
  def second(): js.Tuple5[T0, T1, T2, T3, T4]
  def third(): js.Tuple5[T0, T1, T2, T3, T4]
}

object ArgCaptor5 {
  @scala.inline
  def apply[T0, T1, T2, T3, T4](
    beforeLast: js.Function0[js.Tuple5[T0, T1, T2, T3, T4]],
    byCallIndex: js.Function1[scala.Double, js.Tuple5[T0, T1, T2, T3, T4]],
    first: js.Function0[js.Tuple5[T0, T1, T2, T3, T4]],
    last: js.Function0[js.Tuple5[T0, T1, T2, T3, T4]],
    second: js.Function0[js.Tuple5[T0, T1, T2, T3, T4]],
    third: js.Function0[js.Tuple5[T0, T1, T2, T3, T4]]
  ): ArgCaptor5[T0, T1, T2, T3, T4] = {
    val __obj = js.Dynamic.literal(beforeLast = beforeLast, byCallIndex = byCallIndex, first = first, last = last, second = second, third = third)
  
    __obj.asInstanceOf[ArgCaptor5[T0, T1, T2, T3, T4]]
  }
}

