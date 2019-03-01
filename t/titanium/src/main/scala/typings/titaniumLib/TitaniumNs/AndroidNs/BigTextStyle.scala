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
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bigContentTitle: java.lang.String,
    bigText: java.lang.String,
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBigContentTitle: js.Function0[java.lang.String],
    getBigText: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getSummaryText: js.Function0[java.lang.String],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBigContentTitle: js.Function1[java.lang.String, scala.Unit],
    setBigText: js.Function1[java.lang.String, scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setSummaryText: js.Function1[java.lang.String, scala.Unit],
    summaryText: java.lang.String,
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): BigTextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("apiName")(apiName)
    __obj.updateDynamic("applyProperties")(applyProperties)
    __obj.updateDynamic("bigContentTitle")(bigContentTitle)
    __obj.updateDynamic("bigText")(bigText)
    __obj.updateDynamic("bubbleParent")(bubbleParent)
    __obj.updateDynamic("fireEvent")(fireEvent)
    __obj.updateDynamic("getApiName")(getApiName)
    __obj.updateDynamic("getBigContentTitle")(getBigContentTitle)
    __obj.updateDynamic("getBigText")(getBigText)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent)
    __obj.updateDynamic("getSummaryText")(getSummaryText)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setBigContentTitle")(setBigContentTitle)
    __obj.updateDynamic("setBigText")(setBigText)
    __obj.updateDynamic("setBubbleParent")(setBubbleParent)
    __obj.updateDynamic("setSummaryText")(setSummaryText)
    __obj.updateDynamic("summaryText")(summaryText)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[BigTextStyle]
  }
}

