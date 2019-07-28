package typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.Rect
import typings.winrtDashUwp.WindowsNs.FoundationNs.Size
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.consolidated
import typings.winrtDashUwp.winrtDashUwpStrings.visibleboundschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the active application view and associated states and behaviors. */
@JSGlobal("Windows.UI.ViewManagement.ApplicationView")
@js.native
abstract class ApplicationView () extends js.Object {
  /** Gets whether the current window (app view) is adjacent to the left edge of the screen, whether the window is full-screen or docked. */
  var adjacentToLeftDisplayEdge: Boolean = js.native
  /** Gets whether the current window (app view) is adjacent to the right edge of the screen, whether the window is full-screen or docked. */
  var adjacentToRightDisplayEdge: Boolean = js.native
  /** Gets a value that indicates the bounds used by the framework to lay out the contents of the window (app view). */
  var desiredBoundsMode: ApplicationViewBoundsMode = js.native
  /** Gets or sets a value that indicates how an app in full-screen mode responds to edge swipe actions. */
  var fullScreenSystemOverlayMode: FullScreenSystemOverlayMode = js.native
  /** Gets the ID of the window (app view). */
  var id: Double = js.native
  /** Gets whether the window (app view) fills the entire screen. */
  var isFullScreen: Boolean = js.native
  var isFullScreenMode: js.Any = js.native
   /* unmapped type */ /** Gets whether the window (app view) is on the Windows lock screen. */
  var isOnLockScreen: Boolean = js.native
  /** Gets or sets whether screen capture is enabled for the window (app view). */
  var isScreenCaptureEnabled: Boolean = js.native
  /** Occurs when the window is removed from the list of recently used apps, or if the user executes a close gesture on it. */
  @JSName("onconsolidated")
  var onconsolidated_Original: TypedEventHandler[ApplicationView, ApplicationViewConsolidatedEventArgs] = js.native
  /** This event is raised when the value of VisibleBounds changes, typically as a result of the status bar, app bar, or other chrome being shown or hidden. */
  @JSName("onvisibleboundschanged")
  var onvisibleboundschanged_Original: TypedEventHandler[ApplicationView, _] = js.native
  /** Gets the current orientation (landscape or portrait) of the window (app view) with respect to the display. */
  var orientation: ApplicationViewOrientation = js.native
  /** Gets or sets a value indicating whether or not system overlays (such as overlay applications or the soft steering wheel) should be shown. */
  var suppressSystemOverlays: Boolean = js.native
  /** Gets or sets the displayed title of the window. */
  var title: String = js.native
  /** Gets the title bar of the app. */
  var titleBar: ApplicationViewTitleBar = js.native
  /** Gets the visible region of the window (app view). The visible region is the region not occluded by chrome such as the status bar and app bar. */
  var visibleBounds: Rect = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_consolidated(
    `type`: consolidated,
    listener: TypedEventHandler[ApplicationView, ApplicationViewConsolidatedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_visibleboundschanged(`type`: visibleboundschanged, listener: TypedEventHandler[ApplicationView, _]): Unit = js.native
  /** Takes the app out of full-screen mode. */
  def exitFullScreenMode(): Unit = js.native
  /** Occurs when the window is removed from the list of recently used apps, or if the user executes a close gesture on it. */
  def onconsolidated(ev: ApplicationViewConsolidatedEventArgs with WinRTEvent[ApplicationView]): Unit = js.native
  /** This event is raised when the value of VisibleBounds changes, typically as a result of the status bar, app bar, or other chrome being shown or hidden. */
  def onvisibleboundschanged(ev: js.Any with WinRTEvent[ApplicationView]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_consolidated(
    `type`: consolidated,
    listener: TypedEventHandler[ApplicationView, ApplicationViewConsolidatedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_visibleboundschanged(`type`: visibleboundschanged, listener: TypedEventHandler[ApplicationView, _]): Unit = js.native
  /**
    * Sets a value indicating the bounds used by the framework to lay out the contents of the window (app view).
    * @param boundsMode The bounds that the framework should use to lay out the contents of the window (app view).
    * @return true to confirm that the change to DesiredBoundsMode was successful; otherwise, false.
    */
  def setDesiredBoundsMode(boundsMode: ApplicationViewBoundsMode): Boolean = js.native
  /**
    * Sets the smallest size, in effective pixels, allowed for the app window.
    * @param minSize The smallest size allowed for the app window, or a Size whose height and width are both zero to use the system default minimum size.
    */
  def setPreferredMinSize(minSize: Size): Unit = js.native
  /** Shows system UI elements, like the title bar, over a full-screen app. */
  def showStandardSystemOverlays(): Unit = js.native
  /**
    * Attempts to place the app in full-screen mode.
    * @return true if the app is placed in full-screen mode; otherwise, false.
    */
  def tryEnterFullScreenMode(): Boolean = js.native
  /**
    * Attempts to change the size of the view to the specified size.
    * @param value The new size of the view.
    * @return true if the view is resized; otherwise, false.
    */
  def tryResizeView(value: Size): Boolean = js.native
}

/* static members */
@JSGlobal("Windows.UI.ViewManagement.ApplicationView")
@js.native
object ApplicationView extends js.Object {
  /** Gets or sets the size the app launches with if no view size is remembered by Windows. */
  var preferredLaunchViewSize: Size = js.native
  /** Gets or sets a value that indicates the windowing mode the app launches with. */
  var preferredLaunchWindowingMode: ApplicationViewWindowingMode = js.native
  /** Indicates whether the app terminates when the last window is closed. */
  var terminateAppOnFinalViewClose: Boolean = js.native
  var tryUnsnapToFullscreen: js.Any = js.native
   /* unmapped type */ /** Gets the state of the current window (app view). */
  var value: ApplicationViewState = js.native
  /**
    * Gets the view state and behavior settings of the active application.
    * @return An ApplicationView instance that can be used to get and set app display properties.
    */
  def getForCurrentView(): ApplicationView = js.native
  /**
    * Attempts to unsnap a previously snapped app. This call will only succeed when the app is running in the foreground.
    * @return true if the app has been successfully unsnapped; false if the unsnap attempt failed.
    */
  def tryUnsnap(): Boolean = js.native
}

