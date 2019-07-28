package typings.titanium.TitaniumNs.AndroidNs

import typings.titanium.TitaniumNs.Proxy
import typings.titanium.TitaniumNs.UINs.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The Titanium binding of an Android menu item.
		 */
@js.native
trait MenuItem extends Proxy {
  /**
  			 * Custom view that replaces the default menu item button.
  			 */
  var actionView: View = js.native
  /**
  			 * True if this menu item's action view has been expanded.
  			 */
  val actionViewExpanded: Boolean = js.native
  /**
  			 * Determines if the item can be checked.
  			 */
  var checkable: Boolean = js.native
  /**
  			 * Determines if the item is checked.
  			 */
  var checked: Boolean = js.native
  /**
  			 * Determines if the item is enabled.
  			 */
  var enabled: Boolean = js.native
  /**
  			 * Group ID for this item.
  			 */
  val groupId: Double = js.native
  /**
  			 * Icon to display for the this menu item.
  			 */
  var icon: Double | String = js.native
  /**
  			 * Item ID for this item.
  			 */
  val itemId: Double = js.native
  /**
  			 * Integer used for controlling the category and sort order for menu items.
  			 */
  val order: Double = js.native
  /**
  			 * A set of flags that controls how this item appears in the action bar.
  			 */
  var showAsAction: Double = js.native
  /**
  			 * Title of the item.
  			 */
  var title: String = js.native
  /**
  			 * Shortened version of the item's title.
  			 */
  var titleCondensed: String = js.native
  /**
  			 * Determines whether the menu item is visible.
  			 */
  var visible: Boolean = js.native
  /**
  			 * Collapse the action view associated with this menu item.
  			 */
  def collapseActionView(): Unit = js.native
  /**
  			 * Expand the action view associated with this menu item.
  			 */
  def expandActionView(): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.Android.MenuItem.actionView> property.
  			 */
  def getActionView(): View = js.native
  /**
  			 * Gets the value of the <Titanium.Android.MenuItem.groupId> property.
  			 */
  def getGroupId(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.MenuItem.itemId> property.
  			 */
  def getItemId(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.MenuItem.order> property.
  			 */
  def getOrder(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.MenuItem.title> property.
  			 */
  def getTitle(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.MenuItem.titleCondensed> property.
  			 */
  def getTitleCondensed(): String = js.native
  /**
  			 * Returns the [actionViewExpanded](Titanium.Android.MenuItem.actionViewExpanded) state of the menu item.
  			 */
  def isActionViewExpanded(): Boolean = js.native
  /**
  			 * Returns the [checkable](Titanium.Android.MenuItem.checkable) state of the menu item.
  			 */
  def isCheckable(): Boolean = js.native
  /**
  			 * Returns the [checked](Titanium.Android.MenuItem.checked) state of the menu item.
  			 */
  def isChecked(): Boolean = js.native
  /**
  			 * Returns the [enabled](Titanium.Android.MenuItem.enabled) state of the menu item.
  			 */
  def isEnabled(): Boolean = js.native
  /**
  			 * Returns the [visible](Titanium.Android.MenuItem.visible) state of the menu item.
  			 */
  def isVisible(): Boolean = js.native
  /**
  			 * Sets the value of the <Titanium.Android.MenuItem.actionView> property.
  			 */
  def setActionView(actionView: js.Any): Unit = js.native
  /**
  			 * Sets the [checkable](Titanium.Android.MenuItem.checkable) state of the menu item.
  			 */
  def setCheckable(checkable: Boolean): Unit = js.native
  /**
  			 * Sets the [checked](Titanium.Android.MenuItem.checked) state of the menu item.
  			 */
  def setChecked(enabled: Boolean): Unit = js.native
  /**
  			 * Sets the [enabled](Titanium.Android.MenuItem.enabled) state of the menu item.
  			 */
  def setEnabled(enabled: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.MenuItem.icon> property.
  			 */
  def setIcon(icon: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.MenuItem.icon> property.
  			 */
  def setIcon(icon: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.MenuItem.showAsAction> property.
  			 */
  def setShowAsAction(showAsAction: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.MenuItem.title> property.
  			 */
  def setTitle(title: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.MenuItem.titleCondensed> property.
  			 */
  def setTitleCondensed(titleCondensed: String): Unit = js.native
  /**
  			 * Sets the [visible](Titanium.Android.MenuItem.visible) state of the menu item.
  			 */
  def setVisible(visible: Boolean): Unit = js.native
}

