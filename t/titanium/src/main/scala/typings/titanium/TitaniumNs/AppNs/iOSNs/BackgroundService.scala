package typings.titanium.TitaniumNs.AppNs.iOSNs

import typings.titanium.TitaniumNs.Proxy
import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A service that runs when the application is placed in the background.
			 */
trait BackgroundService extends Proxy {
  /**
  				 * A local URL to a JavaScript file containing the code to run in the background.
  				 */
  var url: String
  /**
  				 * Gets the value of the <Titanium.App.iOS.BackgroundService.url> property.
  				 */
  def getUrl(): String
  /**
  				 * Sets the value of the <Titanium.App.iOS.BackgroundService.url> property.
  				 */
  def setUrl(url: String): Unit
  /**
  				 * Stops the service from running during the current background session to conserve resources.
  				 */
  def stop(): Unit
  /**
  				 * Unregisters the background service.
  				 */
  def unregister(): Unit
}

object BackgroundService {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getUrl: () => String,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit,
    setUrl: String => Unit,
    stop: () => Unit,
    unregister: () => Unit,
    url: String,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): BackgroundService = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getUrl = js.Any.fromFunction0(getUrl), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setUrl = js.Any.fromFunction1(setUrl), stop = js.Any.fromFunction0(stop), unregister = js.Any.fromFunction0(unregister), url = url)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[BackgroundService]
  }
}

