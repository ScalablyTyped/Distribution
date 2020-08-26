package typings.tsmonad.monadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Functor[T] extends js.Object {
  def fmap[U](f: js.Function1[/* t */ T, U]): Functor[U] = js.native
  def lift[U](f: js.Function1[/* t */ T, U]): Functor[U] = js.native
  def map[U](f: js.Function1[/* t */ T, U]): Functor[U] = js.native
}

object Functor {
  @scala.inline
  def apply[T](
    fmap: js.Function1[/* t */ T, js.Any] => Functor[js.Any],
    lift: js.Function1[/* t */ T, js.Any] => Functor[js.Any],
    map: js.Function1[/* t */ T, js.Any] => Functor[js.Any]
  ): Functor[T] = {
    val __obj = js.Dynamic.literal(fmap = js.Any.fromFunction1(fmap), lift = js.Any.fromFunction1(lift), map = js.Any.fromFunction1(map))
    __obj.asInstanceOf[Functor[T]]
  }
  @scala.inline
  implicit class FunctorOps[Self <: Functor[_], T] (val x: Self with Functor[T]) extends AnyVal {
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
    def setFmap(value: js.Function1[/* t */ T, js.Any] => Functor[js.Any]): Self = this.set("fmap", js.Any.fromFunction1(value))
    @scala.inline
    def setLift(value: js.Function1[/* t */ T, js.Any] => Functor[js.Any]): Self = this.set("lift", js.Any.fromFunction1(value))
    @scala.inline
    def setMap(value: js.Function1[/* t */ T, js.Any] => Functor[js.Any]): Self = this.set("map", js.Any.fromFunction1(value))
  }
  
}

