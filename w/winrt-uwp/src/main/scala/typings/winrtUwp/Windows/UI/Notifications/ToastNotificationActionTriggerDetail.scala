package typings.winrtUwp.Windows.UI.Notifications

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToastNotificationActionTriggerDetail extends StObject {
  
  var argument: Any
  
  /* unmapped type */
  var userInput: Any
}
object ToastNotificationActionTriggerDetail {
  
  inline def apply(argument: Any, userInput: Any): ToastNotificationActionTriggerDetail = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], userInput = userInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastNotificationActionTriggerDetail]
  }
  
  extension [Self <: ToastNotificationActionTriggerDetail](x: Self) {
    
    inline def setArgument(value: Any): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setUserInput(value: Any): Self = StObject.set(x, "userInput", value.asInstanceOf[js.Any])
  }
}
