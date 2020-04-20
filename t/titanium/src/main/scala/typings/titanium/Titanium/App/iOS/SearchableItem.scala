package typings.titanium.Titanium.App.iOS

import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Used to create a unique object containing all of the search information that will appear in the device search index.
			 */
@JSGlobal("Titanium.App.iOS.SearchableItem")
@js.native
class SearchableItem () extends Proxy {
  /**
  				 * Set of metadata properties to display for the item.
  				 */
  var attributeSet: SearchableItemAttributeSet = js.native
  /**
  				 * Identifier that represents the "domain" or owner of this item.
  				 */
  var domainIdentifier: String = js.native
  /**
  				 * Searchable items have an expiration date or time to live.  By default it is set to one month.
  				 */
  var expirationDate: String = js.native
  /**
  				 * Unique identifier to your application group.
  				 */
  var uniqueIdentifier: String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItem.domainIdentifier> property.
  				 * @deprecated Access <Titanium.App.iOS.SearchableItem.domainIdentifier> instead.
  				 */
  def getDomainIdentifier(): String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItem.expirationDate> property.
  				 * @deprecated Access <Titanium.App.iOS.SearchableItem.expirationDate> instead.
  				 */
  def getExpirationDate(): String = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItem.uniqueIdentifier> property.
  				 * @deprecated Access <Titanium.App.iOS.SearchableItem.uniqueIdentifier> instead.
  				 */
  def getUniqueIdentifier(): String = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItem.domainIdentifier> property.
  				 * @deprecated Set the value using <Titanium.App.iOS.SearchableItem.domainIdentifier> instead.
  				 */
  def setDomainIdentifier(domainIdentifier: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItem.expirationDate> property.
  				 * @deprecated Set the value using <Titanium.App.iOS.SearchableItem.expirationDate> instead.
  				 */
  def setExpirationDate(expirationDate: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItem.uniqueIdentifier> property.
  				 * @deprecated Set the value using <Titanium.App.iOS.SearchableItem.uniqueIdentifier> instead.
  				 */
  def setUniqueIdentifier(uniqueIdentifier: String): Unit = js.native
}

