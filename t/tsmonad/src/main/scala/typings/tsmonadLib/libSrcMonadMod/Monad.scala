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

