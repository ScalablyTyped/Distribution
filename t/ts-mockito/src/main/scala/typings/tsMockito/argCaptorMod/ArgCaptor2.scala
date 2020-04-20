package typings.tsMockito.argCaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgCaptor2[T0, T1] extends js.Object {
  def beforeLast(): js.Tuple2[T0, T1]
  def byCallIndex(index: Double): js.Tuple2[T0, T1]
  def first(): js.Tuple2[T0, T1]
  def last(): js.Tuple2[T0, T1]
  def second(): js.Tuple2[T0, T1]
  def third(): js.Tuple2[T0, T1]
}

object ArgCaptor2 {
  @scala.inline
  def apply[T0, T1](
    beforeLast: () => js.Tuple2[T0, T1],
    byCallIndex: Double => js.Tuple2[T0, T1],
    first: () => js.Tuple2[T0, T1],
    last: () => js.Tuple2[T0, T1],
    second: () => js.Tuple2[T0, T1],
    third: () => js.Tuple2[T0, T1]
  ): ArgCaptor2[T0, T1] = {
    val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
    __obj.asInstanceOf[ArgCaptor2[T0, T1]]
  }
}

