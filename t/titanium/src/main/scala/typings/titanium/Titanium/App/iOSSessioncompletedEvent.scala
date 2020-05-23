package typings.titanium.Titanium.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired to indicate that a [urlSession](Modules.URLSession) task finished transferring data.
  * Available only on iOS 7 and later.
  */
trait iOSSessioncompletedEvent extends iOSBaseEvent {
  /**
    * The error code of the error, if any (potentially system-dependent).
    */
  var errorCode: Double
  /**
    * A string containing the localized description of the error.
    */
  var message: String
  /**
    * The response text for upload tasks (since SDK 7.2.0).
    */
  var responseText: String
  /**
    * The `urlSession` session identifier. If it does not exist, this property is not provided.
    * This property is available since Titanium Mobile 5.4.0.GA.
    */
  var sessionIdentifier: String
  /**
    * The response status code for upload tasks (since SDK 7.2.0).
    */
  var statusCode: Double
  /**
    * Indicates if the operation succeeded. Returns true if download succeeded, false otherwise.
    */
  var success: Boolean
  /**
    * The `urlSession` download task's identifier.
    */
  var taskIdentifier: Double
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
}

