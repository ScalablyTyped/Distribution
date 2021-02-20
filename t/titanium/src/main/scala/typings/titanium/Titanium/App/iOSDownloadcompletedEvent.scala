package typings.titanium.Titanium.App

import typings.titanium.Titanium.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired to indicate that a [urlSession's](Modules.URLSession) download task has finished downloading.
  * Available only on iOS 7 and later.
  */
@js.native
trait iOSDownloadcompletedEvent extends iOSBaseEvent {
  
  /**
    * The downloaded data as a Titanium.Blob object.
    */
  var data: Blob = js.native
  
  /**
    * The `urlSession` session identifier. If it does not exist, this property is not provided.
    * This property is available since Titanium Mobile 5.4.0.GA.
    */
  var sessionIdentifier: String = js.native
  
  /**
    * The `urlSession` download task's identifier.
    */
  var taskIdentifier: Double = js.native
}
object iOSDownloadcompletedEvent {
  
  @scala.inline
  def apply(data: Blob, sessionIdentifier: String, source: iOS, taskIdentifier: Double): iOSDownloadcompletedEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sessionIdentifier = sessionIdentifier.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], taskIdentifier = taskIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSDownloadcompletedEvent]
  }
  
  @scala.inline
  implicit class iOSDownloadcompletedEventMutableBuilder[Self <: iOSDownloadcompletedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Blob): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionIdentifier(value: String): Self = StObject.set(x, "sessionIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskIdentifier(value: Double): Self = StObject.set(x, "taskIdentifier", value.asInstanceOf[js.Any])
  }
}
