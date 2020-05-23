package typings.titanium.Titanium.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the application is woken up for a fetch operation. Available only on iOS 7 and later.
  */
trait iOSBackgroundfetchEvent extends iOSBaseEvent {
  /**
    * Unique string identifier for the `backgroundfetch` event. This identifier should be passed as the argument
    * to the [endBackgroundHandler](Titanium.App.iOS.endBackgroundHandler) method.
    */
  var handlerId: String
}

object iOSBackgroundfetchEvent {
  @scala.inline
  def apply(handlerId: String, source: iOS): iOSBackgroundfetchEvent = {
    val __obj = js.Dynamic.literal(handlerId = handlerId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSBackgroundfetchEvent]
  }
}

