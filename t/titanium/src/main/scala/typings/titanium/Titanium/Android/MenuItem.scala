package typings.titanium.Titanium.Android

import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.View
import typings.titanium.titaniumStrings.click
import typings.titanium.titaniumStrings.collapse
import typings.titanium.titaniumStrings.expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Titanium binding of an Android menu item.
  */
@js.native
trait MenuItem extends Proxy {
  
  /**
    * Briefly describes what performing an action (such as a click) on the view will do.
    */
  var accessibilityHint: String = js.native
  
  /**
    * A succint label identifying the view for the device's accessibility service.
    */
  var accessibilityLabel: String = js.native
  
  /**
    * A string describing the value (if any) of the view for the device's accessibility service.
    */
  var accessibilityValue: String = js.native
  
  /**
    * Custom view that replaces the default menu item button.
    */
  var actionView: View = js.native
  
  /**
    * True if this menu item's action view has been expanded.
    */
  val actionViewExpanded: Boolean = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_click(
    name: click,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ MenuItemClickEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_collapse(
    name: collapse,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ MenuItemCollapseEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_expand(
    name: expand,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ MenuItemExpandEvent, Unit]
  ): Unit = js.native
  
  /**
    * Determines if the item can be checked.
    */
  var checkable: Boolean = js.native
  
  /**
    * Determines if the item is checked.
    */
  var checked: Boolean = js.native
  
  /**
    * Collapse the action view associated with this menu item.
    */
  def collapseActionView(): Unit = js.native
  
  /**
    * Determines if the item is enabled.
    */
  var enabled: Boolean = js.native
  
  /**
    * Expand the action view associated with this menu item.
    */
  def expandActionView(): Unit = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_click(name: click): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: MenuItemClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_collapse(name: collapse): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_collapse(name: collapse, event: MenuItemCollapseEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_expand(name: expand): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_expand(name: expand, event: MenuItemExpandEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.Android.MenuItem.accessibilityHint> property.
    * @deprecated Access <Titanium.Android.MenuItem.accessibilityHint> instead.
    */
  def getAccessibilityHint(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Android.MenuItem.accessibilityLabel> property.
    * @deprecated Access <Titanium.Android.MenuItem.accessibilityLabel> instead.
    */
  def getAccessibilityLabel(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Android.MenuItem.accessibilityValue> property.
    * @deprecated Access <Titanium.Android.MenuItem.accessibilityValue> instead.
    */
  def getAccessibilityValue(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Android.MenuItem.actionView> property.
    * @deprecated Access <Titanium.Android.MenuItem.actionView> instead.
    */
  def getActionView(): View = js.native
  
  /**
    * Gets the value of the <Titanium.Android.MenuItem.groupId> property.
    * @deprecated Access <Titanium.Android.MenuItem.groupId> instead.
    */
  def getGroupId(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Android.MenuItem.itemId> property.
    * @deprecated Access <Titanium.Android.MenuItem.itemId> instead.
    */
  def getItemId(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Android.MenuItem.order> property.
    * @deprecated Access <Titanium.Android.MenuItem.order> instead.
    */
  def getOrder(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Android.MenuItem.title> property.
    * @deprecated Access <Titanium.Android.MenuItem.title> instead.
    */
  def getTitle(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Android.MenuItem.titleCondensed> property.
    * @deprecated Access <Titanium.Android.MenuItem.titleCondensed> instead.
    */
  def getTitleCondensed(): String = js.native
  
  /**
    * Group ID for this item.
    */
  val groupId: Double = js.native
  
  /**
    * Icon to display for the this menu item.
    */
  var icon: Double | String = js.native
  
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
    * Item ID for this item.
    */
  val itemId: Double = js.native
  
  /**
    * Integer used for controlling the category and sort order for menu items.
    */
  val order: Double = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_click(
    name: click,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ MenuItemClickEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_collapse(
    name: collapse,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ MenuItemCollapseEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_expand(
    name: expand,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ MenuItemExpandEvent, Unit]
  ): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Android.MenuItem.accessibilityHint> property.
    * @deprecated Set the value using <Titanium.Android.MenuItem.accessibilityHint> instead.
    */
  def setAccessibilityHint(accessibilityHint: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Android.MenuItem.accessibilityLabel> property.
    * @deprecated Set the value using <Titanium.Android.MenuItem.accessibilityLabel> instead.
    */
  def setAccessibilityLabel(accessibilityLabel: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Android.MenuItem.accessibilityValue> property.
    * @deprecated Set the value using <Titanium.Android.MenuItem.accessibilityValue> instead.
    */
  def setAccessibilityValue(accessibilityValue: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Android.MenuItem.actionView> property.
    * @deprecated Set the value using <Titanium.Android.MenuItem.actionView> instead.
    */
  def setActionView(actionView: View): Unit = js.native
  
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
  
  def setIcon(icon: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.Android.MenuItem.icon> property.
    * @deprecated Set the value using <Titanium.Android.MenuItem.icon> instead.
    */
  def setIcon(icon: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Android.MenuItem.showAsAction> property.
    * @deprecated Set the value using <Titanium.Android.MenuItem.showAsAction> instead.
    */
  def setShowAsAction(showAsAction: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Android.MenuItem.title> property.
    * @deprecated Set the value using <Titanium.Android.MenuItem.title> instead.
    */
  def setTitle(title: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Android.MenuItem.titleCondensed> property.
    * @deprecated Set the value using <Titanium.Android.MenuItem.titleCondensed> instead.
    */
  def setTitleCondensed(titleCondensed: String): Unit = js.native
  
  /**
    * Sets the [visible](Titanium.Android.MenuItem.visible) state of the menu item.
    */
  def setVisible(visible: Boolean): Unit = js.native
  
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
}
