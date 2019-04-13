package typings
package titaniumLib.TitaniumNs.UINs.AndroidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.UI.Android")
@js.native
object ^ extends js.Object {
  /**
  			 * Window flag which makes the Android system's navigation bar semi-transparent.
  			 */
  val FLAG_TRANSLUCENT_NAVIGATION: scala.Double = js.native
  /**
  			 * Window flag which makes the Android system's top status bar semi-transparent.
  			 */
  val FLAG_TRANSLUCENT_STATUS: scala.Double = js.native
  /**
  			 * Raw bit controlling whether the right/bottom edge is clipped to its container, based on the gravity direction being applied.
  			 */
  val GRAVITY_AXIS_CLIP: scala.Double = js.native
  /**
  			 * Raw bit controlling how the right/bottom edge is placed.
  			 */
  val GRAVITY_AXIS_PULL_AFTER: scala.Double = js.native
  /**
  			 * Raw bit controlling how the left/top edge is placed.
  			 */
  val GRAVITY_AXIS_PULL_BEFORE: scala.Double = js.native
  /**
  			 * Raw bit indicating the gravity for an axis has been specified.
  			 */
  val GRAVITY_AXIS_SPECIFIED: scala.Double = js.native
  /**
  			 * Bits defining the horizontal axis.
  			 */
  val GRAVITY_AXIS_X_SHIFT: scala.Double = js.native
  /**
  			 * Bits defining the vertical axis.
  			 */
  val GRAVITY_AXIS_Y_SHIFT: scala.Double = js.native
  /**
  			 * Push object to the bottom of its container, not changing its size.
  			 */
  val GRAVITY_BOTTOM: scala.Double = js.native
  /**
  			 * Place the object in the center of its container in both the vertical and horizontal axis, not changing its size.
  			 */
  val GRAVITY_CENTER: scala.Double = js.native
  /**
  			 * Place object in the horizontal center of its container, not changing its size.
  			 */
  val GRAVITY_CENTER_HORIZONTAL: scala.Double = js.native
  /**
  			 * Place object in the vertical center of its container, not changing its size.
  			 */
  val GRAVITY_CENTER_VERTICAL: scala.Double = js.native
  /**
  			 * Flag to clip the edges of the object to its container along the horizontal axis.
  			 */
  val GRAVITY_CLIP_HORIZONTAL: scala.Double = js.native
  /**
  			 * Flag to clip the edges of the object to its container along the vertical axis.
  			 */
  val GRAVITY_CLIP_VERTICAL: scala.Double = js.native
  /**
  			 * Special constant to enable clipping to an overall display along the horizontal dimension.
  			 */
  val GRAVITY_DISPLAY_CLIP_HORIZONTAL: scala.Double = js.native
  /**
  			 * Special constant to enable clipping to an overall display along the vertical dimension.
  			 */
  val GRAVITY_DISPLAY_CLIP_VERTICAL: scala.Double = js.native
  /**
  			 * Push object to x-axis position at the end of its container, not changing its size.
  			 */
  val GRAVITY_END: scala.Double = js.native
  /**
  			 * Grow the horizontal and vertical size of the object if needed so it completely fills its container.
  			 */
  val GRAVITY_FILL: scala.Double = js.native
  /**
  			 * Grow the horizontal size of the object if needed so it completely fills its container.
  			 */
  val GRAVITY_FILL_HORIZONTAL: scala.Double = js.native
  /**
  			 * Grow the vertical size of the object if needed so it completely fills its container.
  			 */
  val GRAVITY_FILL_VERTICAL: scala.Double = js.native
  /**
  			 * Binary mask to get the absolute horizontal gravity of a gravity.
  			 */
  val GRAVITY_HORIZONTAL_GRAVITY_MASK: scala.Double = js.native
  /**
  			 * Push object to the left of its container, not changing its size.
  			 */
  val GRAVITY_LEFT: scala.Double = js.native
  /**
  			 * Constant indicating that no gravity has been set
  			 */
  val GRAVITY_NO_GRAVITY: scala.Double = js.native
  /**
  			 * Binary mask for the horizontal gravity and script specific direction bit.
  			 */
  val GRAVITY_RELATIVE_HORIZONTAL_GRAVITY_MASK: scala.Double = js.native
  /**
  			 * Raw bit controlling whether the layout direction is relative or not (GRAVITY_START/GRAVITY_END instead of absolute GRAVITY_LEFT/GRAVITY_RIGHT).
  			 */
  val GRAVITY_RELATIVE_LAYOUT_DIRECTION: scala.Double = js.native
  /**
  			 * Push object to the right of its container, not changing its size.
  			 */
  val GRAVITY_RIGHT: scala.Double = js.native
  /**
  			 * Push object to x-axis position at the start of its container, not changing its size.
  			 */
  val GRAVITY_START: scala.Double = js.native
  /**
  			 * Push object to the top of its container, not changing its size.
  			 */
  val GRAVITY_TOP: scala.Double = js.native
  /**
  			 * Binary mask to get the vertical gravity of a gravity.
  			 */
  val GRAVITY_VERTICAL_GRAVITY_MASK: scala.Double = js.native
  /**
  			 * Converts all detectable types of data into clickable links.
  			 */
  val LINKIFY_ALL: scala.Double = js.native
  /**
  			 * Converts strings formatted as email addresses into clickable links.
  			 */
  val LINKIFY_EMAIL_ADDRESSES: scala.Double = js.native
  /**
  			 * Converts strings formatted as addresses into clickable links.
  			 */
  val LINKIFY_MAP_ADDRESSES: scala.Double = js.native
  /**
  			 * Converts strings formatted as phone numbers into clickable links.
  			 */
  val LINKIFY_PHONE_NUMBERS: scala.Double = js.native
  /**
  			 * Converts strings formatted as URLs into clickable links.
  			 */
  val LINKIFY_WEB_URLS: scala.Double = js.native
  /**
  			 * Always allow a user to over-scroll this view, provided it is a view that can scroll.
  			 */
  val OVER_SCROLL_ALWAYS: scala.Double = js.native
  /**
  			 * Allow a user to over-scroll this view only if the content is large enough to meaningfully scroll, provided it is a view that can scroll.
  			 */
  val OVER_SCROLL_IF_CONTENT_SCROLLS: scala.Double = js.native
  /**
  			 * Never allow a user to over-scroll this view.
  			 */
  val OVER_SCROLL_NEVER: scala.Double = js.native
  /**
  			 * Android A_8 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
  			 * can improve image clarity and performance.
  			 */
  val PIXEL_FORMAT_A_8: scala.Double = js.native
  /**
  			 * Android LA_88 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
  			 * can improve image clarity and performance.
  			 */
  val PIXEL_FORMAT_LA_88: scala.Double = js.native
  /**
  			 * Android L_8 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
  			 * can improve image clarity and performance.
  			 */
  val PIXEL_FORMAT_L_8: scala.Double = js.native
  /**
  			 * Android OPAQUE pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
  			 * can improve image clarity and performance.
  			 */
  val PIXEL_FORMAT_OPAQUE: scala.Double = js.native
  /**
  			 * Android RGBA_4444 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
  			 * can improve image clarity and performance.
  			 */
  val PIXEL_FORMAT_RGBA_4444: scala.Double = js.native
  /**
  			 * Android RGBA_5551 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
  			 * can improve image clarity and performance.
  			 */
  val PIXEL_FORMAT_RGBA_5551: scala.Double = js.native
  /**
  			 * Android RGBA_8888 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
  			 * can improve image clarity and performance.
  			 */
  val PIXEL_FORMAT_RGBA_8888: scala.Double = js.native
  /**
  			 * Android RGBX_8888 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
  			 * can improve image clarity and performance.
  			 */
  val PIXEL_FORMAT_RGBX_8888: scala.Double = js.native
  /**
  			 * Android RGB_332 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
  			 * can improve image clarity and performance.
  			 */
  val PIXEL_FORMAT_RGB_332: scala.Double = js.native
  /**
  			 * Android RGB_565 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
  			 * can improve image clarity and performance.
  			 */
  val PIXEL_FORMAT_RGB_565: scala.Double = js.native
  /**
  			 * Android RGB_888 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
  			 * can improve image clarity and performance.
  			 */
  val PIXEL_FORMAT_RGB_888: scala.Double = js.native
  /**
  			 * Android TRANSLUCENT pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
  			 * can improve image clarity and performance.
  			 */
  val PIXEL_FORMAT_TRANSLUCENT: scala.Double = js.native
  /**
  			 * Android A_8 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format can
  			 * improve image clarity and performance.
  			 */
  val PIXEL_FORMAT_TRANSPARENT: scala.Double = js.native
  /**
  			 * Android UNKNOWN pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
  			 * can improve image clarity and performance.
  			 */
  val PIXEL_FORMAT_UNKNOWN: scala.Double = js.native
  /**
  			 * Used with the <Titanium.UI.Android.ProgressIndicator.type> property to indicate an ongoing
  			 * activity of determinate length.
  			 */
  val PROGRESS_INDICATOR_DETERMINANT: scala.Double = js.native
  /**
  			 * Display <Titanium.UI.Android.ProgressIndicator> as a modal dialog. (default)
  			 */
  val PROGRESS_INDICATOR_DIALOG: scala.Double = js.native
  /**
  			 * Used with the <Titanium.UI.Android.ProgressIndicator.type> property to indicate an ongoing
  			 * activity of indeterminate length. (default)
  			 */
  val PROGRESS_INDICATOR_INDETERMINANT: scala.Double = js.native
  /**
  			 * Display <Titanium.UI.Android.ProgressIndicator> as a horizontal progress bar in the title of
  			 * the window.
  			 */
  val PROGRESS_INDICATOR_STATUS_BAR: scala.Double = js.native
  /**
  			 * Pan the current heavyweight window when the input method (ie software keyboard) is shown, to
  			 * ensure that its contents are not obscured.
  			 */
  val SOFT_INPUT_ADJUST_PAN: scala.Double = js.native
  /**
  			 * Resize the current heavyweight window when the input method (ie software keyboard) is shown,
  			 * to ensure that its contents are not obscured.
  			 */
  val SOFT_INPUT_ADJUST_RESIZE: scala.Double = js.native
  /**
  			 * Use the system-default behavior to determine how the soft input area (ie software keyboard)
  			 * is accomodated by the current heavyweight window when it receives focus (default.)
  			 */
  val SOFT_INPUT_ADJUST_UNSPECIFIED: scala.Double = js.native
  /**
  			 * Always hide the soft input area (ie software keyboard) when the current heavyweight window
  			 * receives focus.
  			 */
  val SOFT_INPUT_STATE_ALWAYS_HIDDEN: scala.Double = js.native
  /**
  			 * Always show the soft input area (ie software keyboard) when the current heavyweight window
  			 * receives focus.
  			 */
  val SOFT_INPUT_STATE_ALWAYS_VISIBLE: scala.Double = js.native
  /**
  			 * Attempt to hide the soft input area (ie software keyboard) when the current heavyweight
  			 * window receives focus.
  			 */
  val SOFT_INPUT_STATE_HIDDEN: scala.Double = js.native
  /**
  			 * Use the system-default behavior to determine whether to show the soft input area
  			 * (ie software keyboard) when the current heavyweight window receives focus.
  			 */
  val SOFT_INPUT_STATE_UNSPECIFIED: scala.Double = js.native
  /**
  			 * Attempt to show the soft input area (ie software keyboard) when the current heavyweight
  			 * window receives focus.
  			 */
  val SOFT_INPUT_STATE_VISIBLE: scala.Double = js.native
  /**
  			 * Use Android default behavior to handle keyboard visibility when a view receives focus.
  			 * (default)
  			 */
  val SOFT_KEYBOARD_DEFAULT_ON_FOCUS: scala.Double = js.native
  /**
  			 * Attempt to hide the soft keyboard when a view receives focus. Note: system can override
  			 * request.
  			 */
  val SOFT_KEYBOARD_HIDE_ON_FOCUS: scala.Double = js.native
  /**
  			 * Attempt to show the soft keyboard when a view receives focus. Note: system can override
  			 * request.
  			 */
  val SOFT_KEYBOARD_SHOW_ON_FOCUS: scala.Double = js.native
  /**
  			 * Display a checkbox.
  			 */
  val SWITCH_STYLE_CHECKBOX: scala.Double = js.native
  /**
  			 * Display a switch.
  			 */
  val SWITCH_STYLE_SWITCH: scala.Double = js.native
  /**
  			 * Display a toggle button.
  			 */
  val SWITCH_STYLE_TOGGLEBUTTON: scala.Double = js.native
  /**
  			 * TabGroup style taking advantage of a bottom navigation controller for switching between tabs.
  			 */
  val TABS_STYLE_BOTTOM_NAVIGATION: scala.Double = js.native
  /**
  			 * The default TabGroup style that places the Tabs bellow the ActionBar and above the Window content.
  			 */
  val TABS_STYLE_DEFAULT: scala.Double = js.native
  /**
  			 * Captures layout bounds of target views before and after the scene change and animates those changes during the transition.
  			 */
  val TRANSITION_CHANGE_BOUNDS: scala.Double = js.native
  /**
  			 * Captures the clip bounds before and after the scene change and animates those changes during the transition.
  			 */
  val TRANSITION_CHANGE_CLIP_BOUNDS: scala.Double = js.native
  /**
  			 * Captures an ImageView's matrix before and after the scene change and animates it during the transition.
  			 */
  val TRANSITION_CHANGE_IMAGE_TRANSFORM: scala.Double = js.native
  /**
  			 * Captures scale and rotation for Views before and after the scene change and animates those changes during the transition.
  			 */
  val TRANSITION_CHANGE_TRANSFORM: scala.Double = js.native
  /**
  			 * Moves views in or out from the edges of the scene.
  			 */
  val TRANSITION_EXPLODE: scala.Double = js.native
  /**
  			 * Fades in the views.
  			 */
  val TRANSITION_FADE_IN: scala.Double = js.native
  /**
  			 * Fades out the views.
  			 */
  val TRANSITION_FADE_OUT: scala.Double = js.native
  /**
  			 * Resets transition to platform default.
  			 */
  val TRANSITION_NONE: scala.Double = js.native
  /**
  			 * Moves views to bottom.
  			 */
  val TRANSITION_SLIDE_BOTTOM: scala.Double = js.native
  /**
  			 * Moves views to left.
  			 */
  val TRANSITION_SLIDE_LEFT: scala.Double = js.native
  /**
  			 * Moves views to right.
  			 */
  val TRANSITION_SLIDE_RIGHT: scala.Double = js.native
  /**
  			 * Moves views to top.
  			 */
  val TRANSITION_SLIDE_TOP: scala.Double = js.native
  /**
  			 * Use with [WebView.cacheMode](Titanium.UI.WebView.cacheMode) to override how the cache is used in a web view.
  			 */
  val WEBVIEW_LOAD_CACHE_ELSE_NETWORK: scala.Double = js.native
  /**
  			 * Use with [WebView.cacheMode](Titanium.UI.WebView.cacheMode) to override how the cache is used in a web view.
  			 */
  val WEBVIEW_LOAD_CACHE_ONLY: scala.Double = js.native
  /**
  			 * Use with [WebView.cacheMode](Titanium.UI.WebView.cacheMode) to override how the cache is used in a web view.
  			 */
  val WEBVIEW_LOAD_DEFAULT: scala.Double = js.native
  /**
  			 * Use with [WebView.cacheMode](Titanium.UI.WebView.cacheMode) to override how the cache is used in a web view.
  			 */
  val WEBVIEW_LOAD_NO_CACHE: scala.Double = js.native
  /**
  			 * Use with [WebView.pluginState](Titanium.UI.WebView.pluginState) to disable plugins in a web view.
  			 */
  val WEBVIEW_PLUGINS_OFF: scala.Double = js.native
  /**
  			 * Use with [WebView.pluginState](Titanium.UI.WebView.pluginState) to enable plugins in a web view.
  			 */
  val WEBVIEW_PLUGINS_ON: scala.Double = js.native
  /**
  			 * Display a placeholder and only load plugins when user selects it.
  			 */
  val WEBVIEW_PLUGINS_ON_DEMAND: scala.Double = js.native
  /**
  			 * The name of the API that this proxy corresponds to.
  			 */
  val apiName: java.lang.String = js.native
  /**
  			 * Indicates if the proxy will bubble an event to its parent.
  			 */
  var bubbleParent: scala.Boolean = js.native
  /**
  			 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  			 */
  var lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Applies the properties to the proxy.
  			 */
  def applyProperties(props: js.Any): scala.Unit = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.Android.CardView>.
  			 */
  def createCardView(): CardView = js.native
  def createCardView(parameters: js.Any): CardView = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.Android.DrawerLayout>.
  			 */
  def createDrawerLayout(): DrawerLayout = js.native
  def createDrawerLayout(parameters: js.Any): DrawerLayout = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.Android.ProgressIndicator>.
  			 */
  def createProgressIndicator(): ProgressIndicator = js.native
  def createProgressIndicator(parameters: js.Any): ProgressIndicator = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.Android.SearchView>.
  			 */
  def createSearchView(): SearchView = js.native
  def createSearchView(parameters: js.Any): SearchView = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Android.apiName> property.
  			 */
  def getApiName(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Android.bubbleParent> property.
  			 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Android.lifecycleContainer> property.
  			 */
  def getLifecycleContainer(): titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  			 * Hides the soft keyboard.
  			 */
  def hideSoftKeyboard(): scala.Unit = js.native
  /**
  			 * Opens an application preferences dialog, using the native Android system settings interface,
  			 * defined by the platform-specific `preferences.xml` and `array.xml` files.
  			 */
  def openPreferences(): scala.Unit = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Android.bubbleParent> property.
  			 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Android.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.TabGroup): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Android.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
}

