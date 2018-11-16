package typings
package titaniumLib.TitaniumNs.AppNs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Used to create a unique object containing all of the search information that will appear in the device search index.
			 */

trait SearchableItem
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Set of metadata properties to display for the item.
  				 */
  var attributeSet: SearchableItemAttributeSet
  /**
  				 * Identifier that represents the "domain" or owner of this item.
  				 */
  var domainIdentifier: java.lang.String
  /**
  				 * Searchable items have an expiration date or time to live.  By default it is set to one month.
  				 */
  var expirationDate: java.lang.String
  /**
  				 * Unique identifier to your application group.
  				 */
  var uniqueIdentifier: java.lang.String
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItem.domainIdentifier> property.
  				 */
  def getDomainIdentifier(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItem.expirationDate> property.
  				 */
  def getExpirationDate(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItem.uniqueIdentifier> property.
  				 */
  def getUniqueIdentifier(): java.lang.String
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItem.domainIdentifier> property.
  				 */
  def setDomainIdentifier(domainIdentifier: java.lang.String): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItem.expirationDate> property.
  				 */
  def setExpirationDate(expirationDate: java.lang.String): scala.Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItem.uniqueIdentifier> property.
  				 */
  def setUniqueIdentifier(uniqueIdentifier: java.lang.String): scala.Unit
}

