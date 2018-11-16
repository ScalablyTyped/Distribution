package typings
package titaniumLib.TitaniumNs.AndroidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The Titanium binding of an Android menu item.
		 */
@js.native
trait MenuItem
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Custom view that replaces the default menu item button.
  			 */
  var actionView: titaniumLib.TitaniumNs.UINs.View = js.native
  /**
  			 * True if this menu item's action view has been expanded.
  			 */
  val actionViewExpanded: scala.Boolean = js.native
  /**
  			 * Determines if the item can be checked.
  			 */
  var checkable: scala.Boolean = js.native
  /**
  			 * Determines if the item is checked.
  			 */
  var checked: scala.Boolean = js.native
  /**
  			 * Determines if the item is enabled.
  			 */
  var enabled: scala.Boolean = js.native
  /**
  			 * Group ID for this item.
  			 */
  val groupId: scala.Double = js.native
  /**
  			 * Icon to display for the this menu item.
  			 */
  var icon: scala.Double | java.lang.String = js.native
  /**
  			 * Item ID for this item.
  			 */
  val itemId: scala.Double = js.native
  /**
  			 * Integer used for controlling the category and sort order for menu items.
  			 */
  val order: scala.Double = js.native
  /**
  			 * A set of flags that controls how this item appears in the action bar.
  			 */
  var showAsAction: scala.Double = js.native
  /**
  			 * Title of the item.
  			 */
  var title: java.lang.String = js.native
  /**
  			 * Shortened version of the item's title.
  			 */
  var titleCondensed: java.lang.String = js.native
  /**
  			 * Determines whether the menu item is visible.
  			 */
  var visible: scala.Boolean = js.native
  /**
  			 * Collapse the action view associated with this menu item.
  			 */
  def collapseActionView(): scala.Unit = js.native
  /**
  			 * Expand the action view associated with this menu item.
  			 */
  def expandActionView(): scala.Unit = js.native
  /**
  			 * Gets the value of the <Titanium.Android.MenuItem.actionView> property.
  			 */
  def getActionView(): titaniumLib.TitaniumNs.UINs.View = js.native
  /**
  			 * Gets the value of the <Titanium.Android.MenuItem.groupId> property.
  			 */
  def getGroupId(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.MenuItem.itemId> property.
  			 */
  def getItemId(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.MenuItem.order> property.
  			 */
  def getOrder(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.MenuItem.title> property.
  			 */
  def getTitle(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.MenuItem.titleCondensed> property.
  			 */
  def getTitleCondensed(): java.lang.String = js.native
  /**
  			 * Returns the [actionViewExpanded](Titanium.Android.MenuItem.actionViewExpanded) state of the menu item.
  			 */
  def isActionViewExpanded(): scala.Boolean = js.native
  /**
  			 * Returns the [checkable](Titanium.Android.MenuItem.checkable) state of the menu item.
  			 */
  def isCheckable(): scala.Boolean = js.native
  /**
  			 * Returns the [checked](Titanium.Android.MenuItem.checked) state of the menu item.
  			 */
  def isChecked(): scala.Boolean = js.native
  /**
  			 * Returns the [enabled](Titanium.Android.MenuItem.enabled) state of the menu item.
  			 */
  def isEnabled(): scala.Boolean = js.native
  /**
  			 * Returns the [visible](Titanium.Android.MenuItem.visible) state of the menu item.
  			 */
  def isVisible(): scala.Boolean = js.native
  /**
  			 * Sets the value of the <Titanium.Android.MenuItem.actionView> property.
  			 */
  def setActionView(actionView: js.Any): scala.Unit = js.native
  /**
  			 * Sets the [checkable](Titanium.Android.MenuItem.checkable) state of the menu item.
  			 */
  def setCheckable(checkable: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the [checked](Titanium.Android.MenuItem.checked) state of the menu item.
  			 */
  def setChecked(enabled: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the [enabled](Titanium.Android.MenuItem.enabled) state of the menu item.
  			 */
  def setEnabled(enabled: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.MenuItem.icon> property.
  			 */
  def setIcon(icon: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.MenuItem.icon> property.
  			 */
  def setIcon(icon: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.MenuItem.showAsAction> property.
  			 */
  def setShowAsAction(showAsAction: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.MenuItem.title> property.
  			 */
  def setTitle(title: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.MenuItem.titleCondensed> property.
  			 */
  def setTitleCondensed(titleCondensed: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the [visible](Titanium.Android.MenuItem.visible) state of the menu item.
  			 */
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
}

