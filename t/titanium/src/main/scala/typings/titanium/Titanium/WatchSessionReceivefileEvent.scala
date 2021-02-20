package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
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
  implicit class WatchSessionReceivefileEventMutableBuilder[Self <: WatchSessionReceivefileEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Blob): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaData(value: js.Any): Self = StObject.set(x, "metaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
