package typings
package tstlLib.baseDisposableIPartialContainersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _IPushFront[T] extends js.Object {
  /**
    * Insert an element at the first.
    *
    * @param val Value to insert.
    */
  def push_front(`val`: T): scala.Unit
}

object _IPushFront {
  @scala.inline
  def apply[T](push_front: js.Function1[T, scala.Unit]): _IPushFront[T] = {
    val __obj = js.Dynamic.literal(push_front = push_front)
  
    __obj.asInstanceOf[_IPushFront[T]]
  }
}

