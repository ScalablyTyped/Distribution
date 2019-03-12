package typings
package titaniumLib.TitaniumNs.AppNs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * The SearchableIndex module is used to add or remove Ti.App.iOS.SearchableItem objects from the device search index.
			 */
trait SearchableIndex
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Adds an array of Titanium.App.iOS.SearchableItem objects to the default search index.
  				 */
  def addToDefaultSearchableIndex(Array: js.Array[SearchableItem], callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit
  /**
  				 * Removes search items based on an array of domain identifiers.
  				 */
  def deleteAllSearchableItemByDomainIdenifiers(Array: js.Array[java.lang.String], callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit
  /**
  				 * Removes all search items added by the application.
  				 */
  def deleteAllSearchableItems(callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit
  /**
  				 * Removes search items based on an array of identifiers.
  				 */
  def deleteSearchableItemsByIdentifiers(Array: js.Array[java.lang.String], callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit
  /**
  				 * Indicates whether indexing is supported by the device.
  				 */
  def isSupported(): scala.Boolean
}

object SearchableIndex {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    addToDefaultSearchableIndex: (js.Array[SearchableItem], js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    deleteAllSearchableItemByDomainIdenifiers: (js.Array[java.lang.String], js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    deleteAllSearchableItems: js.Function1[/* param0 */ js.Any, _] => scala.Unit,
    deleteSearchableItemsByIdentifiers: (js.Array[java.lang.String], js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    isSupported: () => scala.Boolean,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): SearchableIndex = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), addToDefaultSearchableIndex = js.Any.fromFunction2(addToDefaultSearchableIndex), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, deleteAllSearchableItemByDomainIdenifiers = js.Any.fromFunction2(deleteAllSearchableItemByDomainIdenifiers), deleteAllSearchableItems = js.Any.fromFunction1(deleteAllSearchableItems), deleteSearchableItemsByIdentifiers = js.Any.fromFunction2(deleteSearchableItemsByIdentifiers), fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), isSupported = js.Any.fromFunction0(isSupported), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[SearchableIndex]
  }
}

