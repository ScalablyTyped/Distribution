package typings.tabris.mod

import typings.tabris.OmitWebViewset
import typings.tabris.tabrisStrings.html
import typings.tabris.tabrisStrings.set
import typings.tabris.tabrisStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "WebView")
@js.native
class WebView () extends Widget {
  def this(properties: Properties[WebView, OmitWebViewset]) = this()
  /**
    * Whether there is a previous to navigated to via `goBack()`.
    */
  val canGoBack: Boolean = js.native
  /**
    * Whether there is a next page to navigate to via `goForward()`.
    */
  val canGoForward: Boolean = js.native
  /**
    * A complete HTML document to display. Always returns the last set value.
    * Note: `htmlChanged` event will not be fired on iOS when a page is using `history.pushState()` to
    * navigate between pages.
    */
  var html: String = js.native
  /**
    * JavaScript code to be executed before page begins loading.
    * @constant
    */
  var initScript: String = js.native
  /**
    * @constant
    */
  @JSName("jsxAttributes")
  val jsxAttributes_WebView: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) with js.Object = js.native
  /**
    * Fired when the [*canGoBack*](#canGoBack) property has changed.
    */
  var onCanGoBackChanged: ChangeListeners[this.type, typings.tabris.tabrisStrings.canGoBack] = js.native
  /**
    * Fired when the [*canGoForward*](#canGoForward) property has changed.
    */
  var onCanGoForwardChanged: ChangeListeners[this.type, typings.tabris.tabrisStrings.canGoForward] = js.native
  /**
    * Fired when the WebView requests a download. The download event provides the properties `url`,
    * `mimeType`, `contentLength` and `contentDisposition`. Supported only on Android.
    */
  var onDownload: Listeners[WebViewDownloadEvent[this.type]] = js.native
  /**
    * Fired when the [*html*](#html) property has changed.
    */
  var onHtmlChanged: ChangeListeners[this.type, html] = js.native
  /**
    * Fired when the url has been loaded.
    * Note: This event will not be fired on iOS when a page is using `history.pushState()` to navigate
    * between pages.
    */
  var onLoad: Listeners[EventObject[this.type]] = js.native
  /**
    * Fired when a web message has been sent via `window.parent.postMessage(message, targetOrigin)` from
    * inside the `WebView`.
    */
  var onMessage: Listeners[WebViewMessageEvent[this.type]] = js.native
  /**
    * Fired when the WebView is about to navigate to a new URL.
    * Note: This event will not be fired on iOS when a page is using `history.pushState()` to navigate
    * between pages.
    */
  var onNavigate: Listeners[WebViewNavigateEvent[this.type]] = js.native
  /**
    * Fired when the [*url*](#url) property has changed.
    */
  var onUrlChanged: ChangeListeners[this.type, url] = js.native
  /**
    * The URL of the web page to display. Relative URLs are resolved relative to 'package.json'. Returns
    * empty string when content from *html* property is displayed.
    * Note: `urlChanged` event will not be fired on iOS when a page is using `history.pushState()` to
    * navigate between pages.
    */
  var url: String = js.native
  /**
    * Navigate the `WebView` to the previous page if possible.
    */
  def goBack(): Unit = js.native
  /**
    * Navigate the `WebView` to the next page if possible.
    */
  def goForward(): Unit = js.native
  /**
    * Posts a web message to the underlying `window` object of the WebView. The website in the `WebView`
    * can register for the message in the following fashion: `window.addEventListener('message',
    * callbackFunction)`. For more information see
    * [`Window.postMessage()`](https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage) API.
    * @param message The message to send. Supports only strings.
    * @param targetOrigin The URL of the page that receives the message. The message is only sent if the current document URL has the same scheme, domain and path. Use `*` to send to any URL.
    */
  def postMessage(message: String, targetOrigin: String): this.type = js.native
}

