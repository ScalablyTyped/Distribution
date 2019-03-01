package typings
package tsmonadLib.libSrcMonadMod

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
    bind: js.Function1[js.Function1[/* t */ T, Monad[js.Any]], Monad[js.Any]],
    chain: js.Function1[js.Function1[/* t */ T, Monad[js.Any]], Monad[js.Any]],
    of: js.Function1[js.Any, Monad[js.Any]],
    unit: js.Function1[js.Any, Monad[js.Any]]
  ): Monad[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bind")(bind)
    __obj.updateDynamic("chain")(chain)
    __obj.updateDynamic("of")(of)
    __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[Monad[T]]
  }
}

