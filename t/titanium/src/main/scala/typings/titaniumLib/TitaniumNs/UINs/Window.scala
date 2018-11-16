package typings
package titaniumLib.TitaniumNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The Window is an empty drawing surface or container.
		 */
@js.native
trait Window extends View {
  /**
  			 * For lightweight windows, this property returns undefined.
  			 * For heavyweight windows, this property contains a reference to the
  			 * Android Activity object associated with this window.
  			 */
  val activity: titaniumLib.TitaniumNs.AndroidNs.Activity = js.native
  /**
  			 * The type of transition used when activity is entering.
  			 */
  var activityEnterTransition: scala.Double = js.native
  /**
  			 * The type of transition used when activity is exiting.
  			 */
  var activityExitTransition: scala.Double = js.native
  /**
  			 * The type of transition used when reentering to a previously started activity.
  			 */
  var activityReenterTransition: scala.Double = js.native
  /**
  			 * The type of transition used when returning from a previously started activity.
  			 */
  var activityReturnTransition: scala.Double = js.native
  /**
  			 * The type of enter transition used when animating shared elements between two activities.
  			 */
  var activitySharedElementEnterTransition: scala.Double = js.native
  /**
  			 * The type of exit transition used when animating shared elements between two activities.
  			 */
  var activitySharedElementExitTransition: scala.Double = js.native
  /**
  			 * The type of reenter transition used when animating shared elements between two activities.
  			 */
  var activitySharedElementReenterTransition: scala.Double = js.native
  /**
  			 * The type of return transition used when animating shared elements between two activities.
  			 */
  var activitySharedElementReturnTransition: scala.Double = js.native
  /**
  			 * Specifies whether or not the view controller should automatically adjust its scroll view insets.
  			 */
  var autoAdjustScrollViewInsets: scala.Boolean = js.native
  /**
  			 * Title for the back button. This is only valid when the window is a child of a tab.
  			 */
  var backButtonTitle: java.lang.String = js.native
  /**
  			 * The image to show as the back button. This is only valid when the window is a child of a tab.
  			 */
  var backButtonTitleImage: java.lang.String | titaniumLib.TitaniumNs.Blob = js.native
  /**
  			 * Background color for the nav bar, as a color name or hex triplet.
  			 */
  var barColor: java.lang.String = js.native
  /**
  			 * Background image for the nav bar, specified as a URL to a local image.
  			 */
  var barImage: java.lang.String = js.native
  /**
  			 * Boolean value indicating if the application should exit when the Android
  			 * Back button is pressed while the window is being shown or when the window
  			 * is closed programmatically.
  			 */
  var exitOnClose: scala.Boolean = js.native
  /**
  			 * An array of supported values specified using the EXTEND_EDGE constants in <Titanium.UI>.
  			 */
  var extendEdges: js.Array[scala.Double] = js.native
  /**
  			 * Specifies whether the content (subviews) of the window  will render inside the safe-area or not.
  			 * Only used in iOS 11.0 and later.
  			 */
  var extendSafeArea: scala.Boolean = js.native
  /**
  			 * Treat the content of the window as secure, preventing it from appearing in screenshots or from being viewed on non-secure displays.
  			 */
  var flagSecure: scala.Boolean = js.native
  /**
  			 * Boolean value indicating if the window is fullscreen.
  			 */
  var fullscreen: scala.Boolean = js.native
  /**
  			 * Set this to true to hide the shadow image of the navigation bar.
  			 */
  var hideShadow: scala.Boolean = js.native
  /**
  			 * Set this to true to hide the back button of navigation bar.
  			 */
  var hidesBackButton: scala.Boolean = js.native
  /**
  			 * Set this to true to hide the navigation bar on swipe.
  			 */
  var hidesBarsOnSwipe: scala.Boolean = js.native
  /**
  			 * Set this to true to hide the navigation bar on tap.
  			 */
  var hidesBarsOnTap: scala.Boolean = js.native
  /**
  			 * Set this to true to hide the navigation bar when the keyboard appears.
  			 */
  var hidesBarsWhenKeyboardAppears: scala.Boolean = js.native
  /**
  			 * Boolean value indicating whether the system is allowed to hide the visual indicator for returning to the Home screen.
  			 */
  var homeIndicatorAutoHidden: scala.Boolean = js.native
  /**
  			 * Specifies if the edges should extend beyond opaque bars (navigation bar, tab bar, toolbar).
  			 */
  var includeOpaqueBars: scala.Boolean = js.native
  /**
  			 * The mode to use when displaying the title of the navigation bar.
  			 */
  var largeTitleDisplayMode: scala.Double = js.native
  /**
  			 * A Boolean value indicating whether the title should be displayed in a large format.
  			 */
  var largeTitleEnabled: java.lang.String = js.native
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
  var modal: scala.Boolean = js.native
  /**
  			 * Hides the navigation bar (`true`) or shows the navigation bar (`false`).
  			 */
  var navBarHidden: scala.Boolean = js.native
  /**
  			 * The tintColor to apply to the navigation bar.
  			 */
  var navTintColor: java.lang.String = js.native
  /**
  			 * The <Titanium.UI.iOS.NavigationWindow> instance hosting this window.
  			 */
  val navigationWindow: titaniumLib.TitaniumNs.UINs.iOSNs.NavigationWindow = js.native
  /**
  			 * Current orientation of the window.
  			 */
  val orientation: scala.Double = js.native
  /**
  			 * Array of supported orientation modes, specified using the orientation
  			 * constants defined in <Titanium.UI>.
  			 */
  var orientationModes: js.Array[scala.Double] = js.native
  /**
  			 * View to show in the right nav bar area.
  			 */
  var rightNavButton: View = js.native
  /**
  			 * An Array of views to show in the right nav bar area.
  			 */
  var rightNavButtons: js.Array[View] = js.native
  /**
  			 * Shadow image for the navigation bar, specified as a URL to a local image..
  			 */
  var shadowImage: java.lang.String = js.native
  /**
  			 * Boolean value to enable split action bar.
  			 */
  var splitActionBar: scala.Boolean = js.native
  /**
  			 * The status bar style associated with this window.
  			 */
  var statusBarStyle: scala.Double = js.native
  /**
  			 * Maintain a sustainable level of performance.
  			 */
  var sustainedPerformanceMode: scala.Boolean = js.native
  /**
  			 * Boolean value indicating if the user should be able to close a window using a swipe gesture.
  			 */
  var swipeToClose: scala.Boolean = js.native
  /**
  			 * Boolean value indicating if the tab bar should be hidden.
  			 */
  var tabBarHidden: scala.Boolean = js.native
  /**
  			 * Name of the theme to apply to the window.
  			 */
  var theme: java.lang.String = js.native
  /**
  			 * Title of the window.
  			 */
  var title: java.lang.String = js.native
  /**
  			 * Title text attributes of the window.
  			 */
  var titleAttributes: titaniumLib.titleAttributesParams = js.native
  /**
  			 * View to show in the title area of the nav bar.
  			 */
  var titleControl: View = js.native
  /**
  			 * Image to show in the title area of the nav bar, specified as a local file path or URL.
  			 */
  var titleImage: java.lang.String = js.native
  /**
  			 * Title prompt for the window.
  			 */
  var titlePrompt: java.lang.String = js.native
  /**
  			 * Key identifying a string from the locale file to use for the window title.
  			 */
  var titleid: java.lang.String = js.native
  /**
  			 * Key identifying a string from the locale file to use for the window title prompt.
  			 */
  var titlepromptid: java.lang.String = js.native
  /**
  			 * Array of button objects to show in the window's toolbar.
  			 */
  var toolbar: js.Array[_] = js.native
  /**
  			 * Use a transition animation when opening or closing windows in a
  			 * <Titanium.UI.iOS.NavigationWindow> or <Titanium.UI.Tab>.
  			 */
  var transitionAnimation: titaniumLib.TitaniumNs.Proxy = js.native
  /**
  			 * Boolean value indicating if the nav bar is translucent.
  			 */
  var translucent: scala.Boolean = js.native
  /**
  			 * Loads a JavaScript file from a local URL.
  			 */
  var url: java.lang.String = js.native
  /**
  			 * Additional flags to set on the Activity Window.
  			 */
  var windowFlags: scala.Double = js.native
  /**
  			 * Set the pixel format for the Activity's Window.
  			 */
  var windowPixelFormat: scala.Double = js.native
  /**
  			 * Determines whether a heavyweight window's soft input area (ie software keyboard) is visible
  			 * as it receives focus and how the window behaves in order to accomodate it while keeping its
  			 * contents in view.
  			 */
  var windowSoftInputMode: scala.Double = js.native
  /**
  			 * Adds a common UI element to participate in window transition animation.
  			 */
  def addSharedElement(view: js.Any, transitionName: java.lang.String): scala.Unit = js.native
  /**
  			 * Closes the window.
  			 */
  def close(): scala.Unit = js.native
  /**
  			 * Closes the window.
  			 */
  def close(params: js.Any): scala.Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.activity> property.
  			 */
  def getActivity(): titaniumLib.TitaniumNs.AndroidNs.Activity = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.activityEnterTransition> property.
  			 */
  def getActivityEnterTransition(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.activityExitTransition> property.
  			 */
  def getActivityExitTransition(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.activityReenterTransition> property.
  			 */
  def getActivityReenterTransition(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.activityReturnTransition> property.
  			 */
  def getActivityReturnTransition(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.activitySharedElementEnterTransition> property.
  			 */
  def getActivitySharedElementEnterTransition(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.activitySharedElementExitTransition> property.
  			 */
  def getActivitySharedElementExitTransition(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.activitySharedElementReenterTransition> property.
  			 */
  def getActivitySharedElementReenterTransition(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.activitySharedElementReturnTransition> property.
  			 */
  def getActivitySharedElementReturnTransition(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.autoAdjustScrollViewInsets> property.
  			 */
  def getAutoAdjustScrollViewInsets(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.backButtonTitle> property.
  			 */
  def getBackButtonTitle(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.backButtonTitleImage> property.
  			 */
  def getBackButtonTitleImage(): java.lang.String | titaniumLib.TitaniumNs.Blob = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.barColor> property.
  			 */
  def getBarColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.barImage> property.
  			 */
  def getBarImage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.exitOnClose> property.
  			 */
  def getExitOnClose(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.extendEdges> property.
  			 */
  def getExtendEdges(): js.Array[scala.Double] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.extendSafeArea> property.
  			 */
  def getExtendSafeArea(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.flagSecure> property.
  			 */
  def getFlagSecure(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.fullscreen> property.
  			 */
  def getFullscreen(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.hideShadow> property.
  			 */
  def getHideShadow(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.hidesBackButton> property.
  			 */
  def getHidesBackButton(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.hidesBarsOnSwipe> property.
  			 */
  def getHidesBarsOnSwipe(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.hidesBarsOnTap> property.
  			 */
  def getHidesBarsOnTap(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.hidesBarsWhenKeyboardAppears> property.
  			 */
  def getHidesBarsWhenKeyboardAppears(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.homeIndicatorAutoHidden> property.
  			 */
  def getHomeIndicatorAutoHidden(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.includeOpaqueBars> property.
  			 */
  def getIncludeOpaqueBars(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.largeTitleDisplayMode> property.
  			 */
  def getLargeTitleDisplayMode(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.largeTitleEnabled> property.
  			 */
  def getLargeTitleEnabled(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.leftNavButton> property.
  			 */
  def getLeftNavButton(): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.leftNavButtons> property.
  			 */
  def getLeftNavButtons(): js.Array[View] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.modal> property.
  			 */
  def getModal(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.navBarHidden> property.
  			 */
  def getNavBarHidden(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.navTintColor> property.
  			 */
  def getNavTintColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.navigationWindow> property.
  			 */
  def getNavigationWindow(): titaniumLib.TitaniumNs.UINs.iOSNs.NavigationWindow = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.onBack> property.
  			 */
  def getOnBack(): js.Function1[/* param0 */ js.Any, _] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.orientation> property.
  			 */
  def getOrientation(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.orientationModes> property.
  			 */
  def getOrientationModes(): js.Array[scala.Double] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.rightNavButton> property.
  			 */
  def getRightNavButton(): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.rightNavButtons> property.
  			 */
  def getRightNavButtons(): js.Array[View] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.shadowImage> property.
  			 */
  def getShadowImage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.splitActionBar> property.
  			 */
  def getSplitActionBar(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.statusBarStyle> property.
  			 */
  def getStatusBarStyle(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.sustainedPerformanceMode> property.
  			 */
  def getSustainedPerformanceMode(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.swipeToClose> property.
  			 */
  def getSwipeToClose(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.tabBarHidden> property.
  			 */
  def getTabBarHidden(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.theme> property.
  			 */
  def getTheme(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.title> property.
  			 */
  def getTitle(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.titleAttributes> property.
  			 */
  def getTitleAttributes(): titaniumLib.titleAttributesParams = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.titleControl> property.
  			 */
  def getTitleControl(): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.titleImage> property.
  			 */
  def getTitleImage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.titlePrompt> property.
  			 */
  def getTitlePrompt(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.titleid> property.
  			 */
  def getTitleid(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.titlepromptid> property.
  			 */
  def getTitlepromptid(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.toolbar> property.
  			 */
  def getToolbar(): js.Array[_] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.transitionAnimation> property.
  			 */
  def getTransitionAnimation(): titaniumLib.TitaniumNs.Proxy = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.translucent> property.
  			 */
  def getTranslucent(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.url> property.
  			 */
  def getUrl(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.windowFlags> property.
  			 */
  def getWindowFlags(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.windowPixelFormat> property.
  			 */
  def getWindowPixelFormat(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Window.windowSoftInputMode> property.
  			 */
  def getWindowSoftInputMode(): scala.Double = js.native
  /**
  			 * Hides the navigation bar.
  			 */
  def hideNavBar(): scala.Unit = js.native
  /**
  			 * Hides the navigation bar.
  			 */
  def hideNavBar(options: js.Any): scala.Unit = js.native
  /**
  			 * Hides the tab bar. Must be called before opening the window.
  			 */
  def hideTabBar(): scala.Unit = js.native
  /**
  			 * Makes the bottom toolbar invisible.
  			 */
  def hideToolbar(): scala.Unit = js.native
  /**
  			 * Makes the bottom toolbar invisible.
  			 */
  def hideToolbar(options: js.Any): scala.Unit = js.native
  /**
  			 * Callback function that overrides the default behavior when the user presses the **Back**
  			 * button.
  			 */
  def onBack(param0: js.Any): js.Any = js.native
  /**
  			 * Opens the window.
  			 */
  def open(): scala.Unit = js.native
  /**
  			 * Opens the window.
  			 */
  def open(params: titaniumLib.openWindowParams): scala.Unit = js.native
  /**
  			 * Clears all added shared elements.
  			 */
  def removeAllSharedElements(): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.activityEnterTransition> property.
  			 */
  def setActivityEnterTransition(activityEnterTransition: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.activityExitTransition> property.
  			 */
  def setActivityExitTransition(activityExitTransition: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.activityReenterTransition> property.
  			 */
  def setActivityReenterTransition(activityReenterTransition: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.activityReturnTransition> property.
  			 */
  def setActivityReturnTransition(activityReturnTransition: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.activitySharedElementEnterTransition> property.
  			 */
  def setActivitySharedElementEnterTransition(activitySharedElementEnterTransition: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.activitySharedElementExitTransition> property.
  			 */
  def setActivitySharedElementExitTransition(activitySharedElementExitTransition: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.activitySharedElementReenterTransition> property.
  			 */
  def setActivitySharedElementReenterTransition(activitySharedElementReenterTransition: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.activitySharedElementReturnTransition> property.
  			 */
  def setActivitySharedElementReturnTransition(activitySharedElementReturnTransition: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.autoAdjustScrollViewInsets> property.
  			 */
  def setAutoAdjustScrollViewInsets(autoAdjustScrollViewInsets: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.backButtonTitle> property.
  			 */
  def setBackButtonTitle(backButtonTitle: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.backButtonTitleImage> property.
  			 */
  def setBackButtonTitleImage(backButtonTitleImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.backButtonTitleImage> property.
  			 */
  def setBackButtonTitleImage(backButtonTitleImage: titaniumLib.TitaniumNs.Blob): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.barColor> property.
  			 */
  def setBarColor(barColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.barImage> property.
  			 */
  def setBarImage(barImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.exitOnClose> property.
  			 */
  def setExitOnClose(exitOnClose: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.extendEdges> property.
  			 */
  def setExtendEdges(extendEdges: js.Array[scala.Double]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.extendSafeArea> property.
  			 */
  def setExtendSafeArea(extendSafeArea: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.flagSecure> property.
  			 */
  def setFlagSecure(flagSecure: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.fullscreen> property.
  			 */
  def setFullscreen(fullscreen: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.hideShadow> property.
  			 */
  def setHideShadow(hideShadow: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.hidesBackButton> property.
  			 */
  def setHidesBackButton(hidesBackButton: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.hidesBarsOnSwipe> property.
  			 */
  def setHidesBarsOnSwipe(hidesBarsOnSwipe: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.hidesBarsOnTap> property.
  			 */
  def setHidesBarsOnTap(hidesBarsOnTap: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.hidesBarsWhenKeyboardAppears> property.
  			 */
  def setHidesBarsWhenKeyboardAppears(hidesBarsWhenKeyboardAppears: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.homeIndicatorAutoHidden> property.
  			 */
  def setHomeIndicatorAutoHidden(homeIndicatorAutoHidden: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.includeOpaqueBars> property.
  			 */
  def setIncludeOpaqueBars(includeOpaqueBars: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.largeTitleDisplayMode> property.
  			 */
  def setLargeTitleDisplayMode(largeTitleDisplayMode: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.largeTitleEnabled> property.
  			 */
  def setLargeTitleEnabled(largeTitleEnabled: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.leftNavButton> property.
  			 */
  def setLeftNavButton(leftNavButton: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.leftNavButtons> property.
  			 */
  def setLeftNavButtons(leftNavButtons: js.Array[_]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.modal> property.
  			 */
  def setModal(modal: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.navBarHidden> property.
  			 */
  def setNavBarHidden(navBarHidden: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.navTintColor> property.
  			 */
  def setNavTintColor(navTintColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.onBack> property.
  			 */
  def setOnBack(onBack: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.orientationModes> property.
  			 */
  def setOrientationModes(orientationModes: js.Array[scala.Double]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.rightNavButton> property.
  			 */
  def setRightNavButton(rightNavButton: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.rightNavButtons> property.
  			 */
  def setRightNavButtons(rightNavButtons: js.Array[_]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.shadowImage> property.
  			 */
  def setShadowImage(shadowImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.splitActionBar> property.
  			 */
  def setSplitActionBar(splitActionBar: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.statusBarStyle> property.
  			 */
  def setStatusBarStyle(statusBarStyle: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.sustainedPerformanceMode> property.
  			 */
  def setSustainedPerformanceMode(sustainedPerformanceMode: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.swipeToClose> property.
  			 */
  def setSwipeToClose(swipeToClose: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.tabBarHidden> property.
  			 */
  def setTabBarHidden(tabBarHidden: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.theme> property.
  			 */
  def setTheme(theme: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.title> property.
  			 */
  def setTitle(title: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.titleAttributes> property.
  			 */
  def setTitleAttributes(titleAttributes: titaniumLib.titleAttributesParams): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.titleControl> property.
  			 */
  def setTitleControl(titleControl: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.titleImage> property.
  			 */
  def setTitleImage(titleImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.titlePrompt> property.
  			 */
  def setTitlePrompt(titlePrompt: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.titleid> property.
  			 */
  def setTitleid(titleid: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.titlepromptid> property.
  			 */
  def setTitlepromptid(titlepromptid: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the array of items to show in the window's toolbar.
  			 */
  /**
  			 * Sets the value of the <Titanium.UI.Window.toolbar> property.
  			 */
  def setToolbar(items: js.Array[_]): scala.Unit = js.native
  /**
  			 * Sets the array of items to show in the window's toolbar.
  			 */
  def setToolbar(items: js.Array[_], params: titaniumLib.windowToolbarParam): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.transitionAnimation> property.
  			 */
  def setTransitionAnimation(transitionAnimation: titaniumLib.TitaniumNs.Proxy): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.translucent> property.
  			 */
  def setTranslucent(translucent: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.url> property.
  			 */
  def setUrl(url: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.windowFlags> property.
  			 */
  def setWindowFlags(windowFlags: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.windowPixelFormat> property.
  			 */
  def setWindowPixelFormat(windowPixelFormat: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Window.windowSoftInputMode> property.
  			 */
  def setWindowSoftInputMode(windowSoftInputMode: scala.Double): scala.Unit = js.native
  /**
  			 * Makes the navigation bar visible.
  			 */
  def showNavBar(): scala.Unit = js.native
  /**
  			 * Makes the navigation bar visible.
  			 */
  def showNavBar(options: js.Any): scala.Unit = js.native
  /**
  			 * Makes the bottom toolbar visible.
  			 */
  def showToolbar(): scala.Unit = js.native
  /**
  			 * Makes the bottom toolbar visible.
  			 */
  def showToolbar(options: js.Any): scala.Unit = js.native
}

