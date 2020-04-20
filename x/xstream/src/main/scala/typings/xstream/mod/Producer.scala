package typings.xstream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Producer[T] extends js.Object {
  def start(listener: Listener[T]): Unit
  def stop(): Unit
}

object Producer {
  @scala.inline
  def apply[T](start: Listener[T] => Unit, stop: () => Unit): Producer[T] = {
    val __obj = js.Dynamic.literal(start = js.Any.fromFunction1(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[Producer[T]]
  }
}

