package typings
package titaniumLib.TitaniumNs.AndroidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Helper object for generating large-format notifications that include a lot of text.
		 */
trait BigTextStyle
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Overrides <Titanium.Android.Notification.contentTitle> in the big form of the notification. This defaults to the value passed to <Titanium.Android.Notification.contentTitle>.
  			 */
  var bigContentTitle: java.lang.String
  /**
  			 * Sets the longer text to be displayed in the big form of the notification in place of the content text.
  			 */
  var bigText: java.lang.String
  /**
  			 * Set the first line of text after the detail section in the big form of the notification.
  			 */
  var summaryText: java.lang.String
  /**
  			 * Gets the value of the <Titanium.Android.BigTextStyle.bigContentTitle> property.
  			 */
  def getBigContentTitle(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Android.BigTextStyle.bigText> property.
  			 */
  def getBigText(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Android.BigTextStyle.summaryText> property.
  			 */
  def getSummaryText(): java.lang.String
  /**
  			 * Sets the value of the <Titanium.Android.BigTextStyle.bigContentTitle> property.
  			 */
  def setBigContentTitle(bigContentTitle: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.BigTextStyle.bigText> property.
  			 */
  def setBigText(bigText: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.BigTextStyle.summaryText> property.
  			 */
  def setSummaryText(summaryText: java.lang.String): scala.Unit
}

object BigTextStyle {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bigContentTitle: java.lang.String,
    bigText: java.lang.String,
    bubbleParent: scala.Boolean,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getApiName: () => java.lang.String,
    getBigContentTitle: () => java.lang.String,
    getBigText: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getSummaryText: () => java.lang.String,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setBigContentTitle: java.lang.String => scala.Unit,
    setBigText: java.lang.String => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setSummaryText: java.lang.String => scala.Unit,
    summaryText: java.lang.String,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): BigTextStyle = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bigContentTitle = bigContentTitle, bigText = bigText, bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBigContentTitle = js.Any.fromFunction0(getBigContentTitle), getBigText = js.Any.fromFunction0(getBigText), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getSummaryText = js.Any.fromFunction0(getSummaryText), removeEventListener = js.Any.fromFunction2(removeEventListener), setBigContentTitle = js.Any.fromFunction1(setBigContentTitle), setBigText = js.Any.fromFunction1(setBigText), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setSummaryText = js.Any.fromFunction1(setSummaryText), summaryText = summaryText)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[BigTextStyle]
  }
}

