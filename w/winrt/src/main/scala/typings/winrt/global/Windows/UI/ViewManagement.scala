package typings.winrt.global.Windows.UI

import typings.winrt.Windows.Foundation.Rect
import typings.winrt.Windows.Foundation.Size
import typings.winrt.Windows.UI.Color
import typings.winrt.Windows.UI.ViewManagement.ApplicationViewOrientation
import typings.winrt.Windows.UI.ViewManagement.ApplicationViewState
import typings.winrt.Windows.UI.ViewManagement.HandPreference
import typings.winrt.Windows.UI.ViewManagement.UIElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ViewManagement {
  
  @JSGlobal("Windows.UI.ViewManagement.AccessibilitySettings")
  @js.native
  class AccessibilitySettings ()
    extends StObject
       with typings.winrt.Windows.UI.ViewManagement.AccessibilitySettings {
    
    /* CompleteClass */
    var highContrast: Boolean = js.native
    
    /* CompleteClass */
    var highContrastScheme: String = js.native
    
    /* CompleteClass */
    var onhighcontrastchanged: js.Any = js.native
  }
  
  @JSGlobal("Windows.UI.ViewManagement.ApplicationView")
  @js.native
  class ApplicationView ()
    extends StObject
       with typings.winrt.Windows.UI.ViewManagement.ApplicationView {
    
    /**
      * Gets whether the current window (app view) is adjacent to the left edge of the screen.
      **/
    /* CompleteClass */
    var adjacentToLeftDisplayEdge: Double = js.native
    
    /**
      * Gets whether the current window (app view) is adjacent to the right edge of the screen.
      **/
    /* CompleteClass */
    var adjacentToRightDisplayEdge: Boolean = js.native
    
    /**
      * Gets the current ID of the window (app view) .
      **/
    /* CompleteClass */
    var id: Double = js.native
    
    /**
      * Gets whether the window(app view) is full screen or not.
      **/
    /* CompleteClass */
    var isFullScreen: Boolean = js.native
    
    /**
      * Gets whether the window (app view) is on the Windows lock screen.
      **/
    /* CompleteClass */
    var isOnLockScreen: Boolean = js.native
    
    /**
      * Gets or sets whether screen capture is enabled for the window (app view).
      **/
    /* CompleteClass */
    var isScreenCaptureEnabled: Boolean = js.native
    
    /**
      * Gets the current orientation of the window (app view) with respect to the display.
      **/
    /* CompleteClass */
    var orientation: ApplicationViewOrientation = js.native
    
    /**
      * Gets or sets the displayed title of the window.
      **/
    /* CompleteClass */
    var title: String = js.native
    
    /**
      * Gets the title bar of the app.
      **/
    /* CompleteClass */
    var titleBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ApplicationViewTitleBar */ js.Any = js.native
  }
  /* static members */
  object ApplicationView {
    
    @JSGlobal("Windows.UI.ViewManagement.ApplicationView")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets the window (app view) for the current app.
      **/
    inline def getForCurrentView(): typings.winrt.Windows.UI.ViewManagement.ApplicationView = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrt.Windows.UI.ViewManagement.ApplicationView]
    
    /**
      * Indicates whether the app terminates when the last window is closed.
      **/
    @JSGlobal("Windows.UI.ViewManagement.ApplicationView.terminateAppOnFinalViewClose")
    @js.native
    def terminateAppOnFinalViewClose: Boolean = js.native
    inline def terminateAppOnFinalViewClose_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("terminateAppOnFinalViewClose")(x.asInstanceOf[js.Any])
    
    /**
      * Attempts to unsnap a previously snapped app. This call will only succeed when the app is running in the foreground.
      **/
    inline def tryUnsnap(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("tryUnsnap")().asInstanceOf[Boolean]
    
    /**
      * Gets the state of the current app view.
      **/
    @JSGlobal("Windows.UI.ViewManagement.ApplicationView.value")
    @js.native
    def value: ApplicationViewState = js.native
    inline def value_=(x: ApplicationViewState): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.UI.ViewManagement.ApplicationViewOrientation")
  @js.native
  object ApplicationViewOrientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.ViewManagement.ApplicationViewOrientation & Double] = js.native
    
    /* 0 */ val landscape: typings.winrt.Windows.UI.ViewManagement.ApplicationViewOrientation.landscape & Double = js.native
    
    /* 1 */ val portrait: typings.winrt.Windows.UI.ViewManagement.ApplicationViewOrientation.portrait & Double = js.native
  }
  
  @JSGlobal("Windows.UI.ViewManagement.ApplicationViewState")
  @js.native
  object ApplicationViewState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.ViewManagement.ApplicationViewState & Double] = js.native
    
    /* 1 */ val filled: typings.winrt.Windows.UI.ViewManagement.ApplicationViewState.filled & Double = js.native
    
    /* 0 */ val fullScreenLandscape: typings.winrt.Windows.UI.ViewManagement.ApplicationViewState.fullScreenLandscape & Double = js.native
    
    /* 3 */ val fullScreenPortrait: typings.winrt.Windows.UI.ViewManagement.ApplicationViewState.fullScreenPortrait & Double = js.native
    
    /* 2 */ val snapped: typings.winrt.Windows.UI.ViewManagement.ApplicationViewState.snapped & Double = js.native
  }
  
  @JSGlobal("Windows.UI.ViewManagement.ApplicationViewTitleBar")
  @js.native
  class ApplicationViewTitleBar ()
    extends StObject
       with typings.winrt.Windows.UI.ViewManagement.ApplicationViewTitleBar {
    
    /**
      * Gets or sets the color of the title bar background.
      **/
    /* CompleteClass */
    var backgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
    
    /**
      * Gets or sets the background color of the title bar buttons.
      **/
    /* CompleteClass */
    var buttonBackgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
    
    /**
      * Gets or sets the foreground color of the title bar buttons.
      **/
    /* CompleteClass */
    var buttonForegroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
    
    /**
      * Gets or sets the background color of a title bar button when the pointer is over it.
      **/
    /* CompleteClass */
    var buttonHoverBackgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
    
    /**
      * Gets or sets the foreground color of a title bar button when the pointer is over it.
      **/
    /* CompleteClass */
    var buttonHoverForegroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
    
    /**
      * Gets or sets the background color of a title bar button when it's inactive.
      **/
    /* CompleteClass */
    var buttonInactiveBackgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
    
    /**
      * Gets or sets the foreground color of a title bar button when it's inactive.
      **/
    /* CompleteClass */
    var buttonInactiveForegroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
    
    /**
      * Gets or sets the background color of a title bar button when it's pressed.
      **/
    /* CompleteClass */
    var buttonPressedBackgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
    
    /**
      * Gets or sets the foreground color of a title bar button when it's pressed.
      **/
    /* CompleteClass */
    var buttonPressedForegroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
    
    /**
      * Gets or sets the color of the title bar foreground.
      **/
    /* CompleteClass */
    var foregroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
    
    /**
      * Gets or sets the color of the title bar background when it's inactive.
      **/
    /* CompleteClass */
    var inactiveBackgroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
    
    /**
      * Gets or sets the color of the title bar foreground when it's inactive.
      **/
    /* CompleteClass */
    var inactiveForegroundColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ js.Any = js.native
  }
  
  @JSGlobal("Windows.UI.ViewManagement.HandPreference")
  @js.native
  object HandPreference extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.ViewManagement.HandPreference & Double] = js.native
    
    /* 0 */ val leftHanded: typings.winrt.Windows.UI.ViewManagement.HandPreference.leftHanded & Double = js.native
    
    /* 1 */ val rightHanded: typings.winrt.Windows.UI.ViewManagement.HandPreference.rightHanded & Double = js.native
  }
  
  @JSGlobal("Windows.UI.ViewManagement.InputPane")
  @js.native
  class InputPane ()
    extends StObject
       with typings.winrt.Windows.UI.ViewManagement.InputPane {
    
    /* CompleteClass */
    var occludedRect: Rect = js.native
    
    /* CompleteClass */
    var onhiding: js.Any = js.native
    
    /* CompleteClass */
    var onshowing: js.Any = js.native
  }
  /* static members */
  object InputPane {
    
    @JSGlobal("Windows.UI.ViewManagement.InputPane")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getForCurrentView(): typings.winrt.Windows.UI.ViewManagement.InputPane = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrt.Windows.UI.ViewManagement.InputPane]
  }
  
  @JSGlobal("Windows.UI.ViewManagement.InputPaneVisibilityEventArgs")
  @js.native
  class InputPaneVisibilityEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.ViewManagement.InputPaneVisibilityEventArgs {
    
    /* CompleteClass */
    var ensuredFocusedElementInView: Boolean = js.native
    
    /* CompleteClass */
    var occludedRect: Rect = js.native
  }
  
  @JSGlobal("Windows.UI.ViewManagement.UIElementType")
  @js.native
  object UIElementType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.ViewManagement.UIElementType & Double] = js.native
    
    /* 0 */ val activeCaption: typings.winrt.Windows.UI.ViewManagement.UIElementType.activeCaption & Double = js.native
    
    /* 1 */ val background: typings.winrt.Windows.UI.ViewManagement.UIElementType.background & Double = js.native
    
    /* 2 */ val buttonFace: typings.winrt.Windows.UI.ViewManagement.UIElementType.buttonFace & Double = js.native
    
    /* 3 */ val buttonText: typings.winrt.Windows.UI.ViewManagement.UIElementType.buttonText & Double = js.native
    
    /* 4 */ val captionText: typings.winrt.Windows.UI.ViewManagement.UIElementType.captionText & Double = js.native
    
    /* 5 */ val grayText: typings.winrt.Windows.UI.ViewManagement.UIElementType.grayText & Double = js.native
    
    /* 6 */ val highlight: typings.winrt.Windows.UI.ViewManagement.UIElementType.highlight & Double = js.native
    
    /* 7 */ val highlightText: typings.winrt.Windows.UI.ViewManagement.UIElementType.highlightText & Double = js.native
    
    /* 8 */ val hotlight: typings.winrt.Windows.UI.ViewManagement.UIElementType.hotlight & Double = js.native
    
    /* 9 */ val inactiveCaption: typings.winrt.Windows.UI.ViewManagement.UIElementType.inactiveCaption & Double = js.native
    
    /* 10 */ val inactiveCaptionText: typings.winrt.Windows.UI.ViewManagement.UIElementType.inactiveCaptionText & Double = js.native
    
    /* 11 */ val window: typings.winrt.Windows.UI.ViewManagement.UIElementType.window & Double = js.native
    
    /* 12 */ val windowText: typings.winrt.Windows.UI.ViewManagement.UIElementType.windowText & Double = js.native
  }
  
  @JSGlobal("Windows.UI.ViewManagement.UISettings")
  @js.native
  class UISettings ()
    extends StObject
       with typings.winrt.Windows.UI.ViewManagement.UISettings {
    
    /* CompleteClass */
    var animationsEnabled: Boolean = js.native
    
    /* CompleteClass */
    var caretBlinkRate: Double = js.native
    
    /* CompleteClass */
    var caretBrowsingEnabled: Boolean = js.native
    
    /* CompleteClass */
    var caretWidth: Double = js.native
    
    /* CompleteClass */
    var cursorSize: Size = js.native
    
    /* CompleteClass */
    var doubleClickTime: Double = js.native
    
    /* CompleteClass */
    var handPreference: HandPreference = js.native
    
    /* CompleteClass */
    var messageDuration: Double = js.native
    
    /* CompleteClass */
    var mouseHoverTime: Double = js.native
    
    /* CompleteClass */
    var scrollBarArrowSize: Size = js.native
    
    /* CompleteClass */
    var scrollBarSize: Size = js.native
    
    /* CompleteClass */
    var scrollBarThumbBoxSize: Size = js.native
    
    /* CompleteClass */
    override def uIElementColor(desiredElement: UIElementType): Color = js.native
  }
  
  @JSGlobal("Windows.UI.ViewManagement.ViewSizePreference")
  @js.native
  object ViewSizePreference extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.ViewManagement.ViewSizePreference & Double] = js.native
    
    /* 0 */ val default: typings.winrt.Windows.UI.ViewManagement.ViewSizePreference.default & Double = js.native
    
    /* 2 */ val useHalf: typings.winrt.Windows.UI.ViewManagement.ViewSizePreference.useHalf & Double = js.native
    
    /* 1 */ val useLess: typings.winrt.Windows.UI.ViewManagement.ViewSizePreference.useLess & Double = js.native
    
    /* 4 */ val useMinimum: typings.winrt.Windows.UI.ViewManagement.ViewSizePreference.useMinimum & Double = js.native
    
    /* 3 */ val useMore: typings.winrt.Windows.UI.ViewManagement.ViewSizePreference.useMore & Double = js.native
    
    /* 5 */ val useNone: typings.winrt.Windows.UI.ViewManagement.ViewSizePreference.useNone & Double = js.native
  }
}
