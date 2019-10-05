package typings.titanium.Titanium.Android

import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Helper object for generating large-format notifications that include a lot of text.
		 */
trait BigTextStyle extends Proxy {
  /**
  			 * Overrides <Titanium.Android.Notification.contentTitle> in the big form of the notification. This defaults to the value passed to <Titanium.Android.Notification.contentTitle>.
  			 */
  var bigContentTitle: String
  /**
  			 * Sets the longer text to be displayed in the big form of the notification in place of the content text.
  			 */
  var bigText: String
  /**
  			 * Set the first line of text after the detail section in the big form of the notification.
  			 */
  var summaryText: String
  /**
  			 * Gets the value of the <Titanium.Android.BigTextStyle.bigContentTitle> property.
  			 */
  def getBigContentTitle(): String
  /**
  			 * Gets the value of the <Titanium.Android.BigTextStyle.bigText> property.
  			 */
  def getBigText(): String
  /**
  			 * Gets the value of the <Titanium.Android.BigTextStyle.summaryText> property.
  			 */
  def getSummaryText(): String
  /**
  			 * Sets the value of the <Titanium.Android.BigTextStyle.bigContentTitle> property.
  			 */
  def setBigContentTitle(bigContentTitle: String): Unit
  /**
  			 * Sets the value of the <Titanium.Android.BigTextStyle.bigText> property.
  			 */
  def setBigText(bigText: String): Unit
  /**
  			 * Sets the value of the <Titanium.Android.BigTextStyle.summaryText> property.
  			 */
  def setSummaryText(summaryText: String): Unit
}

object BigTextStyle {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bigContentTitle: String,
    bigText: String,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBigContentTitle: () => String,
    getBigText: () => String,
    getBubbleParent: () => Boolean,
    getSummaryText: () => String,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBigContentTitle: String => Unit,
    setBigText: String => Unit,
    setBubbleParent: Boolean => Unit,
    setSummaryText: String => Unit,
    summaryText: String,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): BigTextStyle = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bigContentTitle = bigContentTitle, bigText = bigText, bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBigContentTitle = js.Any.fromFunction0(getBigContentTitle), getBigText = js.Any.fromFunction0(getBigText), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getSummaryText = js.Any.fromFunction0(getSummaryText), removeEventListener = js.Any.fromFunction2(removeEventListener), setBigContentTitle = js.Any.fromFunction1(setBigContentTitle), setBigText = js.Any.fromFunction1(setBigText), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setSummaryText = js.Any.fromFunction1(setSummaryText), summaryText = summaryText)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[BigTextStyle]
  }
}

