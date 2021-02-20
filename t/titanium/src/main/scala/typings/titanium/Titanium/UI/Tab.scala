package typings.titanium.Titanium.UI

import typings.titanium.AnimatedOptions
import typings.titanium.TabIconInsets
import typings.titanium.openWindowParams
import typings.titanium.titaniumStrings.click
import typings.titanium.titaniumStrings.dblclick
import typings.titanium.titaniumStrings.doubletap
import typings.titanium.titaniumStrings.keypressed
import typings.titanium.titaniumStrings.longclick
import typings.titanium.titaniumStrings.longpress
import typings.titanium.titaniumStrings.pinch
import typings.titanium.titaniumStrings.postlayout
import typings.titanium.titaniumStrings.selected
import typings.titanium.titaniumStrings.singletap
import typings.titanium.titaniumStrings.swipe
import typings.titanium.titaniumStrings.touchcancel
import typings.titanium.titaniumStrings.touchend
import typings.titanium.titaniumStrings.touchmove
import typings.titanium.titaniumStrings.touchstart
import typings.titanium.titaniumStrings.twofingertap
import typings.titanium.titaniumStrings.unselected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * Defines the color of the tab icon when it is active. Will fallback to activeTitleColor when not defined.
    */
  var activeTintColor: String = js.native
  
  /**
    * Defines the color of the title of tab when it's active.
    */
  var activeTitleColor: String | Color = js.native
  
  @JSName("addEventListener")
  def addEventListener_selected(
    name: selected,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ TabSelectedEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unselected(
    name: unselected,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ TabUnselectedEvent, Unit]
  ): Unit = js.native
  
  /**
    * Badge value for this tab. `null` indicates no badge.
    */
  var badge: String = js.native
  
  /**
    * If this item displays a badge, this color will be used for the badge's background.
    * If set to null, the default background color will be used instead.
    */
  var badgeColor: String | Color = js.native
  
  /**
    * Closes the top-level window for this tab.
    */
  def close(window: Window): Unit = js.native
  def close(window: Window, options: js.Any): Unit = js.native
  
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: TabClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: TabDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: TabDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: TabKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: TabLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: TabLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: TabPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: TabPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_selected(name: selected): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_selected(name: selected, event: TabSelectedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: TabSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: TabSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: TabTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: TabTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: TabTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: TabTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: TabTwofingertapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_unselected(name: unselected): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_unselected(name: unselected, event: TabUnselectedEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Tab.active> property.
    * @deprecated Access <Titanium.UI.Tab.active> instead.
    */
  def getActive(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Tab.activeIcon> property.
    * @deprecated Access <Titanium.UI.Tab.activeIcon> instead.
    */
  def getActiveIcon(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Tab.activeIconIsMask> property.
    * @deprecated Access <Titanium.UI.Tab.activeIconIsMask> instead.
    */
  def getActiveIconIsMask(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Tab.activeTintColor> property.
    * @deprecated Access <Titanium.UI.Tab.activeTintColor> instead.
    */
  def getActiveTintColor(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Tab.activeTitleColor> property.
    * @deprecated Access <Titanium.UI.Tab.activeTitleColor> instead.
    */
  def getActiveTitleColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Tab.badge> property.
    * @deprecated Access <Titanium.UI.Tab.badge> instead.
    */
  def getBadge(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Tab.badgeColor> property.
    * @deprecated Access <Titanium.UI.Tab.badgeColor> instead.
    */
  def getBadgeColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Tab.icon> property.
    * @deprecated Access <Titanium.UI.Tab.icon> instead.
    */
  def getIcon(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Tab.iconInsets> property.
    * @deprecated Access <Titanium.UI.Tab.iconInsets> instead.
    */
  def getIconInsets(): TabIconInsets = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Tab.iconIsMask> property.
    * @deprecated Access <Titanium.UI.Tab.iconIsMask> instead.
    */
  def getIconIsMask(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Tab.title> property.
    * @deprecated Access <Titanium.UI.Tab.title> instead.
    */
  def getTitle(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Tab.titleColor> property.
    * @deprecated Access <Titanium.UI.Tab.titleColor> instead.
    */
  def getTitleColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Tab.titleid> property.
    * @deprecated Access <Titanium.UI.Tab.titleid> instead.
    */
  def getTitleid(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Tab.window> property.
    * @deprecated Access <Titanium.UI.Tab.window> instead.
    */
  def getWindow(): Window = js.native
  
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
    * Opens a new window.
    */
  def open(window: Window): Unit = js.native
  def open(window: Window, options: openWindowParams): Unit = js.native
  
  /**
    * Closes all windows that are currently opened inside the tab.
    */
  def popToRootWindow(): Unit = js.native
  def popToRootWindow(options: AnimatedOptions): Unit = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_selected(
    name: selected,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ TabSelectedEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unselected(
    name: unselected,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ TabUnselectedEvent, Unit]
  ): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Tab.active> property.
    * @deprecated Set the value using <Titanium.UI.Tab.active> instead.
    */
  def setActive(active: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Tab.activeIcon> property.
    * @deprecated Set the value using <Titanium.UI.Tab.activeIcon> instead.
    */
  def setActiveIcon(activeIcon: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Tab.activeIconIsMask> property.
    * @deprecated Set the value using <Titanium.UI.Tab.activeIconIsMask> instead.
    */
  def setActiveIconIsMask(activeIconIsMask: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Tab.activeTintColor> property.
    * @deprecated Set the value using <Titanium.UI.Tab.activeTintColor> instead.
    */
  def setActiveTintColor(activeTintColor: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Tab.activeTitleColor> property.
    * @deprecated Set the value using <Titanium.UI.Tab.activeTitleColor> instead.
    */
  def setActiveTitleColor(activeTitleColor: String): Unit = js.native
  def setActiveTitleColor(activeTitleColor: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Tab.badge> property.
    * @deprecated Set the value using <Titanium.UI.Tab.badge> instead.
    */
  def setBadge(badge: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Tab.badgeColor> property.
    * @deprecated Set the value using <Titanium.UI.Tab.badgeColor> instead.
    */
  def setBadgeColor(badgeColor: String): Unit = js.native
  def setBadgeColor(badgeColor: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Tab.icon> property.
    * @deprecated Set the value using <Titanium.UI.Tab.icon> instead.
    */
  def setIcon(icon: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Tab.iconInsets> property.
    * @deprecated Set the value using <Titanium.UI.Tab.iconInsets> instead.
    */
  def setIconInsets(iconInsets: TabIconInsets): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Tab.iconIsMask> property.
    * @deprecated Set the value using <Titanium.UI.Tab.iconIsMask> instead.
    */
  def setIconIsMask(iconIsMask: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Tab.title> property.
    * @deprecated Set the value using <Titanium.UI.Tab.title> instead.
    */
  def setTitle(title: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Tab.titleColor> property.
    * @deprecated Set the value using <Titanium.UI.Tab.titleColor> instead.
    */
  def setTitleColor(titleColor: String): Unit = js.native
  def setTitleColor(titleColor: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Tab.titleid> property.
    * @deprecated Set the value using <Titanium.UI.Tab.titleid> instead.
    */
  def setTitleid(titleid: String): Unit = js.native
  
  /**
    * Sets the root window that appears in the tab.
    */
  def setWindow(window: Window): Unit = js.native
  
  /**
    * Defines the color of the tab icon. Will fallback to titleColor when not defined.
    */
  @JSName("tintColor")
  var tintColor_Tab: String = js.native
  
  /**
    * Title for this tab.
    */
  var title: String = js.native
  
  /**
    * Defines the color of the title of tab when it's inactive.
    */
  var titleColor: String | Color = js.native
  
  /**
    * Key identifying a string from the locale file to use for the tab title. Only one of `title` or `titleid` should be specified.
    */
  var titleid: String = js.native
  
  /**
    * Root-level tab window.  All tabs must have at least one root-level tab window.
    */
  var window: Window = js.native
}
