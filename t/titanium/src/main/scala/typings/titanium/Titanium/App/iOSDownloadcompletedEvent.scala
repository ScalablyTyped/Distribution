package typings.titanium.Titanium.App

import typings.titanium.Titanium.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class iOSDownloadcompletedEventOps[Self <: iOSDownloadcompletedEvent] (val x: Self) extends AnyVal {
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
    def setData(value: Blob): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionIdentifier(value: String): Self = this.set("sessionIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskIdentifier(value: Double): Self = this.set("taskIdentifier", value.asInstanceOf[js.Any])
  }
  
}

