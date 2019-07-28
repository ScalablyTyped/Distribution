package typings.titanium.TitaniumNs.UINs

import typings.titanium.Dimension
import typings.titanium.TitaniumNs.AndroidNs.Activity
import typings.titanium.TitaniumNs.Blob
import typings.titanium.TitaniumNs.Proxy
import typings.titanium.openWindowParams
import typings.titanium.titleAttributesParams
import typings.titanium.windowToolbarParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A tabbed group of windows.
		 */
@js.native
trait TabGroup extends View {
  /**
  			 * Active tab.
  			 */
  var activeTab: Double | Tab = js.native
  /**
  			 * Default background image for the active tab.
  			 */
  var activeTabBackgroundImage: String = js.native
  /**
  			 * Color applied to active tabs icons, as a color name or hex triplet, where the tab's activeIcon was not defined.
  			 */
  var activeTabIconTint: String = js.native
  /**
  			 * Reference to the Android Activity object associated with this tab group.
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
  			 * Allow the user to reorder tabs in the tab group using the **Edit** button on the **More**
  			 * tab.
  			 */
  var allowUserCustomization: Boolean = js.native
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
  			 * Default navigation bar color (typically for the **More** tab), as a color name or hex triplet.
  			 */
  var barColor: String = js.native
  /**
  			 * Background image for the nav bar, specified as a URL to a local image.
  			 */
  var barImage: String = js.native
  /**
  			 * Title for the edit button on the **More** tab.
  			 */
  var editButtonTitle: String = js.native
  /**
  			 * Boolean value indicating if the application should exit when closing the tab group, whether via Android
  			 * back button or the [close](Titanium.UI.TabGroup.close) method.
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
  			 * The tintColor to apply to the navigation bar (typically for the **More** tab).
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
  val safeAreaPadding: Dimension = js.native
  /**
  			 * Image of the shadow placed between the tab bar and the content area.
  			 */
  var shadowImage: String = js.native
  /**
  			 * Determines whether the BOTTOM_NAVIGATION_VIEW_STYLE uses shiftMode.
  			 */
  var shiftMode: Boolean = js.native
  /**
  			 * Boolean value indicating if changing pages by tab clicks is animated.
  			 */
  var smoothScrollOnTabClick: Boolean = js.native
  /**
  			 * Boolean value to enable split action bar.
  			 */
  var splitActionBar: Boolean = js.native
  /**
  			 * The status bar style associated with this window.
  			 */
  var statusBarStyle: Double = js.native
  /**
  			 * Property defining which style for the TabGroup to be used.
  			 */
  var style: Double = js.native
  /**
  			 * Maintain a sustainable level of performance.
  			 */
  var sustainedPerformanceMode: Boolean = js.native
  /**
  			 * Boolean value indicating if the user should be able to close a window using a swipe gesture.
  			 */
  var swipeToClose: Boolean = js.native
  /**
  			 * Boolean value indicating if tab navigation can be done by swipes, in addition to tab clicks.
  			 */
  var swipeable: Boolean = js.native
  /**
  			 * Boolean value indicating if the tab bar should be hidden.
  			 */
  var tabBarHidden: Boolean = js.native
  /**
  			 * Tabs managed by the tab group.
  			 */
  var tabs: js.Array[Tab] = js.native
  /**
  			 * Default background color for inactive tabs, as a color name or hex triplet.
  			 */
  var tabsBackgroundColor: String = js.native
  /**
  			 * Default background image for tabs.
  			 */
  var tabsBackgroundImage: String = js.native
  /**
  			 * Default background selected color for tabs, as a color name or hex triplet.
  			 */
  var tabsBackgroundSelectedColor: String = js.native
  /**
  			 * The tintColor to apply to the tabs.
  			 */
  var tabsTintColor: String = js.native
  /**
  			 * A Boolean value that indicates whether the tab bar is translucent.
  			 */
  var tabsTranslucent: Boolean = js.native
  /**
  			 * Name of the theme to apply to the window.
  			 */
  var theme: String = js.native
  /**
  			 * Title for this tabGroup.
  			 */
  var title: String = js.native
  /**
  			 * Title text attributes of the window to be applied on the **More** tab.
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
  var toolbar: js.Array[_] = js.native
  /**
  			 * Use a transition animation when opening or closing windows in a
  			 * <Titanium.UI.NavigationWindow> or <Titanium.UI.Tab>.
  			 */
  var transitionAnimation: Proxy = js.native
  /**
  			 * Boolean value indicating if the nav bar (typically for the **More** tab), is translucent.
  			 */
  var translucent: Boolean = js.native
  /**
  			 * Unselected items in this tab group will be tinted with this color. Setting this value to null
  			 * indicates that the tab group should use its default value instead.
  			 */
  var unselectedItemTintColor: String = js.native
  /**
  			 * Loads a JavaScript file from a local URL.
  			 */
  var url: String = js.native
  /**
  			 * Additional flags to set on the Activity Window.
  			 */
  var windowFlags: Double = js.native
  /**
  			 * Set the pixel format for the Activity's Window.
  			 */
  var windowPixelFormat: Double = js.native
  /**
  			 * Determines how the tab group is treated when a soft input method (such as a virtual keyboard)
  			 * is displayed.
  			 */
  var windowSoftInputMode: Double = js.native
  /**
  			 * Adds a common UI element to participate in window transition animation.
  			 */
  def addSharedElement(view: js.Any, transitionName: String): Unit = js.native
  /**
  			 * Adds a tab to the tab group.
  			 */
  def addTab(tab: Tab): Unit = js.native
  /**
  			 * Closes the tab group and removes it from the UI.
  			 */
  def close(): Unit = js.native
  def close(params: js.Any): Unit = js.native
  /**
  			 * Disable (or re-enable) tab navigation. If tab navigation is disabled, the tabs are hidden and
  			 * the last selected tab window is shown.
  			 */
  def disableTabNavigation(disable: Boolean): Unit = js.native
  /**
  			 * Gets the currently-active tab.
  			 */
  def getActiveTab(): Tab = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.activeTabBackgroundImage> property.
  			 */
  def getActiveTabBackgroundImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.activeTabIconTint> property.
  			 */
  def getActiveTabIconTint(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.activity> property.
  			 */
  def getActivity(): Activity = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.activityEnterTransition> property.
  			 */
  def getActivityEnterTransition(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.activityExitTransition> property.
  			 */
  def getActivityExitTransition(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.activityReenterTransition> property.
  			 */
  def getActivityReenterTransition(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.activityReturnTransition> property.
  			 */
  def getActivityReturnTransition(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.activitySharedElementEnterTransition> property.
  			 */
  def getActivitySharedElementEnterTransition(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.activitySharedElementExitTransition> property.
  			 */
  def getActivitySharedElementExitTransition(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.activitySharedElementReenterTransition> property.
  			 */
  def getActivitySharedElementReenterTransition(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.activitySharedElementReturnTransition> property.
  			 */
  def getActivitySharedElementReturnTransition(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.allowUserCustomization> property.
  			 */
  def getAllowUserCustomization(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.autoAdjustScrollViewInsets> property.
  			 */
  def getAutoAdjustScrollViewInsets(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.backButtonTitle> property.
  			 */
  def getBackButtonTitle(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.backButtonTitleImage> property.
  			 */
  def getBackButtonTitleImage(): String | Blob = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.barColor> property.
  			 */
  def getBarColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.barImage> property.
  			 */
  def getBarImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.editButtonTitle> property.
  			 */
  def getEditButtonTitle(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.exitOnClose> property.
  			 */
  def getExitOnClose(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.extendEdges> property.
  			 */
  def getExtendEdges(): js.Array[Double] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.extendSafeArea> property.
  			 */
  def getExtendSafeArea(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.flagSecure> property.
  			 */
  def getFlagSecure(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.fullscreen> property.
  			 */
  def getFullscreen(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.hideShadow> property.
  			 */
  def getHideShadow(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.hidesBackButton> property.
  			 */
  def getHidesBackButton(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.hidesBarsOnSwipe> property.
  			 */
  def getHidesBarsOnSwipe(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.hidesBarsOnTap> property.
  			 */
  def getHidesBarsOnTap(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.hidesBarsWhenKeyboardAppears> property.
  			 */
  def getHidesBarsWhenKeyboardAppears(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.homeIndicatorAutoHidden> property.
  			 */
  def getHomeIndicatorAutoHidden(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.includeOpaqueBars> property.
  			 */
  def getIncludeOpaqueBars(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.largeTitleDisplayMode> property.
  			 */
  def getLargeTitleDisplayMode(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.largeTitleEnabled> property.
  			 */
  def getLargeTitleEnabled(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.leftNavButton> property.
  			 */
  def getLeftNavButton(): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.leftNavButtons> property.
  			 */
  def getLeftNavButtons(): js.Array[View] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.modal> property.
  			 */
  def getModal(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.navBarHidden> property.
  			 */
  def getNavBarHidden(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.navTintColor> property.
  			 */
  def getNavTintColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.navigationWindow> property.
  			 */
  def getNavigationWindow(): NavigationWindow = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.onBack> property.
  			 */
  def getOnBack(): js.Function1[/* param0 */ js.Any, _] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.orientation> property.
  			 */
  def getOrientation(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.orientationModes> property.
  			 */
  def getOrientationModes(): js.Array[Double] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.rightNavButton> property.
  			 */
  def getRightNavButton(): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.rightNavButtons> property.
  			 */
  def getRightNavButtons(): js.Array[View] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.safeAreaPadding> property.
  			 */
  def getSafeAreaPadding(): Dimension = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.shadowImage> property.
  			 */
  def getShadowImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.shiftMode> property.
  			 */
  def getShiftMode(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.smoothScrollOnTabClick> property.
  			 */
  def getSmoothScrollOnTabClick(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.splitActionBar> property.
  			 */
  def getSplitActionBar(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.statusBarStyle> property.
  			 */
  def getStatusBarStyle(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.style> property.
  			 */
  def getStyle(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.sustainedPerformanceMode> property.
  			 */
  def getSustainedPerformanceMode(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.swipeToClose> property.
  			 */
  def getSwipeToClose(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.swipeable> property.
  			 */
  def getSwipeable(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.tabBarHidden> property.
  			 */
  def getTabBarHidden(): Boolean = js.native
  /**
  			 * Gets all tabs that are managed by the tab group.
  			 */
  def getTabs(): js.Array[Tab] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.tabsBackgroundColor> property.
  			 */
  def getTabsBackgroundColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.tabsBackgroundImage> property.
  			 */
  def getTabsBackgroundImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.tabsBackgroundSelectedColor> property.
  			 */
  def getTabsBackgroundSelectedColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.tabsTintColor> property.
  			 */
  def getTabsTintColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.tabsTranslucent> property.
  			 */
  def getTabsTranslucent(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.theme> property.
  			 */
  def getTheme(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.title> property.
  			 */
  def getTitle(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.titleAttributes> property.
  			 */
  def getTitleAttributes(): titleAttributesParams = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.titleControl> property.
  			 */
  def getTitleControl(): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.titleImage> property.
  			 */
  def getTitleImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.titlePrompt> property.
  			 */
  def getTitlePrompt(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.titleid> property.
  			 */
  def getTitleid(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.titlepromptid> property.
  			 */
  def getTitlepromptid(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.toolbar> property.
  			 */
  def getToolbar(): js.Array[_] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.transitionAnimation> property.
  			 */
  def getTransitionAnimation(): Proxy = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.translucent> property.
  			 */
  def getTranslucent(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.unselectedItemTintColor> property.
  			 */
  def getUnselectedItemTintColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.url> property.
  			 */
  def getUrl(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.windowFlags> property.
  			 */
  def getWindowFlags(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.windowPixelFormat> property.
  			 */
  def getWindowPixelFormat(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.windowSoftInputMode> property.
  			 */
  def getWindowSoftInputMode(): Double = js.native
  /**
  			 * Hides the navigation bar.
  			 */
  def hideNavBar(): Unit = js.native
  def hideNavBar(options: js.Any): Unit = js.native
  /**
  			 * Hides the tab bar. Must be called before opening the window.
  			 */
  def hideTabBar(): Unit = js.native
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
  			 * Opens the tab group and makes it visible.
  			 */
  def open(): Unit = js.native
  def open(params: openWindowParams): Unit = js.native
  /**
  			 * Clears all added shared elements.
  			 */
  def removeAllSharedElements(): Unit = js.native
  /**
  			 * Removes a tab from the tab group.
  			 */
  def removeTab(tab: Tab): Unit = js.native
  /**
  			 * Selects the currently active tab in a tab group.
  			 */
  def setActiveTab(indexOrObject: Double): Unit = js.native
  /**
  			 * Selects the currently active tab in a tab group.
  			 */
  def setActiveTab(indexOrObject: Tab): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.activeTabBackgroundImage> property.
  			 */
  def setActiveTabBackgroundImage(activeTabBackgroundImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.activeTabIconTint> property.
  			 */
  def setActiveTabIconTint(activeTabIconTint: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.activityEnterTransition> property.
  			 */
  def setActivityEnterTransition(activityEnterTransition: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.activityExitTransition> property.
  			 */
  def setActivityExitTransition(activityExitTransition: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.activityReenterTransition> property.
  			 */
  def setActivityReenterTransition(activityReenterTransition: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.activityReturnTransition> property.
  			 */
  def setActivityReturnTransition(activityReturnTransition: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.activitySharedElementEnterTransition> property.
  			 */
  def setActivitySharedElementEnterTransition(activitySharedElementEnterTransition: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.activitySharedElementExitTransition> property.
  			 */
  def setActivitySharedElementExitTransition(activitySharedElementExitTransition: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.activitySharedElementReenterTransition> property.
  			 */
  def setActivitySharedElementReenterTransition(activitySharedElementReenterTransition: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.activitySharedElementReturnTransition> property.
  			 */
  def setActivitySharedElementReturnTransition(activitySharedElementReturnTransition: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.allowUserCustomization> property.
  			 */
  def setAllowUserCustomization(allowUserCustomization: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.autoAdjustScrollViewInsets> property.
  			 */
  def setAutoAdjustScrollViewInsets(autoAdjustScrollViewInsets: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.backButtonTitle> property.
  			 */
  def setBackButtonTitle(backButtonTitle: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.backButtonTitleImage> property.
  			 */
  def setBackButtonTitleImage(backButtonTitleImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.backButtonTitleImage> property.
  			 */
  def setBackButtonTitleImage(backButtonTitleImage: Blob): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.barColor> property.
  			 */
  def setBarColor(barColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.barImage> property.
  			 */
  def setBarImage(barImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.editButtonTitle> property.
  			 */
  def setEditButtonTitle(editButtonTitle: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.exitOnClose> property.
  			 */
  def setExitOnClose(exitOnClose: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.extendEdges> property.
  			 */
  def setExtendEdges(extendEdges: js.Array[Double]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.extendSafeArea> property.
  			 */
  def setExtendSafeArea(extendSafeArea: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.flagSecure> property.
  			 */
  def setFlagSecure(flagSecure: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.fullscreen> property.
  			 */
  def setFullscreen(fullscreen: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.hideShadow> property.
  			 */
  def setHideShadow(hideShadow: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.hidesBackButton> property.
  			 */
  def setHidesBackButton(hidesBackButton: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.hidesBarsOnSwipe> property.
  			 */
  def setHidesBarsOnSwipe(hidesBarsOnSwipe: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.hidesBarsOnTap> property.
  			 */
  def setHidesBarsOnTap(hidesBarsOnTap: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.hidesBarsWhenKeyboardAppears> property.
  			 */
  def setHidesBarsWhenKeyboardAppears(hidesBarsWhenKeyboardAppears: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.homeIndicatorAutoHidden> property.
  			 */
  def setHomeIndicatorAutoHidden(homeIndicatorAutoHidden: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.includeOpaqueBars> property.
  			 */
  def setIncludeOpaqueBars(includeOpaqueBars: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.largeTitleDisplayMode> property.
  			 */
  def setLargeTitleDisplayMode(largeTitleDisplayMode: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.largeTitleEnabled> property.
  			 */
  def setLargeTitleEnabled(largeTitleEnabled: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.leftNavButton> property.
  			 */
  def setLeftNavButton(leftNavButton: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.leftNavButtons> property.
  			 */
  def setLeftNavButtons(leftNavButtons: js.Array[_]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.modal> property.
  			 */
  def setModal(modal: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.navBarHidden> property.
  			 */
  def setNavBarHidden(navBarHidden: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.navTintColor> property.
  			 */
  def setNavTintColor(navTintColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.onBack> property.
  			 */
  def setOnBack(onBack: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.orientationModes> property.
  			 */
  def setOrientationModes(orientationModes: js.Array[Double]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.rightNavButton> property.
  			 */
  def setRightNavButton(rightNavButton: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.rightNavButtons> property.
  			 */
  def setRightNavButtons(rightNavButtons: js.Array[_]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.shadowImage> property.
  			 */
  def setShadowImage(shadowImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.shiftMode> property.
  			 */
  def setShiftMode(shiftMode: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.smoothScrollOnTabClick> property.
  			 */
  def setSmoothScrollOnTabClick(smoothScrollOnTabClick: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.splitActionBar> property.
  			 */
  def setSplitActionBar(splitActionBar: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.statusBarStyle> property.
  			 */
  def setStatusBarStyle(statusBarStyle: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.style> property.
  			 */
  def setStyle(style: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.sustainedPerformanceMode> property.
  			 */
  def setSustainedPerformanceMode(sustainedPerformanceMode: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.swipeToClose> property.
  			 */
  def setSwipeToClose(swipeToClose: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.swipeable> property.
  			 */
  def setSwipeable(swipeable: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.tabBarHidden> property.
  			 */
  def setTabBarHidden(tabBarHidden: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.tabs> property.
  			 */
  def setTabs(tabs: js.Array[Tab]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.tabsBackgroundColor> property.
  			 */
  def setTabsBackgroundColor(tabsBackgroundColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.tabsBackgroundImage> property.
  			 */
  def setTabsBackgroundImage(tabsBackgroundImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.tabsBackgroundSelectedColor> property.
  			 */
  def setTabsBackgroundSelectedColor(tabsBackgroundSelectedColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.tabsTintColor> property.
  			 */
  def setTabsTintColor(tabsTintColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.tabsTranslucent> property.
  			 */
  def setTabsTranslucent(tabsTranslucent: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.theme> property.
  			 */
  def setTheme(theme: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.title> property.
  			 */
  def setTitle(title: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.titleAttributes> property.
  			 */
  def setTitleAttributes(titleAttributes: titleAttributesParams): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.titleControl> property.
  			 */
  def setTitleControl(titleControl: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.titleImage> property.
  			 */
  def setTitleImage(titleImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.titlePrompt> property.
  			 */
  def setTitlePrompt(titlePrompt: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.titleid> property.
  			 */
  def setTitleid(titleid: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.titlepromptid> property.
  			 */
  def setTitlepromptid(titlepromptid: String): Unit = js.native
  /**
  			 * Sets the array of items to show in the window's toolbar.
  			 */
  def setToolbar(items: js.Array[_]): Unit = js.native
  def setToolbar(items: js.Array[_], params: windowToolbarParam): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.transitionAnimation> property.
  			 */
  def setTransitionAnimation(transitionAnimation: Proxy): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.translucent> property.
  			 */
  def setTranslucent(translucent: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.unselectedItemTintColor> property.
  			 */
  def setUnselectedItemTintColor(unselectedItemTintColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.url> property.
  			 */
  def setUrl(url: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.windowFlags> property.
  			 */
  def setWindowFlags(windowFlags: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.windowPixelFormat> property.
  			 */
  def setWindowPixelFormat(windowPixelFormat: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.windowSoftInputMode> property.
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

