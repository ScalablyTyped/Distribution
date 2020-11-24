package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the application completed user info transfer to the watch app.
  */
@js.native
trait WatchSessionFinishuserinfotransferEvent extends WatchSessionBaseEvent {
  
  /**
    * Error code if transfer failed.
    */
  var errorCode: Double = js.native
  
  /**
    * Error message if any.
    */
  var message: String = js.native
  
  /**
    * If the transfer was successful.
    */
  var success: Boolean = js.native
  
  /**
    * The downloaded data as a Titanium.Blob object.
    */
  var userInfo: js.Any = js.native
}
object WatchSessionFinishuserinfotransferEvent {
  
  @scala.inline
  def apply(errorCode: Double, message: String, source: WatchSession, success: Boolean, userInfo: js.Any): WatchSessionFinishuserinfotransferEvent = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchSessionFinishuserinfotransferEvent]
  }
  
  @scala.inline
  implicit class WatchSessionFinishuserinfotransferEventOps[Self <: WatchSessionFinishuserinfotransferEvent] (val x: Self) extends AnyVal {
    
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
    def setErrorCode(value: Double): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfo(value: js.Any): Self = this.set("userInfo", value.asInstanceOf[js.Any])
  }
}
