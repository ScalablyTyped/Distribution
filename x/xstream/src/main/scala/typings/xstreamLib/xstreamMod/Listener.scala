package typings
package xstreamLib.xstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Listener[T] extends js.Object {
  def complete(): scala.Unit
  def error(err: js.Any): scala.Unit
  def next(x: T): scala.Unit
}

object Listener {
  @scala.inline
  def apply[T](complete: () => scala.Unit, error: js.Any => scala.Unit, next: T => scala.Unit): Listener[T] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
  
    __obj.asInstanceOf[Listener[T]]
  }
}

