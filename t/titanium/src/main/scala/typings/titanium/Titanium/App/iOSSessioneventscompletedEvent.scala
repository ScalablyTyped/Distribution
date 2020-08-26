package typings.titanium.Titanium.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired to indicate that all messages enqueued for a [urlSession](Modules.URLSession) have been delivered.
  * Available only on iOS 7 and later.
  */
@js.native
trait iOSSessioneventscompletedEvent extends iOSBaseEvent {
  /**
    * The `urlSession` session identifier. If it does not exist, this property is not provided.
    * This property is available since Titanium Mobile 5.4.0.GA.
    */
  var sessionIdentifier: String = js.native
}

object iOSSessioneventscompletedEvent {
  @scala.inline
  def apply(sessionIdentifier: String, source: iOS): iOSSessioneventscompletedEvent = {
    val __obj = js.Dynamic.literal(sessionIdentifier = sessionIdentifier.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSSessioneventscompletedEvent]
  }
  @scala.inline
  implicit class iOSSessioneventscompletedEventOps[Self <: iOSSessioneventscompletedEvent] (val x: Self) extends AnyVal {
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
    def setSessionIdentifier(value: String): Self = this.set("sessionIdentifier", value.asInstanceOf[js.Any])
  }
  
}

