package typings
package tsDashMockitoLib.libCaptureArgCaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgCaptor6[T0, T1, T2, T3, T4, T5] extends js.Object {
  def beforeLast(): js.Tuple6[T0, T1, T2, T3, T4, T5]
  def byCallIndex(index: scala.Double): js.Tuple6[T0, T1, T2, T3, T4, T5]
  def first(): js.Tuple6[T0, T1, T2, T3, T4, T5]
  def last(): js.Tuple6[T0, T1, T2, T3, T4, T5]
  def second(): js.Tuple6[T0, T1, T2, T3, T4, T5]
  def third(): js.Tuple6[T0, T1, T2, T3, T4, T5]
}

object ArgCaptor6 {
  @scala.inline
  def apply[T0, T1, T2, T3, T4, T5](
    beforeLast: js.Function0[js.Tuple6[T0, T1, T2, T3, T4, T5]],
    byCallIndex: js.Function1[scala.Double, js.Tuple6[T0, T1, T2, T3, T4, T5]],
    first: js.Function0[js.Tuple6[T0, T1, T2, T3, T4, T5]],
    last: js.Function0[js.Tuple6[T0, T1, T2, T3, T4, T5]],
    second: js.Function0[js.Tuple6[T0, T1, T2, T3, T4, T5]],
    third: js.Function0[js.Tuple6[T0, T1, T2, T3, T4, T5]]
  ): ArgCaptor6[T0, T1, T2, T3, T4, T5] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beforeLast")(beforeLast)
    __obj.updateDynamic("byCallIndex")(byCallIndex)
    __obj.updateDynamic("first")(first)
    __obj.updateDynamic("last")(last)
    __obj.updateDynamic("second")(second)
    __obj.updateDynamic("third")(third)
    __obj.asInstanceOf[ArgCaptor6[T0, T1, T2, T3, T4, T5]]
  }
}

