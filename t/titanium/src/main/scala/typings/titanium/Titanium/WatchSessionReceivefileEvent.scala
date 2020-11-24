package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * App received file from apple watch in background.
  */
@js.native
trait WatchSessionReceivefileEvent extends WatchSessionBaseEvent {
  
  /**
    * The downloaded data as a Titanium.Blob object.
    */
  var data: Blob = js.native
  
  /**
    * Error code if transfer failed.
    */
  var errorCode: Double = js.native
  
  /**
    * Error message if any.
    */
  var message: String = js.native
  
  /**
    * Information about the file.
    */
  var metaData: js.Any = js.native
  
  /**
    * If the transfer was successful.
    */
  var success: Boolean = js.native
}
object WatchSessionReceivefileEvent {
  
  @scala.inline
  def apply(
    data: Blob,
    errorCode: Double,
    message: String,
    metaData: js.Any,
    source: WatchSession,
    success: Boolean
  ): WatchSessionReceivefileEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], metaData = metaData.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchSessionReceivefileEvent]
  }
  
  @scala.inline
  implicit class WatchSessionReceivefileEventOps[Self <: WatchSessionReceivefileEvent] (val x: Self) extends AnyVal {
    
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
    def setData(value: Blob): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCode(value: Double): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaData(value: js.Any): Self = this.set("metaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
}
