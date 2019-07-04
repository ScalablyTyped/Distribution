package typings
package vueDashSplitpaneLib.vueDashSplitpaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitpaneComputed extends js.Object {
  def cursor(): java.lang.String
  def userSelect(): java.lang.String
}

object SplitpaneComputed {
  @scala.inline
  def apply(cursor: () => java.lang.String, userSelect: () => java.lang.String): SplitpaneComputed = {
    val __obj = js.Dynamic.literal(cursor = js.Any.fromFunction0(cursor), userSelect = js.Any.fromFunction0(userSelect))
  
    __obj.asInstanceOf[SplitpaneComputed]
  }
}

