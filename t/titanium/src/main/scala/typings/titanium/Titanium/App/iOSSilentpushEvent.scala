package typings.titanium.Titanium.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the application is woken up by a silent remote notification. Available only on iOS 7 and later.
		 */
trait iOSSilentpushEvent extends iOSBaseEvent {
  /**
  			 * Unique string identifier for the `silentpush` event. This identifier should be passed as the argument
  			 * to the [endBackgroundHandler](Titanium.App.iOS.endBackgroundHandler) method.
  			 */
  var handlerId: String
}

object iOSSilentpushEvent {
  @scala.inline
  def apply(handlerId: String, source: iOS): iOSSilentpushEvent = {
    val __obj = js.Dynamic.literal(handlerId = handlerId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSSilentpushEvent]
  }
}

