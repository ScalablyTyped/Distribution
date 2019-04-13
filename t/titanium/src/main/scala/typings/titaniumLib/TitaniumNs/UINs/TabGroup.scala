package typings
package titaniumLib.TitaniumNs.UINs

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
  var activeTab: scala.Double | Tab = js.native
  /**
  			 * Default background image for the active tab.
  			 */
  var activeTabBackgroundImage: java.lang.String = js.native
  /**
  			 * Color applied to active tabs icons, as a color name or hex triplet, where the tab's activeIcon was not defined.
  			 */
  var activeTabIconTint: java.lang.String = js.native
  /**
  			 * Reference to the Android Activity object associated with this tab group.
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
  			 * Allow the user to reorder tabs in the tab group using the **Edit** button on the **More**
  			 * tab.
  			 */
  var allowUserCustomization: scala.Boolean = js.native
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
  			 * Default navigation bar color (typically for the **More** tab), as a color name or hex triplet.
  			 */
  var barColor: java.lang.String = js.native
  /**
  			 * Background image for the nav bar, specified as a URL to a local image.
  			 */
  var barImage: java.lang.String = js.native
  /**
  			 * Title for the edit button on the **More** tab.
  			 */
  var editButtonTitle: java.lang.String = js.native
  /**
  			 * Boolean value indicating if the application should exit when closing the tab group, whether via Android
  			 * back button or the [close](Titanium.UI.TabGroup.close) method.
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
  			 * The tintColor to apply to the navigation bar (typically for the **More** tab).
  			 */
  var navTintColor: java.lang.String = js.native
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
  val safeAreaPadding: titaniumLib.Dimension = js.native
  /**
  			 * Image of the shadow placed between the tab bar and the content area.
  			 */
  var shadowImage: java.lang.String = js.native
  /**
  			 * Determines whether the BOTTOM_NAVIGATION_VIEW_STYLE uses shiftMode.
  			 */
  var shiftMode: scala.Boolean = js.native
  /**
  			 * Boolean value indicating if changing pages by tab clicks is animated.
  			 */
  var smoothScrollOnTabClick: scala.Boolean = js.native
  /**
  			 * Boolean value to enable split action bar.
  			 */
  var splitActionBar: scala.Boolean = js.native
  /**
  			 * The status bar style associated with this window.
  			 */
  var statusBarStyle: scala.Double = js.native
  /**
  			 * Property defining which style for the TabGroup to be used.
  			 */
  var style: scala.Double = js.native
  /**
  			 * Maintain a sustainable level of performance.
  			 */
  var sustainedPerformanceMode: scala.Boolean = js.native
  /**
  			 * Boolean value indicating if the user should be able to close a window using a swipe gesture.
  			 */
  var swipeToClose: scala.Boolean = js.native
  /**
  			 * Boolean value indicating if tab navigation can be done by swipes, in addition to tab clicks.
  			 */
  var swipeable: scala.Boolean = js.native
  /**
  			 * Boolean value indicating if the tab bar should be hidden.
  			 */
  var tabBarHidden: scala.Boolean = js.native
  /**
  			 * Tabs managed by the tab group.
  			 */
  var tabs: js.Array[Tab] = js.native
  /**
  			 * Default background color for inactive tabs, as a color name or hex triplet.
  			 */
  var tabsBackgroundColor: java.lang.String = js.native
  /**
  			 * Default background image for tabs.
  			 */
  var tabsBackgroundImage: java.lang.String = js.native
  /**
  			 * Default background selected color for tabs, as a color name or hex triplet.
  			 */
  var tabsBackgroundSelectedColor: java.lang.String = js.native
  /**
  			 * The tintColor to apply to the tabs.
  			 */
  var tabsTintColor: java.lang.String = js.native
  /**
  			 * A Boolean value that indicates whether the tab bar is translucent.
  			 */
  var tabsTranslucent: scala.Boolean = js.native
  /**
  			 * Name of the theme to apply to the window.
  			 */
  var theme: java.lang.String = js.native
  /**
  			 * Title for this tabGroup.
  			 */
  var title: java.lang.String = js.native
  /**
  			 * Title text attributes of the window to be applied on the **More** tab.
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
  			 * <Titanium.UI.NavigationWindow> or <Titanium.UI.Tab>.
  			 */
  var transitionAnimation: titaniumLib.TitaniumNs.Proxy = js.native
  /**
  			 * Boolean value indicating if the nav bar (typically for the **More** tab), is translucent.
  			 */
  var translucent: scala.Boolean = js.native
  /**
  			 * Unselected items in this tab group will be tinted with this color. Setting this value to null
  			 * indicates that the tab group should use its default value instead.
  			 */
  var unselectedItemTintColor: java.lang.String = js.native
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
  			 * Determines how the tab group is treated when a soft input method (such as a virtual keyboard)
  			 * is displayed.
  			 */
  var windowSoftInputMode: scala.Double = js.native
  /**
  			 * Adds a common UI element to participate in window transition animation.
  			 */
  def addSharedElement(view: js.Any, transitionName: java.lang.String): scala.Unit = js.native
  /**
  			 * Adds a tab to the tab group.
  			 */
  def addTab(tab: Tab): scala.Unit = js.native
  /**
  			 * Closes the tab group and removes it from the UI.
  			 */
  def close(): scala.Unit = js.native
  def close(params: js.Any): scala.Unit = js.native
  /**
  			 * Disable (or re-enable) tab navigation. If tab navigation is disabled, the tabs are hidden and
  			 * the last selected tab window is shown.
  			 */
  def disableTabNavigation(disable: scala.Boolean): scala.Unit = js.native
  /**
  			 * Gets the currently-active tab.
  			 */
  def getActiveTab(): Tab = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.activeTabBackgroundImage> property.
  			 */
  def getActiveTabBackgroundImage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.activeTabIconTint> property.
  			 */
  def getActiveTabIconTint(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.activity> property.
  			 */
  def getActivity(): titaniumLib.TitaniumNs.AndroidNs.Activity = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.activityEnterTransition> property.
  			 */
  def getActivityEnterTransition(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.activityExitTransition> property.
  			 */
  def getActivityExitTransition(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.activityReenterTransition> property.
  			 */
  def getActivityReenterTransition(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.activityReturnTransition> property.
  			 */
  def getActivityReturnTransition(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.activitySharedElementEnterTransition> property.
  			 */
  def getActivitySharedElementEnterTransition(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.activitySharedElementExitTransition> property.
  			 */
  def getActivitySharedElementExitTransition(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.activitySharedElementReenterTransition> property.
  			 */
  def getActivitySharedElementReenterTransition(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.activitySharedElementReturnTransition> property.
  			 */
  def getActivitySharedElementReturnTransition(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.allowUserCustomization> property.
  			 */
  def getAllowUserCustomization(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.autoAdjustScrollViewInsets> property.
  			 */
  def getAutoAdjustScrollViewInsets(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.backButtonTitle> property.
  			 */
  def getBackButtonTitle(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.backButtonTitleImage> property.
  			 */
  def getBackButtonTitleImage(): java.lang.String | titaniumLib.TitaniumNs.Blob = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.barColor> property.
  			 */
  def getBarColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.barImage> property.
  			 */
  def getBarImage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.editButtonTitle> property.
  			 */
  def getEditButtonTitle(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.exitOnClose> property.
  			 */
  def getExitOnClose(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.extendEdges> property.
  			 */
  def getExtendEdges(): js.Array[scala.Double] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.extendSafeArea> property.
  			 */
  def getExtendSafeArea(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.flagSecure> property.
  			 */
  def getFlagSecure(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.fullscreen> property.
  			 */
  def getFullscreen(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.hideShadow> property.
  			 */
  def getHideShadow(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.hidesBackButton> property.
  			 */
  def getHidesBackButton(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.hidesBarsOnSwipe> property.
  			 */
  def getHidesBarsOnSwipe(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.hidesBarsOnTap> property.
  			 */
  def getHidesBarsOnTap(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.hidesBarsWhenKeyboardAppears> property.
  			 */
  def getHidesBarsWhenKeyboardAppears(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.homeIndicatorAutoHidden> property.
  			 */
  def getHomeIndicatorAutoHidden(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.includeOpaqueBars> property.
  			 */
  def getIncludeOpaqueBars(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.largeTitleDisplayMode> property.
  			 */
  def getLargeTitleDisplayMode(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.largeTitleEnabled> property.
  			 */
  def getLargeTitleEnabled(): java.lang.String = js.native
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
  def getModal(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.navBarHidden> property.
  			 */
  def getNavBarHidden(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.navTintColor> property.
  			 */
  def getNavTintColor(): java.lang.String = js.native
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
  def getOrientation(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.orientationModes> property.
  			 */
  def getOrientationModes(): js.Array[scala.Double] = js.native
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
  def getSafeAreaPadding(): titaniumLib.Dimension = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.shadowImage> property.
  			 */
  def getShadowImage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.shiftMode> property.
  			 */
  def getShiftMode(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.smoothScrollOnTabClick> property.
  			 */
  def getSmoothScrollOnTabClick(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.splitActionBar> property.
  			 */
  def getSplitActionBar(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.statusBarStyle> property.
  			 */
  def getStatusBarStyle(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.style> property.
  			 */
  def getStyle(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.sustainedPerformanceMode> property.
  			 */
  def getSustainedPerformanceMode(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.swipeToClose> property.
  			 */
  def getSwipeToClose(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.swipeable> property.
  			 */
  def getSwipeable(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.tabBarHidden> property.
  			 */
  def getTabBarHidden(): scala.Boolean = js.native
  /**
  			 * Gets all tabs that are managed by the tab group.
  			 */
  def getTabs(): js.Array[Tab] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.tabsBackgroundColor> property.
  			 */
  def getTabsBackgroundColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.tabsBackgroundImage> property.
  			 */
  def getTabsBackgroundImage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.tabsBackgroundSelectedColor> property.
  			 */
  def getTabsBackgroundSelectedColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.tabsTintColor> property.
  			 */
  def getTabsTintColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.tabsTranslucent> property.
  			 */
  def getTabsTranslucent(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.theme> property.
  			 */
  def getTheme(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.title> property.
  			 */
  def getTitle(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.titleAttributes> property.
  			 */
  def getTitleAttributes(): titaniumLib.titleAttributesParams = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.titleControl> property.
  			 */
  def getTitleControl(): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.titleImage> property.
  			 */
  def getTitleImage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.titlePrompt> property.
  			 */
  def getTitlePrompt(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.titleid> property.
  			 */
  def getTitleid(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.titlepromptid> property.
  			 */
  def getTitlepromptid(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.toolbar> property.
  			 */
  def getToolbar(): js.Array[_] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.transitionAnimation> property.
  			 */
  def getTransitionAnimation(): titaniumLib.TitaniumNs.Proxy = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.translucent> property.
  			 */
  def getTranslucent(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.unselectedItemTintColor> property.
  			 */
  def getUnselectedItemTintColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.url> property.
  			 */
  def getUrl(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.windowFlags> property.
  			 */
  def getWindowFlags(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.windowPixelFormat> property.
  			 */
  def getWindowPixelFormat(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TabGroup.windowSoftInputMode> property.
  			 */
  def getWindowSoftInputMode(): scala.Double = js.native
  /**
  			 * Hides the navigation bar.
  			 */
  def hideNavBar(): scala.Unit = js.native
  def hideNavBar(options: js.Any): scala.Unit = js.native
  /**
  			 * Hides the tab bar. Must be called before opening the window.
  			 */
  def hideTabBar(): scala.Unit = js.native
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
  			 * Opens the tab group and makes it visible.
  			 */
  def open(): scala.Unit = js.native
  def open(params: titaniumLib.openWindowParams): scala.Unit = js.native
  /**
  			 * Clears all added shared elements.
  			 */
  def removeAllSharedElements(): scala.Unit = js.native
  /**
  			 * Removes a tab from the tab group.
  			 */
  def removeTab(tab: Tab): scala.Unit = js.native
  /**
  			 * Selects the currently active tab in a tab group.
  			 */
  def setActiveTab(indexOrObject: scala.Double): scala.Unit = js.native
  /**
  			 * Selects the currently active tab in a tab group.
  			 */
  def setActiveTab(indexOrObject: Tab): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.activeTabBackgroundImage> property.
  			 */
  def setActiveTabBackgroundImage(activeTabBackgroundImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.activeTabIconTint> property.
  			 */
  def setActiveTabIconTint(activeTabIconTint: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.activityEnterTransition> property.
  			 */
  def setActivityEnterTransition(activityEnterTransition: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.activityExitTransition> property.
  			 */
  def setActivityExitTransition(activityExitTransition: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.activityReenterTransition> property.
  			 */
  def setActivityReenterTransition(activityReenterTransition: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.activityReturnTransition> property.
  			 */
  def setActivityReturnTransition(activityReturnTransition: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.activitySharedElementEnterTransition> property.
  			 */
  def setActivitySharedElementEnterTransition(activitySharedElementEnterTransition: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.activitySharedElementExitTransition> property.
  			 */
  def setActivitySharedElementExitTransition(activitySharedElementExitTransition: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.activitySharedElementReenterTransition> property.
  			 */
  def setActivitySharedElementReenterTransition(activitySharedElementReenterTransition: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.activitySharedElementReturnTransition> property.
  			 */
  def setActivitySharedElementReturnTransition(activitySharedElementReturnTransition: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.allowUserCustomization> property.
  			 */
  def setAllowUserCustomization(allowUserCustomization: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.autoAdjustScrollViewInsets> property.
  			 */
  def setAutoAdjustScrollViewInsets(autoAdjustScrollViewInsets: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.backButtonTitle> property.
  			 */
  def setBackButtonTitle(backButtonTitle: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.backButtonTitleImage> property.
  			 */
  def setBackButtonTitleImage(backButtonTitleImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.backButtonTitleImage> property.
  			 */
  def setBackButtonTitleImage(backButtonTitleImage: titaniumLib.TitaniumNs.Blob): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.barColor> property.
  			 */
  def setBarColor(barColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.barImage> property.
  			 */
  def setBarImage(barImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.editButtonTitle> property.
  			 */
  def setEditButtonTitle(editButtonTitle: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.exitOnClose> property.
  			 */
  def setExitOnClose(exitOnClose: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.extendEdges> property.
  			 */
  def setExtendEdges(extendEdges: js.Array[scala.Double]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.extendSafeArea> property.
  			 */
  def setExtendSafeArea(extendSafeArea: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.flagSecure> property.
  			 */
  def setFlagSecure(flagSecure: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.fullscreen> property.
  			 */
  def setFullscreen(fullscreen: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.hideShadow> property.
  			 */
  def setHideShadow(hideShadow: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.hidesBackButton> property.
  			 */
  def setHidesBackButton(hidesBackButton: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.hidesBarsOnSwipe> property.
  			 */
  def setHidesBarsOnSwipe(hidesBarsOnSwipe: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.hidesBarsOnTap> property.
  			 */
  def setHidesBarsOnTap(hidesBarsOnTap: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.hidesBarsWhenKeyboardAppears> property.
  			 */
  def setHidesBarsWhenKeyboardAppears(hidesBarsWhenKeyboardAppears: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.homeIndicatorAutoHidden> property.
  			 */
  def setHomeIndicatorAutoHidden(homeIndicatorAutoHidden: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.includeOpaqueBars> property.
  			 */
  def setIncludeOpaqueBars(includeOpaqueBars: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.largeTitleDisplayMode> property.
  			 */
  def setLargeTitleDisplayMode(largeTitleDisplayMode: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.largeTitleEnabled> property.
  			 */
  def setLargeTitleEnabled(largeTitleEnabled: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.leftNavButton> property.
  			 */
  def setLeftNavButton(leftNavButton: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.leftNavButtons> property.
  			 */
  def setLeftNavButtons(leftNavButtons: js.Array[_]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.modal> property.
  			 */
  def setModal(modal: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.navBarHidden> property.
  			 */
  def setNavBarHidden(navBarHidden: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.navTintColor> property.
  			 */
  def setNavTintColor(navTintColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.onBack> property.
  			 */
  def setOnBack(onBack: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.orientationModes> property.
  			 */
  def setOrientationModes(orientationModes: js.Array[scala.Double]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.rightNavButton> property.
  			 */
  def setRightNavButton(rightNavButton: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.rightNavButtons> property.
  			 */
  def setRightNavButtons(rightNavButtons: js.Array[_]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.shadowImage> property.
  			 */
  def setShadowImage(shadowImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.shiftMode> property.
  			 */
  def setShiftMode(shiftMode: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.smoothScrollOnTabClick> property.
  			 */
  def setSmoothScrollOnTabClick(smoothScrollOnTabClick: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.splitActionBar> property.
  			 */
  def setSplitActionBar(splitActionBar: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.statusBarStyle> property.
  			 */
  def setStatusBarStyle(statusBarStyle: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.style> property.
  			 */
  def setStyle(style: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.sustainedPerformanceMode> property.
  			 */
  def setSustainedPerformanceMode(sustainedPerformanceMode: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.swipeToClose> property.
  			 */
  def setSwipeToClose(swipeToClose: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.swipeable> property.
  			 */
  def setSwipeable(swipeable: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.tabBarHidden> property.
  			 */
  def setTabBarHidden(tabBarHidden: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.tabs> property.
  			 */
  def setTabs(tabs: js.Array[Tab]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.tabsBackgroundColor> property.
  			 */
  def setTabsBackgroundColor(tabsBackgroundColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.tabsBackgroundImage> property.
  			 */
  def setTabsBackgroundImage(tabsBackgroundImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.tabsBackgroundSelectedColor> property.
  			 */
  def setTabsBackgroundSelectedColor(tabsBackgroundSelectedColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.tabsTintColor> property.
  			 */
  def setTabsTintColor(tabsTintColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.tabsTranslucent> property.
  			 */
  def setTabsTranslucent(tabsTranslucent: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.theme> property.
  			 */
  def setTheme(theme: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.title> property.
  			 */
  def setTitle(title: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.titleAttributes> property.
  			 */
  def setTitleAttributes(titleAttributes: titaniumLib.titleAttributesParams): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.titleControl> property.
  			 */
  def setTitleControl(titleControl: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.titleImage> property.
  			 */
  def setTitleImage(titleImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.titlePrompt> property.
  			 */
  def setTitlePrompt(titlePrompt: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.titleid> property.
  			 */
  def setTitleid(titleid: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.titlepromptid> property.
  			 */
  def setTitlepromptid(titlepromptid: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the array of items to show in the window's toolbar.
  			 */
  def setToolbar(items: js.Array[_]): scala.Unit = js.native
  def setToolbar(items: js.Array[_], params: titaniumLib.windowToolbarParam): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.transitionAnimation> property.
  			 */
  def setTransitionAnimation(transitionAnimation: titaniumLib.TitaniumNs.Proxy): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.translucent> property.
  			 */
  def setTranslucent(translucent: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.unselectedItemTintColor> property.
  			 */
  def setUnselectedItemTintColor(unselectedItemTintColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.url> property.
  			 */
  def setUrl(url: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.windowFlags> property.
  			 */
  def setWindowFlags(windowFlags: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.windowPixelFormat> property.
  			 */
  def setWindowPixelFormat(windowPixelFormat: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TabGroup.windowSoftInputMode> property.
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

