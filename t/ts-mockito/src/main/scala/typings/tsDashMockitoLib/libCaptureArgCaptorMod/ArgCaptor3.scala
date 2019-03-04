package typings
package tsDashMockitoLib.libCaptureArgCaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgCaptor3[T0, T1, T2] extends js.Object {
  def beforeLast(): js.Tuple3[T0, T1, T2]
  def byCallIndex(index: scala.Double): js.Tuple3[T0, T1, T2]
  def first(): js.Tuple3[T0, T1, T2]
  def last(): js.Tuple3[T0, T1, T2]
  def second(): js.Tuple3[T0, T1, T2]
  def third(): js.Tuple3[T0, T1, T2]
}

object ArgCaptor3 {
  @scala.inline
  def apply[T0, T1, T2](
    beforeLast: js.Function0[js.Tuple3[T0, T1, T2]],
    byCallIndex: js.Function1[scala.Double, js.Tuple3[T0, T1, T2]],
    first: js.Function0[js.Tuple3[T0, T1, T2]],
    last: js.Function0[js.Tuple3[T0, T1, T2]],
    second: js.Function0[js.Tuple3[T0, T1, T2]],
    third: js.Function0[js.Tuple3[T0, T1, T2]]
  ): ArgCaptor3[T0, T1, T2] = {
    val __obj = js.Dynamic.literal(beforeLast = beforeLast, byCallIndex = byCallIndex, first = first, last = last, second = second, third = third)
  
    __obj.asInstanceOf[ArgCaptor3[T0, T1, T2]]
  }
}

