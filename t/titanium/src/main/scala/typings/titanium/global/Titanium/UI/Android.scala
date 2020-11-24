package typings.titanium.global.Titanium.UI

import typings.titanium.Dictionary
import typings.titanium.Titanium.Event
import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Android-specific UI capabilities. All properties, methods and events in this namespace will
  * only work on Android systems.
  */
@JSGlobal("Titanium.UI.Android")
@js.native
class Android () extends Proxy
/**
  * The Android-specific UI capabilities. All properties, methods and events in this namespace will
  * only work on Android systems.
  */
/* static members */
@JSGlobal("Titanium.UI.Android")
@js.native
object Android extends js.Object {
  
  /**
    * Window flag which makes the Android system's navigation bar semi-transparent.
    */
  val FLAG_TRANSLUCENT_NAVIGATION: Double = js.native
  
  /**
    * Window flag which makes the Android system's top status bar semi-transparent.
    */
  val FLAG_TRANSLUCENT_STATUS: Double = js.native
  
  /**
    * Raw bit controlling whether the right/bottom edge is clipped to its container, based on the gravity direction being applied.
    */
  val GRAVITY_AXIS_CLIP: Double = js.native
  
  /**
    * Raw bit controlling how the right/bottom edge is placed.
    */
  val GRAVITY_AXIS_PULL_AFTER: Double = js.native
  
  /**
    * Raw bit controlling how the left/top edge is placed.
    */
  val GRAVITY_AXIS_PULL_BEFORE: Double = js.native
  
  /**
    * Raw bit indicating the gravity for an axis has been specified.
    */
  val GRAVITY_AXIS_SPECIFIED: Double = js.native
  
  /**
    * Bits defining the horizontal axis.
    */
  val GRAVITY_AXIS_X_SHIFT: Double = js.native
  
  /**
    * Bits defining the vertical axis.
    */
  val GRAVITY_AXIS_Y_SHIFT: Double = js.native
  
  /**
    * Push object to the bottom of its container, not changing its size.
    */
  val GRAVITY_BOTTOM: Double = js.native
  
  /**
    * Place the object in the center of its container in both the vertical and horizontal axis, not changing its size.
    */
  val GRAVITY_CENTER: Double = js.native
  
  /**
    * Place object in the horizontal center of its container, not changing its size.
    */
  val GRAVITY_CENTER_HORIZONTAL: Double = js.native
  
  /**
    * Place object in the vertical center of its container, not changing its size.
    */
  val GRAVITY_CENTER_VERTICAL: Double = js.native
  
  /**
    * Flag to clip the edges of the object to its container along the horizontal axis.
    */
  val GRAVITY_CLIP_HORIZONTAL: Double = js.native
  
  /**
    * Flag to clip the edges of the object to its container along the vertical axis.
    */
  val GRAVITY_CLIP_VERTICAL: Double = js.native
  
  /**
    * Special constant to enable clipping to an overall display along the horizontal dimension.
    */
  val GRAVITY_DISPLAY_CLIP_HORIZONTAL: Double = js.native
  
  /**
    * Special constant to enable clipping to an overall display along the vertical dimension.
    */
  val GRAVITY_DISPLAY_CLIP_VERTICAL: Double = js.native
  
  /**
    * Push object to x-axis position at the end of its container, not changing its size.
    */
  val GRAVITY_END: Double = js.native
  
  /**
    * Grow the horizontal and vertical size of the object if needed so it completely fills its container.
    */
  val GRAVITY_FILL: Double = js.native
  
  /**
    * Grow the horizontal size of the object if needed so it completely fills its container.
    */
  val GRAVITY_FILL_HORIZONTAL: Double = js.native
  
  /**
    * Grow the vertical size of the object if needed so it completely fills its container.
    */
  val GRAVITY_FILL_VERTICAL: Double = js.native
  
  /**
    * Binary mask to get the absolute horizontal gravity of a gravity.
    */
  val GRAVITY_HORIZONTAL_GRAVITY_MASK: Double = js.native
  
  /**
    * Push object to the left of its container, not changing its size.
    */
  val GRAVITY_LEFT: Double = js.native
  
