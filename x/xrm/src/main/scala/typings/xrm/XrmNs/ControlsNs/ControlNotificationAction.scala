package typings.xrm.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * interface to define the actions on a control notification
  */
trait ControlNotificationAction extends js.Object {
  /**
    * Array of functions. The corresponding actions for the message.
    */
  var actions: js.Array[js.Function0[Unit]]
  /**
    * The body message of the notification to be displayed to the user. Limit your message to 100 characters for optimal user experience.
    */
  var message: js.UndefOr[String] = js.undefined
}

object ControlNotificationAction {
  @scala.inline
  def apply(actions: js.Array[js.Function0[Unit]], message: String = null): ControlNotificationAction = {
    val __obj = js.Dynamic.literal(actions = actions)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[ControlNotificationAction]
  }
}

