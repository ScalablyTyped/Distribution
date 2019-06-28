package typings
package uniDashAppLib.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBarSearchInputEvent extends js.Object {
  /**
    * 搜索输入框输入内容
    */
  var text: java.lang.String
}

object NavigationBarSearchInputEvent {
  @scala.inline
  def apply(text: java.lang.String): NavigationBarSearchInputEvent = {
    val __obj = js.Dynamic.literal(text = text)
  
    __obj.asInstanceOf[NavigationBarSearchInputEvent]
  }
}

