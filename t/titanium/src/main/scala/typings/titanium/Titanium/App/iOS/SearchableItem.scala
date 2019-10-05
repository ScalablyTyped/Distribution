package typings.titanium.Titanium.App.iOS

import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Used to create a unique object containing all of the search information that will appear in the device search index.
			 */
trait SearchableItem extends Proxy {
  /**
  				 * Set of metadata properties to display for the item.
  				 */
  var attributeSet: SearchableItemAttributeSet
  /**
  				 * Identifier that represents the "domain" or owner of this item.
  				 */
  var domainIdentifier: String
  /**
  				 * Searchable items have an expiration date or time to live.  By default it is set to one month.
  				 */
  var expirationDate: String
  /**
  				 * Unique identifier to your application group.
  				 */
  var uniqueIdentifier: String
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItem.domainIdentifier> property.
  				 */
  def getDomainIdentifier(): String
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItem.expirationDate> property.
  				 */
  def getExpirationDate(): String
  /**
  				 * Gets the value of the <Titanium.App.iOS.SearchableItem.uniqueIdentifier> property.
  				 */
  def getUniqueIdentifier(): String
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItem.domainIdentifier> property.
  				 */
  def setDomainIdentifier(domainIdentifier: String): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItem.expirationDate> property.
  				 */
  def setExpirationDate(expirationDate: String): Unit
  /**
  				 * Sets the value of the <Titanium.App.iOS.SearchableItem.uniqueIdentifier> property.
  				 */
  def setUniqueIdentifier(uniqueIdentifier: String): Unit
}

object SearchableItem {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    attributeSet: SearchableItemAttributeSet,
    bubbleParent: Boolean,
    domainIdentifier: String,
    expirationDate: String,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getDomainIdentifier: () => String,
    getExpirationDate: () => String,
    getUniqueIdentifier: () => String,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit,
    setDomainIdentifier: String => Unit,
    setExpirationDate: String => Unit,
    setUniqueIdentifier: String => Unit,
    uniqueIdentifier: String,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): SearchableItem = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), attributeSet = attributeSet, bubbleParent = bubbleParent, domainIdentifier = domainIdentifier, expirationDate = expirationDate, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getDomainIdentifier = js.Any.fromFunction0(getDomainIdentifier), getExpirationDate = js.Any.fromFunction0(getExpirationDate), getUniqueIdentifier = js.Any.fromFunction0(getUniqueIdentifier), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setDomainIdentifier = js.Any.fromFunction1(setDomainIdentifier), setExpirationDate = js.Any.fromFunction1(setExpirationDate), setUniqueIdentifier = js.Any.fromFunction1(setUniqueIdentifier), uniqueIdentifier = uniqueIdentifier)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[SearchableItem]
  }
}

