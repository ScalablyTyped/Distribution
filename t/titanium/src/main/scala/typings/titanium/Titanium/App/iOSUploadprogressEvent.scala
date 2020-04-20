package typings.titanium.Titanium.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired periodically to inform the app about the upload's progress of a [urlSession](Modules.URLSession).
		 * Available only on iOS 7 and later.
		 */
trait iOSUploadprogressEvent extends iOSBaseEvent {
  /**
  			 * The number of bytes transferred since the last time this event was fired.
  			 */
  var bytesSent: Double
  /**
  			 * The `urlSession` session identifier. If it does not exist, this property is not provided.
  			 * This property is available since Titanium Mobile 5.4.0.GA.
  			 */
  var sessionIdentifier: String
  /**
  			 * The `urlSession` upload task's identifier.
  			 */
  var taskIdentifier: Double
  /**
  			 * The expected length of the file, as provided by the Content-Length header. If this
  			 * header was not provided, the value is zero.
  			 */
  var totalBytesExpectedToSend: Double
  /**
  			 * The total number of bytes transferred so far.
  			 */
  var totalBytesSent: Double
}

object iOSUploadprogressEvent {
  @scala.inline
  def apply(
    bytesSent: Double,
    sessionIdentifier: String,
    source: iOS,
    taskIdentifier: Double,
    totalBytesExpectedToSend: Double,
    totalBytesSent: Double
  ): iOSUploadprogressEvent = {
    val __obj = js.Dynamic.literal(bytesSent = bytesSent.asInstanceOf[js.Any], sessionIdentifier = sessionIdentifier.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], taskIdentifier = taskIdentifier.asInstanceOf[js.Any], totalBytesExpectedToSend = totalBytesExpectedToSend.asInstanceOf[js.Any], totalBytesSent = totalBytesSent.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSUploadprogressEvent]
  }
}

