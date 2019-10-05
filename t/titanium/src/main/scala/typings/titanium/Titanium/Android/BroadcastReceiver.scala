package typings.titanium.Titanium.Android

import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Monitor and handle Android system broadcasts.
		 */
trait BroadcastReceiver extends Proxy {
  /**
  			 * URL of the JavaScript file to handle the broadcast.
  			 */
  var url: String
  /**
  			 * Gets the value of the <Titanium.Android.BroadcastReceiver.onReceived> property.
  			 */
  def getOnReceived(): js.Function1[/* param0 */ js.Any, _]
  /**
  			 * Gets the value of the <Titanium.Android.BroadcastReceiver.url> property.
  			 */
  def getUrl(): String
  /**
  			 * The function called when a broadcast is received.
  			 */
  def onReceived(param0: js.Any): js.Any
  /**
  			 * Sets the value of the <Titanium.Android.BroadcastReceiver.onReceived> property.
  			 */
  def setOnReceived(onReceived: js.Function1[/* param0 */ js.Any, _]): Unit
  /**
  			 * Sets the value of the <Titanium.Android.BroadcastReceiver.url> property.
  			 */
  def setUrl(url: String): Unit
}

object BroadcastReceiver {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getOnReceived: () => js.Function1[/* param0 */ js.Any, _],
    getUrl: () => String,
    onReceived: js.Any => js.Any,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit,
    setOnReceived: js.Function1[/* param0 */ js.Any, _] => Unit,
    setUrl: String => Unit,
    url: String,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): BroadcastReceiver = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getOnReceived = js.Any.fromFunction0(getOnReceived), getUrl = js.Any.fromFunction0(getUrl), onReceived = js.Any.fromFunction1(onReceived), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setOnReceived = js.Any.fromFunction1(setOnReceived), setUrl = js.Any.fromFunction1(setUrl), url = url)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[BroadcastReceiver]
  }
}

