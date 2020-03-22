package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitNotificationElement extends js.Object {
  def close(immediate: Boolean): Unit
}

object UIkitNotificationElement {
  @scala.inline
  def apply(close: Boolean => Unit): UIkitNotificationElement = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close))
  
    __obj.asInstanceOf[UIkitNotificationElement]
  }
}

