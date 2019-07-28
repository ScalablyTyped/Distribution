package typings.tstl.baseDisposableIPartialContainersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _IPushFront[T] extends js.Object {
  /**
    * Insert an element at the first.
    *
    * @param val Value to insert.
    */
  def push_front(`val`: T): Unit
}

object _IPushFront {
  @scala.inline
  def apply[T](push_front: T => Unit): _IPushFront[T] = {
    val __obj = js.Dynamic.literal(push_front = js.Any.fromFunction1(push_front))
  
    __obj.asInstanceOf[_IPushFront[T]]
  }
}

