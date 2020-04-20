package typings.titanium.Titanium.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired periodically to inform the app about the download's progress of a [urlSession](Modules.URLSession).
		 * Available only on iOS 7 and later.
		 */
trait iOSDownloadprogressEvent extends iOSBaseEvent {
  /**
  			 * The number of bytes transferred since the last time this event was fired.
  			 */
  var bytesWritten: Double
  /**
  			 * The `urlSession` session identifier. If it does not exist, this property is not provided.
  			 * This property is available since Titanium Mobile 5.4.0.GA.
  			 */
  var sessionIdentifier: String
  /**
  			 * The `urlSession` download task's identifier.
  			 */
  var taskIdentifier: Double
  /**
  			 * The expected length of the file, as provided by the Content-Length header. If this
  			 * header was not provided, the value is zero.
  			 */
  var totalBytesExpectedToWrite: Double
  /**
  			 * The total number of bytes transferred so far.
  			 */
  var totalBytesWritten: Double
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
}

