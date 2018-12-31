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

