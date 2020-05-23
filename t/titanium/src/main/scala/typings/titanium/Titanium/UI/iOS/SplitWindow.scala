package typings.titanium.Titanium.UI.iOS

import typings.titanium.AnimatedOptions
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
  * A SplitWindow is a window that manages the presentation of two side-by-side view
  * controllers.
  */
@js.native
trait SplitWindow extends Window {
  /**
    * Window for the detail view section of the SplitWindow.
    */
  var detailView: Window = js.native
  /**
    * Determines the width of the `masterView` in landscape mode.
    */
  var landscapeSplit: Double = js.native
  /**
    * Determines whether to show the master view is overlayed in portrait orientation.
    */
  var masterIsOverlayed: Boolean = js.native
  /**
    * Window for the master view section of the SplitWindow.
    */
  var masterView: Window = js.native
  /**
    * Determines whether to show the master view or hide.
    */
  var masterViewVisible: Boolean = js.native
  /**
    * Determines the width of the `masterView` in portrait mode.
    */
  var portraitSplit: Double = js.native
  /**
    * Determines whether to show the master view in portrait orientation.
    */
  var showMasterInPortrait: Boolean = js.native
  @JSName("fireEvent")
  def fireEvent_blur(name: blur, event: SplitWindowBlurEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: SplitWindowClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_close(name: close, event: SplitWindowCloseEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: SplitWindowDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: SplitWindowDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: SplitWindowFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: SplitWindowKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: SplitWindowLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_open(name: open, event: SplitWindowOpenEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: SplitWindowPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: SplitWindowPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: SplitWindowSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: SplitWindowSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: SplitWindowTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: SplitWindowTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: SplitWindowTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: SplitWindowTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: SplitWindowTwofingertapEvent): Unit = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.SplitWindow.detailView> property.
    * @deprecated Access <Titanium.UI.iOS.SplitWindow.detailView> instead.
    */
  def getDetailView(): Window = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.SplitWindow.landscapeSplit> property.
    * @deprecated Access <Titanium.UI.iOS.SplitWindow.landscapeSplit> instead.
    */
  def getLandscapeSplit(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.SplitWindow.masterIsOverlayed> property.
    * @deprecated Access <Titanium.UI.iOS.SplitWindow.masterIsOverlayed> instead.
    */
  def getMasterIsOverlayed(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.SplitWindow.masterView> property.
    * @deprecated Access <Titanium.UI.iOS.SplitWindow.masterView> instead.
    */
  def getMasterView(): Window = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.SplitWindow.masterViewVisible> property.
    * @deprecated Access <Titanium.UI.iOS.SplitWindow.masterViewVisible> instead.
    */
  def getMasterViewVisible(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.SplitWindow.portraitSplit> property.
    * @deprecated Access <Titanium.UI.iOS.SplitWindow.portraitSplit> instead.
    */
  def getPortraitSplit(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.SplitWindow.showMasterInPortrait> property.
    * @deprecated Access <Titanium.UI.iOS.SplitWindow.showMasterInPortrait> instead.
    */
  def getShowMasterInPortrait(): Boolean = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.SplitWindow.detailView> property.
    * @deprecated Set the value using <Titanium.UI.iOS.SplitWindow.detailView> instead.
    */
  def setDetailView(detailView: Window): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.SplitWindow.landscapeSplit> property.
    * @deprecated Set the value using <Titanium.UI.iOS.SplitWindow.landscapeSplit> instead.
    */
  def setLandscapeSplit(landscapeSplit: Double): Unit = js.native
  /**
    * Sets the value of the [masterIsOverlayed](Titanium.UI.iOS.SplitWindow.masterIsOverlayed) property.
    */
  def setMasterIsOverlayed(masterIsOverlayed: Boolean): Unit = js.native
  def setMasterIsOverlayed(masterIsOverlayed: Boolean, options: AnimatedOptions): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.SplitWindow.masterView> property.
    * @deprecated Set the value using <Titanium.UI.iOS.SplitWindow.masterView> instead.
    */
  def setMasterView(masterView: Window): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.SplitWindow.masterViewVisible> property.
    * @deprecated Set the value using <Titanium.UI.iOS.SplitWindow.masterViewVisible> instead.
    */
  def setMasterViewVisible(masterViewVisible: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.SplitWindow.portraitSplit> property.
    * @deprecated Set the value using <Titanium.UI.iOS.SplitWindow.portraitSplit> instead.
    */
  def setPortraitSplit(portraitSplit: Double): Unit = js.native
  /**
    * Sets the value of the [showMasterInPortrait](Titanium.UI.iOS.SplitWindow.showMasterInPortrait) property.
    */
  def setShowMasterInPortrait(showMasterInPortrait: Boolean): Unit = js.native
  def setShowMasterInPortrait(showMasterInPortrait: Boolean, options: AnimatedOptions): Unit = js.native
}

