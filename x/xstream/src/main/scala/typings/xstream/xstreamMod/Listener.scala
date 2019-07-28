package typings.xstream.xstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Listener[T] extends js.Object {
  def complete(): Unit
  def error(err: js.Any): Unit
  def next(x: T): Unit
}

object Listener {
  @scala.inline
  def apply[T](complete: () => Unit, error: js.Any => Unit, next: T => Unit): Listener[T] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
  
    __obj.asInstanceOf[Listener[T]]
  }
}

