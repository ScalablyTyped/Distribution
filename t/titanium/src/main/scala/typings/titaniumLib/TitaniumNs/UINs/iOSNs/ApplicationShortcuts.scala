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

