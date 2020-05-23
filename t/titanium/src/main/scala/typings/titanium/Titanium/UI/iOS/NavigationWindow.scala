package typings.titanium.Titanium.UI.iOS

import typings.titanium.Titanium.UI.Window
import typings.titanium.titaniumStrings.blur
import typings.titanium.titaniumStrings.click
import typings.titanium.titaniumStrings.close
import typings.titanium.titaniumStrings.dblclick
import typings.titanium.titaniumStrings.doubletap
import typings.titanium.titaniumStrings.focus
import typings.titanium.titaniumStrings.keypressed
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
  * A `NavigationWindow` implements a specialized view that manages the navigation of hierarchical
  * content.
  * @deprecated Use [Titanium.UI.NavigationWindow](Titanium.UI.NavigationWindow) instead.
  */
@js.native
trait NavigationWindow extends Window {
  /**
    * Window to add to this navigation window.
    */
  var window: Window = js.native
  /**
    * Closes a window and removes it from the navigation window.
    */
  def closeWindow(window: Window, options: js.Any): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_blur(name: blur, event: NavigationWindowBlurEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: NavigationWindowClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_close(name: close, event: NavigationWindowCloseEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: NavigationWindowDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: NavigationWindowDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: NavigationWindowFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: NavigationWindowKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: NavigationWindowLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_open(name: open, event: NavigationWindowOpenEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: NavigationWindowPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: NavigationWindowPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: NavigationWindowSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: NavigationWindowSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: NavigationWindowTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: NavigationWindowTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: NavigationWindowTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: NavigationWindowTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: NavigationWindowTwofingertapEvent): Unit = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.NavigationWindow.window> property.
    * @deprecated Access <Titanium.UI.iOS.NavigationWindow.window> instead.
    */
  def getWindow(): Window = js.native
  /**
    * Opens a window within the navigation window.
    */
  def openWindow(window: Window, options: js.Any): Unit = js.native
  /**
    * Closes all windows that are currently opened inside the navigation window.
    */
  def popToRootWindow(options: js.Any): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.NavigationWindow.window> property.
    * @deprecated Set the value using <Titanium.UI.iOS.NavigationWindow.window> instead.
    */
  def setWindow(window: Window): Unit = js.native
}

