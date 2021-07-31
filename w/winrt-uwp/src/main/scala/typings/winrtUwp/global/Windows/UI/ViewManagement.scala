package typings.winrtUwp.global.Windows.UI

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Foundation.Size
import typings.winrtUwp.Windows.UI.Color
import typings.winrtUwp.Windows.UI.Popups.Placement
import typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewState
import typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewSwitchingOptions
import typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewWindowingMode
import typings.winrtUwp.Windows.UI.ViewManagement.UserInteractionMode
import typings.winrtUwp.Windows.UI.ViewManagement.ViewSizePreference
import typings.winrtUwp.winrtUwpStrings.projectiondisplayavailablechanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides support for handling and managing the various views associated with the active Universal Windows Platform (UWP) app. */
object ViewManagement {
  
  /** Provides access to the high contrast accessibility settings. */
  @JSGlobal("Windows.UI.ViewManagement.AccessibilitySettings")
  @js.native
  /** Initializes a new AccessibilitySettings object. */
  class AccessibilitySettings ()
    extends StObject
       with typings.winrtUwp.Windows.UI.ViewManagement.AccessibilitySettings
  
  @JSGlobal("Windows.UI.ViewManagement.ActivationViewSwitcher")
  @js.native
  abstract class ActivationViewSwitcher ()
    extends StObject
       with typings.winrtUwp.Windows.UI.ViewManagement.ActivationViewSwitcher
  
  /** Represents the active application view and associated states and behaviors. */
  @JSGlobal("Windows.UI.ViewManagement.ApplicationView")
  @js.native
  abstract class ApplicationView ()
    extends StObject
       with typings.winrtUwp.Windows.UI.ViewManagement.ApplicationView
  object ApplicationView {
    
    @JSGlobal("Windows.UI.ViewManagement.ApplicationView")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets the view state and behavior settings of the active application.
      * @return An ApplicationView instance that can be used to get and set app display properties.
      */
    /* static member */
    @scala.inline
    def getForCurrentView(): typings.winrtUwp.Windows.UI.ViewManagement.ApplicationView = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrtUwp.Windows.UI.ViewManagement.ApplicationView]
    
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
    @scala.inline
    def tryUnsnap(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("tryUnsnap")().asInstanceOf[Boolean]
    
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
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewBoundsMode & Double] = js.native
    
    /* 1 */ val useCoreWindow: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewBoundsMode.useCoreWindow & Double = js.native
    
