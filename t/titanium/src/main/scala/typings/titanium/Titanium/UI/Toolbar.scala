package typings.titanium.Titanium.UI

import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Filesystem.File
import typings.titanium.titaniumStrings.click
import typings.titanium.titaniumStrings.dblclick
import typings.titanium.titaniumStrings.doubletap
import typings.titanium.titaniumStrings.focus
import typings.titanium.titaniumStrings.keypressed
import typings.titanium.titaniumStrings.longclick
import typings.titanium.titaniumStrings.longpress
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
  * A Toolbar can contain buttons, as well as certain other widgets, including text fields and labels.
  */
@js.native
trait Toolbar extends View {
  /**
    * Background color for the toolbar, as a color name or hex triplet.
    */
  var barColor: String = js.native
  /**
    * Returns the margin after the toolbar's content when there are action buttons.
    */
  var contentInsetEndWithActions: Double = js.native
  /**
    * Returns the margin at the toolbar's content start when there is a navigation button.
    */
  var contentInsetStartWithNavigation: Double = js.native
  /**
    * If `true`, the background of the toolbar extends upwards.
    */
  var extendBackground: Boolean = js.native
  /**
    * An array of buttons (or other widgets) contained in the toolbar.
    */
  var items: js.Array[View] = js.native
  /**
    * Image to be used as a logo in the Toolbar.
    */
  var logo: String | Blob | File = js.native
  /**
    * Image to be used for a navigation icon.
    */
  var navigationIcon: String | Blob | File = js.native
  /**
    * Image to be used for the overflow menu.
    */
  var overflowIcon: String | Blob | File = js.native
  /**
    * Text of the subtitle.
    */
  var subtitle: String = js.native
  /**
    * Color for toolbar's subtitle
    */
  var subtitleTextColor: String = js.native
  /**
    * Text of the title.
    */
  var title: String = js.native
  /**
    * Color string with any Titanium supported format
    */
  var titleTextColor: String = js.native
  /**
    * If `true`, a translucent background color is used for the toolbar.
    */
  var translucent: Boolean = js.native
  /**
    * Collapses expanded ActionViews if there is any
    */
  def collapseActionViews(): Unit = js.native
  /**
    * Collapses expandend ActionViews and hides overflow menu
    */
  def dismissPopupMenus(): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: ToolbarClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: ToolbarDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: ToolbarDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: ToolbarFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: ToolbarKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: ToolbarLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: ToolbarLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: ToolbarPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: ToolbarPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: ToolbarSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: ToolbarSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: ToolbarTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: ToolbarTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: ToolbarTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: ToolbarTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: ToolbarTwofingertapEvent): Unit = js.native
  /**
    * Gets the value of the <Titanium.UI.Toolbar.barColor> property.
    * @deprecated Access <Titanium.UI.Toolbar.barColor> instead.
    */
  def getBarColor(): String = js.native
  /**
    * Returns the margin at the toolbar's content end.
    */
  def getContentInsetEnd(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.Toolbar.contentInsetEndWithActions> property.
    * @deprecated Access <Titanium.UI.Toolbar.contentInsetEndWithActions> instead.
    */
  def getContentInsetEndWithActions(): Double = js.native
  /**
    * Returns the margin on the left of the toolbar's content.
    */
  def getContentInsetLeft(): Double = js.native
  /**
    * Returns the margin on the right of the toolbar's content.
    */
  def getContentInsetRight(): Double = js.native
  /**
    * Returns the margin at the toolbar's content start.
    */
  def getContentInsetStart(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.Toolbar.contentInsetStartWithNavigation> property.
    * @deprecated Access <Titanium.UI.Toolbar.contentInsetStartWithNavigation> instead.
    */
  def getContentInsetStartWithNavigation(): Double = js.native
  /**
    * Returns the margin at the toolbar's content end that will be used with the current configuration of the toolbar.
    */
  def getCurrentContentInsetEnd(): Double = js.native
  /**
    * Returns the margin on the left of the toolbar's content that will be used with the current configuration of the toolbar.
    */
  def getCurrentContentInsetLeft(): Double = js.native
  /**
    * Returns the margin on the right of the toolbar's content that will be used with the current configuration of the toolbar.
    */
  def getCurrentContentInsetRight(): Double = js.native
  /**
    * Returns the margin at the toolbar's content start that will be used with the current configuration of the toolbar.
    */
  def getCurrentContentInsetStart(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.Toolbar.items> property.
    * @deprecated Access <Titanium.UI.Toolbar.items> instead.
    */
  def getItems(): js.Array[View] = js.native
  /**
    * Gets the value of the <Titanium.UI.Toolbar.logo> property.
    * @deprecated Access <Titanium.UI.Toolbar.logo> instead.
    */
  def getLogo(): String | Blob | File = js.native
  /**
    * Gets the value of the <Titanium.UI.Toolbar.navigationIcon> property.
    * @deprecated Access <Titanium.UI.Toolbar.navigationIcon> instead.
    */
  def getNavigationIcon(): String | Blob | File = js.native
  /**
    * Gets the value of the <Titanium.UI.Toolbar.overflowIcon> property.
    * @deprecated Access <Titanium.UI.Toolbar.overflowIcon> instead.
    */
  def getOverflowIcon(): String | Blob | File = js.native
  /**
    * Gets the value of the <Titanium.UI.Toolbar.subtitle> property.
    * @deprecated Access <Titanium.UI.Toolbar.subtitle> instead.
    */
  def getSubtitle(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.Toolbar.subtitleTextColor> property.
    * @deprecated Access <Titanium.UI.Toolbar.subtitleTextColor> instead.
    */
  def getSubtitleTextColor(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.Toolbar.title> property.
    * @deprecated Access <Titanium.UI.Toolbar.title> instead.
    */
  def getTitle(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.Toolbar.titleTextColor> property.
    * @deprecated Access <Titanium.UI.Toolbar.titleTextColor> instead.
    */
  def getTitleTextColor(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.Toolbar.translucent> property.
    * @deprecated Access <Titanium.UI.Toolbar.translucent> instead.
    */
  def getTranslucent(): Boolean = js.native
  /**
    * Checks if the toolbar is currently hosting an expanded action view.
    */
  def hasExpandedActionView(): Boolean = js.native
  /**
    * Hides the overflow menu if there is one.
    */
  def hideOverflowMenu(): Unit = js.native
  /**
    * Checks if the toolbar is currently hosting an expanded action view.
    */
  def isOverflowMenuShowing(): Boolean = js.native
  /**
    * Sets the value of the <Titanium.UI.Toolbar.barColor> property.
    * @deprecated Set the value using <Titanium.UI.Toolbar.barColor> instead.
    */
  def setBarColor(barColor: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.Toolbar.contentInsetEndWithActions> property.
    * @deprecated Set the value using <Titanium.UI.Toolbar.contentInsetEndWithActions> instead.
    */
  def setContentInsetEndWithActions(contentInsetEndWithActions: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.Toolbar.contentInsetStartWithNavigation> property.
    * @deprecated Set the value using <Titanium.UI.Toolbar.contentInsetStartWithNavigation> instead.
    */
  def setContentInsetStartWithNavigation(contentInsetStartWithNavigation: Double): Unit = js.native
  /**
    * Sets the content margins of the toolbar
    */
  def setContentInsetsAbsolute(insetLeft: Double, insetRight: Double): Unit = js.native
  /**
    * Sets the content margins relative to the layout direction
    */
  def setContentInsetsRelative(insetStart: Double, insetEnd: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.Toolbar.items> property.
    * @deprecated Set the value using <Titanium.UI.Toolbar.items> instead.
    */
  def setItems(items: js.Array[View]): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.Toolbar.logo> property.
    * @deprecated Set the value using <Titanium.UI.Toolbar.logo> instead.
    */
  def setLogo(logo: String): Unit = js.native
  def setLogo(logo: Blob): Unit = js.native
  def setLogo(logo: File): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.Toolbar.navigationIcon> property.
    * @deprecated Set the value using <Titanium.UI.Toolbar.navigationIcon> instead.
    */
  def setNavigationIcon(navigationIcon: String): Unit = js.native
  def setNavigationIcon(navigationIcon: Blob): Unit = js.native
  def setNavigationIcon(navigationIcon: File): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.Toolbar.overflowIcon> property.
    * @deprecated Set the value using <Titanium.UI.Toolbar.overflowIcon> instead.
    */
  def setOverflowIcon(overflowIcon: String): Unit = js.native
  def setOverflowIcon(overflowIcon: Blob): Unit = js.native
  def setOverflowIcon(overflowIcon: File): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.Toolbar.subtitle> property.
    * @deprecated Set the value using <Titanium.UI.Toolbar.subtitle> instead.
    */
  def setSubtitle(subtitle: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.Toolbar.subtitleTextColor> property.
    * @deprecated Set the value using <Titanium.UI.Toolbar.subtitleTextColor> instead.
    */
  def setSubtitleTextColor(subtitleTextColor: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.Toolbar.title> property.
    * @deprecated Set the value using <Titanium.UI.Toolbar.title> instead.
    */
  def setTitle(title: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.Toolbar.titleTextColor> property.
    * @deprecated Set the value using <Titanium.UI.Toolbar.titleTextColor> instead.
    */
  def setTitleTextColor(titleTextColor: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.Toolbar.translucent> property.
    * @deprecated Set the value using <Titanium.UI.Toolbar.translucent> instead.
    */
  def setTranslucent(translucent: Boolean): Unit = js.native
  /**
    * Shows the overflow menu if there is one
    */
  def showOverflowMenu(): Unit = js.native
}

