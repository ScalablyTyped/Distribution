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
    addDynamicShortcut: js.Function1[titaniumLib.ShortcutParams, scala.Unit],
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    dynamicShortcutExists: js.Function1[java.lang.String, scala.Boolean],
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getDynamicShortcut: js.Function1[java.lang.String, scala.Unit],
    listDynamicShortcuts: js.Function0[js.Array[titaniumLib.ShortcutParams]],
    listStaticShortcuts: js.Function0[js.Array[titaniumLib.ShortcutParams]],
    removeAllDynamicShortcuts: js.Function0[scala.Unit],
    removeDynamicShortcut: js.Function1[java.lang.String, scala.Unit],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): ApplicationShortcuts = {
    val __obj = js.Dynamic.literal(addDynamicShortcut = addDynamicShortcut, addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, dynamicShortcutExists = dynamicShortcutExists, fireEvent = fireEvent, getApiName = getApiName, getBubbleParent = getBubbleParent, getDynamicShortcut = getDynamicShortcut, listDynamicShortcuts = listDynamicShortcuts, listStaticShortcuts = listStaticShortcuts, removeAllDynamicShortcuts = removeAllDynamicShortcuts, removeDynamicShortcut = removeDynamicShortcut, removeEventListener = removeEventListener, setBubbleParent = setBubbleParent)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[ApplicationShortcuts]
  }
}

