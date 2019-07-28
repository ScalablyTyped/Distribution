package typings.uikit.UIkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyOptions extends js.Object {
  /**
    * The message to display
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * Adjust the notification's position to different corners.
    * @default  'top-center'
    * <h2>Possible values</h2>
    * top-center, top-left, top-right, bottom-center, bottom-left, bottom-right
    * If you want to create one value set its style with the CSS uk-notify-yourPosition
    */
  var pos: js.UndefOr[String] = js.undefined
  /**
    * A notification can be styled by adding a status to the message to indicate an info, success, warning or a
    * danger status.
    * <h2>Possible values</h2>
    * info, sucess, warning, danger
    * If you want to create one set its style with the CSS class uk-notify-message-yourStatus
    * @default 'info'
    */
  var status: js.UndefOr[String] = js.undefined
  /**
    * Amount of tiem in milliseconds a messa is visible. Set to 0 for sticky message
    * @default 5000
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object NotifyOptions {
  @scala.inline
  def apply(message: String = null, pos: String = null, status: String = null, timeout: Int | Double = null): NotifyOptions = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    if (pos != null) __obj.updateDynamic("pos")(pos)
    if (status != null) __obj.updateDynamic("status")(status)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyOptions]
  }
}

