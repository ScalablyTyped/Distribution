package typings
package tsDashMockitoLib.libCaptureArgCaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgCaptor7[T0, T1, T2, T3, T4, T5, T6] extends js.Object {
  def beforeLast(): js.Tuple7[T0, T1, T2, T3, T4, T5, T6]
  def byCallIndex(index: scala.Double): js.Tuple7[T0, T1, T2, T3, T4, T5, T6]
  def first(): js.Tuple7[T0, T1, T2, T3, T4, T5, T6]
  def last(): js.Tuple7[T0, T1, T2, T3, T4, T5, T6]
  def second(): js.Tuple7[T0, T1, T2, T3, T4, T5, T6]
  def third(): js.Tuple7[T0, T1, T2, T3, T4, T5, T6]
}

object ArgCaptor7 {
  @scala.inline
  def apply[T0, T1, T2, T3, T4, T5, T6](
    beforeLast: js.Function0[js.Tuple7[T0, T1, T2, T3, T4, T5, T6]],
    byCallIndex: js.Function1[scala.Double, js.Tuple7[T0, T1, T2, T3, T4, T5, T6]],
    first: js.Function0[js.Tuple7[T0, T1, T2, T3, T4, T5, T6]],
    last: js.Function0[js.Tuple7[T0, T1, T2, T3, T4, T5, T6]],
    second: js.Function0[js.Tuple7[T0, T1, T2, T3, T4, T5, T6]],
    third: js.Function0[js.Tuple7[T0, T1, T2, T3, T4, T5, T6]]
  ): ArgCaptor7[T0, T1, T2, T3, T4, T5, T6] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beforeLast")(beforeLast)
    __obj.updateDynamic("byCallIndex")(byCallIndex)
    __obj.updateDynamic("first")(first)
    __obj.updateDynamic("last")(last)
    __obj.updateDynamic("second")(second)
    __obj.updateDynamic("third")(third)
    __obj.asInstanceOf[ArgCaptor7[T0, T1, T2, T3, T4, T5, T6]]
  }
}

