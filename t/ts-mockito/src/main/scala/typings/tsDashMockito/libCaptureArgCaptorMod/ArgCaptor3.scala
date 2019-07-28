package typings.tsDashMockito.libCaptureArgCaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgCaptor3[T0, T1, T2] extends js.Object {
  def beforeLast(): js.Tuple3[T0, T1, T2]
  def byCallIndex(index: Double): js.Tuple3[T0, T1, T2]
  def first(): js.Tuple3[T0, T1, T2]
  def last(): js.Tuple3[T0, T1, T2]
  def second(): js.Tuple3[T0, T1, T2]
  def third(): js.Tuple3[T0, T1, T2]
}

object ArgCaptor3 {
  @scala.inline
  def apply[T0, T1, T2](
    beforeLast: () => js.Tuple3[T0, T1, T2],
    byCallIndex: Double => js.Tuple3[T0, T1, T2],
    first: () => js.Tuple3[T0, T1, T2],
    last: () => js.Tuple3[T0, T1, T2],
    second: () => js.Tuple3[T0, T1, T2],
    third: () => js.Tuple3[T0, T1, T2]
  ): ArgCaptor3[T0, T1, T2] = {
    val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
  
    __obj.asInstanceOf[ArgCaptor3[T0, T1, T2]]
  }
}

