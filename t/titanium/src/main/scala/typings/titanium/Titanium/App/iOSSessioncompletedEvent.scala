package typings.titanium.Titanium.App

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired to indicate that a [urlSession](Modules.URLSession) task finished transferring data.
  * Available only on iOS 7 and later.
  */
@js.native
trait iOSSessioncompletedEvent extends iOSBaseEvent {
  
  /**
    * The error code of the error, if any (potentially system-dependent).
    */
  var errorCode: Double = js.native
  
  /**
    * A string containing the localized description of the error.
    * This property does not exhist if errorCode is 0, which means there is no error.
    */
  var message: String = js.native
  
  /**
    * The response text for [task](Modules.URLSession.task) and [uploadTask](Modules.URLSession.uploadTask).
    * This property does not exhist for download task. For download task response,
    * use [downloadcompleted](Titanium.App.iOS.downloadcompleted) event.
    */
  var responseText: String = js.native
  
  /**
    * The `urlSession` session identifier. If it does not exist, this property is not provided.
    * This property is available since Titanium Mobile 5.4.0.GA.
    */
  var sessionIdentifier: String = js.native
  
  /**
    * The response status code for tasks.
    */
  var statusCode: Double = js.native
  
  /**
    * Indicates if the operation succeeded. Returns true if download succeeded, false otherwise.
    */
  var success: Boolean = js.native
  
  /**
    * The `urlSession` download task's identifier.
    */
  var taskIdentifier: Double = js.native
}
object iOSSessioncompletedEvent {
  
  @scala.inline
  def apply(
    errorCode: Double,
    message: String,
    responseText: String,
    sessionIdentifier: String,
    source: iOS,
    statusCode: Double,
    success: Boolean,
    taskIdentifier: Double
  ): iOSSessioncompletedEvent = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], sessionIdentifier = sessionIdentifier.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], taskIdentifier = taskIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSSessioncompletedEvent]
  }
  
  @scala.inline
  implicit class iOSSessioncompletedEventMutableBuilder[Self <: iOSSessioncompletedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseText(value: String): Self = StObject.set(x, "responseText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionIdentifier(value: String): Self = StObject.set(x, "sessionIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskIdentifier(value: Double): Self = StObject.set(x, "taskIdentifier", value.asInstanceOf[js.Any])
  }
}
