package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A widget that can display a web page. Since this widget requires a lot of resources it's recommended
  * to have no more than one instance at a time.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tabrisLib.tabrisMod._WebViewProperties because var conflicts: background, backgroundImage, baseline, bottom, centerX, centerY, `class`, classList, cornerRadius, elevation, enabled, font, height, highlightOnTouch, id, layoutData, left, opacity, right, top, transform, visible, width, win_theme. Inlined html, url */ @JSImport("tabris", "WebView")
@js.native
class WebView () extends Widget {
  def this(properties: tabrisLib.Properties[WebView, tabrisLib.TypeScriptPropertiesKey]) = this()
  /**
    * Whether there is a previous to navigated to via `goBack()`.
    */
  val canGoBack: scala.Boolean = js.native
  /**
    * Whether there is a next page to navigate to via `goForward()`.
    */
  val canGoForward: scala.Boolean = js.native
  /**
    * A complete HTML document to display. Always returns the last set value.
    */
  var html: java.lang.String = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_WebView: tabrisLib.WebViewProperties = js.native
  /**
    * The URL of the web page to display. Relative URLs are resolved relative to 'package.json'. Returns
    * empty string when content from *html* property is displayed.
    */
  var url: java.lang.String = js.native
  /**
    * Navigate the `WebView` to the previous page if possible.
    */
  def goBack(): scala.Unit = js.native
  /**
    * Navigate the `WebView` to the next page if possible.
    */
  def goForward(): scala.Unit = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: WebViewEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: WebViewEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: WebViewEvents): this.type = js.native
  /**
    * Posts a web message to the underlying `window` object of the WebView. The website in the `WebView`
    * can register for the message in the following fashion: `window.addEventListener('message',
    * callbackFunction)`. For more information see
    * [`Window.postMessage()`](https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage) API.
    * @param message The message to send. Currently supports only strings.
    * @param targetOrigin The URL of the page that receives the message. The message is only sent if the current document URL has the same scheme, domain and path. Use `*` to send to any URL.
    */
  def postMessage(message: java.lang.String, targetOrigin: java.lang.String): this.type = js.native
}

