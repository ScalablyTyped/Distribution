package typings.tstl.ipushfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPushFront[T] extends js.Object {
  /**
    * Insert an element at the first.
    *
    * @param val Value to insert.
    */
  def push_front(`val`: T): Unit
}

object IPushFront {
  @scala.inline
  def apply[T](push_front: T => Unit): IPushFront[T] = {
    val __obj = js.Dynamic.literal(push_front = js.Any.fromFunction1(push_front))
    __obj.asInstanceOf[IPushFront[T]]
  }
}

