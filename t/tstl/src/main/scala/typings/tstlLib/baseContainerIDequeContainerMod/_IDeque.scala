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
  def apply[T](pop_front: js.Function0[scala.Unit], push_front: js.Function1[T, scala.Unit]): _IDeque[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pop_front")(pop_front)
    __obj.updateDynamic("push_front")(push_front)
    __obj.asInstanceOf[_IDeque[T]]
  }
}

