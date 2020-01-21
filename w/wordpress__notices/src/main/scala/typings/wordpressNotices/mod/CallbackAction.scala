package typings.wordpressNotices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackAction extends Action {
  var label: String
  def callback(): Unit
}

object CallbackAction {
  @scala.inline
  def apply(callback: () => Unit, label: String): CallbackAction = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CallbackAction]
  }
}

