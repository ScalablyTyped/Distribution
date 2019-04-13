package typings
package titaniumLib.TitaniumNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A `NavigationWindow` implements a specialized view that manages the navigation of hierarchical
		 * content.
		 */
@js.native
trait NavigationWindow extends View {
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
  			 * Specifies whether the screen insets/notches are allowed to overlap the window's content or not.
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
  			 * An Array of views to show in the left nav bar area.
  			 */
  var leftNavButtons: js.Array[View] = js.native
  /**
  			 * Indicates to open a modal window or not.
  			 */
  var modal: scala.Boolean = js.native
  /**
  			 * The <Titanium.UI.NavigationWindow> instance hosting this window.
  			 */
  val navigationWindow: NavigationWindow = js.native
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
  			 * An Array of views to show in the right nav bar area.
  			 */
  var rightNavButtons: js.Array[View] = js.native
  /**
  			 * The padding needed to safely display content without it being overlapped by the screen insets and notches.
  			 */
  val safeAreaPadding: titaniumLib.Dimension = js.native
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
  			 * Name of the theme to apply to the window.
  			 */
  var theme: java.lang.String = js.native
  /**
  			 * Title text attributes of the window.
  			 */
  var titleAttributes: titaniumLib.titleAttributesParams = js.native
  /**
  			 * Window to add to this navigation window.
  			 */
  var window: Window = js.native
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
  def close(params: js.Any): scala.Unit = js.native
  /**
  			 * Closes a window and removes it from the navigation window.
  			 */
  def closeWindow(window: Window, options: js.Any): scala.Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.activity> property.
  			 */
  def getActivity(): titaniumLib.TitaniumNs.AndroidNs.Activity = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.activityEnterTransition> property.
  			 */
  def getActivityEnterTransition(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.activityExitTransition> property.
  			 */
  def getActivityExitTransition(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.activityReenterTransition> property.
  			 */
  def getActivityReenterTransition(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.activityReturnTransition> property.
  			 */
  def getActivityReturnTransition(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.activitySharedElementEnterTransition> property.
  			 */
  def getActivitySharedElementEnterTransition(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.activitySharedElementExitTransition> property.
  			 */
  def getActivitySharedElementExitTransition(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.activitySharedElementReenterTransition> property.
  			 */
  def getActivitySharedElementReenterTransition(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.activitySharedElementReturnTransition> property.
  			 */
  def getActivitySharedElementReturnTransition(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.autoAdjustScrollViewInsets> property.
  			 */
  def getAutoAdjustScrollViewInsets(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.exitOnClose> property.
  			 */
  def getExitOnClose(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.extendEdges> property.
  			 */
  def getExtendEdges(): js.Array[scala.Double] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.extendSafeArea> property.
  			 */
  def getExtendSafeArea(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.flagSecure> property.
  			 */
  def getFlagSecure(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.fullscreen> property.
  			 */
  def getFullscreen(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.hidesBackButton> property.
  			 */
  def getHidesBackButton(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.hidesBarsOnSwipe> property.
  			 */
  def getHidesBarsOnSwipe(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.hidesBarsOnTap> property.
  			 */
  def getHidesBarsOnTap(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.hidesBarsWhenKeyboardAppears> property.
  			 */
  def getHidesBarsWhenKeyboardAppears(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.homeIndicatorAutoHidden> property.
  			 */
  def getHomeIndicatorAutoHidden(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.includeOpaqueBars> property.
  			 */
  def getIncludeOpaqueBars(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.largeTitleDisplayMode> property.
  			 */
  def getLargeTitleDisplayMode(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.largeTitleEnabled> property.
  			 */
  def getLargeTitleEnabled(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.leftNavButtons> property.
  			 */
  def getLeftNavButtons(): js.Array[View] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.modal> property.
  			 */
  def getModal(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.navigationWindow> property.
  			 */
  def getNavigationWindow(): NavigationWindow = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.onBack> property.
  			 */
  def getOnBack(): js.Function1[/* param0 */ js.Any, _] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.orientation> property.
  			 */
  def getOrientation(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.orientationModes> property.
  			 */
  def getOrientationModes(): js.Array[scala.Double] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.rightNavButtons> property.
  			 */
  def getRightNavButtons(): js.Array[View] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.safeAreaPadding> property.
  			 */
  def getSafeAreaPadding(): titaniumLib.Dimension = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.splitActionBar> property.
  			 */
  def getSplitActionBar(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.statusBarStyle> property.
  			 */
  def getStatusBarStyle(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.sustainedPerformanceMode> property.
  			 */
  def getSustainedPerformanceMode(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.theme> property.
  			 */
  def getTheme(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.titleAttributes> property.
  			 */
  def getTitleAttributes(): titaniumLib.titleAttributesParams = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.window> property.
  			 */
  def getWindow(): Window = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.windowFlags> property.
  			 */
  def getWindowFlags(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.windowPixelFormat> property.
  			 */
  def getWindowPixelFormat(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.windowSoftInputMode> property.
  			 */
  def getWindowSoftInputMode(): scala.Double = js.native
  /**
  			 * Hides the navigation bar.
  			 */
  def hideNavBar(): scala.Unit = js.native
  def hideNavBar(options: js.Any): scala.Unit = js.native
  /**
  			 * Makes the bottom toolbar invisible.
  			 */
  def hideToolbar(): scala.Unit = js.native
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
  def open(params: titaniumLib.openWindowParams): scala.Unit = js.native
  /**
  			 * Opens a window within the navigation window.
  			 */
  def openWindow(window: Window, options: js.Any): scala.Unit = js.native
  /**
  			 * Closes all windows that are currently opened inside the navigation window.
  			 */
  def popToRootWindow(options: js.Any): scala.Unit = js.native
  /**
  			 * Clears all added shared elements.
  			 */
  def removeAllSharedElements(): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.activityEnterTransition> property.
  			 */
  def setActivityEnterTransition(activityEnterTransition: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.activityExitTransition> property.
  			 */
  def setActivityExitTransition(activityExitTransition: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.activityReenterTransition> property.
  			 */
  def setActivityReenterTransition(activityReenterTransition: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.activityReturnTransition> property.
  			 */
  def setActivityReturnTransition(activityReturnTransition: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.activitySharedElementEnterTransition> property.
  			 */
  def setActivitySharedElementEnterTransition(activitySharedElementEnterTransition: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.activitySharedElementExitTransition> property.
  			 */
  def setActivitySharedElementExitTransition(activitySharedElementExitTransition: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.activitySharedElementReenterTransition> property.
  			 */
  def setActivitySharedElementReenterTransition(activitySharedElementReenterTransition: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.activitySharedElementReturnTransition> property.
  			 */
  def setActivitySharedElementReturnTransition(activitySharedElementReturnTransition: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.autoAdjustScrollViewInsets> property.
  			 */
  def setAutoAdjustScrollViewInsets(autoAdjustScrollViewInsets: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.exitOnClose> property.
  			 */
  def setExitOnClose(exitOnClose: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.extendEdges> property.
  			 */
  def setExtendEdges(extendEdges: js.Array[scala.Double]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.extendSafeArea> property.
  			 */
  def setExtendSafeArea(extendSafeArea: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.flagSecure> property.
  			 */
  def setFlagSecure(flagSecure: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.fullscreen> property.
  			 */
  def setFullscreen(fullscreen: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.hidesBackButton> property.
  			 */
  def setHidesBackButton(hidesBackButton: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.hidesBarsOnSwipe> property.
  			 */
  def setHidesBarsOnSwipe(hidesBarsOnSwipe: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.hidesBarsOnTap> property.
  			 */
  def setHidesBarsOnTap(hidesBarsOnTap: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.hidesBarsWhenKeyboardAppears> property.
  			 */
  def setHidesBarsWhenKeyboardAppears(hidesBarsWhenKeyboardAppears: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.homeIndicatorAutoHidden> property.
  			 */
  def setHomeIndicatorAutoHidden(homeIndicatorAutoHidden: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.includeOpaqueBars> property.
  			 */
  def setIncludeOpaqueBars(includeOpaqueBars: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.largeTitleDisplayMode> property.
  			 */
  def setLargeTitleDisplayMode(largeTitleDisplayMode: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.largeTitleEnabled> property.
  			 */
  def setLargeTitleEnabled(largeTitleEnabled: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.leftNavButtons> property.
  			 */
  def setLeftNavButtons(leftNavButtons: js.Array[_]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.modal> property.
  			 */
  def setModal(modal: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.onBack> property.
  			 */
  def setOnBack(onBack: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.orientationModes> property.
  			 */
  def setOrientationModes(orientationModes: js.Array[scala.Double]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.rightNavButtons> property.
  			 */
  def setRightNavButtons(rightNavButtons: js.Array[_]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.splitActionBar> property.
  			 */
  def setSplitActionBar(splitActionBar: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.statusBarStyle> property.
  			 */
  def setStatusBarStyle(statusBarStyle: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.sustainedPerformanceMode> property.
  			 */
  def setSustainedPerformanceMode(sustainedPerformanceMode: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.theme> property.
  			 */
  def setTheme(theme: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.titleAttributes> property.
  			 */
  def setTitleAttributes(titleAttributes: titaniumLib.titleAttributesParams): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.window> property.
  			 */
  def setWindow(window: Window): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.windowFlags> property.
  			 */
  def setWindowFlags(windowFlags: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.windowPixelFormat> property.
  			 */
  def setWindowPixelFormat(windowPixelFormat: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.windowSoftInputMode> property.
  			 */
  def setWindowSoftInputMode(windowSoftInputMode: scala.Double): scala.Unit = js.native
  /**
  			 * Makes the navigation bar visible.
  			 */
  def showNavBar(): scala.Unit = js.native
  def showNavBar(options: js.Any): scala.Unit = js.native
  /**
  			 * Makes the bottom toolbar visible.
  			 */
  def showToolbar(): scala.Unit = js.native
  def showToolbar(options: js.Any): scala.Unit = js.native
}

