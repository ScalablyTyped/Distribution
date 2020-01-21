package typings.tstl.iclearMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClear extends js.Object {
  /**
    * Clear elements.
    */
  def clear(): Unit
}

object IClear {
  @scala.inline
  def apply(clear: () => Unit): IClear = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
  
    __obj.asInstanceOf[IClear]
  }
}

