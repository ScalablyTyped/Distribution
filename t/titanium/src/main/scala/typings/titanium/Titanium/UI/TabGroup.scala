package typings.titanium.Titanium.UI

import typings.titanium.titaniumStrings.androidback
import typings.titanium.titaniumStrings.androidcamera
import typings.titanium.titaniumStrings.androidfocus
import typings.titanium.titaniumStrings.androidsearch
import typings.titanium.titaniumStrings.androidvoldown
import typings.titanium.titaniumStrings.androidvolup
import typings.titanium.titaniumStrings.blur
import typings.titanium.titaniumStrings.click
import typings.titanium.titaniumStrings.close
import typings.titanium.titaniumStrings.dblclick
import typings.titanium.titaniumStrings.doubletap
import typings.titanium.titaniumStrings.focus
import typings.titanium.titaniumStrings.keypressed
import typings.titanium.titaniumStrings.longclick
import typings.titanium.titaniumStrings.longpress
import typings.titanium.titaniumStrings.open
import typings.titanium.titaniumStrings.pinch
import typings.titanium.titaniumStrings.postlayout
import typings.titanium.titaniumStrings.singletap
import typings.titanium.titaniumStrings.swipe
import typings.titanium.titaniumStrings.touchcancel
import typings.titanium.titaniumStrings.touchend
import typings.titanium.titaniumStrings.touchmove
import typings.titanium.titaniumStrings.touchstart
import typings.titanium.titaniumStrings.twofingertap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A tabbed group of windows.
  */
