package typings
package titaniumLib.TitaniumNs.AndroidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Monitor and handle Android system broadcasts.
		 */
trait BroadcastReceiver
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * URL of the JavaScript file to handle the broadcast.
  			 */
  var url: java.lang.String
  /**
  			 * Gets the value of the <Titanium.Android.BroadcastReceiver.onReceived> property.
  			 */
  def getOnReceived(): js.Function1[/* param0 */ js.Any, _]
  /**
  			 * Gets the value of the <Titanium.Android.BroadcastReceiver.url> property.
  			 */
  def getUrl(): java.lang.String
  /**
  			 * The function called when a broadcast is received.
  			 */
  def onReceived(param0: js.Any): js.Any
  /**
  			 * Sets the value of the <Titanium.Android.BroadcastReceiver.onReceived> property.
  			 */
  def setOnReceived(onReceived: js.Function1[/* param0 */ js.Any, _]): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.BroadcastReceiver.url> property.
  			 */
  def setUrl(url: java.lang.String): scala.Unit
}

object BroadcastReceiver {
  @scala.inline
  def apply(
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getOnReceived: js.Function0[js.Function1[/* param0 */ js.Any, _]],
    getUrl: js.Function0[java.lang.String],
    onReceived: js.Function1[js.Any, js.Any],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setOnReceived: js.Function1[js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setUrl: js.Function1[java.lang.String, scala.Unit],
    url: java.lang.String,
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): BroadcastReceiver = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, fireEvent = fireEvent, getApiName = getApiName, getBubbleParent = getBubbleParent, getOnReceived = getOnReceived, getUrl = getUrl, onReceived = onReceived, removeEventListener = removeEventListener, setBubbleParent = setBubbleParent, setOnReceived = setOnReceived, setUrl = setUrl, url = url)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[BroadcastReceiver]
  }
}

