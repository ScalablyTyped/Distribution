package typings
package titaniumLib.TitaniumNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A tab instance for a [TabGroup](Titanium.UI.TabGroup).
		 */
@js.native
trait Tab extends View {
  /**
  			 * `true` if this tab is active, `false` if it is not.
  			 */
  var active: scala.Boolean = js.native
  /**
  			 * Icon URL for this tab when active.
  			 */
  var activeIcon: java.lang.String = js.native
  /**
  			 * Defines if the active icon property of the tab must be used as a mask.
  			 */
  var activeIconIsMask: scala.Boolean = js.native
  /**
  			 * Defines the color of the title of tab when it's active.
  			 */
  var activeTitleColor: java.lang.String = js.native
  /**
  			 * Badge value for this tab. `null` indicates no badge.
  			 */
  var badge: java.lang.String = js.native
  /**
  			 * If this item displays a badge, this color will be used for the badge's background.
  			 * If set to null, the default background color will be used instead.
  			 */
  var badgeColor: java.lang.String = js.native
  /**
  			 * Icon URL for this tab.
  			 */
  var icon: java.lang.String = js.native
  /**
  			 * The icon inset or outset for each edge.
  			 */
  var iconInsets: titaniumLib.TabIconInsets = js.native
  /**
  			 * Defines if the icon property of the tab must be used as a mask.
  			 */
  var iconIsMask: scala.Boolean = js.native
  /**
  			 * Title for this tab.
  			 */
  var title: java.lang.String = js.native
  /**
  			 * Defines the color of the title of tab when it's inactive.
  			 */
  var titleColor: java.lang.String = js.native
  /**
  			 * Key identifying a string from the locale file to use for the tab title. Only one of `title` or `titleid` should be specified.
  			 */
  var titleid: java.lang.String = js.native
  /**
  			 * Root-level tab window.  All tabs must have at least one root-level tab window.
  			 */
  var window: Window = js.native
  /**
  			 * Closes the top-level window for this tab.
  			 */
  def close(window: Window): scala.Unit = js.native
  /**
  			 * Closes the top-level window for this tab.
  			 */
  def close(window: Window, options: js.Any): scala.Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Tab.active> property.
  			 */
  def getActive(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Tab.activeIcon> property.
  			 */
  def getActiveIcon(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Tab.activeIconIsMask> property.
  			 */
  def getActiveIconIsMask(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Tab.activeTitleColor> property.
  			 */
  def getActiveTitleColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Tab.badge> property.
  			 */
  def getBadge(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Tab.badgeColor> property.
  			 */
  def getBadgeColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Tab.icon> property.
  			 */
  def getIcon(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Tab.iconInsets> property.
  			 */
  def getIconInsets(): titaniumLib.TabIconInsets = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Tab.iconIsMask> property.
  			 */
  def getIconIsMask(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Tab.title> property.
  			 */
  def getTitle(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Tab.titleColor> property.
  			 */
  def getTitleColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Tab.titleid> property.
  			 */
  def getTitleid(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Tab.window> property.
  			 */
  def getWindow(): Window = js.native
  /**
  			 * Opens a new window.
  			 */
  def open(window: Window): scala.Unit = js.native
  /**
  			 * Opens a new window.
  			 */
  def open(window: Window, options: js.Any): scala.Unit = js.native
  /**
  			 * Closes all windows that are currently opened inside the tab.
  			 */
  def popToRootWindow(options: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Tab.active> property.
  			 */
  def setActive(active: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Tab.activeIcon> property.
  			 */
  def setActiveIcon(activeIcon: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Tab.activeIconIsMask> property.
  			 */
  def setActiveIconIsMask(activeIconIsMask: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Tab.activeTitleColor> property.
  			 */
  def setActiveTitleColor(activeTitleColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Tab.badge> property.
  			 */
  def setBadge(badge: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Tab.badgeColor> property.
  			 */
  def setBadgeColor(badgeColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Tab.icon> property.
  			 */
  def setIcon(icon: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Tab.iconInsets> property.
  			 */
  def setIconInsets(iconInsets: titaniumLib.TabIconInsets): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Tab.iconIsMask> property.
  			 */
  def setIconIsMask(iconIsMask: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Tab.title> property.
  			 */
  def setTitle(title: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Tab.titleColor> property.
  			 */
  def setTitleColor(titleColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Tab.titleid> property.
  			 */
  def setTitleid(titleid: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the root window that appears in the tab.
  			 */
  def setWindow(window: Window): scala.Unit = js.native
}

