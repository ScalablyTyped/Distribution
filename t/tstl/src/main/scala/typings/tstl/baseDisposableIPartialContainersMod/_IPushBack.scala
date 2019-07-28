package typings.tstl.baseDisposableIPartialContainersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _IPushBack[T] extends js.Object {
  /**
    * Insert an element at the end.
    *
    * @param val Value to insert.
    */
  def push_back(`val`: T): Unit
}

object _IPushBack {
  @scala.inline
  def apply[T](push_back: T => Unit): _IPushBack[T] = {
    val __obj = js.Dynamic.literal(push_back = js.Any.fromFunction1(push_back))
  
    __obj.asInstanceOf[_IPushBack[T]]
  }
}

