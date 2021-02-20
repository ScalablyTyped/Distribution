package typings.winrtUwp.global.Windows.UI

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Foundation.Size
import typings.winrtUwp.Windows.UI.Popups.Placement
import typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewState
import typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewSwitchingOptions
import typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewWindowingMode
import typings.winrtUwp.Windows.UI.ViewManagement.ViewSizePreference
import typings.winrtUwp.winrtUwpStrings.projectiondisplayavailablechanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides support for handling and managing the various views associated with the active Universal Windows Platform (UWP) app. */
object ViewManagement {
  
  /** Provides access to the high contrast accessibility settings. */
  @JSGlobal("Windows.UI.ViewManagement.AccessibilitySettings")
  @js.native
  /** Initializes a new AccessibilitySettings object. */
  class AccessibilitySettings ()
    extends typings.winrtUwp.Windows.UI.ViewManagement.AccessibilitySettings
  
  @JSGlobal("Windows.UI.ViewManagement.ActivationViewSwitcher")
  @js.native
  abstract class ActivationViewSwitcher ()
    extends typings.winrtUwp.Windows.UI.ViewManagement.ActivationViewSwitcher
  
  /** Represents the active application view and associated states and behaviors. */
  @JSGlobal("Windows.UI.ViewManagement.ApplicationView")
  @js.native
  abstract class ApplicationView ()
    extends typings.winrtUwp.Windows.UI.ViewManagement.ApplicationView
  object ApplicationView {
    
    @JSGlobal("Windows.UI.ViewManagement.ApplicationView")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets the view state and behavior settings of the active application.
      * @return An ApplicationView instance that can be used to get and set app display properties.
      */
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ApplicationView.getForCurrentView")
    @js.native
    def getForCurrentView(): typings.winrtUwp.Windows.UI.ViewManagement.ApplicationView = js.native
    
    /** Gets or sets the size the app launches with if no view size is remembered by Windows. */
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ApplicationView.preferredLaunchViewSize")
    @js.native
    def preferredLaunchViewSize: Size = js.native
    @scala.inline
    def preferredLaunchViewSize_=(x: Size): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preferredLaunchViewSize")(x.asInstanceOf[js.Any])
    
    /** Gets or sets a value that indicates the windowing mode the app launches with. */
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ApplicationView.preferredLaunchWindowingMode")
    @js.native
    def preferredLaunchWindowingMode: ApplicationViewWindowingMode = js.native
    @scala.inline
    def preferredLaunchWindowingMode_=(x: ApplicationViewWindowingMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preferredLaunchWindowingMode")(x.asInstanceOf[js.Any])
    
    /** Indicates whether the app terminates when the last window is closed. */
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ApplicationView.terminateAppOnFinalViewClose")
    @js.native
    def terminateAppOnFinalViewClose: Boolean = js.native
    @scala.inline
    def terminateAppOnFinalViewClose_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("terminateAppOnFinalViewClose")(x.asInstanceOf[js.Any])
    
    /**
      * Attempts to unsnap a previously snapped app. This call will only succeed when the app is running in the foreground.
      * @return true if the app has been successfully unsnapped; false if the unsnap attempt failed.
      */
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ApplicationView.tryUnsnap")
    @js.native
    def tryUnsnap(): Boolean = js.native
    
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ApplicationView.tryUnsnapToFullscreen")
    @js.native
    def tryUnsnapToFullscreen: js.Any = js.native
    @scala.inline
    def tryUnsnapToFullscreen_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tryUnsnapToFullscreen")(x.asInstanceOf[js.Any])
    
    /* unmapped type */
    /** Gets the state of the current window (app view). */
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ApplicationView.value")
    @js.native
    def value: ApplicationViewState = js.native
    @scala.inline
    def value_=(x: ApplicationViewState): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
  }
  
  /** The bounds used by the framework to lay out the contents of a window (app view). */
  @JSGlobal("Windows.UI.ViewManagement.ApplicationViewBoundsMode")
  @js.native
  object ApplicationViewBoundsMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewBoundsMode with Double] = js.native
    
    /* 1 */ val useCoreWindow: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewBoundsMode.useCoreWindow with Double = js.native
    
