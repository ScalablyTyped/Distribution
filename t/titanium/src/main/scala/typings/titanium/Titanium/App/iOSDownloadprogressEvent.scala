package typings.titanium.Titanium.App

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired periodically to inform the app about the download's progress of a [urlSession](Modules.URLSession).
  * Available only on iOS 7 and later.
  */
@js.native
trait iOSDownloadprogressEvent extends iOSBaseEvent {
  
  /**
    * The number of bytes transferred since the last time this event was fired.
    */
  var bytesWritten: Double = js.native
  
  /**
    * The `urlSession` session identifier. If it does not exist, this property is not provided.
    * This property is available since Titanium Mobile 5.4.0.GA.
    */
  var sessionIdentifier: String = js.native
  
  /**
    * The `urlSession` download task's identifier.
    */
  var taskIdentifier: Double = js.native
  
  /**
    * The expected length of the file, as provided by the Content-Length header. If this
    * header was not provided, the value is zero.
    */
  var totalBytesExpectedToWrite: Double = js.native
  
  /**
    * The total number of bytes transferred so far.
    */
  var totalBytesWritten: Double = js.native
}
object iOSDownloadprogressEvent {
  
  @scala.inline
  def apply(
    bytesWritten: Double,
    sessionIdentifier: String,
    source: iOS,
    taskIdentifier: Double,
    totalBytesExpectedToWrite: Double,
    totalBytesWritten: Double
  ): iOSDownloadprogressEvent = {
    val __obj = js.Dynamic.literal(bytesWritten = bytesWritten.asInstanceOf[js.Any], sessionIdentifier = sessionIdentifier.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], taskIdentifier = taskIdentifier.asInstanceOf[js.Any], totalBytesExpectedToWrite = totalBytesExpectedToWrite.asInstanceOf[js.Any], totalBytesWritten = totalBytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSDownloadprogressEvent]
  }
  
  @scala.inline
  implicit class iOSDownloadprogressEventMutableBuilder[Self <: iOSDownloadprogressEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionIdentifier(value: String): Self = StObject.set(x, "sessionIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskIdentifier(value: Double): Self = StObject.set(x, "taskIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesExpectedToWrite(value: Double): Self = StObject.set(x, "totalBytesExpectedToWrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesWritten(value: Double): Self = StObject.set(x, "totalBytesWritten", value.asInstanceOf[js.Any])
  }
}
