package typings.winrtDashUwp.Windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WinRTEvent[TSender] extends js.Object {
  var detail: js.Array[_]
  var target: TSender
  var `type`: String
}

object WinRTEvent {
  @scala.inline
  def apply[TSender](detail: js.Array[_], target: TSender, `type`: String): WinRTEvent[TSender] = {
    val __obj = js.Dynamic.literal(detail = detail, target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WinRTEvent[TSender]]
  }
}

