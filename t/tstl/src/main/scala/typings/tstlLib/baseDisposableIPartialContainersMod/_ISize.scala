package typings
package tstlLib.baseDisposableIPartialContainersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ISize extends js.Object {
  /**
    * Number of elements in the container.
    */
  def size(): scala.Double
}

object _ISize {
  @scala.inline
  def apply(size: () => scala.Double): _ISize = {
    val __obj = js.Dynamic.literal(size = js.Any.fromFunction0(size))
  
    __obj.asInstanceOf[_ISize]
  }
}

