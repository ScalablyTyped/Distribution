package typings.titanium.Titanium.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when openParentApplication:reply is called from a WatchKit extension. Available only on iOS 8.2 and later.
		 */
trait iOSWatchkitextensionrequestEvent extends iOSBaseEvent {
  /**
  			 * Unique string identifier for the `watchkitextensionrequest` event. This identifier should be passed an argument
  			 * to the [sendWatchExtensionReply](Titanium.App.iOS.sendWatchExtensionReply) method.
  			 */
  var handlerId: String
  /**
  			 * The payload passed to the `openParentApplication:reply` method from the WatchKit extension.
  			 */
  var userInfo: js.Any
}

object iOSWatchkitextensionrequestEvent {
  @scala.inline
  def apply(handlerId: String, source: iOS, userInfo: js.Any): iOSWatchkitextensionrequestEvent = {
    val __obj = js.Dynamic.literal(handlerId = handlerId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSWatchkitextensionrequestEvent]
  }
}

