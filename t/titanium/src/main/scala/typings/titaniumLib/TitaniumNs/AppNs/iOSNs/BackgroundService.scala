package typings
package titaniumLib.TitaniumNs.AppNs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A service that runs when the application is placed in the background.
			 */
trait BackgroundService
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * A local URL to a JavaScript file containing the code to run in the background.
  				 */
  var url: java.lang.String
  /**
  				 * Gets the value of the <Titanium.App.iOS.BackgroundService.url> property.
  				 */
  def getUrl(): java.lang.String
  /**
  				 * Sets the value of the <Titanium.App.iOS.BackgroundService.url> property.
  				 */
  def setUrl(url: java.lang.String): scala.Unit
  /**
  				 * Stops the service from running during the current background session to conserve resources.
  				 */
  def stop(): scala.Unit
  /**
  				 * Unregisters the background service.
  				 */
  def unregister(): scala.Unit
}

object BackgroundService {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getUrl: () => java.lang.String,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setUrl: java.lang.String => scala.Unit,
    stop: () => scala.Unit,
    unregister: () => scala.Unit,
    url: java.lang.String,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): BackgroundService = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getUrl = js.Any.fromFunction0(getUrl), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setUrl = js.Any.fromFunction1(setUrl), stop = js.Any.fromFunction0(stop), unregister = js.Any.fromFunction0(unregister), url = url)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[BackgroundService]
  }
}

