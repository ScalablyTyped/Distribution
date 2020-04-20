package typings.wordpressNotices.mod

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
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDismissible = isDismissible.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notice]
  }
}

