package typings
package atWordpressNoticesLib.atWordpressNoticesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackAction extends Action {
  var label: java.lang.String
  def callback(): scala.Unit
}

object CallbackAction {
  @scala.inline
  def apply(callback: () => scala.Unit, label: java.lang.String): CallbackAction = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), label = label)
  
    __obj.asInstanceOf[CallbackAction]
  }
}