  /**
    * Constant indicating that no gravity has been set
    */
  val GRAVITY_NO_GRAVITY: Double = js.native
  
  /**
    * Binary mask for the horizontal gravity and script specific direction bit.
    */
  val GRAVITY_RELATIVE_HORIZONTAL_GRAVITY_MASK: Double = js.native
  
  /**
    * Raw bit controlling whether the layout direction is relative or not (GRAVITY_START/GRAVITY_END instead of absolute GRAVITY_LEFT/GRAVITY_RIGHT).
    */
  val GRAVITY_RELATIVE_LAYOUT_DIRECTION: Double = js.native
  
  /**
    * Push object to the right of its container, not changing its size.
    */
  val GRAVITY_RIGHT: Double = js.native
  
  /**
    * Push object to x-axis position at the start of its container, not changing its size.
    */
  val GRAVITY_START: Double = js.native
  
  /**
    * Push object to the top of its container, not changing its size.
    */
  val GRAVITY_TOP: Double = js.native
  
  /**
    * Binary mask to get the vertical gravity of a gravity.
    */
  val GRAVITY_VERTICAL_GRAVITY_MASK: Double = js.native
  
  /**
    * Converts all detectable types of data into clickable links.
    * @deprecated Use [Titanium.UI.AUTOLINK_ALL](Titanium.UI.AUTOLINK_ALL) instead.
    */
  val LINKIFY_ALL: scala.Nothing = js.native
  
  /**
    * Converts strings formatted as email addresses into clickable links.
    * @deprecated Use [Titanium.UI.AUTOLINK_EMAIL_ADDRESSES](Titanium.UI.AUTOLINK_EMAIL_ADDRESSES) instead.
    */
  val LINKIFY_EMAIL_ADDRESSES: scala.Nothing = js.native
  
  /**
    * Converts strings formatted as addresses into clickable links.
    * @deprecated Use [Titanium.UI.AUTOLINK_MAP_ADDRESSES](Titanium.UI.AUTOLINK_MAP_ADDRESSES) instead.
    */
  val LINKIFY_MAP_ADDRESSES: scala.Nothing = js.native
  
  /**
    * Converts strings formatted as phone numbers into clickable links.
    * @deprecated Use [Titanium.UI.AUTOLINK_PHONE_NUMBERS](Titanium.UI.AUTOLINK_PHONE_NUMBERS) instead.
    */
  val LINKIFY_PHONE_NUMBERS: scala.Nothing = js.native
  
  /**
    * Converts strings formatted as URLs into clickable links.
    * @deprecated Use [Titanium.UI.AUTOLINK_URLS](Titanium.UI.AUTOLINK_URLS) instead.
    */
  val LINKIFY_WEB_URLS: scala.Nothing = js.native
  
  /**
    * Always allow a user to over-scroll this view, provided it is a view that can scroll.
    */
  val OVER_SCROLL_ALWAYS: Double = js.native
  
  /**
    * Allow a user to over-scroll this view only if the content is large enough to meaningfully scroll, provided it is a view that can scroll.
    */
  val OVER_SCROLL_IF_CONTENT_SCROLLS: Double = js.native
  
  /**
    * Never allow a user to over-scroll this view.
    */
  val OVER_SCROLL_NEVER: Double = js.native
  
  /**
    * Android A_8 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
    * can improve image clarity and performance.
    */
  val PIXEL_FORMAT_A_8: Double = js.native
  
  /**
    * Android LA_88 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
    * can improve image clarity and performance.
    */
  val PIXEL_FORMAT_LA_88: Double = js.native
  
  /**
    * Android L_8 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
    * can improve image clarity and performance.
    */
  val PIXEL_FORMAT_L_8: Double = js.native
  
  /**
    * Android OPAQUE pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
    * can improve image clarity and performance.
    */
  val PIXEL_FORMAT_OPAQUE: Double = js.native
  
  /**
    * Android RGBA_4444 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
    * can improve image clarity and performance.
    */
  val PIXEL_FORMAT_RGBA_4444: Double = js.native
  