    /* 0 */ val useVisible: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewBoundsMode.useVisible & Double = js.native
  }
  
  /** Contains the results of a window (app view) consolidation operation. */
  @JSGlobal("Windows.UI.ViewManagement.ApplicationViewConsolidatedEventArgs")
  @js.native
  abstract class ApplicationViewConsolidatedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewConsolidatedEventArgs {
    
    /** Indicates whether the window consolidation was user- or system-initiated. */
    /* CompleteClass */
    var isUserInitiated: Boolean = js.native
  }
  
  /** Defines the set of display orientation modes for a window (app view). */
  @JSGlobal("Windows.UI.ViewManagement.ApplicationViewOrientation")
  @js.native
  object ApplicationViewOrientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewOrientation & Double] = js.native
    
    /* 0 */ val landscape: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewOrientation.landscape & Double = js.native
    
    /* 1 */ val portrait: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewOrientation.portrait & Double = js.native
  }
  
  /** Specifies the set of app view state changes that can be handled. */
  @JSGlobal("Windows.UI.ViewManagement.ApplicationViewState")
  @js.native
  object ApplicationViewState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewState & Double] = js.native
    
    /* 1 */ val filled: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewState.filled & Double = js.native
    
    /* 0 */ val fullScreenLandscape: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewState.fullScreenLandscape & Double = js.native
    
    /* 3 */ val fullScreenPortrait: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewState.fullScreenPortrait & Double = js.native
    
    /* 2 */ val snapped: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewState.snapped & Double = js.native
  }
  
  /** Represents the app view switching behaviors for an app. */
  @JSGlobal("Windows.UI.ViewManagement.ApplicationViewSwitcher")
  @js.native
  abstract class ApplicationViewSwitcher ()
    extends StObject
       with typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewSwitcher
  object ApplicationViewSwitcher {
    
    @JSGlobal("Windows.UI.ViewManagement.ApplicationViewSwitcher")
    @js.native
    val ^ : js.Any = js.native
    
    /** Disables the primary window (app view) when the app is activated, showing the most recently displayed window instead. */
    /* static member */
    @scala.inline
    def disableShowingMainViewOnActivation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableShowingMainViewOnActivation")().asInstanceOf[Unit]
    
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
    @scala.inline
    def prepareForCustomAnimatedSwitchAsync(toViewId: Double, fromViewId: Double, options: ApplicationViewSwitchingOptions): IPromiseWithIAsyncOperation[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareForCustomAnimatedSwitchAsync")(toViewId.asInstanceOf[js.Any], fromViewId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[Boolean]]
    
    /**
      * Visually replaces the calling window (app view) with a specified window.
      * @param toViewId The ID of the window under preparation for display.
      * @param fromViewId The ID of the calling, currently displayed window.
      * @return The asynchronous results of the operation. Use this to determine when the async call is complete.
      */
    /* static member */
    @scala.inline
    def switchAsync(toViewId: Double, fromViewId: Double): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("switchAsync")(toViewId.asInstanceOf[js.Any], fromViewId.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
    /**
      * Visually replaces the calling window (app view) with a specified window.
      * @param toViewId The ID of the window under preparation for display.
      * @param fromViewId The ID of the calling, currently displayed window.
      * @param options Options for the display transition behaviors.
      * @return The asynchronous results of the operation. Use this to determine when the async call is complete.
      */
    /* static member */
    @scala.inline
    def switchAsync(toViewId: Double, fromViewId: Double, options: ApplicationViewSwitchingOptions): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("switchAsync")(toViewId.asInstanceOf[js.Any], fromViewId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
    /**
      * Visually replaces the calling window (app view) with a specified window.
      * @param viewId The ID of the window under preparation for display.
      * @return The asynchronous results of the operation. Use this to determine when the async call is complete.
      */
    /* static member */
    @scala.inline
    def switchAsync(viewId: Double): IPromiseWithIAsyncAction = ^.asInstanceOf[js.Dynamic].applyDynamic("switchAsync")(viewId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncAction]
    
    /**
      * Displays another window (app view) for the app on the screen, adjacent to the original window
      * @param viewId The ID of the new window to display.
      * @return Asynchronously returns true if the call succeeds; false if it does not.
      */
    /* static member */
    @scala.inline
    def tryShowAsStandaloneAsync(viewId: Double): IPromiseWithIAsyncOperation[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("tryShowAsStandaloneAsync")(viewId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[Boolean]]
    /**
      * Displays another window (app view) for the app on the screen, adjacent to the original window
      * @param viewId The ID of the new window to display.
      * @param sizePreference The preferred general sizing of the new window.
      * @return Asynchronously returns true if the call succeeds; false if it does not.
      */
    /* static member */
    @scala.inline
    def tryShowAsStandaloneAsync(viewId: Double, sizePreference: ViewSizePreference): IPromiseWithIAsyncOperation[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryShowAsStandaloneAsync")(viewId.asInstanceOf[js.Any], sizePreference.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[Boolean]]
    /**
      * Displays another window (app view) for the app on the screen, adjacent to the original window.
      * @param viewId The ID of the new window to display.
      * @param sizePreference The preferred general sizing of the new window.
      * @param anchorViewId The ID of the calling (anchor) window.
      * @param anchorSizePreference The preferred new general sizing of the calling window if this call succeeds.
      * @return Asynchronously returns true if the call succeeds; false if it does not.
      */
    /* static member */
    @scala.inline
    def tryShowAsStandaloneAsync(
      viewId: Double,
      sizePreference: ViewSizePreference,
      anchorViewId: Double,
      anchorSizePreference: ViewSizePreference
    ): IPromiseWithIAsyncOperation[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryShowAsStandaloneAsync")(viewId.asInstanceOf[js.Any], sizePreference.asInstanceOf[js.Any], anchorViewId.asInstanceOf[js.Any], anchorSizePreference.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[Boolean]]
  }
  
  /** Defines a set of options for window (app view) switching behaviors. */
  @JSGlobal("Windows.UI.ViewManagement.ApplicationViewSwitchingOptions")
  @js.native
  object ApplicationViewSwitchingOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewSwitchingOptions & Double
      ] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewSwitchingOptions.default & Double = js.native
    
    /* 2 */ val consolidateViews: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewSwitchingOptions.consolidateViews & Double = js.native
    
    /* 1 */ val skipAnimation: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewSwitchingOptions.skipAnimation & Double = js.native
  }
  
  /** Represents the title bar of an app. */
  @JSGlobal("Windows.UI.ViewManagement.ApplicationViewTitleBar")
  @js.native
  abstract class ApplicationViewTitleBar ()
    extends StObject
       with typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewTitleBar {
    
    /** Gets or sets the color of the title bar background. */
    /* CompleteClass */
    var backgroundColor: Color = js.native
    
    /** Gets or sets the background color of the title bar buttons. */
    /* CompleteClass */
    var buttonBackgroundColor: Color = js.native
    
    /** Gets or sets the foreground color of the title bar buttons. */
    /* CompleteClass */
    var buttonForegroundColor: Color = js.native
    
    /** Gets or sets the background color of a title bar button when the pointer is over it. */
    /* CompleteClass */
    var buttonHoverBackgroundColor: Color = js.native
    
    /** Gets or sets the foreground color of a title bar button when the pointer is over it. */
    /* CompleteClass */
    var buttonHoverForegroundColor: Color = js.native
    
    /** Gets or sets the background color of a title bar button when it's inactive. */
    /* CompleteClass */
    var buttonInactiveBackgroundColor: Color = js.native
    
    /** Gets or sets the foreground color of a title bar button when it's inactive. */
    /* CompleteClass */
    var buttonInactiveForegroundColor: Color = js.native
    
    /** Gets or sets the background color of a title bar button when it's pressed. */
    /* CompleteClass */
    var buttonPressedBackgroundColor: Color = js.native
    
    /** Gets or sets the foreground color of a title bar button when it's pressed. */
    /* CompleteClass */
    var buttonPressedForegroundColor: Color = js.native
    
    /** Gets or sets the color of the title bar foreground. */
    /* CompleteClass */
    var foregroundColor: Color = js.native
    
    /** Gets or sets the color of the title bar background when it's inactive. */
    /* CompleteClass */
    var inactiveBackgroundColor: Color = js.native
    
    /** Gets or sets the color of the title bar foreground when it's inactive. */
    /* CompleteClass */
    var inactiveForegroundColor: Color = js.native
  }
  
  @JSGlobal("Windows.UI.ViewManagement.ApplicationViewTransferContext")
  @js.native
  abstract class ApplicationViewTransferContext ()
    extends StObject
       with typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewTransferContext {
    
    /* unmapped type */
    /* CompleteClass */
    var viewId: js.Any = js.native
  }
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
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewWindowingMode & Double] = js.native
    
    /* 0 */ val auto: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewWindowingMode.auto & Double = js.native
    
    /* 2 */ val fullScreen: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewWindowingMode.fullScreen & Double = js.native
    
    /* 1 */ val preferredLaunchViewSize: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewWindowingMode.preferredLaunchViewSize & Double = js.native
  }
  
  /** Defines constants that specify how the app responds to edge gestures when in full-screen mode. */
  @JSGlobal("Windows.UI.ViewManagement.FullScreenSystemOverlayMode")
  @js.native
  object FullScreenSystemOverlayMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.ViewManagement.FullScreenSystemOverlayMode & Double] = js.native
    
    /* 1 */ val minimal: typings.winrtUwp.Windows.UI.ViewManagement.FullScreenSystemOverlayMode.minimal & Double = js.native
    
    /* 0 */ val standard: typings.winrtUwp.Windows.UI.ViewManagement.FullScreenSystemOverlayMode.standard & Double = js.native
  }
  
  /** Defines the set of directional preferences for the user interface presented by the app view. */
  @JSGlobal("Windows.UI.ViewManagement.HandPreference")
  @js.native
  object HandPreference extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.ViewManagement.HandPreference & Double] = js.native
    
    /* 0 */ val leftHanded: typings.winrtUwp.Windows.UI.ViewManagement.HandPreference.leftHanded & Double = js.native
    
    /* 1 */ val rightHanded: typings.winrtUwp.Windows.UI.ViewManagement.HandPreference.rightHanded & Double = js.native
  }
  
  /** Enables an app to register to receive notifications when the input pane is about to be displayed or hidden, and to determine which portion of the application's window is being obscured by the input pane. */
  @JSGlobal("Windows.UI.ViewManagement.InputPane")
  @js.native
  abstract class InputPane ()
    extends StObject
       with typings.winrtUwp.Windows.UI.ViewManagement.InputPane
  object InputPane {
    
    @JSGlobal("Windows.UI.ViewManagement.InputPane")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets the InputPane object associated with the application window that is currently visible.
      * @return The input pane.
      */
    /* static member */
    @scala.inline
    def getForCurrentView(): typings.winrtUwp.Windows.UI.ViewManagement.InputPane = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrtUwp.Windows.UI.ViewManagement.InputPane]
  }
  
  /** Provides data for the input pane Hiding and Showing events. */
  @JSGlobal("Windows.UI.ViewManagement.InputPaneVisibilityEventArgs")
  @js.native
  abstract class InputPaneVisibilityEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.UI.ViewManagement.InputPaneVisibilityEventArgs {
    
    /** Identifies whether the application has taken steps to ensure that the input pane doesn't cover the UI element that has focus. */
    /* CompleteClass */
    var ensuredFocusedElementInView: Boolean = js.native
    
    /** Gets the region of the application's window that the input pane is covering. */
    /* CompleteClass */
    var occludedRect: Rect = js.native
  }
  
  /** Defines a set of methods for managing the windows (app views) sent to secondary displays, such as projectors. */
  @JSGlobal("Windows.UI.ViewManagement.ProjectionManager")
  @js.native
  abstract class ProjectionManager ()
    extends StObject
       with typings.winrtUwp.Windows.UI.ViewManagement.ProjectionManager
  object ProjectionManager {
    
    @JSGlobal("Windows.UI.ViewManagement.ProjectionManager")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    @scala.inline
    def addEventListener_projectiondisplayavailablechanged(`type`: projectiondisplayavailablechanged, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Returns a string that is used to enumerate device services.
      * @return A string that is used to enumerate device services.
      */
    /* static member */
    @scala.inline
    def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
    
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
    @scala.inline
    def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    @scala.inline
    def removeEventListener_projectiondisplayavailablechanged(`type`: projectiondisplayavailablechanged, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Makes a request to asynchronously sends a window (app view) to the projector or other secondary display.
      * @param projectionViewId The new ID of the window to be displayed by the projector or other secondary display.
      * @param anchorViewId The ID of the original window before projection.
      * @param selection The area to one side of which the flyout is displayed.
      * @return true if projection started; otherwise, false.
      */
    /* static member */
    @scala.inline
    def requestStartProjectingAsync(projectionViewId: Double, anchorViewId: Double, selection: Rect): IPromiseWithIAsyncOperation[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestStartProjectingAsync")(projectionViewId.asInstanceOf[js.Any], anchorViewId.asInstanceOf[js.Any], selection.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[Boolean]]
    /**
      * Makes a request to asynchronously sends a window (app view) to the projector or other secondary display with the specified preferred placement.
      * @param projectionViewId The new ID of the window to be displayed by the projector or other secondary display.
      * @param anchorViewId The ID of the original window before projection.
      * @param selection The area to one side of which the flyout is displayed.
      * @param prefferedPlacement The side of the rectangle where the flyout should appear.
      * @return true if projection started; otherwise, false.
      */
    /* static member */
    @scala.inline
    def requestStartProjectingAsync(projectionViewId: Double, anchorViewId: Double, selection: Rect, prefferedPlacement: Placement): IPromiseWithIAsyncOperation[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestStartProjectingAsync")(projectionViewId.asInstanceOf[js.Any], anchorViewId.asInstanceOf[js.Any], selection.asInstanceOf[js.Any], prefferedPlacement.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[Boolean]]
    
    /**
      * Asynchronously sends a window (app view) to the projector or other secondary display.
      * @param projectionViewId The new ID of the window to be displayed by the projector or other secondary display.
      * @param anchorViewId The ID of the original window before projection.
      * @return The asynchronous results of the operation. Use this to determine when the async call is complete.
      */
    /* static member */
    @scala.inline
    def startProjectingAsync(projectionViewId: Double, anchorViewId: Double): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("startProjectingAsync")(projectionViewId.asInstanceOf[js.Any], anchorViewId.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
    /**
      * Asynchronously sends a window (app view) to the projector or other secondary display, and provides info about the display.
      * @param projectionViewId The new ID of the window to be displayed by the projector or other secondary display.
      * @param anchorViewId The ID of the original window before projection.
      * @param displayDeviceInfo Information about the display device.
      * @return The asynchronous results of the operation. Use this to determine when the async call is complete.
      */
    /* static member */
    @scala.inline
    def startProjectingAsync(projectionViewId: Double, anchorViewId: Double, displayDeviceInfo: DeviceInformation): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("startProjectingAsync")(projectionViewId.asInstanceOf[js.Any], anchorViewId.asInstanceOf[js.Any], displayDeviceInfo.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
    
    /**
      * Asynchronously hides a window (app view) displayed by a projector or other secondary display.
      * @param projectionViewId The ID of the window currently displayed by the projector or other secondary display.
      * @param anchorViewId The ID of the original window before projection.
      * @return The asynchronous results of the operation. Use this to determine when the async call is complete.
      */
    /* static member */
    @scala.inline
    def stopProjectingAsync(projectionViewId: Double, anchorViewId: Double): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("stopProjectingAsync")(projectionViewId.asInstanceOf[js.Any], anchorViewId.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
    
    /**
      * Asynchronously swaps the calling window (app view) with the window displayed on the projector or other secondary display. The result is that the calling window is displayed on the projector, and the formerly projected window is displayed on the device screen.
      * @param projectionViewId The ID of the window currently displayed by the projector.
      * @param anchorViewId The ID of the window to swap with the projected window.
      * @return The asynchronous results of the operation. Use this to determine when the async call is complete.
      */
    /* static member */
    @scala.inline
    def swapDisplaysForViewsAsync(projectionViewId: Double, anchorViewId: Double): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("swapDisplaysForViewsAsync")(projectionViewId.asInstanceOf[js.Any], anchorViewId.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
  }
  
  /** Defines constants that specify known system color values. */
  @JSGlobal("Windows.UI.ViewManagement.UIColorType")
  @js.native
  object UIColorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.ViewManagement.UIColorType & Double] = js.native
    
    /* 5 */ val accent: typings.winrtUwp.Windows.UI.ViewManagement.UIColorType.accent & Double = js.native
    
    /* 4 */ val accentDark1: typings.winrtUwp.Windows.UI.ViewManagement.UIColorType.accentDark1 & Double = js.native
    
    /* 3 */ val accentDark2: typings.winrtUwp.Windows.UI.ViewManagement.UIColorType.accentDark2 & Double = js.native
    
    /* 2 */ val accentDark3: typings.winrtUwp.Windows.UI.ViewManagement.UIColorType.accentDark3 & Double = js.native
    
    /* 6 */ val accentLight1: typings.winrtUwp.Windows.UI.ViewManagement.UIColorType.accentLight1 & Double = js.native
    
    /* 7 */ val accentLight2: typings.winrtUwp.Windows.UI.ViewManagement.UIColorType.accentLight2 & Double = js.native
    
    /* 8 */ val accentLight3: typings.winrtUwp.Windows.UI.ViewManagement.UIColorType.accentLight3 & Double = js.native
    
    /* 0 */ val background: typings.winrtUwp.Windows.UI.ViewManagement.UIColorType.background & Double = js.native
    
    /* 9 */ val complement: typings.winrtUwp.Windows.UI.ViewManagement.UIColorType.complement & Double = js.native
    
    /* 1 */ val foreground: typings.winrtUwp.Windows.UI.ViewManagement.UIColorType.foreground & Double = js.native
  }
  
  /** Defines the set of user interface element types. */
  @JSGlobal("Windows.UI.ViewManagement.UIElementType")
  @js.native
  object UIElementType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.ViewManagement.UIElementType & Double] = js.native
    
    /* 0 */ val activeCaption: typings.winrtUwp.Windows.UI.ViewManagement.UIElementType.activeCaption & Double = js.native
    
    /* 1 */ val background: typings.winrtUwp.Windows.UI.ViewManagement.UIElementType.background & Double = js.native
    
    /* 2 */ val buttonFace: typings.winrtUwp.Windows.UI.ViewManagement.UIElementType.buttonFace & Double = js.native
    
    /* 3 */ val buttonText: typings.winrtUwp.Windows.UI.ViewManagement.UIElementType.buttonText & Double = js.native
    
    /* 4 */ val captionText: typings.winrtUwp.Windows.UI.ViewManagement.UIElementType.captionText & Double = js.native
    
    /* 5 */ val grayText: typings.winrtUwp.Windows.UI.ViewManagement.UIElementType.grayText & Double = js.native
    
    /* 6 */ val highlight: typings.winrtUwp.Windows.UI.ViewManagement.UIElementType.highlight & Double = js.native
    
    /* 7 */ val highlightText: typings.winrtUwp.Windows.UI.ViewManagement.UIElementType.highlightText & Double = js.native
    
    /* 8 */ val hotlight: typings.winrtUwp.Windows.UI.ViewManagement.UIElementType.hotlight & Double = js.native
    
    /* 9 */ val inactiveCaption: typings.winrtUwp.Windows.UI.ViewManagement.UIElementType.inactiveCaption & Double = js.native
    
    /* 10 */ val inactiveCaptionText: typings.winrtUwp.Windows.UI.ViewManagement.UIElementType.inactiveCaptionText & Double = js.native
    
    /* 11 */ val window: typings.winrtUwp.Windows.UI.ViewManagement.UIElementType.window & Double = js.native
    
    /* 12 */ val windowText: typings.winrtUwp.Windows.UI.ViewManagement.UIElementType.windowText & Double = js.native
  }
  
  /** Contains a set of common app user interface settings and operations. */
  @JSGlobal("Windows.UI.ViewManagement.UISettings")
  @js.native
  /** Creates a new default instance of the UISettings class. */
  class UISettings ()
    extends StObject
       with typings.winrtUwp.Windows.UI.ViewManagement.UISettings
  
  /** Represents UI states and behaviors associated with the device mode (Tablet or Desktop) and input device type. */
  @JSGlobal("Windows.UI.ViewManagement.UIViewSettings")
  @js.native
  abstract class UIViewSettings ()
    extends StObject
       with typings.winrtUwp.Windows.UI.ViewManagement.UIViewSettings {
    
    /** Gets a value that indicates whether the device UI is optimized for touch input or mouse input. */
    /* CompleteClass */
    var userInteractionMode: UserInteractionMode = js.native
  }
  object UIViewSettings {
    
    @JSGlobal("Windows.UI.ViewManagement.UIViewSettings")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets the UI states and behaviors associated with the device mode (Tablet or Desktop) for the active app.
      * @return A UIViewSettings instance that can be used to get and set view settings properties.
      */
    /* static member */
    @scala.inline
    def getForCurrentView(): typings.winrtUwp.Windows.UI.ViewManagement.UIViewSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrtUwp.Windows.UI.ViewManagement.UIViewSettings]
  }
  
  /** Specifies the UI view, optimized for input device type. */
  @JSGlobal("Windows.UI.ViewManagement.UserInteractionMode")
  @js.native
  object UserInteractionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.ViewManagement.UserInteractionMode & Double] = js.native
    
    /* 0 */ val mouse: typings.winrtUwp.Windows.UI.ViewManagement.UserInteractionMode.mouse & Double = js.native
    
    /* 1 */ val touch: typings.winrtUwp.Windows.UI.ViewManagement.UserInteractionMode.touch & Double = js.native
  }
  
  /** Defines the set of possible general window (app view) size preferences. */
  @JSGlobal("Windows.UI.ViewManagement.ViewSizePreference")
  @js.native
  object ViewSizePreference extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.ViewManagement.ViewSizePreference & Double] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.UI.ViewManagement.ViewSizePreference.default & Double = js.native
    
    /* 2 */ val useHalf: typings.winrtUwp.Windows.UI.ViewManagement.ViewSizePreference.useHalf & Double = js.native
    
    /* 1 */ val useLess: typings.winrtUwp.Windows.UI.ViewManagement.ViewSizePreference.useLess & Double = js.native
    
    /* 4 */ val useMinimum: typings.winrtUwp.Windows.UI.ViewManagement.ViewSizePreference.useMinimum & Double = js.native
    
    /* 3 */ val useMore: typings.winrtUwp.Windows.UI.ViewManagement.ViewSizePreference.useMore & Double = js.native
    
    /* 5 */ val useNone: typings.winrtUwp.Windows.UI.ViewManagement.ViewSizePreference.useNone & Double = js.native
  }
}
