package typings.titanium.Titanium.App

import typings.titanium.Titanium.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired to indicate that a [urlSession's](Modules.URLSession) download task has finished downloading.
  * Available only on iOS 7 and later.
  */
trait iOSDownloadcompletedEvent extends iOSBaseEvent {
  /**
    * The downloaded data as a Titanium.Blob object.
    */
  var data: Blob
  /**
    * The `urlSession` session identifier. If it does not exist, this property is not provided.
    * This property is available since Titanium Mobile 5.4.0.GA.
    */
  var sessionIdentifier: String
  /**
    * The `urlSession` download task's identifier.
    */
  var taskIdentifier: Double
}

object iOSDownloadcompletedEvent {
  @scala.inline
  def apply(data: Blob, sessionIdentifier: String, source: iOS, taskIdentifier: Double): iOSDownloadcompletedEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sessionIdentifier = sessionIdentifier.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], taskIdentifier = taskIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSDownloadcompletedEvent]
  }
}

