package typings.titanium.Titanium.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the events related to a [urlSession](Modules.URLSession) are waiting to be processed.
		 * Available only on iOS 7 and later.
		 */
trait iOSBackgroundtransferEvent extends iOSBaseEvent {
  /**
  			 * Unique string identifier for the `backgroundtransfer` event. This identifier should be passed as the argument
  			 * to the [endBackgroundHandler](Titanium.App.iOS.endBackgroundHandler) method.
  			 */
  var handlerId: String
  /**
  			 * The identifier of the URL session requiring attention. If your app was just launched,
  			 * you can use this identifier to create a new `urlSession` object that can receive the events.
  			 */
  var sessionId: String
}

object iOSBackgroundtransferEvent {
  @scala.inline
  def apply(handlerId: String, sessionId: String, source: iOS): iOSBackgroundtransferEvent = {
    val __obj = js.Dynamic.literal(handlerId = handlerId.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSBackgroundtransferEvent]
  }
}

