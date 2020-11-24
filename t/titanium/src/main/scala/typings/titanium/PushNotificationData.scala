package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple object representing a push notification.
  */
@js.native
trait PushNotificationData extends js.Object {
  
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
  implicit class PushNotificationDataOps[Self <: PushNotificationData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setInBackground(value: Boolean): Self = this.set("inBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInBackground: Self = this.set("inBackground", js.undefined)
  }
}
