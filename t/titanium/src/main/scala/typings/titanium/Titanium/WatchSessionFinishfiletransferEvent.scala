package typings.titanium.Titanium

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
  implicit class WatchSessionFinishfiletransferEventOps[Self <: WatchSessionFinishfiletransferEvent] (val x: Self) extends AnyVal {
    
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
    def setFileURL(value: String): Self = this.set("fileURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaData(value: js.Any): Self = this.set("metaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
}
