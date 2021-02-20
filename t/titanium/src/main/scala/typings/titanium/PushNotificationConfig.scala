package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object for specifying push notification options to
  * [registerForPushNotifications](Titanium.Network.registerForPushNotifications).
  */
@js.native
trait PushNotificationConfig extends StObject {
  
  /**
    * Callback function invoked upon receiving a new push notification.
    */
  var callback: js.UndefOr[js.Function1[/* param0 */ PushNotificationData, Unit]] = js.native
  
  /**
    * Callback function called when an error occurs during registration.
    */
  var error: js.UndefOr[js.Function1[/* param0 */ PushNotificationErrorArg, Unit]] = js.native
  
  /**
    * Callback function called when the push registration is successfully completed.
    */
  var success: js.UndefOr[js.Function1[/* param0 */ PushNotificationSuccessArg, Unit]] = js.native
  
  /**
    * Array of `NOTIFICATION_TYPE` constants that the application would like to receive.
    */
  var types: js.UndefOr[js.Array[Double]] = js.native
}
object PushNotificationConfig {
  
  @scala.inline
  def apply(): PushNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushNotificationConfig]
  }
  
  @scala.inline
  implicit class PushNotificationConfigMutableBuilder[Self <: PushNotificationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: /* param0 */ PushNotificationData => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setError(value: /* param0 */ PushNotificationErrorArg => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* param0 */ PushNotificationSuccessArg => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTypes(value: js.Array[Double]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: Double*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
