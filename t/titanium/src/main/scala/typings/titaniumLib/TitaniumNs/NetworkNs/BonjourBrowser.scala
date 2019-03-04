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
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    domain: java.lang.String,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getDomain: js.Function0[java.lang.String],
    getIsSearching: js.Function0[scala.Boolean],
    getServiceType: js.Function0[java.lang.String],
    isSearching: scala.Boolean,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    search: js.Function0[scala.Unit],
    serviceType: java.lang.String,
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setDomain: js.Function1[java.lang.String, scala.Unit],
    setIsSearching: js.Function1[scala.Boolean, scala.Unit],
    setServiceType: js.Function1[java.lang.String, scala.Unit],
    stopSearch: js.Function0[scala.Unit],
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): BonjourBrowser = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, domain = domain, fireEvent = fireEvent, getApiName = getApiName, getBubbleParent = getBubbleParent, getDomain = getDomain, getIsSearching = getIsSearching, getServiceType = getServiceType, isSearching = isSearching, removeEventListener = removeEventListener, search = search, serviceType = serviceType, setBubbleParent = setBubbleParent, setDomain = setDomain, setIsSearching = setIsSearching, setServiceType = setServiceType, stopSearch = stopSearch)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[BonjourBrowser]
  }
}

