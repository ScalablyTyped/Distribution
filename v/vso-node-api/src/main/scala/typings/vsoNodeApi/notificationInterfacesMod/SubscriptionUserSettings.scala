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
  
  @scala.inline
  def apply(optedOut: Boolean): SubscriptionUserSettings = {
    val __obj = js.Dynamic.literal(optedOut = optedOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionUserSettings]
  }
  
  @scala.inline
  implicit class SubscriptionUserSettingsMutableBuilder[Self <: SubscriptionUserSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptedOut(value: Boolean): Self = StObject.set(x, "optedOut", value.asInstanceOf[js.Any])
  }
}
