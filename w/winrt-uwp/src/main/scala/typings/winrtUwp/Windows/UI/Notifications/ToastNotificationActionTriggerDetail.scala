package typings.winrtUwp.Windows.UI.Notifications

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastNotificationActionTriggerDetail extends StObject {
  
  var argument: js.Any = js.native
  
  /* unmapped type */
  var userInput: js.Any = js.native
}
object ToastNotificationActionTriggerDetail {
  
  @scala.inline
  def apply(argument: js.Any, userInput: js.Any): ToastNotificationActionTriggerDetail = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], userInput = userInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastNotificationActionTriggerDetail]
  }
  
  @scala.inline
  implicit class ToastNotificationActionTriggerDetailMutableBuilder[Self <: ToastNotificationActionTriggerDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: js.Any): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInput(value: js.Any): Self = StObject.set(x, "userInput", value.asInstanceOf[js.Any])
  }
}
