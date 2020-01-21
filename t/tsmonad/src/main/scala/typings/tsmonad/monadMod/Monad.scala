package typings.tsmonad.monadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monad[T] extends js.Object {
  def bind[U](f: js.Function1[/* t */ T, Monad[U]]): Monad[U]
  def chain[U](f: js.Function1[/* t */ T, Monad[U]]): Monad[U]
  def of[U](t: U): Monad[U]
  def unit[U](t: U): Monad[U]
}

object Monad {
  @scala.inline
  def apply[T](
    bind: js.Function1[/* t */ T, Monad[js.Any]] => Monad[js.Any],
    chain: js.Function1[/* t */ T, Monad[js.Any]] => Monad[js.Any],
    of: js.Any => Monad[js.Any],
    unit: js.Any => Monad[js.Any]
  ): Monad[T] = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), chain = js.Any.fromFunction1(chain), of = js.Any.fromFunction1(of), unit = js.Any.fromFunction1(unit))
  
    __obj.asInstanceOf[Monad[T]]
  }
}

