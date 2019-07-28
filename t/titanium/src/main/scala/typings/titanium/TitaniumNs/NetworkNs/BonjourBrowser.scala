package typings.titanium.TitaniumNs.NetworkNs

import typings.titanium.TitaniumNs.Proxy
import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A browser for the discovery and retrieval of Bonjour services available on the network.
		 */
trait BonjourBrowser extends Proxy {
  /**
  			 * The domain the browser is searching in
  			 */
  var domain: String
  /**
  			 * Whether or not the browser is currently searching
  			 */
  var isSearching: Boolean
  /**
  			 * The type of the service the browser searches for
  			 */
  var serviceType: String
  /**
  			 * Gets the value of the <Titanium.Network.BonjourBrowser.domain> property.
  			 */
  def getDomain(): String
  /**
  			 * Gets the value of the <Titanium.Network.BonjourBrowser.isSearching> property.
  			 */
  def getIsSearching(): Boolean
  /**
  			 * Gets the value of the <Titanium.Network.BonjourBrowser.serviceType> property.
  			 */
  def getServiceType(): String
  /**
  			 * Conduct a search for Bonjour services matching the type and domain specified during creation
  			 */
  def search(): Unit
  /**
  			 * Sets the value of the <Titanium.Network.BonjourBrowser.domain> property.
  			 */
  def setDomain(domain: String): Unit
  /**
  			 * Sets the value of the <Titanium.Network.BonjourBrowser.isSearching> property.
  			 */
  def setIsSearching(isSearching: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Network.BonjourBrowser.serviceType> property.
  			 */
  def setServiceType(serviceType: String): Unit
  /**
  			 * Halt an ongoing search
  			 */
  def stopSearch(): Unit
}

object BonjourBrowser {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    domain: String,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getDomain: () => String,
    getIsSearching: () => Boolean,
    getServiceType: () => String,
    isSearching: Boolean,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    search: () => Unit,
    serviceType: String,
    setBubbleParent: Boolean => Unit,
    setDomain: String => Unit,
    setIsSearching: Boolean => Unit,
    setServiceType: String => Unit,
    stopSearch: () => Unit,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): BonjourBrowser = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, domain = domain, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getDomain = js.Any.fromFunction0(getDomain), getIsSearching = js.Any.fromFunction0(getIsSearching), getServiceType = js.Any.fromFunction0(getServiceType), isSearching = isSearching, removeEventListener = js.Any.fromFunction2(removeEventListener), search = js.Any.fromFunction0(search), serviceType = serviceType, setBubbleParent = js.Any.fromFunction1(setBubbleParent), setDomain = js.Any.fromFunction1(setDomain), setIsSearching = js.Any.fromFunction1(setIsSearching), setServiceType = js.Any.fromFunction1(setServiceType), stopSearch = js.Any.fromFunction0(stopSearch))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[BonjourBrowser]
  }
}

