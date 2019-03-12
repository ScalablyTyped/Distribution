package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * The Home screen quick actions API is for adding shortcuts to your app icon that anticipate and accelerate a
			 * user's interaction with your app.
			 */
trait ApplicationShortcuts
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Creates a new dynamic application shortcut item.
  				 */
  def addDynamicShortcut(params: titaniumLib.ShortcutParams): scala.Unit
  /**
  				 * Returns true or false depending if the provided shortcut object already exists.
  				 */
  def dynamicShortcutExists(itemtype: java.lang.String): scala.Boolean
  /**
  				 * Gets the dynamic application shortcut item identified by the `itemtype`.
  				 */
  def getDynamicShortcut(itemtype: java.lang.String): scala.Unit
  /**
  				 * Returns an array of the application shortcuts created dynamically.
  				 */
  def listDynamicShortcuts(): js.Array[titaniumLib.ShortcutParams]
  /**
  				 * Returns an array of the application shortcuts listed in your tiapp.xml file.
  				 */
  def listStaticShortcuts(): js.Array[titaniumLib.ShortcutParams]
  /**
  				 * Removes all dynamically created application shortcuts.
  				 */
  def removeAllDynamicShortcuts(): scala.Unit
  /**
  				 * Removes the dynamic application shortcut item identified by the `itemtype`.
  				 */
  def removeDynamicShortcut(itemtype: java.lang.String): scala.Unit
}

object ApplicationShortcuts {
  @scala.inline
  def apply(
    addDynamicShortcut: titaniumLib.ShortcutParams => scala.Unit,
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    dynamicShortcutExists: java.lang.String => scala.Boolean,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getDynamicShortcut: java.lang.String => scala.Unit,
    listDynamicShortcuts: () => js.Array[titaniumLib.ShortcutParams],
    listStaticShortcuts: () => js.Array[titaniumLib.ShortcutParams],
    removeAllDynamicShortcuts: () => scala.Unit,
    removeDynamicShortcut: java.lang.String => scala.Unit,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): ApplicationShortcuts = {
    val __obj = js.Dynamic.literal(addDynamicShortcut = js.Any.fromFunction1(addDynamicShortcut), addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, dynamicShortcutExists = js.Any.fromFunction1(dynamicShortcutExists), fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getDynamicShortcut = js.Any.fromFunction1(getDynamicShortcut), listDynamicShortcuts = js.Any.fromFunction0(listDynamicShortcuts), listStaticShortcuts = js.Any.fromFunction0(listStaticShortcuts), removeAllDynamicShortcuts = js.Any.fromFunction0(removeAllDynamicShortcuts), removeDynamicShortcut = js.Any.fromFunction1(removeDynamicShortcut), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[ApplicationShortcuts]
  }
}

