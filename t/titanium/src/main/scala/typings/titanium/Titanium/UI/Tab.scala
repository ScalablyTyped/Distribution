package typings.titanium.Titanium.UI

import typings.titanium.TabIconInsets
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
  var active: Boolean = js.native
  /**
  			 * Icon URL for this tab when active.
  			 */
  var activeIcon: String = js.native
  /**
  			 * Defines if the active icon property of the tab must be used as a mask.
  			 */
  var activeIconIsMask: Boolean = js.native
  /**
  			 * Defines the color of the title of tab when it's active.
  			 */
  var activeTitleColor: String = js.native
  /**
  			 * Badge value for this tab. `null` indicates no badge.
  			 */
  var badge: String = js.native
  /**
  			 * If this item displays a badge, this color will be used for the badge's background.
  			 * If set to null, the default background color will be used instead.
  			 */
  var badgeColor: String = js.native
  /**
  			 * Icon URL for this tab.
  			 */
  var icon: String = js.native
  /**
  			 * The icon inset or outset for each edge.
  			 */
  var iconInsets: TabIconInsets = js.native
  /**
  			 * Defines if the icon property of the tab must be used as a mask.
  			 */
  var iconIsMask: Boolean = js.native
  /**
  			 * Title for this tab.
  			 */
  var title: String = js.native
  /**
  			 * Defines the color of the title of tab when it's inactive.
  			 */
  var titleColor: String = js.native
  /**
  			 * Key identifying a string from the locale file to use for the tab title. Only one of `title` or `titleid` should be specified.
  			 */
  var titleid: String = js.native
  /**
  			 * Root-level tab window.  All tabs must have at least one root-level tab window.
  			 */
  var window: Window = js.native
  /**
  			 * Closes the top-level window for this tab.
  			 */
  def close(window: Window): Unit = js.native
  def close(window: Window, options: js.Any): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Tab.active> property.
  			 */
  def getActive(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Tab.activeIcon> property.
  			 */
  def getActiveIcon(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Tab.activeIconIsMask> property.
  			 */
  def getActiveIconIsMask(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Tab.activeTitleColor> property.
  			 */
  def getActiveTitleColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Tab.badge> property.
  			 */
  def getBadge(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Tab.badgeColor> property.
  			 */
  def getBadgeColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Tab.icon> property.
  			 */
  def getIcon(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Tab.iconInsets> property.
  			 */
  def getIconInsets(): TabIconInsets = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Tab.iconIsMask> property.
  			 */
  def getIconIsMask(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Tab.title> property.
  			 */
  def getTitle(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Tab.titleColor> property.
  			 */
  def getTitleColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Tab.titleid> property.
  			 */
  def getTitleid(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Tab.window> property.
  			 */
  def getWindow(): Window = js.native
  /**
  			 * Opens a new window.
  			 */
  def open(window: Window): Unit = js.native
  def open(window: Window, options: js.Any): Unit = js.native
  /**
  			 * Closes all windows that are currently opened inside the tab.
  			 */
  def popToRootWindow(options: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Tab.active> property.
  			 */
  def setActive(active: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Tab.activeIcon> property.
  			 */
  def setActiveIcon(activeIcon: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Tab.activeIconIsMask> property.
  			 */
  def setActiveIconIsMask(activeIconIsMask: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Tab.activeTitleColor> property.
  			 */
  def setActiveTitleColor(activeTitleColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Tab.badge> property.
  			 */
  def setBadge(badge: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Tab.badgeColor> property.
  			 */
  def setBadgeColor(badgeColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Tab.icon> property.
  			 */
  def setIcon(icon: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Tab.iconInsets> property.
  			 */
  def setIconInsets(iconInsets: TabIconInsets): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Tab.iconIsMask> property.
  			 */
  def setIconIsMask(iconIsMask: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Tab.title> property.
  			 */
  def setTitle(title: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Tab.titleColor> property.
  			 */
  def setTitleColor(titleColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Tab.titleid> property.
  			 */
  def setTitleid(titleid: String): Unit = js.native
  /**
  			 * Sets the root window that appears in the tab.
  			 */
  def setWindow(window: Window): Unit = js.native
}

