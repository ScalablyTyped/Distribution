package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionUserSettings extends StObject {
  
  /**
    * Indicates whether the user will receive notifications for the associated group subscription.
    */
  var optedOut: Boolean
}
object SubscriptionUserSettings {
  
  inline def apply(optedOut: Boolean): SubscriptionUserSettings = {
    val __obj = js.Dynamic.literal(optedOut = optedOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionUserSettings]
  }
  
  extension [Self <: SubscriptionUserSettings](x: Self) {
    
    inline def setOptedOut(value: Boolean): Self = StObject.set(x, "optedOut", value.asInstanceOf[js.Any])
  }
}
