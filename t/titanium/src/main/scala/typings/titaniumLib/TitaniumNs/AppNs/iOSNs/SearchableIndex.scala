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
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    addToDefaultSearchableIndex: js.Function2[js.Array[SearchableItem], js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    deleteAllSearchableItemByDomainIdenifiers: js.Function2[js.Array[java.lang.String], js.Function1[/* param0 */ js.Any, _], scala.Unit],
    deleteAllSearchableItems: js.Function1[js.Function1[/* param0 */ js.Any, _], scala.Unit],
    deleteSearchableItemsByIdentifiers: js.Function2[js.Array[java.lang.String], js.Function1[/* param0 */ js.Any, _], scala.Unit],
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    isSupported: js.Function0[scala.Boolean],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): SearchableIndex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addToDefaultSearchableIndex")(addToDefaultSearchableIndex)
    __obj.updateDynamic("apiName")(apiName)
    __obj.updateDynamic("applyProperties")(applyProperties)
    __obj.updateDynamic("bubbleParent")(bubbleParent)
    __obj.updateDynamic("deleteAllSearchableItemByDomainIdenifiers")(deleteAllSearchableItemByDomainIdenifiers)
    __obj.updateDynamic("deleteAllSearchableItems")(deleteAllSearchableItems)
    __obj.updateDynamic("deleteSearchableItemsByIdentifiers")(deleteSearchableItemsByIdentifiers)
    __obj.updateDynamic("fireEvent")(fireEvent)
    __obj.updateDynamic("getApiName")(getApiName)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent)
    __obj.updateDynamic("isSupported")(isSupported)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setBubbleParent")(setBubbleParent)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[SearchableIndex]
  }
}