  /**
    * Android RGBA_5551 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
    * can improve image clarity and performance.
    */
  val PIXEL_FORMAT_RGBA_5551: Double = js.native
  
  /**
    * Android RGBA_8888 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
    * can improve image clarity and performance.
    */
  val PIXEL_FORMAT_RGBA_8888: Double = js.native
  
  /**
    * Android RGBX_8888 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
    * can improve image clarity and performance.
    */
  val PIXEL_FORMAT_RGBX_8888: Double = js.native
  
  /**
    * Android RGB_332 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
    * can improve image clarity and performance.
    */
  val PIXEL_FORMAT_RGB_332: Double = js.native
  
  /**
    * Android RGB_565 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
    * can improve image clarity and performance.
    */
  val PIXEL_FORMAT_RGB_565: Double = js.native
  
  /**
    * Android RGB_888 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
    * can improve image clarity and performance.
    */
  val PIXEL_FORMAT_RGB_888: Double = js.native
  
  /**
    * Android TRANSLUCENT pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
    * can improve image clarity and performance.
    */
  val PIXEL_FORMAT_TRANSLUCENT: Double = js.native
  
  /**
    * Android A_8 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format can
    * improve image clarity and performance.
    */
  val PIXEL_FORMAT_TRANSPARENT: Double = js.native
  
  /**
    * Android UNKNOWN pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
    * can improve image clarity and performance.
    */
  val PIXEL_FORMAT_UNKNOWN: Double = js.native
  
  /**
    * Used with the <Titanium.UI.Android.ProgressIndicator.type> property to indicate an ongoing
    * activity of determinate length.
    */
  val PROGRESS_INDICATOR_DETERMINANT: Double = js.native
  
  /**
    * Display <Titanium.UI.Android.ProgressIndicator> as a modal dialog. (default)
    */
  val PROGRESS_INDICATOR_DIALOG: Double = js.native
  
  /**
    * Used with the <Titanium.UI.Android.ProgressIndicator.type> property to indicate an ongoing
    * activity of indeterminate length. (default)
    */
  val PROGRESS_INDICATOR_INDETERMINANT: Double = js.native
  
  /**
    * Display <Titanium.UI.Android.ProgressIndicator> as a horizontal progress bar in the title of
    * the window.
    */
  val PROGRESS_INDICATOR_STATUS_BAR: Double = js.native
  
  /**
    * Pan the current heavyweight window when the input method (ie software keyboard) is shown, to
    * ensure that its contents are not obscured.
    */
  val SOFT_INPUT_ADJUST_PAN: Double = js.native
  
  /**
    * Resize the current heavyweight window when the input method (ie software keyboard) is shown,
    * to ensure that its contents are not obscured.
    */
  val SOFT_INPUT_ADJUST_RESIZE: Double = js.native
  
  /**
    * Use the system-default behavior to determine how the soft input area (ie software keyboard)
    * is accomodated by the current heavyweight window when it receives focus (default.)
    */
  val SOFT_INPUT_ADJUST_UNSPECIFIED: Double = js.native
  
  /**
    * Always hide the soft input area (ie software keyboard) when the current heavyweight window
    * receives focus.
    */
  val SOFT_INPUT_STATE_ALWAYS_HIDDEN: Double = js.native
  
  /**
    * Always show the soft input area (ie software keyboard) when the current heavyweight window
    * receives focus.
    */
  val SOFT_INPUT_STATE_ALWAYS_VISIBLE: Double = js.native
  
  /**
    * Attempt to hide the soft input area (ie software keyboard) when the current heavyweight
    * window receives focus.
    */
  val SOFT_INPUT_STATE_HIDDEN: Double = js.native
  
  /**
    * Use the system-default behavior to determine whether to show the soft input area
    * (ie software keyboard) when the current heavyweight window receives focus.
    */
  val SOFT_INPUT_STATE_UNSPECIFIED: Double = js.native
  
  /**
    * Attempt to show the soft input area (ie software keyboard) when the current heavyweight
    * window receives focus.
    */
  val SOFT_INPUT_STATE_VISIBLE: Double = js.native
  
