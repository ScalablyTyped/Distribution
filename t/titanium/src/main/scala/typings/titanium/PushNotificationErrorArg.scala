package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple object passed to the
  * [registerForPushNotifications](Titanium.Network.registerForPushNotifications) error callback.
  */
@js.native
trait PushNotificationErrorArg extends FailureResponse {
  
  /**
    * The value of this string is always "remote".
    */
  var `type`: js.UndefOr[String] = js.native
}
object PushNotificationErrorArg {
  
  @scala.inline
  def apply(): PushNotificationErrorArg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushNotificationErrorArg]
  }
  
  @scala.inline
  implicit class PushNotificationErrorArgMutableBuilder[Self <: PushNotificationErrorArg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
