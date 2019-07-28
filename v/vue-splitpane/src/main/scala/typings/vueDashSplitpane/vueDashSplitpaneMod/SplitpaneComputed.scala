package typings.vueDashSplitpane.vueDashSplitpaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitpaneComputed extends js.Object {
  def cursor(): String
  def userSelect(): String
}

object SplitpaneComputed {
  @scala.inline
  def apply(cursor: () => String, userSelect: () => String): SplitpaneComputed = {
    val __obj = js.Dynamic.literal(cursor = js.Any.fromFunction0(cursor), userSelect = js.Any.fromFunction0(userSelect))
  
    __obj.asInstanceOf[SplitpaneComputed]
  }
}

