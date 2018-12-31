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

