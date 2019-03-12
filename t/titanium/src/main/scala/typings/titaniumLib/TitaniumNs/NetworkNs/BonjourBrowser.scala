package typings
package titaniumLib.TitaniumNs.NetworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A browser for the discovery and retrieval of Bonjour services available on the network.
		 */
trait BonjourBrowser
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * The domain the browser is searching in
  			 */
  var domain: java.lang.String
  /**
  			 * Whether or not the browser is currently searching
  			 */
  var isSearching: scala.Boolean
  /**
  			 * The type of the service the browser searches for
  			 */
  var serviceType: java.lang.String
  /**
  			 * Gets the value of the <Titanium.Network.BonjourBrowser.domain> property.
  			 */
  def getDomain(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Network.BonjourBrowser.isSearching> property.
  			 */
  def getIsSearching(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Network.BonjourBrowser.serviceType> property.
  			 */
  def getServiceType(): java.lang.String
  /**
  			 * Conduct a search for Bonjour services matching the type and domain specified during creation
  			 */
  def search(): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Network.BonjourBrowser.domain> property.
  			 */
  def setDomain(domain: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Network.BonjourBrowser.isSearching> property.
  			 */
  def setIsSearching(isSearching: scala.Boolean): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Network.BonjourBrowser.serviceType> property.
  			 */
  def setServiceType(serviceType: java.lang.String): scala.Unit
  /**
  			 * Halt an ongoing search
  			 */
  def stopSearch(): scala.Unit
}

object BonjourBrowser {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    domain: java.lang.String,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getDomain: () => java.lang.String,
    getIsSearching: () => scala.Boolean,
    getServiceType: () => java.lang.String,
    isSearching: scala.Boolean,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    search: () => scala.Unit,
    serviceType: java.lang.String,
    setBubbleParent: scala.Boolean => scala.Unit,
    setDomain: java.lang.String => scala.Unit,
    setIsSearching: scala.Boolean => scala.Unit,
    setServiceType: java.lang.String => scala.Unit,
    stopSearch: () => scala.Unit,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): BonjourBrowser = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, domain = domain, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getDomain = js.Any.fromFunction0(getDomain), getIsSearching = js.Any.fromFunction0(getIsSearching), getServiceType = js.Any.fromFunction0(getServiceType), isSearching = isSearching, removeEventListener = js.Any.fromFunction2(removeEventListener), search = js.Any.fromFunction0(search), serviceType = serviceType, setBubbleParent = js.Any.fromFunction1(setBubbleParent), setDomain = js.Any.fromFunction1(setDomain), setIsSearching = js.Any.fromFunction1(setIsSearching), setServiceType = js.Any.fromFunction1(setServiceType), stopSearch = js.Any.fromFunction0(stopSearch))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[BonjourBrowser]
  }
}

