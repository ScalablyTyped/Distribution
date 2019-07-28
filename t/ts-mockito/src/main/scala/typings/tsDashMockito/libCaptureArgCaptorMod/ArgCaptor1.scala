package typings.tsDashMockito.libCaptureArgCaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgCaptor1[T] extends js.Object {
  def beforeLast(): js.Array[T]
  def byCallIndex(index: Double): js.Array[T]
  def first(): js.Array[T]
  def last(): js.Array[T]
  def second(): js.Array[T]
  def third(): js.Array[T]
}

object ArgCaptor1 {
  @scala.inline
  def apply[T](
    beforeLast: () => js.Array[T],
    byCallIndex: Double => js.Array[T],
    first: () => js.Array[T],
    last: () => js.Array[T],
    second: () => js.Array[T],
    third: () => js.Array[T]
  ): ArgCaptor1[T] = {
    val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
  
    __obj.asInstanceOf[ArgCaptor1[T]]
  }
}

