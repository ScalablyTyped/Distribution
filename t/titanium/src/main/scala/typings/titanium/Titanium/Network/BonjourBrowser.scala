package typings.titanium.Titanium.Network

import typings.titanium.Titanium.Proxy
import typings.titanium.titaniumStrings.updatedservices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A browser for the discovery and retrieval of Bonjour services available on the network.
		 */
@JSGlobal("Titanium.Network.BonjourBrowser")
@js.native
class BonjourBrowser () extends Proxy {
  /**
  			 * The domain the browser is searching in
  			 */
  var domain: String = js.native
  /**
  			 * Whether or not the browser is currently searching
  			 */
  var isSearching: Boolean = js.native
  /**
  			 * The type of the service the browser searches for
  			 */
  var serviceType: String = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  @JSName("addEventListener")
  def addEventListener_updatedservices(
    name: updatedservices,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ BonjourBrowserUpdatedservicesEvent, Unit]
  ): Unit = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  @JSName("fireEvent")
  def fireEvent_updatedservices(name: updatedservices): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_updatedservices(name: updatedservices, event: BonjourBrowserUpdatedservicesEvent): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.Network.BonjourBrowser.domain> property.
  			 * @deprecated Access <Titanium.Network.BonjourBrowser.domain> instead.
  			 */
  def getDomain(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Network.BonjourBrowser.isSearching> property.
  			 * @deprecated Access <Titanium.Network.BonjourBrowser.isSearching> instead.
  			 */
  def getIsSearching(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Network.BonjourBrowser.serviceType> property.
  			 * @deprecated Access <Titanium.Network.BonjourBrowser.serviceType> instead.
  			 */
  def getServiceType(): String = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  @JSName("removeEventListener")
  def removeEventListener_updatedservices(
    name: updatedservices,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ BonjourBrowserUpdatedservicesEvent, Unit]
  ): Unit = js.native
  /**
  			 * Conduct a search for Bonjour services matching the type and domain specified during creation
  			 */
  def search(): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.BonjourBrowser.domain> property.
  			 * @deprecated Set the value using <Titanium.Network.BonjourBrowser.domain> instead.
  			 */
  def setDomain(domain: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.BonjourBrowser.isSearching> property.
  			 * @deprecated Set the value using <Titanium.Network.BonjourBrowser.isSearching> instead.
  			 */
  def setIsSearching(isSearching: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.BonjourBrowser.serviceType> property.
  			 * @deprecated Set the value using <Titanium.Network.BonjourBrowser.serviceType> instead.
  			 */
  def setServiceType(serviceType: String): Unit = js.native
  /**
  			 * Halt an ongoing search
  			 */
  def stopSearch(): Unit = js.native
}

