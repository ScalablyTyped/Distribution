package typings.winrtUwp.Windows.UI.ViewManagement

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Foundation.Size
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.consolidated
import typings.winrtUwp.winrtUwpStrings.visibleboundschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the active application view and associated states and behaviors. */
@js.native
trait ApplicationView extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_consolidated(
    `type`: consolidated,
    listener: TypedEventHandler[ApplicationView, ApplicationViewConsolidatedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_visibleboundschanged(`type`: visibleboundschanged, listener: TypedEventHandler[ApplicationView, _]): Unit = js.native
  
  /** Gets whether the current window (app view) is adjacent to the left edge of the screen, whether the window is full-screen or docked. */
  var adjacentToLeftDisplayEdge: Boolean = js.native
  
  /** Gets whether the current window (app view) is adjacent to the right edge of the screen, whether the window is full-screen or docked. */
  var adjacentToRightDisplayEdge: Boolean = js.native
  
  /** Gets a value that indicates the bounds used by the framework to lay out the contents of the window (app view). */
  var desiredBoundsMode: ApplicationViewBoundsMode = js.native
  
  /** Takes the app out of full-screen mode. */
  def exitFullScreenMode(): Unit = js.native
  
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
  def onconsolidated(ev: ApplicationViewConsolidatedEventArgs with WinRTEvent[ApplicationView]): Unit = js.native
  /** Occurs when the window is removed from the list of recently used apps, or if the user executes a close gesture on it. */
  @JSName("onconsolidated")
  var onconsolidated_Original: TypedEventHandler[ApplicationView, ApplicationViewConsolidatedEventArgs] = js.native
  
  /** This event is raised when the value of VisibleBounds changes, typically as a result of the status bar, app bar, or other chrome being shown or hidden. */
  def onvisibleboundschanged(ev: js.Any with WinRTEvent[ApplicationView]): Unit = js.native
  /** This event is raised when the value of VisibleBounds changes, typically as a result of the status bar, app bar, or other chrome being shown or hidden. */
  @JSName("onvisibleboundschanged")
  var onvisibleboundschanged_Original: TypedEventHandler[ApplicationView, _] = js.native
  
  /** Gets the current orientation (landscape or portrait) of the window (app view) with respect to the display. */
  var orientation: ApplicationViewOrientation = js.native
  
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
  
  /** Gets or sets a value indicating whether or not system overlays (such as overlay applications or the soft steering wheel) should be shown. */
  var suppressSystemOverlays: Boolean = js.native
  
  /** Gets or sets the displayed title of the window. */
  var title: String = js.native
  
  /** Gets the title bar of the app. */
  var titleBar: ApplicationViewTitleBar = js.native
  
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
  
  /** Gets the visible region of the window (app view). The visible region is the region not occluded by chrome such as the status bar and app bar. */
  var visibleBounds: Rect = js.native
}