    /* 0 */ val useVisible: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewBoundsMode.useVisible with Double = js.native
  }
  
  /** Contains the results of a window (app view) consolidation operation. */
  @JSGlobal("Windows.UI.ViewManagement.ApplicationViewConsolidatedEventArgs")
  @js.native
  abstract class ApplicationViewConsolidatedEventArgs ()
    extends typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewConsolidatedEventArgs
  
  /** Defines the set of display orientation modes for a window (app view). */
  @JSGlobal("Windows.UI.ViewManagement.ApplicationViewOrientation")
  @js.native
  object ApplicationViewOrientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewOrientation with Double
      ] = js.native
    
    /* 0 */ val landscape: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewOrientation.landscape with Double = js.native
    
    /* 1 */ val portrait: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewOrientation.portrait with Double = js.native
  }
  
  /** Specifies the set of app view state changes that can be handled. */
  @JSGlobal("Windows.UI.ViewManagement.ApplicationViewState")
  @js.native
  object ApplicationViewState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewState with Double] = js.native
    
    /* 1 */ val filled: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewState.filled with Double = js.native
    
    /* 0 */ val fullScreenLandscape: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewState.fullScreenLandscape with Double = js.native
    
    /* 3 */ val fullScreenPortrait: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewState.fullScreenPortrait with Double = js.native
    
    /* 2 */ val snapped: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewState.snapped with Double = js.native
  }
  
  /** Represents the app view switching behaviors for an app. */
  @JSGlobal("Windows.UI.ViewManagement.ApplicationViewSwitcher")
  @js.native
  abstract class ApplicationViewSwitcher ()
    extends typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewSwitcher
  object ApplicationViewSwitcher {
    
    @JSGlobal("Windows.UI.ViewManagement.ApplicationViewSwitcher")
    @js.native
    val ^ : js.Any = js.native
    
    /** Disables the primary window (app view) when the app is activated, showing the most recently displayed window instead. */
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ApplicationViewSwitcher.disableShowingMainViewOnActivation")
    @js.native
    def disableShowingMainViewOnActivation(): Unit = js.native
    
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ApplicationViewSwitcher.disableSystemViewActivationPolicy")
    @js.native
    def disableSystemViewActivationPolicy: js.Any = js.native
    @scala.inline
    def disableSystemViewActivationPolicy_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableSystemViewActivationPolicy")(x.asInstanceOf[js.Any])
    
    /* unmapped type */
    /**
      * Prepares your app to visually transition between two windows with a custom animation.
      * @param toViewId The ID of the window from which your app is transitioning.
      * @param fromViewId The ID of the window to which your app is transitioning.
      * @param options Enumeration value that specifies thw view switching behaviors.
      * @return Asynchronously returns true if the call succeeds; false if it does not.
      */
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ApplicationViewSwitcher.prepareForCustomAnimatedSwitchAsync")
    @js.native
    def prepareForCustomAnimatedSwitchAsync(toViewId: Double, fromViewId: Double, options: ApplicationViewSwitchingOptions): IPromiseWithIAsyncOperation[Boolean] = js.native
    
    /**
      * Visually replaces the calling window (app view) with a specified window.
      * @param toViewId The ID of the window under preparation for display.
      * @param fromViewId The ID of the calling, currently displayed window.
      * @return The asynchronous results of the operation. Use this to determine when the async call is complete.
      */
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ApplicationViewSwitcher.switchAsync")
    @js.native
    def switchAsync(toViewId: Double, fromViewId: Double): IPromiseWithIAsyncAction = js.native
    /**
      * Visually replaces the calling window (app view) with a specified window.
      * @param toViewId The ID of the window under preparation for display.
      * @param fromViewId The ID of the calling, currently displayed window.
      * @param options Options for the display transition behaviors.
      * @return The asynchronous results of the operation. Use this to determine when the async call is complete.
      */
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ApplicationViewSwitcher.switchAsync")
    @js.native
    def switchAsync(toViewId: Double, fromViewId: Double, options: ApplicationViewSwitchingOptions): IPromiseWithIAsyncAction = js.native
    /**
      * Visually replaces the calling window (app view) with a specified window.
      * @param viewId The ID of the window under preparation for display.
      * @return The asynchronous results of the operation. Use this to determine when the async call is complete.
      */
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ApplicationViewSwitcher.switchAsync")
    @js.native
    def switchAsync(viewId: Double): IPromiseWithIAsyncAction = js.native
    
    /**
      * Displays another window (app view) for the app on the screen, adjacent to the original window
      * @param viewId The ID of the new window to display.
      * @return Asynchronously returns true if the call succeeds; false if it does not.
      */
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ApplicationViewSwitcher.tryShowAsStandaloneAsync")
    @js.native
    def tryShowAsStandaloneAsync(viewId: Double): IPromiseWithIAsyncOperation[Boolean] = js.native
    /**
      * Displays another window (app view) for the app on the screen, adjacent to the original window
      * @param viewId The ID of the new window to display.
      * @param sizePreference The preferred general sizing of the new window.
      * @return Asynchronously returns true if the call succeeds; false if it does not.
      */
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ApplicationViewSwitcher.tryShowAsStandaloneAsync")
    @js.native
    def tryShowAsStandaloneAsync(viewId: Double, sizePreference: ViewSizePreference): IPromiseWithIAsyncOperation[Boolean] = js.native
    /**
      * Displays another window (app view) for the app on the screen, adjacent to the original window.
      * @param viewId The ID of the new window to display.
      * @param sizePreference The preferred general sizing of the new window.
      * @param anchorViewId The ID of the calling (anchor) window.
      * @param anchorSizePreference The preferred new general sizing of the calling window if this call succeeds.
      * @return Asynchronously returns true if the call succeeds; false if it does not.
      */
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ApplicationViewSwitcher.tryShowAsStandaloneAsync")
    @js.native
    def tryShowAsStandaloneAsync(
      viewId: Double,
      sizePreference: ViewSizePreference,
      anchorViewId: Double,
      anchorSizePreference: ViewSizePreference
    ): IPromiseWithIAsyncOperation[Boolean] = js.native
  }
  
  /** Defines a set of options for window (app view) switching behaviors. */
  @JSGlobal("Windows.UI.ViewManagement.ApplicationViewSwitchingOptions")
  @js.native
  object ApplicationViewSwitchingOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewSwitchingOptions with Double
      ] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewSwitchingOptions.default with Double = js.native
    
    /* 2 */ val consolidateViews: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewSwitchingOptions.consolidateViews with Double = js.native
    
    /* 1 */ val skipAnimation: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewSwitchingOptions.skipAnimation with Double = js.native
  }
  
  /** Represents the title bar of an app. */
  @JSGlobal("Windows.UI.ViewManagement.ApplicationViewTitleBar")
  @js.native
  abstract class ApplicationViewTitleBar ()
    extends typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewTitleBar
  
  @JSGlobal("Windows.UI.ViewManagement.ApplicationViewTransferContext")
  @js.native
  abstract class ApplicationViewTransferContext ()
    extends typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewTransferContext
  object ApplicationViewTransferContext {
    
    @JSGlobal("Windows.UI.ViewManagement.ApplicationViewTransferContext")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ApplicationViewTransferContext.dataPackageFormatId")
    @js.native
    def dataPackageFormatId: js.Any = js.native
    @scala.inline
    def dataPackageFormatId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataPackageFormatId")(x.asInstanceOf[js.Any])
  }
  
  /** Defines constants that specify whether the app window is auto-sized, full-screen, or set to a specific size on launch. */
  @JSGlobal("Windows.UI.ViewManagement.ApplicationViewWindowingMode")
  @js.native
  object ApplicationViewWindowingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewWindowingMode with Double
      ] = js.native
    
    /* 0 */ val auto: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewWindowingMode.auto with Double = js.native
    
    /* 2 */ val fullScreen: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewWindowingMode.fullScreen with Double = js.native
    
    /* 1 */ val preferredLaunchViewSize: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewWindowingMode.preferredLaunchViewSize with Double = js.native
  }
  
  /** Defines constants that specify how the app responds to edge gestures when in full-screen mode. */
  @JSGlobal("Windows.UI.ViewManagement.FullScreenSystemOverlayMode")
  @js.native
  object FullScreenSystemOverlayMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.UI.ViewManagement.FullScreenSystemOverlayMode with Double
      ] = js.native
    
    /* 1 */ val minimal: typings.winrtUwp.Windows.UI.ViewManagement.FullScreenSystemOverlayMode.minimal with Double = js.native
    
    /* 0 */ val standard: typings.winrtUwp.Windows.UI.ViewManagement.FullScreenSystemOverlayMode.standard with Double = js.native
  }
  
  /** Defines the set of directional preferences for the user interface presented by the app view. */
  @JSGlobal("Windows.UI.ViewManagement.HandPreference")
  @js.native
  object HandPreference extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.ViewManagement.HandPreference with Double] = js.native
    
    /* 0 */ val leftHanded: typings.winrtUwp.Windows.UI.ViewManagement.HandPreference.leftHanded with Double = js.native
    
    /* 1 */ val rightHanded: typings.winrtUwp.Windows.UI.ViewManagement.HandPreference.rightHanded with Double = js.native
  }
  
  /** Enables an app to register to receive notifications when the input pane is about to be displayed or hidden, and to determine which portion of the application's window is being obscured by the input pane. */
  @JSGlobal("Windows.UI.ViewManagement.InputPane")
  @js.native
  abstract class InputPane ()
    extends typings.winrtUwp.Windows.UI.ViewManagement.InputPane
  object InputPane {
    
    /**
      * Gets the InputPane object associated with the application window that is currently visible.
      * @return The input pane.
      */
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.InputPane.getForCurrentView")
    @js.native
    def getForCurrentView(): typings.winrtUwp.Windows.UI.ViewManagement.InputPane = js.native
  }
  
  /** Provides data for the input pane Hiding and Showing events. */
  @JSGlobal("Windows.UI.ViewManagement.InputPaneVisibilityEventArgs")
  @js.native
  abstract class InputPaneVisibilityEventArgs ()
    extends typings.winrtUwp.Windows.UI.ViewManagement.InputPaneVisibilityEventArgs
  
  /** Defines a set of methods for managing the windows (app views) sent to secondary displays, such as projectors. */
  @JSGlobal("Windows.UI.ViewManagement.ProjectionManager")
  @js.native
  abstract class ProjectionManager ()
    extends typings.winrtUwp.Windows.UI.ViewManagement.ProjectionManager
  object ProjectionManager {
    
    @JSGlobal("Windows.UI.ViewManagement.ProjectionManager")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ProjectionManager.addEventListener")
    @js.native
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ProjectionManager.addEventListener")
    @js.native
    def addEventListener_projectiondisplayavailablechanged(`type`: projectiondisplayavailablechanged, listener: EventHandler[_]): Unit = js.native
    
    /**
      * Returns a string that is used to enumerate device services.
      * @return A string that is used to enumerate device services.
      */
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ProjectionManager.getDeviceSelector")
    @js.native
    def getDeviceSelector(): String = js.native
    
    /** Occurs when a projector or other secondary display becomes available or unavailable. */
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ProjectionManager.onprojectiondisplayavailablechanged")
    @js.native
    def onprojectiondisplayavailablechanged: EventHandler[js.Any] = js.native
    @scala.inline
    def onprojectiondisplayavailablechanged_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onprojectiondisplayavailablechanged")(x.asInstanceOf[js.Any])
    
    /** Gets whether or not a projection display is available to use. */
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ProjectionManager.projectionDisplayAvailable")
    @js.native
    def projectionDisplayAvailable: Boolean = js.native
    @scala.inline
    def projectionDisplayAvailable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("projectionDisplayAvailable")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ProjectionManager.removeEventListener")
    @js.native
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ProjectionManager.removeEventListener")
    @js.native
    def removeEventListener_projectiondisplayavailablechanged(`type`: projectiondisplayavailablechanged, listener: EventHandler[_]): Unit = js.native
    
    /**
      * Makes a request to asynchronously sends a window (app view) to the projector or other secondary display.
      * @param projectionViewId The new ID of the window to be displayed by the projector or other secondary display.
      * @param anchorViewId The ID of the original window before projection.
      * @param selection The area to one side of which the flyout is displayed.
      * @return true if projection started; otherwise, false.
      */
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ProjectionManager.requestStartProjectingAsync")
    @js.native
    def requestStartProjectingAsync(projectionViewId: Double, anchorViewId: Double, selection: Rect): IPromiseWithIAsyncOperation[Boolean] = js.native
    /**
      * Makes a request to asynchronously sends a window (app view) to the projector or other secondary display with the specified preferred placement.
      * @param projectionViewId The new ID of the window to be displayed by the projector or other secondary display.
      * @param anchorViewId The ID of the original window before projection.
      * @param selection The area to one side of which the flyout is displayed.
      * @param prefferedPlacement The side of the rectangle where the flyout should appear.
      * @return true if projection started; otherwise, false.
      */
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ProjectionManager.requestStartProjectingAsync")
    @js.native
    def requestStartProjectingAsync(projectionViewId: Double, anchorViewId: Double, selection: Rect, prefferedPlacement: Placement): IPromiseWithIAsyncOperation[Boolean] = js.native
    
    /**
      * Asynchronously sends a window (app view) to the projector or other secondary display.
      * @param projectionViewId The new ID of the window to be displayed by the projector or other secondary display.
      * @param anchorViewId The ID of the original window before projection.
      * @return The asynchronous results of the operation. Use this to determine when the async call is complete.
      */
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ProjectionManager.startProjectingAsync")
    @js.native
    def startProjectingAsync(projectionViewId: Double, anchorViewId: Double): IPromiseWithIAsyncAction = js.native
    /**
      * Asynchronously sends a window (app view) to the projector or other secondary display, and provides info about the display.
      * @param projectionViewId The new ID of the window to be displayed by the projector or other secondary display.
      * @param anchorViewId The ID of the original window before projection.
      * @param displayDeviceInfo Information about the display device.
      * @return The asynchronous results of the operation. Use this to determine when the async call is complete.
      */
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ProjectionManager.startProjectingAsync")
    @js.native
    def startProjectingAsync(projectionViewId: Double, anchorViewId: Double, displayDeviceInfo: DeviceInformation): IPromiseWithIAsyncAction = js.native
    
    /**
      * Asynchronously hides a window (app view) displayed by a projector or other secondary display.
      * @param projectionViewId The ID of the window currently displayed by the projector or other secondary display.
      * @param anchorViewId The ID of the original window before projection.
      * @return The asynchronous results of the operation. Use this to determine when the async call is complete.
      */
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ProjectionManager.stopProjectingAsync")
    @js.native
    def stopProjectingAsync(projectionViewId: Double, anchorViewId: Double): IPromiseWithIAsyncAction = js.native
    
    /**
      * Asynchronously swaps the calling window (app view) with the window displayed on the projector or other secondary display. The result is that the calling window is displayed on the projector, and the formerly projected window is displayed on the device screen.
      * @param projectionViewId The ID of the window currently displayed by the projector.
      * @param anchorViewId The ID of the window to swap with the projected window.
      * @return The asynchronous results of the operation. Use this to determine when the async call is complete.
      */
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.ProjectionManager.swapDisplaysForViewsAsync")
    @js.native
    def swapDisplaysForViewsAsync(projectionViewId: Double, anchorViewId: Double): IPromiseWithIAsyncAction = js.native
  }
  
  /** Defines constants that specify known system color values. */
  @JSGlobal("Windows.UI.ViewManagement.UIColorType")
  @js.native
  object UIColorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.ViewManagement.UIColorType with Double] = js.native
    
    /* 5 */ val accent: typings.winrtUwp.Windows.UI.ViewManagement.UIColorType.accent with Double = js.native
    
    /* 4 */ val accentDark1: typings.winrtUwp.Windows.UI.ViewManagement.UIColorType.accentDark1 with Double = js.native
    
    /* 3 */ val accentDark2: typings.winrtUwp.Windows.UI.ViewManagement.UIColorType.accentDark2 with Double = js.native
    
    /* 2 */ val accentDark3: typings.winrtUwp.Windows.UI.ViewManagement.UIColorType.accentDark3 with Double = js.native
    
    /* 6 */ val accentLight1: typings.winrtUwp.Windows.UI.ViewManagement.UIColorType.accentLight1 with Double = js.native
    
    /* 7 */ val accentLight2: typings.winrtUwp.Windows.UI.ViewManagement.UIColorType.accentLight2 with Double = js.native
    
    /* 8 */ val accentLight3: typings.winrtUwp.Windows.UI.ViewManagement.UIColorType.accentLight3 with Double = js.native
    
    /* 0 */ val background: typings.winrtUwp.Windows.UI.ViewManagement.UIColorType.background with Double = js.native
    
    /* 9 */ val complement: typings.winrtUwp.Windows.UI.ViewManagement.UIColorType.complement with Double = js.native
    
    /* 1 */ val foreground: typings.winrtUwp.Windows.UI.ViewManagement.UIColorType.foreground with Double = js.native
  }
  
  /** Defines the set of user interface element types. */
  @JSGlobal("Windows.UI.ViewManagement.UIElementType")
  @js.native
  object UIElementType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.ViewManagement.UIElementType with Double] = js.native
    
    /* 0 */ val activeCaption: typings.winrtUwp.Windows.UI.ViewManagement.UIElementType.activeCaption with Double = js.native
    
    /* 1 */ val background: typings.winrtUwp.Windows.UI.ViewManagement.UIElementType.background with Double = js.native
    
    /* 2 */ val buttonFace: typings.winrtUwp.Windows.UI.ViewManagement.UIElementType.buttonFace with Double = js.native
    
    /* 3 */ val buttonText: typings.winrtUwp.Windows.UI.ViewManagement.UIElementType.buttonText with Double = js.native
    
    /* 4 */ val captionText: typings.winrtUwp.Windows.UI.ViewManagement.UIElementType.captionText with Double = js.native
    
    /* 5 */ val grayText: typings.winrtUwp.Windows.UI.ViewManagement.UIElementType.grayText with Double = js.native
    
    /* 6 */ val highlight: typings.winrtUwp.Windows.UI.ViewManagement.UIElementType.highlight with Double = js.native
    
    /* 7 */ val highlightText: typings.winrtUwp.Windows.UI.ViewManagement.UIElementType.highlightText with Double = js.native
    
    /* 8 */ val hotlight: typings.winrtUwp.Windows.UI.ViewManagement.UIElementType.hotlight with Double = js.native
    
    /* 9 */ val inactiveCaption: typings.winrtUwp.Windows.UI.ViewManagement.UIElementType.inactiveCaption with Double = js.native
    
    /* 10 */ val inactiveCaptionText: typings.winrtUwp.Windows.UI.ViewManagement.UIElementType.inactiveCaptionText with Double = js.native
    
    /* 11 */ val window: typings.winrtUwp.Windows.UI.ViewManagement.UIElementType.window with Double = js.native
    
    /* 12 */ val windowText: typings.winrtUwp.Windows.UI.ViewManagement.UIElementType.windowText with Double = js.native
  }
  
  /** Contains a set of common app user interface settings and operations. */
  @JSGlobal("Windows.UI.ViewManagement.UISettings")
  @js.native
  /** Creates a new default instance of the UISettings class. */
  class UISettings ()
    extends typings.winrtUwp.Windows.UI.ViewManagement.UISettings
  
  /** Represents UI states and behaviors associated with the device mode (Tablet or Desktop) and input device type. */
  @JSGlobal("Windows.UI.ViewManagement.UIViewSettings")
  @js.native
  abstract class UIViewSettings ()
    extends typings.winrtUwp.Windows.UI.ViewManagement.UIViewSettings
  object UIViewSettings {
    
    /**
      * Gets the UI states and behaviors associated with the device mode (Tablet or Desktop) for the active app.
      * @return A UIViewSettings instance that can be used to get and set view settings properties.
      */
    /* static member */
    @JSGlobal("Windows.UI.ViewManagement.UIViewSettings.getForCurrentView")
    @js.native
    def getForCurrentView(): typings.winrtUwp.Windows.UI.ViewManagement.UIViewSettings = js.native
  }
  
  /** Specifies the UI view, optimized for input device type. */
  @JSGlobal("Windows.UI.ViewManagement.UserInteractionMode")
  @js.native
  object UserInteractionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.ViewManagement.UserInteractionMode with Double] = js.native
    
    /* 0 */ val mouse: typings.winrtUwp.Windows.UI.ViewManagement.UserInteractionMode.mouse with Double = js.native
    
    /* 1 */ val touch: typings.winrtUwp.Windows.UI.ViewManagement.UserInteractionMode.touch with Double = js.native
  }
  
  /** Defines the set of possible general window (app view) size preferences. */
  @JSGlobal("Windows.UI.ViewManagement.ViewSizePreference")
  @js.native
  object ViewSizePreference extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.ViewManagement.ViewSizePreference with Double] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.UI.ViewManagement.ViewSizePreference.default with Double = js.native
    
    /* 2 */ val useHalf: typings.winrtUwp.Windows.UI.ViewManagement.ViewSizePreference.useHalf with Double = js.native
    
    /* 1 */ val useLess: typings.winrtUwp.Windows.UI.ViewManagement.ViewSizePreference.useLess with Double = js.native
    
    /* 4 */ val useMinimum: typings.winrtUwp.Windows.UI.ViewManagement.ViewSizePreference.useMinimum with Double = js.native
    
    /* 3 */ val useMore: typings.winrtUwp.Windows.UI.ViewManagement.ViewSizePreference.useMore with Double = js.native
    
    /* 5 */ val useNone: typings.winrtUwp.Windows.UI.ViewManagement.ViewSizePreference.useNone with Double = js.native
  }
}
