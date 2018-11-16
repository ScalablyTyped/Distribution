package typings
package titaniumLib.TitaniumNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A tabbed group of windows.
		 */
@js.native
trait TabGroup extends View {
  /**
  			 * Active tab.
  			 */
  var activeTab: Tab = js.native
  /**
  			 * Default background image for the active tab.
  			 */
  var activeTabBackgroundImage: java.lang.String = js.native
  /**
  			 * Color applied to active tabs icons, as a color name or hex triplet, where the tab's activeIcon was not defined.
  			 */
  var activeTabIconTint: java.lang.String = js.native
  /**
  			 * Reference to the Android Activity object associated with this tab group.
  			 */
  val activity: titaniumLib.TitaniumNs.AndroidNs.Activity = js.native
  /**
  			 * Allow the user to reorder tabs in the tab group using the **Edit** button on the **More**
  			 * tab.
  			 */
  var allowUserCustomization: scala.Boolean = js.native
  /**
  			 * Default navigation bar color (typically for the **More** tab), as a color name or hex triplet.
  			 */
  var barColor: java.lang.String = js.native
  /**
  			 * Title for the edit button on the **More** tab.
  			 */
  var editButtonTitle: java.lang.String = js.native
  /**
  			 * Boolean value indicating if the application should exit when closing the tab group, whether via Android
  			 * back button or the [close](Titanium.UI.TabGroup.close) method.
  			 */
  var exitOnClose: scala.Boolean = js.native
  /**
  			 * The tintColor to apply to the navigation bar (typically for the **More** tab).
  			 */
  var navTintColor: java.lang.String = js.native
  /**
  			 * Image of the shadow placed between the tab bar and the content area.
  			 */
  var shadowImage: java.lang.String = js.native
  /**
  			 * Boolean value indicating if changing pages by tab clicks is animated.
  			 */
  var smoothScrollOnTabClick: scala.Boolean = js.native
  /**
  			 * Boolean value indicating if tab navigation can be done by swipes, in addition to tab clicks.
  			 */
  var swipeable: scala.Boolean = js.native
  /**
  			 * Tabs managed by the tab group.
  			 */
  var tabs: js.Array[Tab] = js.native
  /**
  			 * Default background color for inactive tabs, as a color name or hex triplet.
  			 */
  var tabsBackgroundColor: java.lang.String = js.native
  /**
  			 * Default background image for tabs.
  			 */
  var tabsBackgroundImage: java.lang.String = js.native
  /**
  			 * Default background selected color for tabs, as a color name or hex triplet.
  			 */
  var tabsBackgroundSelectedColor: java.lang.String = js.native
  /**
  			 * The tintColor to apply to the tabs.
  			 */
  var tabsTintColor: java.lang.String = js.native
  /**
  			 * A Boolean value that indicates whether the tab bar is translucent.
  			 */
  var tabsTranslucent: scala.Boolean = js.native
  /**
  			 * Title for this tabGroup.
  			 */
  var title: java.lang.String = js.native
  /**
  			 * Title text attributes of the window to be applied on the **More** tab.
  			 */
  var titleAttributes: titaniumLib.titleAttributesParams = js.native
  /**
  			 * Boolean value indicating if the nav bar (typically for the **More** tab), is translucent.
  			 */
  var translucent: scala.Boolean = js.native
  /**
  			 * Unselected items in this tab group will be tinted with this color. Setting this value to null
  			 * indicates that the tab group should use its default value instead.
  			 */
  var unselectedItemTintColor: java.lang.String = js.native
  /**
  			 * Determines how the tab group is treated when a soft input method (such as a virtual keyboard)
  			 * is displayed.
  			 */
  var windowSoftInputMode: scala.Double = js.native
  /**
  			 * Adds a tab to the tab group.
  			 */
  def addTab(tab: Tab): scala.Unit = js.native
  /**
  			 * Closes the tab group and removes it from the UI.
  			 */
  def close(): scala.Unit = js.native
  /**
  			 * Disable (or re-enable) tab navigation. If tab navigation is disabled, the tabs are hidden and
  			 * the last selected tab window is shown.
  			 */
  def disableTabNavigation(disable: scala.Boolean): scala.Unit = js.native
  /**
  			 * Gets the currently-active tab.
  			 */
  def getActiveTab(): Tab = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.activeTabBackgroundImage> property.
  			 */
  def getActiveTabBackgroundImage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.activeTabIconTint> property.
  			 */
  def getActiveTabIconTint(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.activity> property.
  			 */
  def getActivity(): titaniumLib.TitaniumNs.AndroidNs.Activity = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.allowUserCustomization> property.
  			 */
  def getAllowUserCustomization(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.barColor> property.
  			 */
  def getBarColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.editButtonTitle> property.
  			 */
  def getEditButtonTitle(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.exitOnClose> property.
  			 */
  def getExitOnClose(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.navTintColor> property.
  			 */
  def getNavTintColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.shadowImage> property.
  			 */
  def getShadowImage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.smoothScrollOnTabClick> property.
  			 */
  def getSmoothScrollOnTabClick(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.swipeable> property.
  			 */
  def getSwipeable(): scala.Boolean = js.native
  /**
  			 * Gets all tabs that are managed by the tab group.
  			 */
  def getTabs(): js.Array[Tab] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.tabsBackgroundColor> property.
  			 */
  def getTabsBackgroundColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.tabsBackgroundImage> property.
  			 */
  def getTabsBackgroundImage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.tabsBackgroundSelectedColor> property.
  			 */
  def getTabsBackgroundSelectedColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.tabsTintColor> property.
  			 */
  def getTabsTintColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.tabsTranslucent> property.
  			 */
  def getTabsTranslucent(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.title> property.
  			 */
  def getTitle(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.titleAttributes> property.
  			 */
  def getTitleAttributes(): titaniumLib.titleAttributesParams = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.translucent> property.
  			 */
  def getTranslucent(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.unselectedItemTintColor> property.
  			 */
  def getUnselectedItemTintColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.windowSoftInputMode> property.
  			 */
  def getWindowSoftInputMode(): scala.Double = js.native
  /**
  			 * Opens the tab group and makes it visible.
  			 */
  def open(): scala.Unit = js.native
  /**
  			 * Removes a tab from the tab group.
  			 */
  def removeTab(tab: Tab): scala.Unit = js.native
  /**
  			 * Selects the currently active tab in a tab group.
  			 */
  def setActiveTab(indexOrObject: scala.Double): scala.Unit = js.native
  /**
  			 * Selects the currently active tab in a tab group.
  			 */
  def setActiveTab(indexOrObject: Tab): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.activeTabBackgroundImage> property.
  			 */
  def setActiveTabBackgroundImage(activeTabBackgroundImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.activeTabIconTint> property.
  			 */
  def setActiveTabIconTint(activeTabIconTint: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.allowUserCustomization> property.
  			 */
  def setAllowUserCustomization(allowUserCustomization: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.barColor> property.
  			 */
  def setBarColor(barColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.editButtonTitle> property.
  			 */
  def setEditButtonTitle(editButtonTitle: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.exitOnClose> property.
  			 */
  def setExitOnClose(exitOnClose: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.navTintColor> property.
  			 */
  def setNavTintColor(navTintColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.shadowImage> property.
  			 */
  def setShadowImage(shadowImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.smoothScrollOnTabClick> property.
  			 */
  def setSmoothScrollOnTabClick(smoothScrollOnTabClick: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.swipeable> property.
  			 */
  def setSwipeable(swipeable: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.tabs> property.
  			 */
  def setTabs(tabs: js.Array[Tab]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.tabsBackgroundColor> property.
  			 */
  def setTabsBackgroundColor(tabsBackgroundColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.tabsBackgroundImage> property.
  			 */
  def setTabsBackgroundImage(tabsBackgroundImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.tabsBackgroundSelectedColor> property.
  			 */
  def setTabsBackgroundSelectedColor(tabsBackgroundSelectedColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.tabsTintColor> property.
  			 */
  def setTabsTintColor(tabsTintColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.tabsTranslucent> property.
  			 */
  def setTabsTranslucent(tabsTranslucent: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.title> property.
  			 */
  def setTitle(title: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.titleAttributes> property.
  			 */
  def setTitleAttributes(titleAttributes: titaniumLib.titleAttributesParams): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.translucent> property.
  			 */
  def setTranslucent(translucent: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.unselectedItemTintColor> property.
  			 */
  def setUnselectedItemTintColor(unselectedItemTintColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.windowSoftInputMode> property.
  			 */
  def setWindowSoftInputMode(windowSoftInputMode: scala.Double): scala.Unit = js.native
}

