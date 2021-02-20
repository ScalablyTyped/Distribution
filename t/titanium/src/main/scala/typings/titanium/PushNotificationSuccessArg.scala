package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple object passed to the
  * [registerForPushNotifications](Titanium.Network.registerForPushNotifications) success callback.
  */
@js.native
trait PushNotificationSuccessArg extends SuccessResponse {
  
  /**
    * The device token which this device was registered for.
    */
  var deviceToken: js.UndefOr[String] = js.native
  
  /**
    * The value of this string is always "remote".
    */
  var `type`: js.UndefOr[String] = js.native
}
object PushNotificationSuccessArg {
  
  @scala.inline
  def apply(): PushNotificationSuccessArg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushNotificationSuccessArg]
  }
  
  @scala.inline
  implicit class PushNotificationSuccessArgMutableBuilder[Self <: PushNotificationSuccessArg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceToken(value: String): Self = StObject.set(x, "deviceToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceTokenUndefined: Self = StObject.set(x, "deviceToken", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
