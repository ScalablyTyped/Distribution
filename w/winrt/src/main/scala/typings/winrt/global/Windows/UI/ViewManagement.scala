package typings.winrt.global.Windows.UI

import typings.winrt.Windows.UI.ViewManagement.ApplicationViewState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.ViewManagement")
@js.native
object ViewManagement extends js.Object {
  @js.native
  class AccessibilitySettings ()
    extends typings.winrt.Windows.UI.ViewManagement.AccessibilitySettings
  
  @js.native
  class ApplicationView ()
    extends typings.winrt.Windows.UI.ViewManagement.ApplicationView
  
  @js.native
  class ApplicationViewTitleBar ()
    extends typings.winrt.Windows.UI.ViewManagement.ApplicationViewTitleBar
  
  @js.native
  class InputPane ()
    extends typings.winrt.Windows.UI.ViewManagement.InputPane
  
  @js.native
  class InputPaneVisibilityEventArgs ()
    extends typings.winrt.Windows.UI.ViewManagement.InputPaneVisibilityEventArgs
  
  @js.native
  class UISettings ()
    extends typings.winrt.Windows.UI.ViewManagement.UISettings
  
  /* static members */
  @js.native
  object ApplicationView extends js.Object {
    /**
      * Indicates whether the app terminates when the last window is closed.
      **/
    var terminateAppOnFinalViewClose: Boolean = js.native
    /**
      * Gets the state of the current app view.
      **/
    var value: ApplicationViewState = js.native
    /**
      * Gets the window (app view) for the current app.
      **/
    def getForCurrentView(): typings.winrt.Windows.UI.ViewManagement.ApplicationView = js.native
    /**
      * Attempts to unsnap a previously snapped app. This call will only succeed when the app is running in the foreground.
      **/
    def tryUnsnap(): Boolean = js.native
  }
  
  @js.native
  object ApplicationViewOrientation extends js.Object {
    /* 0 */ val landscape: typings.winrt.Windows.UI.ViewManagement.ApplicationViewOrientation.landscape with Double = js.native
    /* 1 */ val portrait: typings.winrt.Windows.UI.ViewManagement.ApplicationViewOrientation.portrait with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.ViewManagement.ApplicationViewOrientation with Double] = js.native
  }
  
  @js.native
  object ApplicationViewState extends js.Object {
    /* 1 */ val filled: typings.winrt.Windows.UI.ViewManagement.ApplicationViewState.filled with Double = js.native
    /* 0 */ val fullScreenLandscape: typings.winrt.Windows.UI.ViewManagement.ApplicationViewState.fullScreenLandscape with Double = js.native
    /* 3 */ val fullScreenPortrait: typings.winrt.Windows.UI.ViewManagement.ApplicationViewState.fullScreenPortrait with Double = js.native
    /* 2 */ val snapped: typings.winrt.Windows.UI.ViewManagement.ApplicationViewState.snapped with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.ViewManagement.ApplicationViewState with Double] = js.native
  }
  
  @js.native
  object HandPreference extends js.Object {
    /* 0 */ val leftHanded: typings.winrt.Windows.UI.ViewManagement.HandPreference.leftHanded with Double = js.native
    /* 1 */ val rightHanded: typings.winrt.Windows.UI.ViewManagement.HandPreference.rightHanded with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.ViewManagement.HandPreference with Double] = js.native
  }
  
  /* static members */
  @js.native
  object InputPane extends js.Object {
    def getForCurrentView(): typings.winrt.Windows.UI.ViewManagement.InputPane = js.native
  }
  
  @js.native
  object UIElementType extends js.Object {
    /* 0 */ val activeCaption: typings.winrt.Windows.UI.ViewManagement.UIElementType.activeCaption with Double = js.native
    /* 1 */ val background: typings.winrt.Windows.UI.ViewManagement.UIElementType.background with Double = js.native
    /* 2 */ val buttonFace: typings.winrt.Windows.UI.ViewManagement.UIElementType.buttonFace with Double = js.native
    /* 3 */ val buttonText: typings.winrt.Windows.UI.ViewManagement.UIElementType.buttonText with Double = js.native
    /* 4 */ val captionText: typings.winrt.Windows.UI.ViewManagement.UIElementType.captionText with Double = js.native
    /* 5 */ val grayText: typings.winrt.Windows.UI.ViewManagement.UIElementType.grayText with Double = js.native
    /* 6 */ val highlight: typings.winrt.Windows.UI.ViewManagement.UIElementType.highlight with Double = js.native
    /* 7 */ val highlightText: typings.winrt.Windows.UI.ViewManagement.UIElementType.highlightText with Double = js.native
    /* 8 */ val hotlight: typings.winrt.Windows.UI.ViewManagement.UIElementType.hotlight with Double = js.native
    /* 9 */ val inactiveCaption: typings.winrt.Windows.UI.ViewManagement.UIElementType.inactiveCaption with Double = js.native
    /* 10 */ val inactiveCaptionText: typings.winrt.Windows.UI.ViewManagement.UIElementType.inactiveCaptionText with Double = js.native
    /* 11 */ val window: typings.winrt.Windows.UI.ViewManagement.UIElementType.window with Double = js.native
    /* 12 */ val windowText: typings.winrt.Windows.UI.ViewManagement.UIElementType.windowText with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.ViewManagement.UIElementType with Double] = js.native
  }
  
  @js.native
  object ViewSizePreference extends js.Object {
    /* 0 */ val default: typings.winrt.Windows.UI.ViewManagement.ViewSizePreference.default with Double = js.native
    /* 2 */ val useHalf: typings.winrt.Windows.UI.ViewManagement.ViewSizePreference.useHalf with Double = js.native
    /* 1 */ val useLess: typings.winrt.Windows.UI.ViewManagement.ViewSizePreference.useLess with Double = js.native
    /* 4 */ val useMinimum: typings.winrt.Windows.UI.ViewManagement.ViewSizePreference.useMinimum with Double = js.native
    /* 3 */ val useMore: typings.winrt.Windows.UI.ViewManagement.ViewSizePreference.useMore with Double = js.native
    /* 5 */ val useNone: typings.winrt.Windows.UI.ViewManagement.ViewSizePreference.useNone with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.ViewManagement.ViewSizePreference with Double] = js.native
  }
  
}