  /**
    * Use Android default behavior to handle keyboard visibility when a view receives focus.
    * (default)
    */
  val SOFT_KEYBOARD_DEFAULT_ON_FOCUS: Double = js.native
  
  /**
    * Attempt to hide the soft keyboard when a view receives focus. Note: system can override
    * request.
    */
  val SOFT_KEYBOARD_HIDE_ON_FOCUS: Double = js.native
  
  /**
    * Attempt to show the soft keyboard when a view receives focus. Note: system can override
    * request.
    */
  val SOFT_KEYBOARD_SHOW_ON_FOCUS: Double = js.native
  
  /**
    * Display a checkbox.
    */
  val SWITCH_STYLE_CHECKBOX: Double = js.native
  
  /**
    * Display a switch.
    */
  val SWITCH_STYLE_SWITCH: Double = js.native
  
  /**
    * Display a toggle button.
    */
  val SWITCH_STYLE_TOGGLEBUTTON: Double = js.native
  
  /**
    * TabGroup style taking advantage of a bottom navigation controller for switching between tabs.
    */
  val TABS_STYLE_BOTTOM_NAVIGATION: Double = js.native
  
  /**
    * The default TabGroup style that places the Tabs bellow the ActionBar and above the Window content.
    */
  val TABS_STYLE_DEFAULT: Double = js.native
  
  /**
    * Captures layout bounds of target views before and after the scene change and animates those changes during the transition.
    */
  val TRANSITION_CHANGE_BOUNDS: Double = js.native
  
  /**
    * Captures the clip bounds before and after the scene change and animates those changes during the transition.
    */
  val TRANSITION_CHANGE_CLIP_BOUNDS: Double = js.native
  
  /**
    * Captures an ImageView's matrix before and after the scene change and animates it during the transition.
    */
  val TRANSITION_CHANGE_IMAGE_TRANSFORM: Double = js.native
  
  /**
    * Captures scale and rotation for Views before and after the scene change and animates those changes during the transition.
    */
  val TRANSITION_CHANGE_TRANSFORM: Double = js.native
  
  /**
    * Moves views in or out from the edges of the scene.
    */
  val TRANSITION_EXPLODE: Double = js.native
  
  /**
    * Fades in the views.
    */
  val TRANSITION_FADE_IN: Double = js.native
  
  /**
    * Fades out the views.
    */
  val TRANSITION_FADE_OUT: Double = js.native
  
  /**
    * Resets transition to platform default.
    */
  val TRANSITION_NONE: Double = js.native
  
  /**
    * Moves views to bottom.
    */
  val TRANSITION_SLIDE_BOTTOM: Double = js.native
  
  /**
    * Moves views to left.
    */
  val TRANSITION_SLIDE_LEFT: Double = js.native
  
  /**
    * Moves views to right.
    */
  val TRANSITION_SLIDE_RIGHT: Double = js.native
  
  /**
    * Moves views to top.
    */
  val TRANSITION_SLIDE_TOP: Double = js.native
  
  /**
    * Use with [WebView.cacheMode](Titanium.UI.WebView.cacheMode) to override how the cache is used in a web view.
    */
  val WEBVIEW_LOAD_CACHE_ELSE_NETWORK: Double = js.native
  
  /**
    * Use with [WebView.cacheMode](Titanium.UI.WebView.cacheMode) to override how the cache is used in a web view.
    */
  val WEBVIEW_LOAD_CACHE_ONLY: Double = js.native
  
  /**
    * Use with [WebView.cacheMode](Titanium.UI.WebView.cacheMode) to override how the cache is used in a web view.
    */
  val WEBVIEW_LOAD_DEFAULT: Double = js.native
  
  /**
    * Use with [WebView.cacheMode](Titanium.UI.WebView.cacheMode) to override how the cache is used in a web view.
    */
  val WEBVIEW_LOAD_NO_CACHE: Double = js.native
  
  /**
    * Use with [WebView.pluginState](Titanium.UI.WebView.pluginState) to disable plugins in a web view.
    */
  val WEBVIEW_PLUGINS_OFF: Double = js.native
  
