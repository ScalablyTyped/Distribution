package typings
package winrtDashUwpLib.WindowsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WinRTEvent[TSender] extends js.Object {
  var detail: js.Array[_]
  var target: TSender
  var `type`: java.lang.String
}

object WinRTEvent {
  @scala.inline
  def apply[TSender](detail: js.Array[_], target: TSender, `type`: java.lang.String): WinRTEvent[TSender] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("detail")(detail)
    __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[WinRTEvent[TSender]]
  }
}

