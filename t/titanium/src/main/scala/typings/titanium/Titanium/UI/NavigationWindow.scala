package typings.titanium.Titanium.UI

import typings.titanium.Dimension
import typings.titanium.Titanium.Android.Activity
import typings.titanium.openWindowParams
import typings.titanium.titleAttributesParams
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
  var largeTitleEnabled: String = js.native
  /**
  			 * An Array of views to show in the left nav bar area.
  			 */
  var leftNavButtons: js.Array[View] = js.native
  /**
  			 * Indicates to open a modal window or not.
  			 */
  var modal: Boolean = js.native
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
  			 * An Array of views to show in the right nav bar area.
  			 */
  var rightNavButtons: js.Array[View] = js.native
  /**
  			 * The padding needed to safely display content without it being overlapped by the screen insets and notches.
  			 */
  val safeAreaPadding: Dimension = js.native
  /**
  			 * Boolean value to enable split action bar.
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
  			 * Name of the theme to apply to the window.
  			 */
  var theme: String = js.native
  /**
  			 * Title text attributes of the window.
  			 */
  var titleAttributes: titleAttributesParams = js.native
  /**
  			 * Window to add to this navigation window.
  			 */
  var window: Window = js.native
  /**
  			 * Additional flags to set on the Activity Window.
  			 */
  var windowFlags: Double = js.native
  /**
  			 * Set the pixel format for the Activity's Window.
  			 */
  var windowPixelFormat: Double = js.native
  /**
  			 * Determines whether a heavyweight window's soft input area (ie software keyboard) is visible
  			 * as it receives focus and how the window behaves in order to accomodate it while keeping its
  			 * contents in view.
  			 */
  var windowSoftInputMode: Double = js.native
  /**
  			 * Adds a common UI element to participate in window transition animation.
  			 */
  def addSharedElement(view: js.Any, transitionName: String): Unit = js.native
  /**
  			 * Closes the window.
  			 */
  def close(): Unit = js.native
  def close(params: js.Any): Unit = js.native
  /**
  			 * Closes a window and removes it from the navigation window.
  			 */
  def closeWindow(window: Window, options: js.Any): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.activity> property.
  			 */
  def getActivity(): Activity = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.activityEnterTransition> property.
  			 */
  def getActivityEnterTransition(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.activityExitTransition> property.
  			 */
  def getActivityExitTransition(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.activityReenterTransition> property.
  			 */
  def getActivityReenterTransition(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.activityReturnTransition> property.
  			 */
  def getActivityReturnTransition(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.activitySharedElementEnterTransition> property.
  			 */
  def getActivitySharedElementEnterTransition(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.activitySharedElementExitTransition> property.
  			 */
  def getActivitySharedElementExitTransition(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.activitySharedElementReenterTransition> property.
  			 */
  def getActivitySharedElementReenterTransition(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.activitySharedElementReturnTransition> property.
  			 */
  def getActivitySharedElementReturnTransition(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.autoAdjustScrollViewInsets> property.
  			 */
  def getAutoAdjustScrollViewInsets(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.exitOnClose> property.
  			 */
  def getExitOnClose(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.extendEdges> property.
  			 */
  def getExtendEdges(): js.Array[Double] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.extendSafeArea> property.
  			 */
  def getExtendSafeArea(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.flagSecure> property.
  			 */
  def getFlagSecure(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.fullscreen> property.
  			 */
  def getFullscreen(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.hidesBackButton> property.
  			 */
  def getHidesBackButton(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.hidesBarsOnSwipe> property.
  			 */
  def getHidesBarsOnSwipe(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.hidesBarsOnTap> property.
  			 */
  def getHidesBarsOnTap(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.hidesBarsWhenKeyboardAppears> property.
  			 */
  def getHidesBarsWhenKeyboardAppears(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.homeIndicatorAutoHidden> property.
  			 */
  def getHomeIndicatorAutoHidden(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.includeOpaqueBars> property.
  			 */
  def getIncludeOpaqueBars(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.largeTitleDisplayMode> property.
  			 */
  def getLargeTitleDisplayMode(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.largeTitleEnabled> property.
  			 */
  def getLargeTitleEnabled(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.leftNavButtons> property.
  			 */
  def getLeftNavButtons(): js.Array[View] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.modal> property.
  			 */
  def getModal(): Boolean = js.native
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
  def getOrientation(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.orientationModes> property.
  			 */
  def getOrientationModes(): js.Array[Double] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.rightNavButtons> property.
  			 */
  def getRightNavButtons(): js.Array[View] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.safeAreaPadding> property.
  			 */
  def getSafeAreaPadding(): Dimension = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.splitActionBar> property.
  			 */
  def getSplitActionBar(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.statusBarStyle> property.
  			 */
  def getStatusBarStyle(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.sustainedPerformanceMode> property.
  			 */
  def getSustainedPerformanceMode(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.theme> property.
  			 */
  def getTheme(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.titleAttributes> property.
  			 */
  def getTitleAttributes(): titleAttributesParams = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.window> property.
  			 */
  def getWindow(): Window = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.windowFlags> property.
  			 */
  def getWindowFlags(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.windowPixelFormat> property.
  			 */
  def getWindowPixelFormat(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.NavigationWindow.windowSoftInputMode> property.
  			 */
  def getWindowSoftInputMode(): Double = js.native
  /**
  			 * Hides the navigation bar.
  			 */
  def hideNavBar(): Unit = js.native
  def hideNavBar(options: js.Any): Unit = js.native
  /**
  			 * Makes the bottom toolbar invisible.
  			 */
  def hideToolbar(): Unit = js.native
  def hideToolbar(options: js.Any): Unit = js.native
  /**
  			 * Callback function that overrides the default behavior when the user presses the **Back**
  			 * button.
  			 */
  def onBack(param0: js.Any): js.Any = js.native
  /**
  			 * Opens the window.
  			 */
  def open(): Unit = js.native
  def open(params: openWindowParams): Unit = js.native
  /**
  			 * Opens a window within the navigation window.
  			 */
  def openWindow(window: Window, options: js.Any): Unit = js.native
  /**
  			 * Closes all windows that are currently opened inside the navigation window.
  			 */
  def popToRootWindow(options: js.Any): Unit = js.native
  /**
  			 * Clears all added shared elements.
  			 */
  def removeAllSharedElements(): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.activityEnterTransition> property.
  			 */
  def setActivityEnterTransition(activityEnterTransition: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.activityExitTransition> property.
  			 */
  def setActivityExitTransition(activityExitTransition: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.activityReenterTransition> property.
  			 */
  def setActivityReenterTransition(activityReenterTransition: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.activityReturnTransition> property.
  			 */
  def setActivityReturnTransition(activityReturnTransition: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.activitySharedElementEnterTransition> property.
  			 */
  def setActivitySharedElementEnterTransition(activitySharedElementEnterTransition: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.activitySharedElementExitTransition> property.
  			 */
  def setActivitySharedElementExitTransition(activitySharedElementExitTransition: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.activitySharedElementReenterTransition> property.
  			 */
  def setActivitySharedElementReenterTransition(activitySharedElementReenterTransition: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.activitySharedElementReturnTransition> property.
  			 */
  def setActivitySharedElementReturnTransition(activitySharedElementReturnTransition: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.autoAdjustScrollViewInsets> property.
  			 */
  def setAutoAdjustScrollViewInsets(autoAdjustScrollViewInsets: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.exitOnClose> property.
  			 */
  def setExitOnClose(exitOnClose: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.extendEdges> property.
  			 */
  def setExtendEdges(extendEdges: js.Array[Double]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.extendSafeArea> property.
  			 */
  def setExtendSafeArea(extendSafeArea: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.flagSecure> property.
  			 */
  def setFlagSecure(flagSecure: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.fullscreen> property.
  			 */
  def setFullscreen(fullscreen: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.hidesBackButton> property.
  			 */
  def setHidesBackButton(hidesBackButton: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.hidesBarsOnSwipe> property.
  			 */
  def setHidesBarsOnSwipe(hidesBarsOnSwipe: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.hidesBarsOnTap> property.
  			 */
  def setHidesBarsOnTap(hidesBarsOnTap: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.hidesBarsWhenKeyboardAppears> property.
  			 */
  def setHidesBarsWhenKeyboardAppears(hidesBarsWhenKeyboardAppears: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.homeIndicatorAutoHidden> property.
  			 */
  def setHomeIndicatorAutoHidden(homeIndicatorAutoHidden: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.includeOpaqueBars> property.
  			 */
  def setIncludeOpaqueBars(includeOpaqueBars: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.largeTitleDisplayMode> property.
  			 */
  def setLargeTitleDisplayMode(largeTitleDisplayMode: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.largeTitleEnabled> property.
  			 */
  def setLargeTitleEnabled(largeTitleEnabled: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.leftNavButtons> property.
  			 */
  def setLeftNavButtons(leftNavButtons: js.Array[_]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.modal> property.
  			 */
  def setModal(modal: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.onBack> property.
  			 */
  def setOnBack(onBack: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.orientationModes> property.
  			 */
  def setOrientationModes(orientationModes: js.Array[Double]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.rightNavButtons> property.
  			 */
  def setRightNavButtons(rightNavButtons: js.Array[_]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.splitActionBar> property.
  			 */
  def setSplitActionBar(splitActionBar: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.statusBarStyle> property.
  			 */
  def setStatusBarStyle(statusBarStyle: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.sustainedPerformanceMode> property.
  			 */
  def setSustainedPerformanceMode(sustainedPerformanceMode: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.theme> property.
  			 */
  def setTheme(theme: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.titleAttributes> property.
  			 */
  def setTitleAttributes(titleAttributes: titleAttributesParams): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.window> property.
  			 */
  def setWindow(window: Window): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.windowFlags> property.
  			 */
  def setWindowFlags(windowFlags: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.windowPixelFormat> property.
  			 */
  def setWindowPixelFormat(windowPixelFormat: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.NavigationWindow.windowSoftInputMode> property.
  			 */
  def setWindowSoftInputMode(windowSoftInputMode: Double): Unit = js.native
  /**
  			 * Makes the navigation bar visible.
  			 */
  def showNavBar(): Unit = js.native
  def showNavBar(options: js.Any): Unit = js.native
  /**
  			 * Makes the bottom toolbar visible.
  			 */
  def showToolbar(): Unit = js.native
  def showToolbar(options: js.Any): Unit = js.native
}

