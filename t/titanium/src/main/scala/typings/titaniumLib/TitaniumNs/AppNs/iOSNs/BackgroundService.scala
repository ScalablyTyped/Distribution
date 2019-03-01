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
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getUrl: js.Function0[java.lang.String],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setUrl: js.Function1[java.lang.String, scala.Unit],
    stop: js.Function0[scala.Unit],
    unregister: js.Function0[scala.Unit],
    url: java.lang.String,
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): BackgroundService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("apiName")(apiName)
    __obj.updateDynamic("applyProperties")(applyProperties)
    __obj.updateDynamic("bubbleParent")(bubbleParent)
    __obj.updateDynamic("fireEvent")(fireEvent)
    __obj.updateDynamic("getApiName")(getApiName)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent)
    __obj.updateDynamic("getUrl")(getUrl)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setBubbleParent")(setBubbleParent)
    __obj.updateDynamic("setUrl")(setUrl)
    __obj.updateDynamic("stop")(stop)
    __obj.updateDynamic("unregister")(unregister)
    __obj.updateDynamic("url")(url)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[BackgroundService]
  }
}

