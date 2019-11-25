package typings.titanium.Titanium.App.iOS

import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A set of notification actions to associate with a notification.
			 */
trait UserNotificationCategory extends Proxy {
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
  var categorySummaryFormat: String
  /**
  				 * The placeholder text to display when notification previews are disabled for the app.
  				 */
  var hiddenPreviewsBodyPlaceholder: String
  /**
  				 * Identifier for this category.
  				 */
  var identifier: String
  /**
  				 * The intents related to notifications of this category.
  				 */
  var intentIdentifiers: js.Array[String]
  /**
  				 * Options for how to handle notifications of this type.
  				 */
  var options: js.Array[Double]
}

object UserNotificationCategory {
  @scala.inline
  def apply(
    actionsForDefaultContext: js.Array[UserNotificationAction],
    actionsForMinimalContext: js.Array[UserNotificationAction],
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    categorySummaryFormat: String,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    hiddenPreviewsBodyPlaceholder: String,
    identifier: String,
    intentIdentifiers: js.Array[String],
    options: js.Array[Double],
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): UserNotificationCategory = {
    val __obj = js.Dynamic.literal(actionsForDefaultContext = actionsForDefaultContext.asInstanceOf[js.Any], actionsForMinimalContext = actionsForMinimalContext.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName.asInstanceOf[js.Any], applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent.asInstanceOf[js.Any], categorySummaryFormat = categorySummaryFormat.asInstanceOf[js.Any], fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), hiddenPreviewsBodyPlaceholder = hiddenPreviewsBodyPlaceholder.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], intentIdentifiers = intentIdentifiers.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserNotificationCategory]
  }
}

