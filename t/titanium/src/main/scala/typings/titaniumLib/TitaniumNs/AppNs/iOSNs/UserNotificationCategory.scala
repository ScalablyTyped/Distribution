package typings
package titaniumLib.TitaniumNs.AppNs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A set of notification actions to associate with a notification.
			 */
trait UserNotificationCategory
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Array of notification actions to associate with the group.
  				 */
  var actionsForDefaultContext: js.Array[UserNotificationAction]
  /**
  				 * Array of notification actions to display for non-dialog-style notification.
  				 */
  var actionsForMinimalContext: js.Array[UserNotificationAction]
  /**
  				 * A format string for the summary description used when the system groups the category's notifications.
  				 */
  var categorySummaryFormat: java.lang.String
  /**
  				 * The placeholder text to display when notification previews are disabled for the app.
  				 */
  var hiddenPreviewsBodyPlaceholder: java.lang.String
  /**
  				 * Identifier for this category.
  				 */
  var identifier: java.lang.String
  /**
  				 * The intents related to notifications of this category.
  				 */
  var intentIdentifiers: js.Array[java.lang.String]
  /**
  				 * Options for how to handle notifications of this type.
  				 */
  var options: js.Array[scala.Double]
}