@js.native
trait TabGroup extends Window {
  /**
    * Active tab.
    */
  var activeTab: Double | Tab = js.native
  /**
    * Default background image for the active tab.
    */
  var activeTabBackgroundImage: String = js.native
  /**
    * Color applied to active tabs icons, as a color name or hex triplet, where the tab's activeIcon was not defined.
    */
  var activeTabIconTint: String = js.native
  /**
    * Allow the user to reorder tabs in the tab group using the **Edit** button on the **More**
    * tab.
    */
  var allowUserCustomization: Boolean = js.native
  /**
    * Title for the edit button on the **More** tab.
    */
  var editButtonTitle: String = js.native
  /**
    * Determines whether the [TABS_STYLE_BOTTOM_NAVIGATION](Titanium.UI.Android.TABS_STYLE_BOTTOM_NAVIGATION) uses shiftMode.
    */
  var shiftMode: Boolean = js.native
  /**
    * Boolean value indicating if changing pages by tab clicks is animated.
    */
  var smoothScrollOnTabClick: Boolean = js.native
  /**
    * Property defining which style for the TabGroup to be used.
    */
  var style: Double = js.native
  /**
    * Boolean value indicating if tab navigation can be done by swipes, in addition to tab clicks.
    */
  var swipeable: Boolean = js.native
  /**
    * Tabs managed by the tab group.
    */
  var tabs: js.Array[Tab] = js.native
  /**
    * Default background color for inactive tabs, as a color name or hex triplet.
    */
  var tabsBackgroundColor: String = js.native
  /**
    * Default background image for tabs.
    */
  var tabsBackgroundImage: String = js.native
  /**
    * Default background selected color for tabs, as a color name or hex triplet.
    */
  var tabsBackgroundSelectedColor: String = js.native
  /**
    * The tintColor to apply to the tabs.
    */
  var tabsTintColor: String = js.native
  /**
    * A Boolean value that indicates whether the tab bar is translucent.
    */
  var tabsTranslucent: Boolean = js.native
  /**
    * Unselected items in this tab group will be tinted with this color. Setting this value to null
    * indicates that the tab group should use its default value instead.
    */
  var unselectedItemTintColor: String = js.native
  /**
    * Adds a tab to the tab group.
    */
  def addTab(tab: Tab): Unit = js.native
  /**
    * Disable (or re-enable) tab navigation. If tab navigation is disabled, the tabs are hidden and
    * the last selected tab window is shown.
    */
  def disableTabNavigation(disable: Boolean): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_androidback(name: androidback, event: TabGroupAndroidbackEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_androidcamera(name: androidcamera, event: TabGroupAndroidcameraEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_androidfocus(name: androidfocus, event: TabGroupAndroidfocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_androidsearch(name: androidsearch, event: TabGroupAndroidsearchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_androidvoldown(name: androidvoldown, event: TabGroupAndroidvoldownEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_androidvolup(name: androidvolup, event: TabGroupAndroidvolupEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_blur(name: blur, event: TabGroupBlurEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: TabGroupClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_close(name: close, event: TabGroupCloseEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: TabGroupDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: TabGroupDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: TabGroupFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: TabGroupKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: TabGroupLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: TabGroupLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_open(name: open, event: TabGroupOpenEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: TabGroupPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: TabGroupPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: TabGroupSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: TabGroupSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: TabGroupTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: TabGroupTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: TabGroupTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: TabGroupTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: TabGroupTwofingertapEvent): Unit = js.native
  /**
    * Gets the currently-active tab.
    */
  def getActiveTab(): Tab = js.native
  /**
    * Gets the value of the <Titanium.UI.TabGroup.activeTabBackgroundImage> property.
    * @deprecated Access <Titanium.UI.TabGroup.activeTabBackgroundImage> instead.
    */
  def getActiveTabBackgroundImage(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.TabGroup.activeTabIconTint> property.
    * @deprecated Access <Titanium.UI.TabGroup.activeTabIconTint> instead.
    */
  def getActiveTabIconTint(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.TabGroup.allowUserCustomization> property.
    * @deprecated Access <Titanium.UI.TabGroup.allowUserCustomization> instead.
    */
  def getAllowUserCustomization(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.TabGroup.editButtonTitle> property.
    * @deprecated Access <Titanium.UI.TabGroup.editButtonTitle> instead.
    */
  def getEditButtonTitle(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.TabGroup.shiftMode> property.
    * @deprecated Access <Titanium.UI.TabGroup.shiftMode> instead.
    */
  def getShiftMode(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.TabGroup.smoothScrollOnTabClick> property.
    * @deprecated Access <Titanium.UI.TabGroup.smoothScrollOnTabClick> instead.
    */
  def getSmoothScrollOnTabClick(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.TabGroup.style> property.
    * @deprecated Access <Titanium.UI.TabGroup.style> instead.
    */
  def getStyle(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.TabGroup.swipeable> property.
    * @deprecated Access <Titanium.UI.TabGroup.swipeable> instead.
    */
  def getSwipeable(): Boolean = js.native
  /**
    * Gets all tabs that are managed by the tab group.
    */
  def getTabs(): js.Array[Tab] = js.native
  /**
    * Gets the value of the <Titanium.UI.TabGroup.tabsBackgroundColor> property.
    * @deprecated Access <Titanium.UI.TabGroup.tabsBackgroundColor> instead.
    */
  def getTabsBackgroundColor(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.TabGroup.tabsBackgroundImage> property.
    * @deprecated Access <Titanium.UI.TabGroup.tabsBackgroundImage> instead.
    */
  def getTabsBackgroundImage(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.TabGroup.tabsBackgroundSelectedColor> property.
    * @deprecated Access <Titanium.UI.TabGroup.tabsBackgroundSelectedColor> instead.
    */
  def getTabsBackgroundSelectedColor(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.TabGroup.tabsTintColor> property.
    * @deprecated Access <Titanium.UI.TabGroup.tabsTintColor> instead.
    */
  def getTabsTintColor(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.TabGroup.tabsTranslucent> property.
    * @deprecated Access <Titanium.UI.TabGroup.tabsTranslucent> instead.
    */
  def getTabsTranslucent(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.TabGroup.unselectedItemTintColor> property.
    * @deprecated Access <Titanium.UI.TabGroup.unselectedItemTintColor> instead.
    */
  def getUnselectedItemTintColor(): String = js.native
  /**
    * Removes a tab from the tab group.
    */
  def removeTab(tab: Tab): Unit = js.native
  /**
    * Selects the currently active tab in a tab group.
    */
  def setActiveTab(indexOrObject: Double): Unit = js.native
  def setActiveTab(indexOrObject: Tab): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TabGroup.activeTabBackgroundImage> property.
    * @deprecated Set the value using <Titanium.UI.TabGroup.activeTabBackgroundImage> instead.
    */
  def setActiveTabBackgroundImage(activeTabBackgroundImage: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TabGroup.activeTabIconTint> property.
    * @deprecated Set the value using <Titanium.UI.TabGroup.activeTabIconTint> instead.
    */
  def setActiveTabIconTint(activeTabIconTint: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TabGroup.allowUserCustomization> property.
    * @deprecated Set the value using <Titanium.UI.TabGroup.allowUserCustomization> instead.
    */
  def setAllowUserCustomization(allowUserCustomization: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TabGroup.editButtonTitle> property.
    * @deprecated Set the value using <Titanium.UI.TabGroup.editButtonTitle> instead.
    */
  def setEditButtonTitle(editButtonTitle: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TabGroup.shiftMode> property.
    * @deprecated Set the value using <Titanium.UI.TabGroup.shiftMode> instead.
    */
  def setShiftMode(shiftMode: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TabGroup.smoothScrollOnTabClick> property.
    * @deprecated Set the value using <Titanium.UI.TabGroup.smoothScrollOnTabClick> instead.
    */
  def setSmoothScrollOnTabClick(smoothScrollOnTabClick: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TabGroup.style> property.
    * @deprecated Set the value using <Titanium.UI.TabGroup.style> instead.
    */
  def setStyle(style: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TabGroup.swipeable> property.
    * @deprecated Set the value using <Titanium.UI.TabGroup.swipeable> instead.
    */
  def setSwipeable(swipeable: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TabGroup.tabs> property.
    * @deprecated Set the value using <Titanium.UI.TabGroup.tabs> instead.
    */
  def setTabs(tabs: js.Array[Tab]): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TabGroup.tabsBackgroundColor> property.
    * @deprecated Set the value using <Titanium.UI.TabGroup.tabsBackgroundColor> instead.
    */
  def setTabsBackgroundColor(tabsBackgroundColor: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TabGroup.tabsBackgroundImage> property.
    * @deprecated Set the value using <Titanium.UI.TabGroup.tabsBackgroundImage> instead.
    */
  def setTabsBackgroundImage(tabsBackgroundImage: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TabGroup.tabsBackgroundSelectedColor> property.
    * @deprecated Set the value using <Titanium.UI.TabGroup.tabsBackgroundSelectedColor> instead.
    */
  def setTabsBackgroundSelectedColor(tabsBackgroundSelectedColor: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TabGroup.tabsTintColor> property.
    * @deprecated Set the value using <Titanium.UI.TabGroup.tabsTintColor> instead.
    */
  def setTabsTintColor(tabsTintColor: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TabGroup.tabsTranslucent> property.
    * @deprecated Set the value using <Titanium.UI.TabGroup.tabsTranslucent> instead.
    */
  def setTabsTranslucent(tabsTranslucent: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TabGroup.unselectedItemTintColor> property.
    * @deprecated Set the value using <Titanium.UI.TabGroup.unselectedItemTintColor> instead.
    */
  def setUnselectedItemTintColor(unselectedItemTintColor: String): Unit = js.native
}

