package typings.titanium.TitaniumNs.UINs.iOSNs

import typings.titanium.ShortcutParams
import typings.titanium.TitaniumNs.Proxy
import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * The Home screen quick actions API is for adding shortcuts to your app icon that anticipate and accelerate a
			 * user's interaction with your app.
			 */
trait ApplicationShortcuts extends Proxy {
  /**
  				 * Creates a new dynamic application shortcut item.
  				 */
  def addDynamicShortcut(params: ShortcutParams): Unit
  /**
  				 * Returns true or false depending if the provided shortcut object already exists.
  				 */
  def dynamicShortcutExists(itemtype: String): Boolean
  /**
  				 * Gets the dynamic application shortcut item identified by the `itemtype`.
  				 */
  def getDynamicShortcut(itemtype: String): Unit
  /**
  				 * Returns an array of the application shortcuts created dynamically.
  				 */
  def listDynamicShortcuts(): js.Array[ShortcutParams]
  /**
  				 * Returns an array of the application shortcuts listed in your tiapp.xml file.
  				 */
  def listStaticShortcuts(): js.Array[ShortcutParams]
  /**
  				 * Removes all dynamically created application shortcuts.
  				 */
  def removeAllDynamicShortcuts(): Unit
  /**
  				 * Removes the dynamic application shortcut item identified by the `itemtype`.
  				 */
  def removeDynamicShortcut(itemtype: String): Unit
}

object ApplicationShortcuts {
  @scala.inline
  def apply(
    addDynamicShortcut: ShortcutParams => Unit,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    dynamicShortcutExists: String => Boolean,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getDynamicShortcut: String => Unit,
    listDynamicShortcuts: () => js.Array[ShortcutParams],
    listStaticShortcuts: () => js.Array[ShortcutParams],
    removeAllDynamicShortcuts: () => Unit,
    removeDynamicShortcut: String => Unit,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): ApplicationShortcuts = {
    val __obj = js.Dynamic.literal(addDynamicShortcut = js.Any.fromFunction1(addDynamicShortcut), addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, dynamicShortcutExists = js.Any.fromFunction1(dynamicShortcutExists), fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getDynamicShortcut = js.Any.fromFunction1(getDynamicShortcut), listDynamicShortcuts = js.Any.fromFunction0(listDynamicShortcuts), listStaticShortcuts = js.Any.fromFunction0(listStaticShortcuts), removeAllDynamicShortcuts = js.Any.fromFunction0(removeAllDynamicShortcuts), removeDynamicShortcut = js.Any.fromFunction1(removeDynamicShortcut), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[ApplicationShortcuts]
  }
}

