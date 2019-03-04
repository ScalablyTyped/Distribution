package typings
package tstlLib.baseDisposableIPartialContainersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _IPush[T] extends js.Object {
  /**
    * Insert items at the end.
    *
    * @param items Items to insert.
    * @return Number of elements in the container after insertion.
    */
  def push(items: T*): scala.Double
}

object _IPush {
  @scala.inline
  def apply[T](push: js.Function1[/* repeated */ T, scala.Double]): _IPush[T] = {
    val __obj = js.Dynamic.literal(push = push)
  
    __obj.asInstanceOf[_IPush[T]]
  }
}

