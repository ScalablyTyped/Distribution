package typings.titanium.Titanium.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when a user selects an action for an interactive remote notification.
		 */
trait iOSRemotenotificationactionEvent extends iOSBaseEvent {
  /**
  			 * Identifier of the category of the interactive notification.
  			 */
  var category: String
  /**
  			 * The payload passed to the Apple Push Notification Service.
  			 */
  var data: js.Any
  /**
  			 * Identifier of the action that was selected of the interactive notification.
  			 */
  var identifier: String
}

object iOSRemotenotificationactionEvent {
  @scala.inline
  def apply(category: String, data: js.Any, identifier: String, source: iOS): iOSRemotenotificationactionEvent = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSRemotenotificationactionEvent]
  }
}

