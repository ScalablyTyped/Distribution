package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * App completed file transfer to watch app.
  */
@js.native
trait WatchSessionFinishfiletransferEvent extends WatchSessionBaseEvent {
  
  /**
    * Error code if transfer failed.
    */
  var errorCode: Double = js.native
  
  /**
    * URL of the file transferred.
    */
  var fileURL: String = js.native
  
  /**
    * Error message if any.
    */
  var message: String = js.native
  
  /**
    * meta data of the file transferred.
    */
  var metaData: js.Any = js.native
  
  /**
    * If the transfer was successful.
    */
  var success: Boolean = js.native
}
object WatchSessionFinishfiletransferEvent {
  
  @scala.inline
  def apply(
    errorCode: Double,
    fileURL: String,
    message: String,
    metaData: js.Any,
    source: WatchSession,
    success: Boolean
  ): WatchSessionFinishfiletransferEvent = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], fileURL = fileURL.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], metaData = metaData.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchSessionFinishfiletransferEvent]
  }
  
  @scala.inline
  implicit class WatchSessionFinishfiletransferEventMutableBuilder[Self <: WatchSessionFinishfiletransferEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileURL(value: String): Self = StObject.set(x, "fileURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaData(value: js.Any): Self = StObject.set(x, "metaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
