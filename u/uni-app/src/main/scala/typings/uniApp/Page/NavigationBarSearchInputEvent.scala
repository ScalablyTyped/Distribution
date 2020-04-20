package typings.uniApp.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBarSearchInputEvent extends js.Object {
  /**
    * 搜索输入框输入内容
    */
  var text: String
}

object NavigationBarSearchInputEvent {
  @scala.inline
  def apply(text: String): NavigationBarSearchInputEvent = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBarSearchInputEvent]
  }
}

