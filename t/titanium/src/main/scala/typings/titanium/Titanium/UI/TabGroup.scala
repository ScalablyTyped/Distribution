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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * @deprecated Deprecated in favor of [Titanium.UI.TabGroup.activeTintColor](Titanium.UI.TabGroup.activeTintColor) or alternatively [Titanium.UI.Tab.activeTintColor](Titanium.UI.Tab.activeTintColor).
    */
  var activeTabIconTint: String | Color = js.native
  
  /**
    * The activeTintColor to apply to tabs.
    */
  var activeTintColor: String = js.native
  
  /**
    * Defines the color of the title of tab when it's active.
    */
  var activeTitleColor: String | Color = js.native
  
  /**
    * Adds a tab to the tab group.
    */
  def addTab(tab: Tab): Unit = js.native
  
  /**
    * Allow the user to reorder tabs in the tab group using the **Edit** button on the **More**
    * tab.
    */
  var allowUserCustomization: Boolean = js.native
  
  /**
    * Disable (or re-enable) tab navigation. If tab navigation is disabled, the tabs are hidden and
    * the last selected tab window is shown.
    */
  def disableTabNavigation(disable: Boolean): Unit = js.native
  
  /**
    * Title for the edit button on the **More** tab.
    */
  var editButtonTitle: String = js.native
  
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
    * @deprecated Deprecated in favor of [Titanium.UI.TabGroup.activeTintColor](Titanium.UI.TabGroup.activeTintColor) or alternatively [Titanium.UI.Tab.activeTintColor](Titanium.UI.Tab.activeTintColor).
    */
  def getActiveTabIconTint(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TabGroup.activeTintColor> property.
    * @deprecated Access <Titanium.UI.TabGroup.activeTintColor> instead.
    */
  def getActiveTintColor(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TabGroup.activeTitleColor> property.
    * @deprecated Access <Titanium.UI.TabGroup.activeTitleColor> instead.
    */
  def getActiveTitleColor(): String | Color = js.native
  
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
  def getTabsBackgroundColor(): String | Color = js.native
  
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
    * @deprecated Deprecated in favor of [Titanium.UI.TabGroup.tintColor](Titanium.UI.TabGroup.tintColor) or alternatively [Titanium.UI.Tab.tintColor](Titanium.UI.Tab.tintColor).
    */
  def getTabsTintColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TabGroup.tabsTranslucent> property.
    * @deprecated Access <Titanium.UI.TabGroup.tabsTranslucent> instead.
    */
  def getTabsTranslucent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TabGroup.titleColor> property.
    * @deprecated Access <Titanium.UI.TabGroup.titleColor> instead.
    */
  def getTitleColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TabGroup.unselectedItemTintColor> property.
    * @deprecated Deprecated in favor of [Titanium.UI.TabGroup.tintColor](Titanium.UI.TabGroup.tintColor) or alternatively [Titanium.UI.Tab.tintColor](Titanium.UI.Tab.tintColor).
    */
  def getUnselectedItemTintColor(): String | Color = js.native
  
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
    * @deprecated Deprecated in favor of [Titanium.UI.TabGroup.activeTintColor](Titanium.UI.TabGroup.activeTintColor) or alternatively [Titanium.UI.Tab.activeTintColor](Titanium.UI.Tab.activeTintColor).
    */
  def setActiveTabIconTint(activeTabIconTint: String): Unit = js.native
  def setActiveTabIconTint(activeTabIconTint: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TabGroup.activeTintColor> property.
    * @deprecated Set the value using <Titanium.UI.TabGroup.activeTintColor> instead.
    */
  def setActiveTintColor(activeTintColor: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TabGroup.activeTitleColor> property.
    * @deprecated Set the value using <Titanium.UI.TabGroup.activeTitleColor> instead.
    */
  def setActiveTitleColor(activeTitleColor: String): Unit = js.native
  def setActiveTitleColor(activeTitleColor: Color): Unit = js.native
  
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
  def setTabsBackgroundColor(tabsBackgroundColor: Color): Unit = js.native
  
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
    * @deprecated Deprecated in favor of [Titanium.UI.TabGroup.tintColor](Titanium.UI.TabGroup.tintColor) or alternatively [Titanium.UI.Tab.tintColor](Titanium.UI.Tab.tintColor).
    */
  def setTabsTintColor(tabsTintColor: String): Unit = js.native
  def setTabsTintColor(tabsTintColor: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TabGroup.tabsTranslucent> property.
    * @deprecated Set the value using <Titanium.UI.TabGroup.tabsTranslucent> instead.
    */
  def setTabsTranslucent(tabsTranslucent: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TabGroup.titleColor> property.
    * @deprecated Set the value using <Titanium.UI.TabGroup.titleColor> instead.
    */
  def setTitleColor(titleColor: String): Unit = js.native
  def setTitleColor(titleColor: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TabGroup.unselectedItemTintColor> property.
    * @deprecated Deprecated in favor of [Titanium.UI.TabGroup.tintColor](Titanium.UI.TabGroup.tintColor) or alternatively [Titanium.UI.Tab.tintColor](Titanium.UI.Tab.tintColor).
    */
  def setUnselectedItemTintColor(unselectedItemTintColor: String): Unit = js.native
  def setUnselectedItemTintColor(unselectedItemTintColor: Color): Unit = js.native
  
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
  var tabsBackgroundColor: String | Color = js.native
  
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
    * @deprecated Deprecated in favor of [Titanium.UI.TabGroup.tintColor](Titanium.UI.TabGroup.tintColor) or alternatively [Titanium.UI.Tab.tintColor](Titanium.UI.Tab.tintColor).
    */
  var tabsTintColor: String | Color = js.native
  
  /**
    * A Boolean value that indicates whether the tab bar is translucent.
    */
  var tabsTranslucent: Boolean = js.native
  
  /**
    * The tintColor to apply to tabs.
    */
  @JSName("tintColor")
  var tintColor_TabGroup: String = js.native
  
  /**
    * Defines the color of the title of tab when it's inactive.
    */
  var titleColor: String | Color = js.native
  
  /**
    * Unselected items in this tab group will be tinted with this color. Setting this value to null
    * indicates that the tab group should use its default value instead.
    * @deprecated Deprecated in favor of [Titanium.UI.TabGroup.tintColor](Titanium.UI.TabGroup.tintColor) or alternatively [Titanium.UI.Tab.tintColor](Titanium.UI.Tab.tintColor).
    */
  var unselectedItemTintColor: String | Color = js.native
}