  /**
    * Use with [WebView.pluginState](Titanium.UI.WebView.pluginState) to enable plugins in a web view.
    */
  val WEBVIEW_PLUGINS_ON: Double = js.native
  
  /**
    * Display a placeholder and only load plugins when user selects it.
    */
  val WEBVIEW_PLUGINS_ON_DEMAND: Double = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  var bubbleParent: Boolean = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.Android.CardView>.
    */
  def createCardView(): typings.titanium.Titanium.UI.Android.CardView = js.native
  def createCardView(parameters: Dictionary[typings.titanium.Titanium.UI.Android.CardView]): typings.titanium.Titanium.UI.Android.CardView = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.Android.DrawerLayout>.
    */
  def createDrawerLayout(): typings.titanium.Titanium.UI.Android.DrawerLayout = js.native
  def createDrawerLayout(parameters: Dictionary[typings.titanium.Titanium.UI.Android.DrawerLayout]): typings.titanium.Titanium.UI.Android.DrawerLayout = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.Android.ProgressIndicator>.
    */
  def createProgressIndicator(): typings.titanium.Titanium.UI.Android.ProgressIndicator = js.native
  def createProgressIndicator(parameters: Dictionary[typings.titanium.Titanium.UI.Android.ProgressIndicator]): typings.titanium.Titanium.UI.Android.ProgressIndicator = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.Android.SearchView>.
    */
  def createSearchView(): typings.titanium.Titanium.UI.Android.SearchView = js.native
  def createSearchView(parameters: Dictionary[typings.titanium.Titanium.UI.Android.SearchView]): typings.titanium.Titanium.UI.Android.SearchView = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.apiName> property.
    * @deprecated Access <Titanium.UI.Android.apiName> instead.
    */
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.bubbleParent> property.
    * @deprecated Access <Titanium.UI.Android.bubbleParent> instead.
    */
  def getBubbleParent(): Boolean = js.native
  
  def getColorResource(resourceIdOrColorName: String): typings.titanium.Titanium.UI.Color = js.native
  /**
    * Returns a <Ti.Color> instance for a color defined by the system or user resources (colors.xml)
    */
  def getColorResource(resourceIdOrColorName: Double): typings.titanium.Titanium.UI.Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Android.lifecycleContainer> property.
    * @deprecated Access <Titanium.UI.Android.lifecycleContainer> instead.
    */
  def getLifecycleContainer(): typings.titanium.Titanium.UI.Window | typings.titanium.Titanium.UI.TabGroup = js.native
  
  /**
    * Hides the soft keyboard.
    */
  def hideSoftKeyboard(): Unit = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  var lifecycleContainer: typings.titanium.Titanium.UI.Window | typings.titanium.Titanium.UI.TabGroup = js.native
  
  /**
    * Opens an application preferences dialog, using the native Android system settings interface,
    * defined by the platform-specific `preferences.xml` and `array.xml` files.
    */
  def openPreferences(): Unit = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Android.bubbleParent> property.
    * @deprecated Set the value using <Titanium.UI.Android.bubbleParent> instead.
    */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  def setLifecycleContainer(lifecycleContainer: typings.titanium.Titanium.UI.TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.Android.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.UI.Android.lifecycleContainer> instead.
    */
  def setLifecycleContainer(lifecycleContainer: typings.titanium.Titanium.UI.Window): Unit = js.native
  
  /**
    * CardView provides a layout container with rounded corners and a shadow indicating the view is elevated.
    */
  @js.native
  class CardView ()
    extends typings.titanium.Titanium.UI.Android.CardView
  
  /**
    * A panel that displays the app's main navigation options on the left edge of the screen.
    */
  @js.native
  class DrawerLayout ()
    extends typings.titanium.Titanium.UI.Android.DrawerLayout
  
  /**
    * A progress dialog or a horizontal progress bar in the title of the window.
    */
  @js.native
  class ProgressIndicator ()
    extends typings.titanium.Titanium.UI.Android.ProgressIndicator
  
  /**
    * A specialized text field for entering search text.
    */
  @js.native
  class SearchView ()
    extends typings.titanium.Titanium.UI.Android.SearchView
}
