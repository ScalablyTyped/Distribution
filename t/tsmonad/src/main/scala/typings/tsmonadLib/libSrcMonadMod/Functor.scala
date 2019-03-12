package typings
package tsmonadLib.libSrcMonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Functor[T] extends js.Object {
  def fmap[U](f: js.Function1[/* t */ T, U]): Functor[U]
  def lift[U](f: js.Function1[/* t */ T, U]): Functor[U]
  def map[U](f: js.Function1[/* t */ T, U]): Functor[U]
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
}

