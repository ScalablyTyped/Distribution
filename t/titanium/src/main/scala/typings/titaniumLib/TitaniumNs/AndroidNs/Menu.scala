package typings
package titaniumLib.TitaniumNs.AndroidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The Titanium binding of an Android Options Menu.
		 */
@js.native
trait Menu
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Array of menu items in this menu.
  			 */
  val items: js.Array[MenuItem] = js.native
  /**
  			 * Creates a <Titanium.Android.MenuItem> from the passed creation options.
  			 */
  def add(options: js.Any): MenuItem = js.native
  /**
  			 * Clears all items from this menu.
  			 */
  def clear(): scala.Unit = js.native
  /**
  			 * Closes the menu, if visible.
  			 */
  def close(): scala.Unit = js.native
  /**
  			 * Locates a [MenuItem](Titanium.Android.MenuItem) in this menu, by item ID or reference.
  			 */
  def findItem(item: scala.Double): MenuItem = js.native
  /**
  			 * Locates a [MenuItem](Titanium.Android.MenuItem) in this menu, by item ID or reference.
  			 */
  def findItem(item: MenuItem): MenuItem = js.native
  /**
  			 * Returns the [MenuItem](Titanium.Android.MenuItem) at a specific index.
  			 */
  def getItem(index: scala.Double): MenuItem = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Menu.items> property.
  			 */
  def getItems(): js.Array[MenuItem] = js.native
  /**
  			 * Returns `true` if this menu has visible items.
  			 */
  def hasVisibleItems(): scala.Boolean = js.native
  /**
  			 * Removes all menu items with the specified
  			 * [groupId](Titanium.Android.MenuItem.groupId).
  			 */
  def removeGroup(groupId: scala.Double): scala.Unit = js.native
  /**
  			 * Removes a specific [MenuItem](Titanium.Android.MenuItem) identified by its
  			 * [itemId](Titanium.Android.MenuItem.itemId).
  			 */
  def removeItem(itemId: scala.Double): scala.Unit = js.native
  /**
  			 * Enables or disables a group of menu items identified by a
  			 * [groupId](Titanium.Android.MenuItem.groupId).
  			 */
  def setGroupEnabled(groupId: scala.Double, enabled: scala.Boolean): scala.Unit = js.native
  /**
  			 * Shows or hides a group of menu items identified by a
  			 * [groupId](Titanium.Android.MenuItem.groupId).
  			 */
  def setGroupVisible(groupId: scala.Double, visible: scala.Boolean): scala.Unit = js.native
  /**
  			 * Number of items in this menu.
  			 */
  def size(): scala.Double = js.native
}

