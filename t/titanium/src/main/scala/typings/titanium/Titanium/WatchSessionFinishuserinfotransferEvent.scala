package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
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
  implicit class WatchSessionFinishuserinfotransferEventMutableBuilder[Self <: WatchSessionFinishuserinfotransferEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfo(value: js.Any): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
  }
}
