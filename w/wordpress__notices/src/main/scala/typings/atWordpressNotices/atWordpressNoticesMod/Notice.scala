package typings.atWordpressNotices.atWordpressNoticesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notice extends js.Object {
  var actions: js.Array[Action]
  var content: String
  var id: String
  var isDismissible: Boolean
  var status: Status
}

object Notice {
  @scala.inline
  def apply(actions: js.Array[Action], content: String, id: String, isDismissible: Boolean, status: Status): Notice = {
    val __obj = js.Dynamic.literal(actions = actions, content = content, id = id, isDismissible = isDismissible, status = status)
  
    __obj.asInstanceOf[Notice]
  }
}

