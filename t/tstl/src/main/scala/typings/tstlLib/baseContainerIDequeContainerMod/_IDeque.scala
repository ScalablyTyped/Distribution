package typings
package tstlLib.baseContainerIDequeContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _IDeque[T]
  extends tstlLib.baseDisposableIPartialContainersMod._IPushFront[T] {
  /**
    * Erase the first element.
    */
  def pop_front(): scala.Unit
}

object _IDeque {
  @scala.inline
  def apply[T](pop_front: () => scala.Unit, push_front: T => scala.Unit): _IDeque[T] = {
    val __obj = js.Dynamic.literal(pop_front = js.Any.fromFunction0(pop_front), push_front = js.Any.fromFunction1(push_front))
  
    __obj.asInstanceOf[_IDeque[T]]
  }
}

