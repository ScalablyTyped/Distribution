package typings.titanium.Titanium.UI

import typings.titanium.AnimatedOptions
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
		 * A `NavigationWindow` implements a specialized view that manages the navigation of hierarchical
		 * content.
		 */
@JSGlobal("Titanium.UI.NavigationWindow")
@js.native
class NavigationWindow () extends Window {
  /**
  			 * Window to add to this navigation window.
  			 */
  var window: Window = js.native
  /**
  			 * Closes a window and removes it from the navigation window.
  			 */
  def closeWindow(window: Window, options: js.Any): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_androidback(name: androidback, event: NavigationWindowAndroidbackEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_androidcamera(name: androidcamera, event: NavigationWindowAndroidcameraEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_androidfocus(name: androidfocus, event: NavigationWindowAndroidfocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_androidsearch(name: androidsearch, event: NavigationWindowAndroidsearchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_androidvoldown(name: androidvoldown, event: NavigationWindowAndroidvoldownEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_androidvolup(name: androidvolup, event: NavigationWindowAndroidvolupEvent): Unit = js.native
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
  def fireEvent_longclick(name: longclick, event: NavigationWindowLongclickEvent): Unit = js.native
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
  			 * Gets the value of the <Titanium.UI.NavigationWindow.window> property.
  			 * @deprecated Access <Titanium.UI.NavigationWindow.window> instead.
  			 */
  def getWindow(): Window = js.native
  /**
  			 * Opens a window within the navigation window.
  			 */
  def openWindow(window: Window): Unit = js.native
  def openWindow(window: Window, options: AnimatedOptions): Unit = js.native
  /**
  			 * Closes all windows that are currently opened inside the navigation window.
  			 */
  def popToRootWindow(): Unit = js.native
  def popToRootWindow(options: AnimatedOptions): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.window> property.
  			 * @deprecated Set the value using <Titanium.UI.NavigationWindow.window> instead.
  			 */
  def setWindow(window: Window): Unit = js.native
}

