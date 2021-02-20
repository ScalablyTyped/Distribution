package typings.xrm.Xrm.Controls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * interface to define the actions on a control notification
  */
@js.native
trait ControlNotificationAction extends StObject {
  
  /**
    * Array of functions. The corresponding actions for the message.
    */
  var actions: js.Array[js.Function0[Unit]] = js.native
  
  /**
    * The body message of the notification to be displayed to the user. Limit your message to 100 characters for optimal user experience.
    */
  var message: js.UndefOr[String] = js.native
}
object ControlNotificationAction {
  
  @scala.inline
  def apply(actions: js.Array[js.Function0[Unit]]): ControlNotificationAction = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlNotificationAction]
  }
  
  @scala.inline
  implicit class ControlNotificationActionMutableBuilder[Self <: ControlNotificationAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[js.Function0[Unit]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
