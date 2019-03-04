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

object UserNotificationCategory {
  @scala.inline
  def apply(
    actionsForDefaultContext: js.Array[UserNotificationAction],
    actionsForMinimalContext: js.Array[UserNotificationAction],
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    categorySummaryFormat: java.lang.String,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    hiddenPreviewsBodyPlaceholder: java.lang.String,
    identifier: java.lang.String,
    intentIdentifiers: js.Array[java.lang.String],
    options: js.Array[scala.Double],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): UserNotificationCategory = {
    val __obj = js.Dynamic.literal(actionsForDefaultContext = actionsForDefaultContext, actionsForMinimalContext = actionsForMinimalContext, addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, categorySummaryFormat = categorySummaryFormat, fireEvent = fireEvent, getApiName = getApiName, getBubbleParent = getBubbleParent, hiddenPreviewsBodyPlaceholder = hiddenPreviewsBodyPlaceholder, identifier = identifier, intentIdentifiers = intentIdentifiers, options = options, removeEventListener = removeEventListener, setBubbleParent = setBubbleParent)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[UserNotificationCategory]
  }
}

