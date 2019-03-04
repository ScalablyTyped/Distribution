package typings
package toastrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastrResponse extends js.Object {
  /**
  	 * The datetime the toast was closed, if the state is hidden.
  	 */
  var endTime: js.UndefOr[stdLib.Date] = js.undefined
  /**
  	 * The event's toast details.
  	 */
  var map: ToastMap
  /**
  	 * The toastr options.
  	 */
  var options: ToastrOptions
  /**
  	 * The datetime the toast was opened.
  	 */
  var startTime: stdLib.Date
  /**
  	 * The current state of the toast.
  	 */
  var state: toastrLib.toastrLibStrings.visible | toastrLib.toastrLibStrings.hidden
  /**
  	 * The internal toast id.
  	 */
  var toastId: scala.Double
}

object ToastrResponse {
  @scala.inline
  def apply(
    map: ToastMap,
    options: ToastrOptions,
    startTime: stdLib.Date,
    state: toastrLib.toastrLibStrings.visible | toastrLib.toastrLibStrings.hidden,
    toastId: scala.Double,
    endTime: stdLib.Date = null
  ): ToastrResponse = {
    val __obj = js.Dynamic.literal(map = map, options = options, startTime = startTime, state = state.asInstanceOf[js.Any], toastId = toastId)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    __obj.asInstanceOf[ToastrResponse]
  }
}

