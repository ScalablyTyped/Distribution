package typings.titanium.Titanium.App.iOS

import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * The SearchableIndex module is used to add or remove Ti.App.iOS.SearchableItem objects from the device search index.
			 */
trait SearchableIndex extends Proxy {
  /**
  				 * Adds an array of Titanium.App.iOS.SearchableItem objects to the default search index.
  				 */
  def addToDefaultSearchableIndex(Array: js.Array[SearchableItem], callback: js.Function1[/* param0 */ js.Any, _]): Unit
  /**
  				 * Removes search items based on an array of domain identifiers.
  				 */
  def deleteAllSearchableItemByDomainIdenifiers(Array: js.Array[String], callback: js.Function1[/* param0 */ js.Any, _]): Unit
  /**
  				 * Removes all search items added by the application.
  				 */
  def deleteAllSearchableItems(callback: js.Function1[/* param0 */ js.Any, _]): Unit
  /**
  				 * Removes search items based on an array of identifiers.
  				 */
  def deleteSearchableItemsByIdentifiers(Array: js.Array[String], callback: js.Function1[/* param0 */ js.Any, _]): Unit
  /**
  				 * Indicates whether indexing is supported by the device.
  				 */
  def isSupported(): Boolean
}

object SearchableIndex {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    addToDefaultSearchableIndex: (js.Array[SearchableItem], js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    deleteAllSearchableItemByDomainIdenifiers: (js.Array[String], js.Function1[/* param0 */ js.Any, _]) => Unit,
    deleteAllSearchableItems: js.Function1[/* param0 */ js.Any, _] => Unit,
    deleteSearchableItemsByIdentifiers: (js.Array[String], js.Function1[/* param0 */ js.Any, _]) => Unit,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    isSupported: () => Boolean,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): SearchableIndex = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), addToDefaultSearchableIndex = js.Any.fromFunction2(addToDefaultSearchableIndex), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, deleteAllSearchableItemByDomainIdenifiers = js.Any.fromFunction2(deleteAllSearchableItemByDomainIdenifiers), deleteAllSearchableItems = js.Any.fromFunction1(deleteAllSearchableItems), deleteSearchableItemsByIdentifiers = js.Any.fromFunction2(deleteSearchableItemsByIdentifiers), fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), isSupported = js.Any.fromFunction0(isSupported), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[SearchableIndex]
  }
}

