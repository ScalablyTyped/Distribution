package typings.tstl.internalContainerPartialISizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISize extends js.Object {
  /**
    * Number of elements in the container.
    */
  def size(): Double
}

object ISize {
  @scala.inline
  def apply(size: () => Double): ISize = {
    val __obj = js.Dynamic.literal(size = js.Any.fromFunction0(size))
  
    __obj.asInstanceOf[ISize]
  }
}

