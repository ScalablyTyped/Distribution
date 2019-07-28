package typings.tstl.baseDisposableIPartialContainersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _IClear extends js.Object {
  /**
    * Clear elements.
    */
  def clear(): Unit
}

object _IClear {
  @scala.inline
  def apply(clear: () => Unit): _IClear = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
  
    __obj.asInstanceOf[_IClear]
  }
}

