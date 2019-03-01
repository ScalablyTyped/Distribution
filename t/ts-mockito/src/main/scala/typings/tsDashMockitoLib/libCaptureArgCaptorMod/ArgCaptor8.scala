package typings
package tsDashMockitoLib.libCaptureArgCaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgCaptor8[T0, T1, T2, T3, T4, T5, T6, T7] extends js.Object {
  def beforeLast(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]
  def byCallIndex(index: scala.Double): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]
  def first(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]
  def last(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]
  def second(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]
  def third(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]
}

object ArgCaptor8 {
  @scala.inline
  def apply[T0, T1, T2, T3, T4, T5, T6, T7](
    beforeLast: js.Function0[js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]],
    byCallIndex: js.Function1[scala.Double, js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]],
    first: js.Function0[js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]],
    last: js.Function0[js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]],
    second: js.Function0[js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]],
    third: js.Function0[js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]]
  ): ArgCaptor8[T0, T1, T2, T3, T4, T5, T6, T7] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beforeLast")(beforeLast)
    __obj.updateDynamic("byCallIndex")(byCallIndex)
    __obj.updateDynamic("first")(first)
    __obj.updateDynamic("last")(last)
    __obj.updateDynamic("second")(second)
    __obj.updateDynamic("third")(third)
    __obj.asInstanceOf[ArgCaptor8[T0, T1, T2, T3, T4, T5, T6, T7]]
  }
}

