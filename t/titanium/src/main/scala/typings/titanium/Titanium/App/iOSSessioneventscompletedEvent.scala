package typings.titanium.Titanium.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired to indicate that all messages enqueued for a [urlSession](Modules.URLSession) have been delivered.
  * Available only on iOS 7 and later.
  */
trait iOSSessioneventscompletedEvent extends iOSBaseEvent {
  /**
    * The `urlSession` session identifier. If it does not exist, this property is not provided.
    * This property is available since Titanium Mobile 5.4.0.GA.
    */
  var sessionIdentifier: String
}

object iOSSessioneventscompletedEvent {
  @scala.inline
  def apply(sessionIdentifier: String, source: iOS): iOSSessioneventscompletedEvent = {
    val __obj = js.Dynamic.literal(sessionIdentifier = sessionIdentifier.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSSessioneventscompletedEvent]
  }
}

