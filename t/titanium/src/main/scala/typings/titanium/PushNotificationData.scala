package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple object representing a push notification.
  */
@js.native
trait PushNotificationData extends StObject {
  
  /**
    * The `userinfo` dictionary passed to the Apple Push Notification Service.
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * Boolean indicating if notification was received while app was in background.
    */
  var inBackground: js.UndefOr[Boolean] = js.native
}
object PushNotificationData {
  
  @scala.inline
  def apply(): PushNotificationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushNotificationData]
  }
  
  @scala.inline
  implicit class PushNotificationDataMutableBuilder[Self <: PushNotificationData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setInBackground(value: Boolean): Self = StObject.set(x, "inBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInBackgroundUndefined: Self = StObject.set(x, "inBackground", js.undefined)
  }
}
