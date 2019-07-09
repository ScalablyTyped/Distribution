package typings
package atWordpressNoticesLib.atWordpressNoticesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notice extends js.Object {
  var actions: js.Array[Action]
  var content: java.lang.String
  var id: java.lang.String
  var isDismissible: scala.Boolean
  var status: Status
}

object Notice {
  @scala.inline
  def apply(
    actions: js.Array[Action],
    content: java.lang.String,
    id: java.lang.String,
    isDismissible: scala.Boolean,
    status: Status
  ): Notice = {
    val __obj = js.Dynamic.literal(actions = actions, content = content, id = id, isDismissible = isDismissible, status = status)
  
    __obj.asInstanceOf[Notice]
  }
}

