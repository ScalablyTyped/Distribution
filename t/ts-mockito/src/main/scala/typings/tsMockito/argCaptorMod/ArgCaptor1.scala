package typings.tsMockito.argCaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArgCaptor1[T] extends js.Object {
  def beforeLast(): js.Array[T] = js.native
  def byCallIndex(index: Double): js.Array[T] = js.native
  def first(): js.Array[T] = js.native
  def last(): js.Array[T] = js.native
  def second(): js.Array[T] = js.native
  def third(): js.Array[T] = js.native
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
  @scala.inline
  implicit class ArgCaptor1Ops[Self <: ArgCaptor1[_], T] (val x: Self with ArgCaptor1[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBeforeLast(value: () => js.Array[T]): Self = this.set("beforeLast", js.Any.fromFunction0(value))
    @scala.inline
    def setByCallIndex(value: Double => js.Array[T]): Self = this.set("byCallIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setFirst(value: () => js.Array[T]): Self = this.set("first", js.Any.fromFunction0(value))
    @scala.inline
    def setLast(value: () => js.Array[T]): Self = this.set("last", js.Any.fromFunction0(value))
    @scala.inline
    def setSecond(value: () => js.Array[T]): Self = this.set("second", js.Any.fromFunction0(value))
    @scala.inline
    def setThird(value: () => js.Array[T]): Self = this.set("third", js.Any.fromFunction0(value))
  }
  
}

