package typings.titanium.Titanium.UI

import typings.titanium.AnimatedOptions
import typings.titanium.Dictionary
import typings.titanium.Padding
import typings.titanium.Titanium.Android.Activity
import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Proxy
import typings.titanium.closeWindowParams
import typings.titanium.openWindowParams
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
import typings.titanium.titleAttributesParams
import typings.titanium.windowToolbarParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The Window is an empty drawing surface or container.
		 */
@JSGlobal("Titanium.UI.Window")
@js.native
class Window () extends View {
  /**
  			 * Contains a reference to the Android Activity object associated with this window.
  			 */
  val activity: Activity = js.native
  /**
  			 * The type of transition used when activity is entering.
  			 */
  var activityEnterTransition: Double = js.native
  /**
  			 * The type of transition used when activity is exiting.
  			 */
  var activityExitTransition: Double = js.native
  /**
  			 * The type of transition used when reentering to a previously started activity.
  			 */
  var activityReenterTransition: Double = js.native
  /**
  			 * The type of transition used when returning from a previously started activity.
  			 */
  var activityReturnTransition: Double = js.native
  /**
  			 * The type of enter transition used when animating shared elements between two activities.
  			 */
  var activitySharedElementEnterTransition: Double = js.native
  /**
  			 * The type of exit transition used when animating shared elements between two activities.
  			 */
  var activitySharedElementExitTransition: Double = js.native
  /**
  			 * The type of reenter transition used when animating shared elements between two activities.
  			 */
  var activitySharedElementReenterTransition: Double = js.native
  /**
  			 * The type of return transition used when animating shared elements between two activities.
  			 */
  var activitySharedElementReturnTransition: Double = js.native
  /**
  			 * Specifies whether or not the view controller should automatically adjust its scroll view insets.
  			 */
  var autoAdjustScrollViewInsets: Boolean = js.native
  /**
  			 * Title for the back button. This is only valid when the window is a child of a tab.
  			 */
  var backButtonTitle: String = js.native
  /**
  			 * The image to show as the back button. This is only valid when the window is a child of a tab.
  			 */
  var backButtonTitleImage: String | Blob = js.native
  /**
  			 * Background color for the nav bar, as a color name or hex triplet.
  			 */
  var barColor: String = js.native
  /**
  			 * Background image for the nav bar, specified as a URL to a local image.
  			 */
  var barImage: String = js.native
  /**
  			 * Boolean value indicating if the application should exit when the Android
  			 * Back button is pressed while the window is being shown or when the window
  			 * is closed programmatically.
  			 */
  var exitOnClose: Boolean = js.native
  /**
  			 * An array of supported values specified using the EXTEND_EDGE constants in <Titanium.UI>.
  			 */
  var extendEdges: js.Array[Double] = js.native
  /**
  			 * Specifies whether the screen insets/notches are allowed to overlap the window's content or not.
  			 */
  var extendSafeArea: Boolean = js.native
  /**
  			 * Treat the content of the window as secure, preventing it from appearing in screenshots or from being viewed on non-secure displays.
  			 */
  var flagSecure: Boolean = js.native
  /**
  			 * Boolean value indicating if the window is fullscreen.
  			 */
  var fullscreen: Boolean = js.native
  /**
  			 * Set this to true to hide the shadow image of the navigation bar.
  			 */
  var hideShadow: Boolean = js.native
  /**
  			 * Set this to true to hide the back button of navigation bar.
  			 */
  var hidesBackButton: Boolean = js.native
  /**
  			 * Set this to true to hide the navigation bar on swipe.
  			 */
  var hidesBarsOnSwipe: Boolean = js.native
  /**
  			 * Set this to true to hide the navigation bar on tap.
  			 */
  var hidesBarsOnTap: Boolean = js.native
  /**
  			 * Set this to true to hide the navigation bar when the keyboard appears.
  			 */
  var hidesBarsWhenKeyboardAppears: Boolean = js.native
  /**
  			 * A Boolean value indicating whether the integrated search bar is hidden when scrolling any underlying content.
  			 */
  var hidesSearchBarWhenScrolling: Boolean = js.native
  /**
  			 * Boolean value indicating whether the system is allowed to hide the visual indicator for returning to the Home screen.
  			 */
  var homeIndicatorAutoHidden: Boolean = js.native
  /**
  			 * Specifies if the edges should extend beyond opaque bars (navigation bar, tab bar, toolbar).
  			 */
  var includeOpaqueBars: Boolean = js.native
  /**
  			 * The mode to use when displaying the title of the navigation bar.
  			 */
  var largeTitleDisplayMode: Double = js.native
  /**
  			 * A Boolean value indicating whether the title should be displayed in a large format.
  			 */
  var largeTitleEnabled: Boolean = js.native
  /**
  			 * View to show in the left nav bar area.
  			 */
  var leftNavButton: View = js.native
  /**
  			 * An Array of views to show in the left nav bar area.
  			 */
  var leftNavButtons: js.Array[View] = js.native
  /**
  			 * Indicates to open a modal window or not.
  			 */
  var modal: Boolean = js.native
  /**
  			 * Hides the navigation bar (`true`) or shows the navigation bar (`false`).
  			 */
  var navBarHidden: Boolean = js.native
  /**
  			 * The tintColor to apply to the navigation bar.
  			 */
  var navTintColor: String = js.native
  /**
  			 * The <Titanium.UI.NavigationWindow> instance hosting this window.
  			 */
  val navigationWindow: NavigationWindow = js.native
  /**
  			 * Current orientation of the window.
  			 */
  val orientation: Double = js.native
  /**
  			 * Array of supported orientation modes, specified using the orientation
  			 * constants defined in <Titanium.UI>.
  			 */
  var orientationModes: js.Array[Double] = js.native
  /**
  			 * View to show in the right nav bar area.
  			 */
  var rightNavButton: View = js.native
  /**
  			 * An Array of views to show in the right nav bar area.
  			 */
  var rightNavButtons: js.Array[View] = js.native
  /**
  			 * The padding needed to safely display content without it being overlapped by the screen insets and notches.
  			 */
  val safeAreaPadding: Padding = js.native
  /**
  			 * Shadow image for the navigation bar, specified as a URL to a local image..
  			 */
  var shadowImage: String = js.native
  /**
  			 * Boolean value to enable split action bar.
  			 * @deprecated Deprecated in AppCompat theme. The same behaviour can be achived by using Toolbar.
  			 */
  var splitActionBar: Boolean = js.native
  /**
  			 * The status bar style associated with this window.
  			 */
  var statusBarStyle: Double = js.native
  /**
  			 * Maintain a sustainable level of performance.
  			 */
  var sustainedPerformanceMode: Boolean = js.native
  /**
  			 * Boolean value indicating if the user should be able to close a window using a swipe gesture.
  			 */
  var swipeToClose: Boolean = js.native
  /**
  			 * Boolean value indicating if the tab bar should be hidden.
  			 */
  var tabBarHidden: Boolean = js.native
  /**
  			 * Name of the theme to apply to the window.
  			 */
  var theme: String = js.native
  /**
  			 * Title of the window.
  			 */
  var title: String = js.native
  /**
  			 * Title text attributes of the window.
  			 */
  var titleAttributes: titleAttributesParams = js.native
  /**
  			 * View to show in the title area of the nav bar.
  			 */
  var titleControl: View = js.native
  /**
  			 * Image to show in the title area of the nav bar, specified as a local file path or URL.
  			 */
  var titleImage: String = js.native
  /**
  			 * Title prompt for the window.
  			 */
  var titlePrompt: String = js.native
  /**
  			 * Key identifying a string from the locale file to use for the window title.
  			 */
  var titleid: String = js.native
  /**
  			 * Key identifying a string from the locale file to use for the window title prompt.
  			 */
  var titlepromptid: String = js.native
  /**
  			 * Array of button objects to show in the window's toolbar.
  			 */
  var toolbar: js.Array[View] = js.native
  /**
  			 * Use a transition animation when opening or closing windows in a
  			 * <Titanium.UI.NavigationWindow> or <Titanium.UI.Tab>.
  			 */
  var transitionAnimation: Proxy = js.native
  /**
  			 * Boolean value indicating if the nav bar is translucent.
  			 */
  var translucent: Boolean = js.native
  /**
  			 * Additional flags to set on the Activity Window.
  			 */
  var windowFlags: Double = js.native
  /**
  			 * Set the pixel format for the Activity's Window.
  			 */
  var windowPixelFormat: Double = js.native
  /**
  			 * Determines whether a window's soft input area (ie software keyboard) is visible
  			 * as it receives focus and how the window behaves in order to accomodate it while keeping its
  			 * contents in view.
  			 */
  var windowSoftInputMode: Double = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  @JSName("addEventListener")
  def addEventListener_androidback(
    name: androidback,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WindowAndroidbackEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_androidcamera(
    name: androidcamera,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WindowAndroidcameraEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_androidfocus(
    name: androidfocus,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WindowAndroidfocusEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_androidsearch(
    name: androidsearch,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WindowAndroidsearchEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_androidvoldown(
    name: androidvoldown,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WindowAndroidvoldownEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_androidvolup(
    name: androidvolup,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WindowAndroidvolupEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(name: blur, callback: js.ThisFunction1[/* this */ this.type, /* event */ WindowBlurEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(name: close, callback: js.ThisFunction1[/* this */ this.type, /* event */ WindowCloseEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(name: open, callback: js.ThisFunction1[/* this */ this.type, /* event */ WindowOpenEvent, Unit]): Unit = js.native
  /**
  			 * Adds a common UI element to participate in window transition animation.
  			 */
  def addSharedElement(view: View, transitionName: String): Unit = js.native
  /**
  			 * Closes the window.
  			 */
  def close(): Unit = js.native
  def close(params: Dictionary[Animation]): Unit = js.native
  def close(params: Animation): Unit = js.native
  def close(params: closeWindowParams): Unit = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  @JSName("fireEvent")
  def fireEvent_androidback(name: androidback): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_androidback(name: androidback, event: WindowAndroidbackEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_androidcamera(name: androidcamera): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_androidcamera(name: androidcamera, event: WindowAndroidcameraEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_androidfocus(name: androidfocus): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_androidfocus(name: androidfocus, event: WindowAndroidfocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_androidsearch(name: androidsearch): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_androidsearch(name: androidsearch, event: WindowAndroidsearchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_androidvoldown(name: androidvoldown): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_androidvoldown(name: androidvoldown, event: WindowAndroidvoldownEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_androidvolup(name: androidvolup): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_androidvolup(name: androidvolup, event: WindowAndroidvolupEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_blur(name: blur): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_blur(name: blur, event: WindowBlurEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: WindowClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_close(name: close): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_close(name: close, event: WindowCloseEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: WindowDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: WindowDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: WindowFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: WindowKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: WindowLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: WindowLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_open(name: open): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_open(name: open, event: WindowOpenEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: WindowPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: WindowPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: WindowSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: WindowSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: WindowTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: WindowTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: WindowTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: WindowTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: WindowTwofingertapEvent): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.activity> property.
  			 * @deprecated Access <Titanium.UI.Window.activity> instead.
  			 */
  def getActivity(): Activity = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.activityEnterTransition> property.
  			 * @deprecated Access <Titanium.UI.Window.activityEnterTransition> instead.
  			 */
  def getActivityEnterTransition(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.activityExitTransition> property.
  			 * @deprecated Access <Titanium.UI.Window.activityExitTransition> instead.
  			 */
  def getActivityExitTransition(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.activityReenterTransition> property.
  			 * @deprecated Access <Titanium.UI.Window.activityReenterTransition> instead.
  			 */
  def getActivityReenterTransition(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.activityReturnTransition> property.
  			 * @deprecated Access <Titanium.UI.Window.activityReturnTransition> instead.
  			 */
  def getActivityReturnTransition(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.activitySharedElementEnterTransition> property.
  			 * @deprecated Access <Titanium.UI.Window.activitySharedElementEnterTransition> instead.
  			 */
  def getActivitySharedElementEnterTransition(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.activitySharedElementExitTransition> property.
  			 * @deprecated Access <Titanium.UI.Window.activitySharedElementExitTransition> instead.
  			 */
  def getActivitySharedElementExitTransition(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.activitySharedElementReenterTransition> property.
  			 * @deprecated Access <Titanium.UI.Window.activitySharedElementReenterTransition> instead.
  			 */
  def getActivitySharedElementReenterTransition(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.activitySharedElementReturnTransition> property.
  			 * @deprecated Access <Titanium.UI.Window.activitySharedElementReturnTransition> instead.
  			 */
  def getActivitySharedElementReturnTransition(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.autoAdjustScrollViewInsets> property.
  			 * @deprecated Access <Titanium.UI.Window.autoAdjustScrollViewInsets> instead.
  			 */
  def getAutoAdjustScrollViewInsets(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.backButtonTitle> property.
  			 * @deprecated Access <Titanium.UI.Window.backButtonTitle> instead.
  			 */
  def getBackButtonTitle(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.backButtonTitleImage> property.
  			 * @deprecated Access <Titanium.UI.Window.backButtonTitleImage> instead.
  			 */
  def getBackButtonTitleImage(): String | Blob = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.barColor> property.
  			 * @deprecated Access <Titanium.UI.Window.barColor> instead.
  			 */
  def getBarColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.barImage> property.
  			 * @deprecated Access <Titanium.UI.Window.barImage> instead.
  			 */
  def getBarImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.exitOnClose> property.
  			 * @deprecated Access <Titanium.UI.Window.exitOnClose> instead.
  			 */
  def getExitOnClose(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.extendEdges> property.
  			 * @deprecated Access <Titanium.UI.Window.extendEdges> instead.
  			 */
  def getExtendEdges(): js.Array[Double] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.extendSafeArea> property.
  			 * @deprecated Access <Titanium.UI.Window.extendSafeArea> instead.
  			 */
  def getExtendSafeArea(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.flagSecure> property.
  			 * @deprecated Access <Titanium.UI.Window.flagSecure> instead.
  			 */
  def getFlagSecure(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.fullscreen> property.
  			 * @deprecated Access <Titanium.UI.Window.fullscreen> instead.
  			 */
  def getFullscreen(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.hideShadow> property.
  			 * @deprecated Access <Titanium.UI.Window.hideShadow> instead.
  			 */
  def getHideShadow(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.hidesBackButton> property.
  			 * @deprecated Access <Titanium.UI.Window.hidesBackButton> instead.
  			 */
  def getHidesBackButton(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.hidesBarsOnSwipe> property.
  			 * @deprecated Access <Titanium.UI.Window.hidesBarsOnSwipe> instead.
  			 */
  def getHidesBarsOnSwipe(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.hidesBarsOnTap> property.
  			 * @deprecated Access <Titanium.UI.Window.hidesBarsOnTap> instead.
  			 */
  def getHidesBarsOnTap(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.hidesBarsWhenKeyboardAppears> property.
  			 * @deprecated Access <Titanium.UI.Window.hidesBarsWhenKeyboardAppears> instead.
  			 */
  def getHidesBarsWhenKeyboardAppears(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.hidesSearchBarWhenScrolling> property.
  			 * @deprecated Access <Titanium.UI.Window.hidesSearchBarWhenScrolling> instead.
  			 */
  def getHidesSearchBarWhenScrolling(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.homeIndicatorAutoHidden> property.
  			 * @deprecated Access <Titanium.UI.Window.homeIndicatorAutoHidden> instead.
  			 */
  def getHomeIndicatorAutoHidden(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.includeOpaqueBars> property.
  			 * @deprecated Access <Titanium.UI.Window.includeOpaqueBars> instead.
  			 */
  def getIncludeOpaqueBars(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.largeTitleDisplayMode> property.
  			 * @deprecated Access <Titanium.UI.Window.largeTitleDisplayMode> instead.
  			 */
  def getLargeTitleDisplayMode(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.largeTitleEnabled> property.
  			 * @deprecated Access <Titanium.UI.Window.largeTitleEnabled> instead.
  			 */
  def getLargeTitleEnabled(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.leftNavButton> property.
  			 * @deprecated Access <Titanium.UI.Window.leftNavButton> instead.
  			 */
  def getLeftNavButton(): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.leftNavButtons> property.
  			 * @deprecated Access <Titanium.UI.Window.leftNavButtons> instead.
  			 */
  def getLeftNavButtons(): js.Array[View] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.modal> property.
  			 * @deprecated Access <Titanium.UI.Window.modal> instead.
  			 */
  def getModal(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.navBarHidden> property.
  			 * @deprecated Access <Titanium.UI.Window.navBarHidden> instead.
  			 */
  def getNavBarHidden(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.navTintColor> property.
  			 * @deprecated Access <Titanium.UI.Window.navTintColor> instead.
  			 */
  def getNavTintColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.navigationWindow> property.
  			 * @deprecated Access <Titanium.UI.Window.navigationWindow> instead.
  			 */
  def getNavigationWindow(): NavigationWindow = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.onBack> property.
  			 * @deprecated Access <Titanium.UI.Window.onBack> instead.
  			 */
  def getOnBack(): js.Function0[Unit] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.orientation> property.
  			 * @deprecated Access <Titanium.UI.Window.orientation> instead.
  			 */
  def getOrientation(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.orientationModes> property.
  			 * @deprecated Access <Titanium.UI.Window.orientationModes> instead.
  			 */
  def getOrientationModes(): js.Array[Double] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.rightNavButton> property.
  			 * @deprecated Access <Titanium.UI.Window.rightNavButton> instead.
  			 */
  def getRightNavButton(): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.rightNavButtons> property.
  			 * @deprecated Access <Titanium.UI.Window.rightNavButtons> instead.
  			 */
  def getRightNavButtons(): js.Array[View] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.safeAreaPadding> property.
  			 * @deprecated Access <Titanium.UI.Window.safeAreaPadding> instead.
  			 */
  def getSafeAreaPadding(): Padding = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.shadowImage> property.
  			 * @deprecated Access <Titanium.UI.Window.shadowImage> instead.
  			 */
  def getShadowImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.splitActionBar> property.
  			 * @deprecated Deprecated in AppCompat theme. The same behaviour can be achived by using Toolbar.
  			 */
  def getSplitActionBar(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.statusBarStyle> property.
  			 * @deprecated Access <Titanium.UI.Window.statusBarStyle> instead.
  			 */
  def getStatusBarStyle(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.sustainedPerformanceMode> property.
  			 * @deprecated Access <Titanium.UI.Window.sustainedPerformanceMode> instead.
  			 */
  def getSustainedPerformanceMode(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.swipeToClose> property.
  			 * @deprecated Access <Titanium.UI.Window.swipeToClose> instead.
  			 */
  def getSwipeToClose(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.tabBarHidden> property.
  			 * @deprecated Access <Titanium.UI.Window.tabBarHidden> instead.
  			 */
  def getTabBarHidden(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.theme> property.
  			 * @deprecated Access <Titanium.UI.Window.theme> instead.
  			 */
  def getTheme(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.title> property.
  			 * @deprecated Access <Titanium.UI.Window.title> instead.
  			 */
  def getTitle(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.titleAttributes> property.
  			 * @deprecated Access <Titanium.UI.Window.titleAttributes> instead.
  			 */
  def getTitleAttributes(): titleAttributesParams = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.titleControl> property.
  			 * @deprecated Access <Titanium.UI.Window.titleControl> instead.
  			 */
  def getTitleControl(): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.titleImage> property.
  			 * @deprecated Access <Titanium.UI.Window.titleImage> instead.
  			 */
  def getTitleImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.titlePrompt> property.
  			 * @deprecated Access <Titanium.UI.Window.titlePrompt> instead.
  			 */
  def getTitlePrompt(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.titleid> property.
  			 * @deprecated Access <Titanium.UI.Window.titleid> instead.
  			 */
  def getTitleid(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.titlepromptid> property.
  			 * @deprecated Access <Titanium.UI.Window.titlepromptid> instead.
  			 */
  def getTitlepromptid(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.toolbar> property.
  			 * @deprecated Access <Titanium.UI.Window.toolbar> instead.
  			 */
  def getToolbar(): js.Array[View] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.transitionAnimation> property.
  			 * @deprecated Access <Titanium.UI.Window.transitionAnimation> instead.
  			 */
  def getTransitionAnimation(): Proxy = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.translucent> property.
  			 * @deprecated Access <Titanium.UI.Window.translucent> instead.
  			 */
  def getTranslucent(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.windowFlags> property.
  			 * @deprecated Access <Titanium.UI.Window.windowFlags> instead.
  			 */
  def getWindowFlags(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.windowPixelFormat> property.
  			 * @deprecated Access <Titanium.UI.Window.windowPixelFormat> instead.
  			 */
  def getWindowPixelFormat(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.windowSoftInputMode> property.
  			 * @deprecated Access <Titanium.UI.Window.windowSoftInputMode> instead.
  			 */
  def getWindowSoftInputMode(): Double = js.native
  /**
  			 * Hides the navigation bar.
  			 */
  def hideNavBar(): Unit = js.native
  def hideNavBar(options: AnimatedOptions): Unit = js.native
  /**
  			 * Hides the tab bar. Must be called before opening the window.
  			 */
  def hideTabBar(): Unit = js.native
  /**
  			 * Makes the bottom toolbar invisible.
  			 */
  def hideToolbar(): Unit = js.native
  def hideToolbar(options: AnimatedOptions): Unit = js.native
  /**
  			 * Callback function that overrides the default behavior when the user presses the **Back**
  			 * button.
  			 */
  def onBack(): Unit = js.native
  /**
  			 * Opens the window.
  			 */
  def open(): Unit = js.native
  def open(params: openWindowParams): Unit = js.native
  /**
  			 * Clears all added shared elements.
  			 */
  def removeAllSharedElements(): Unit = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  @JSName("removeEventListener")
  def removeEventListener_androidback(
    name: androidback,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WindowAndroidbackEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_androidcamera(
    name: androidcamera,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WindowAndroidcameraEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_androidfocus(
    name: androidfocus,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WindowAndroidfocusEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_androidsearch(
    name: androidsearch,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WindowAndroidsearchEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_androidvoldown(
    name: androidvoldown,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WindowAndroidvoldownEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_androidvolup(
    name: androidvolup,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WindowAndroidvolupEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(name: blur, callback: js.ThisFunction1[/* this */ this.type, /* event */ WindowBlurEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(name: close, callback: js.ThisFunction1[/* this */ this.type, /* event */ WindowCloseEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_open(name: open, callback: js.ThisFunction1[/* this */ this.type, /* event */ WindowOpenEvent, Unit]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.activityEnterTransition> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.activityEnterTransition> instead.
  			 */
  def setActivityEnterTransition(activityEnterTransition: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.activityExitTransition> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.activityExitTransition> instead.
  			 */
  def setActivityExitTransition(activityExitTransition: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.activityReenterTransition> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.activityReenterTransition> instead.
  			 */
  def setActivityReenterTransition(activityReenterTransition: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.activityReturnTransition> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.activityReturnTransition> instead.
  			 */
  def setActivityReturnTransition(activityReturnTransition: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.activitySharedElementEnterTransition> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.activitySharedElementEnterTransition> instead.
  			 */
  def setActivitySharedElementEnterTransition(activitySharedElementEnterTransition: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.activitySharedElementExitTransition> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.activitySharedElementExitTransition> instead.
  			 */
  def setActivitySharedElementExitTransition(activitySharedElementExitTransition: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.activitySharedElementReenterTransition> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.activitySharedElementReenterTransition> instead.
  			 */
  def setActivitySharedElementReenterTransition(activitySharedElementReenterTransition: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.activitySharedElementReturnTransition> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.activitySharedElementReturnTransition> instead.
  			 */
  def setActivitySharedElementReturnTransition(activitySharedElementReturnTransition: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.autoAdjustScrollViewInsets> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.autoAdjustScrollViewInsets> instead.
  			 */
  def setAutoAdjustScrollViewInsets(autoAdjustScrollViewInsets: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.backButtonTitle> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.backButtonTitle> instead.
  			 */
  def setBackButtonTitle(backButtonTitle: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.backButtonTitleImage> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.backButtonTitleImage> instead.
  			 */
  def setBackButtonTitleImage(backButtonTitleImage: String): Unit = js.native
  def setBackButtonTitleImage(backButtonTitleImage: Blob): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.barColor> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.barColor> instead.
  			 */
  def setBarColor(barColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.barImage> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.barImage> instead.
  			 */
  def setBarImage(barImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.exitOnClose> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.exitOnClose> instead.
  			 */
  def setExitOnClose(exitOnClose: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.extendEdges> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.extendEdges> instead.
  			 */
  def setExtendEdges(extendEdges: js.Array[Double]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.extendSafeArea> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.extendSafeArea> instead.
  			 */
  def setExtendSafeArea(extendSafeArea: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.flagSecure> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.flagSecure> instead.
  			 */
  def setFlagSecure(flagSecure: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.fullscreen> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.fullscreen> instead.
  			 */
  def setFullscreen(fullscreen: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.hideShadow> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.hideShadow> instead.
  			 */
  def setHideShadow(hideShadow: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.hidesBackButton> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.hidesBackButton> instead.
  			 */
  def setHidesBackButton(hidesBackButton: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.hidesBarsOnSwipe> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.hidesBarsOnSwipe> instead.
  			 */
  def setHidesBarsOnSwipe(hidesBarsOnSwipe: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.hidesBarsOnTap> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.hidesBarsOnTap> instead.
  			 */
  def setHidesBarsOnTap(hidesBarsOnTap: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.hidesBarsWhenKeyboardAppears> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.hidesBarsWhenKeyboardAppears> instead.
  			 */
  def setHidesBarsWhenKeyboardAppears(hidesBarsWhenKeyboardAppears: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.hidesSearchBarWhenScrolling> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.hidesSearchBarWhenScrolling> instead.
  			 */
  def setHidesSearchBarWhenScrolling(hidesSearchBarWhenScrolling: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.homeIndicatorAutoHidden> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.homeIndicatorAutoHidden> instead.
  			 */
  def setHomeIndicatorAutoHidden(homeIndicatorAutoHidden: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.includeOpaqueBars> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.includeOpaqueBars> instead.
  			 */
  def setIncludeOpaqueBars(includeOpaqueBars: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.largeTitleDisplayMode> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.largeTitleDisplayMode> instead.
  			 */
  def setLargeTitleDisplayMode(largeTitleDisplayMode: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.largeTitleEnabled> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.largeTitleEnabled> instead.
  			 */
  def setLargeTitleEnabled(largeTitleEnabled: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.leftNavButton> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.leftNavButton> instead.
  			 */
  def setLeftNavButton(leftNavButton: View): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.leftNavButtons> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.leftNavButtons> instead.
  			 */
  def setLeftNavButtons(leftNavButtons: js.Array[View]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.modal> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.modal> instead.
  			 */
  def setModal(modal: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.navBarHidden> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.navBarHidden> instead.
  			 */
  def setNavBarHidden(navBarHidden: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.navTintColor> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.navTintColor> instead.
  			 */
  def setNavTintColor(navTintColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.onBack> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.onBack> instead.
  			 */
  def setOnBack(onBack: js.Function0[Unit]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.orientationModes> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.orientationModes> instead.
  			 */
  def setOrientationModes(orientationModes: js.Array[Double]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.rightNavButton> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.rightNavButton> instead.
  			 */
  def setRightNavButton(rightNavButton: View): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.rightNavButtons> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.rightNavButtons> instead.
  			 */
  def setRightNavButtons(rightNavButtons: js.Array[View]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.shadowImage> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.shadowImage> instead.
  			 */
  def setShadowImage(shadowImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.splitActionBar> property.
  			 * @deprecated Deprecated in AppCompat theme. The same behaviour can be achived by using Toolbar.
  			 */
  def setSplitActionBar(splitActionBar: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.statusBarStyle> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.statusBarStyle> instead.
  			 */
  def setStatusBarStyle(statusBarStyle: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.sustainedPerformanceMode> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.sustainedPerformanceMode> instead.
  			 */
  def setSustainedPerformanceMode(sustainedPerformanceMode: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.swipeToClose> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.swipeToClose> instead.
  			 */
  def setSwipeToClose(swipeToClose: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.tabBarHidden> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.tabBarHidden> instead.
  			 */
  def setTabBarHidden(tabBarHidden: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.theme> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.theme> instead.
  			 */
  def setTheme(theme: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.title> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.title> instead.
  			 */
  def setTitle(title: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.titleAttributes> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.titleAttributes> instead.
  			 */
  def setTitleAttributes(titleAttributes: titleAttributesParams): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.titleControl> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.titleControl> instead.
  			 */
  def setTitleControl(titleControl: View): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.titleImage> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.titleImage> instead.
  			 */
  def setTitleImage(titleImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.titlePrompt> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.titlePrompt> instead.
  			 */
  def setTitlePrompt(titlePrompt: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.titleid> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.titleid> instead.
  			 */
  def setTitleid(titleid: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.titlepromptid> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.titlepromptid> instead.
  			 */
  def setTitlepromptid(titlepromptid: String): Unit = js.native
  /**
  			 * Sets the array of items to show in the window's toolbar.
  			 */
  def setToolbar(items: js.Array[_]): Unit = js.native
  def setToolbar(items: js.Array[_], params: windowToolbarParam): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.transitionAnimation> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.transitionAnimation> instead.
  			 */
  def setTransitionAnimation(transitionAnimation: Proxy): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.translucent> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.translucent> instead.
  			 */
  def setTranslucent(translucent: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.windowFlags> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.windowFlags> instead.
  			 */
  def setWindowFlags(windowFlags: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.windowPixelFormat> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.windowPixelFormat> instead.
  			 */
  def setWindowPixelFormat(windowPixelFormat: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.windowSoftInputMode> property.
  			 * @deprecated Set the value using <Titanium.UI.Window.windowSoftInputMode> instead.
  			 */
  def setWindowSoftInputMode(windowSoftInputMode: Double): Unit = js.native
  /**
  			 * Makes the navigation bar visible.
  			 */
  def showNavBar(): Unit = js.native
  def showNavBar(options: AnimatedOptions): Unit = js.native
  /**
  			 * Makes the bottom toolbar visible.
  			 */
  def showToolbar(): Unit = js.native
  def showToolbar(options: AnimatedOptions): Unit = js.native
}

