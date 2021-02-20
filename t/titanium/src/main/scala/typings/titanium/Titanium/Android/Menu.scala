package typings.titanium.Titanium.Android

import typings.titanium.Titanium.Proxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Titanium binding of an Android Options Menu.
  */
@js.native
trait Menu extends Proxy {
  
  /**
    * Creates a <Titanium.Android.MenuItem> from the passed creation options.
    */
  def add(options: js.Any): MenuItem = js.native
  
  /**
    * Clears all items from this menu.
    */
  def clear(): Unit = js.native
  
  /**
    * Closes the menu, if visible.
    */
  def close(): Unit = js.native
  
  /**
    * Locates a [MenuItem](Titanium.Android.MenuItem) in this menu, by item ID or reference.
    */
  def findItem(item: Double): MenuItem = js.native
  def findItem(item: MenuItem): MenuItem = js.native
  
  /**
    * Returns the [MenuItem](Titanium.Android.MenuItem) at a specific index.
    */
  def getItem(index: Double): MenuItem = js.native
  
  /**
    * Gets the value of the <Titanium.Android.Menu.items> property.
    * @deprecated Access <Titanium.Android.Menu.items> instead.
    */
  def getItems(): js.Array[MenuItem] = js.native
  
  /**
    * Returns `true` if this menu has visible items.
    */
  def hasVisibleItems(): Boolean = js.native
  
  /**
    * Array of menu items in this menu.
    */
  val items: js.Array[MenuItem] = js.native
  
  /**
    * Removes all menu items with the specified
    * [groupId](Titanium.Android.MenuItem.groupId).
    */
  def removeGroup(groupId: Double): Unit = js.native
  
  /**
    * Removes a specific [MenuItem](Titanium.Android.MenuItem) identified by its
    * [itemId](Titanium.Android.MenuItem.itemId).
    */
  def removeItem(itemId: Double): Unit = js.native
  
  /**
    * Enables or disables a group of menu items identified by a
    * [groupId](Titanium.Android.MenuItem.groupId).
    */
  def setGroupEnabled(groupId: Double, enabled: Boolean): Unit = js.native
  
  /**
    * Shows or hides a group of menu items identified by a
    * [groupId](Titanium.Android.MenuItem.groupId).
    */
  def setGroupVisible(groupId: Double, visible: Boolean): Unit = js.native
  
  /**
    * Number of items in this menu.
    */
  def size(): Double = js.native
}
