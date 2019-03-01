package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface to define the actions on a control notification
  * @deprecated Use {@link Xrm.Controls.ControlNotificationAction} instead.
  */
trait ControlNotificationAction
  extends xrmLib.XrmNs.ControlsNs.ControlNotificationAction

object ControlNotificationAction {
  @scala.inline
  def apply(actions: js.Array[js.Function0[scala.Unit]], message: java.lang.String = null): ControlNotificationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("actions")(actions)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[ControlNotificationAction]
  }
}

