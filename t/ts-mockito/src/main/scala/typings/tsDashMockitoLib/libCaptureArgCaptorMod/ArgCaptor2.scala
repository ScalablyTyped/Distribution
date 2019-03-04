package typings
package tsDashMockitoLib.libCaptureArgCaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgCaptor2[T0, T1] extends js.Object {
  def beforeLast(): js.Tuple2[T0, T1]
  def byCallIndex(index: scala.Double): js.Tuple2[T0, T1]
  def first(): js.Tuple2[T0, T1]
  def last(): js.Tuple2[T0, T1]
  def second(): js.Tuple2[T0, T1]
  def third(): js.Tuple2[T0, T1]
}

object ArgCaptor2 {
  @scala.inline
  def apply[T0, T1](
    beforeLast: js.Function0[js.Tuple2[T0, T1]],
    byCallIndex: js.Function1[scala.Double, js.Tuple2[T0, T1]],
    first: js.Function0[js.Tuple2[T0, T1]],
    last: js.Function0[js.Tuple2[T0, T1]],
    second: js.Function0[js.Tuple2[T0, T1]],
    third: js.Function0[js.Tuple2[T0, T1]]
  ): ArgCaptor2[T0, T1] = {
    val __obj = js.Dynamic.literal(beforeLast = beforeLast, byCallIndex = byCallIndex, first = first, last = last, second = second, third = third)
  
    __obj.asInstanceOf[ArgCaptor2[T0, T1]]
  }
}

