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
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getOnReceived: () => js.Function1[/* param0 */ js.Any, _],
    getUrl: () => java.lang.String,
    onReceived: js.Any => js.Any,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setOnReceived: js.Function1[/* param0 */ js.Any, _] => scala.Unit,
    setUrl: java.lang.String => scala.Unit,
    url: java.lang.String,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): BroadcastReceiver = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getOnReceived = js.Any.fromFunction0(getOnReceived), getUrl = js.Any.fromFunction0(getUrl), onReceived = js.Any.fromFunction1(onReceived), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setOnReceived = js.Any.fromFunction1(setOnReceived), setUrl = js.Any.fromFunction1(setUrl), url = url)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[BroadcastReceiver]
  }
}

