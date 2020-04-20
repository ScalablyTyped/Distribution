package typings.titanium.Titanium.UI

import typings.titanium.BackForwardList
import typings.titanium.OnLinkURLResponse
import typings.titanium.SnapshotResult
import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Filesystem.File
import typings.titanium.Titanium.UI.iOS.WebViewConfiguration
import typings.titanium.titaniumStrings.beforeload
import typings.titanium.titaniumStrings.blacklisturl
import typings.titanium.titaniumStrings.click
import typings.titanium.titaniumStrings.dblclick
import typings.titanium.titaniumStrings.doubletap
import typings.titanium.titaniumStrings.error
import typings.titanium.titaniumStrings.focus
import typings.titanium.titaniumStrings.handleurl
import typings.titanium.titaniumStrings.keypressed
import typings.titanium.titaniumStrings.load
import typings.titanium.titaniumStrings.longclick
import typings.titanium.titaniumStrings.longpress
import typings.titanium.titaniumStrings.message
import typings.titanium.titaniumStrings.onLoadResource
import typings.titanium.titaniumStrings.pinch
import typings.titanium.titaniumStrings.postlayout
import typings.titanium.titaniumStrings.redirect
import typings.titanium.titaniumStrings.singletap
import typings.titanium.titaniumStrings.sslerror
import typings.titanium.titaniumStrings.swipe
import typings.titanium.titaniumStrings.touchcancel
import typings.titanium.titaniumStrings.touchend
import typings.titanium.titaniumStrings.touchmove
import typings.titanium.titaniumStrings.touchstart
import typings.titanium.titaniumStrings.twofingertap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The web view allows you to open an HTML5 based view which can load either local or remote content.
		 */
@JSGlobal("Titanium.UI.WebView")
@js.native
class WebView () extends View {
  /**
  			 * List of allowed URL schemes for the web view.
  			 */
  var allowedURLSchemes: js.Array[String] = js.native
  /**
  			 * A Boolean value indicating whether horizontal swipe gestures will trigger back-forward list navigations.
  			 */
  var allowsBackForwardNavigationGestures: Boolean = js.native
  /**
  			 * A Boolean value that determines whether pressing on a link displays a preview of the
  			 * destination for the link.
  			 */
  var allowsLinkPreview: Boolean = js.native
  /**
  			 * Path of file or directory to allow read access by the WebView.
  			 */
  var assetsDirectory: String = js.native
  /**
  			 * An array of url strings to blacklist.
  			 */
  var blacklistedURLs: js.Array[String] = js.native
  /**
  			 * Determines how a cache is used in this web view.
  			 */
  var cacheMode: Double = js.native
  /**
  			 * The cache policy for the request.
  			 */
  var cachePolicy: Double = js.native
  /**
  			 * The configuration for the new web view.
  			 */
  var configuration: WebViewConfiguration = js.native
  /**
  			 * Web content to load.
  			 */
  var data: Blob | File = js.native
  /**
  			 * Determines whether the view will bounce when scrolling to the edge of the scrollable region.
  			 */
  var disableBounce: Boolean = js.native
  /**
  			 * Determines whether or not the webview should not be able to display the context menu.
  			 */
  var disableContextMenu: Boolean = js.native
  /**
  			 * Enable adding javascript interfaces internally to webview prior to JELLY_BEAN_MR1 (Android 4.2)
  			 */
  var enableJavascriptInterface: Boolean = js.native
  /**
  			 * If `true`, zoom controls are enabled.
  			 */
  var enableZoomControls: Boolean = js.native
  /**
  			 * Lets the webview handle platform supported urls
  			 * @deprecated This property in no more supported in Titanium SDK 8.0.0+. Use property <Titanium.UI.WebView.allowedURLSchemes>
  			 * in conjuction with <Titanium.UI.WebView.handleurl>. See the example section
  			 * "Usage of allowedURLSchemes and handleurl in iOS".
  			 *
  			 */
  var handlePlatformUrl: Boolean = js.native
  /**
  			 * Hides activity indicator when loading remote URL.
  			 */
  var hideLoadIndicator: Boolean = js.native
  /**
  			 * HTML content of this web view.
  			 */
  var html: String = js.native
  /**
  			 * Controls whether to ignore invalid SSL certificates or not.
  			 */
  var ignoreSslError: Boolean = js.native
  /**
  			 * A Boolean value indicating whether web content can programmatically display the keyboard.
  			 */
  var keyboardDisplayRequiresUserAction: Boolean = js.native
  /**
  			 * Enables using light touches to make a selection and activate mouseovers.
  			 */
  var lightTouchEnabled: Boolean = js.native
  /**
  			 * Indicates if the webview is loading content.
  			 */
  var loading: Boolean = js.native
  /**
  			 * If `true`, allows the loading of insecure resources from a secure origin.
  			 */
  var mixedContentMode: Boolean = js.native
  /**
  			 * Determines the behavior when the user overscrolls the view.
  			 */
  var overScrollMode: Double = js.native
  /**
  			 * Determines how to treat content that requires plugins in this web view.
  			 */
  var pluginState: Double = js.native
  /**
  			 * An estimate of what fraction of the current navigation has been loaded.
  			 */
  val progress: Double = js.native
  /**
  			 * Sets extra request headers for this web view to use on subsequent URL requests.
  			 */
  var requestHeaders: js.Any = js.native
  /**
  			 * If `true`, scale contents to fit the web view.
  			 */
  var scalesPageToFit: Boolean = js.native
  /**
  			 * Controls whether the scroll-to-top gesture is effective.
  			 */
  var scrollsToTop: Boolean = js.native
  /**
  			 * A Boolean value indicating whether all resources on the page have been loaded through
  			 * securely encrypted connections.
  			 */
  val secure: Boolean = js.native
  /**
  			 * The level of granularity with which the user can interactively select content in the web view.
  			 */
  val selectionGranularity: Double = js.native
  /**
  			 * The timeout interval for the request, in seconds.
  			 */
  var timeout: Double = js.native
  /**
  			 * Returns page title of webpage.
  			 */
  val title: String = js.native
  /**
  			 * URL to the web document.
  			 */
  var url: String = js.native
  /**
  			 * The User-Agent header used by the web view when requesting content.
  			 */
  var userAgent: String = js.native
  /**
  			 * Explicitly specifies if this web view handles touches.
  			 */
  var willHandleTouches: Boolean = js.native
  /**
  			 * Manage the zoom-level of the current page.
  			 */
  var zoomLevel: Double = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  @JSName("addEventListener")
  def addEventListener_beforeload(
    name: beforeload,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WebViewBeforeloadEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blacklisturl(
    name: blacklisturl,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WebViewBlacklisturlEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(name: error, callback: js.ThisFunction1[/* this */ this.type, /* event */ WebViewErrorEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_handleurl(
    name: handleurl,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WebViewHandleurlEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(name: load, callback: js.ThisFunction1[/* this */ this.type, /* event */ WebViewLoadEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    name: message,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WebViewMessageEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_onLoadResource(
    name: onLoadResource,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WebViewOnLoadResourceEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    name: typings.titanium.titaniumStrings.progress,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WebViewProgressEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_redirect(
    name: redirect,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WebViewRedirectEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sslerror(
    name: sslerror,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WebViewSslerrorEvent, Unit]
  ): Unit = js.native
  /**
  			 * Adds a script message handler.
  			 */
  def addScriptMessageHandler(handlerName: String): Unit = js.native
  /**
  			 * Adds a user script.
  			 */
  def addUserScript(source: String, injectionTime: Double, mainFrameOnly: Boolean): Unit = js.native
  /**
  			 * An object which maintains a list of visited pages used to go back and forward to the most recent page.
  			 */
  def backForwardList(): BackForwardList = js.native
  /**
  			 * Returns `true` if the web view can go back in its history list.
  			 */
  def canGoBack(): Boolean = js.native
  /**
  			 * Returns `true` if the web view can go forward in its history list.
  			 */
  def canGoForward(): Boolean = js.native
  /**
  			 * Evaluates a JavaScript expression inside the context of the web view and
  			 * optionally, returns a result. If a callback function is passed in as second argument,
  			 * the evaluation will take place asynchronously and the the callback function will be called with the result.
  			 */
  def evalJS(code: String): String = js.native
  def evalJS(code: String, callback: js.Function1[/* param0 */ String, Unit]): String = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  @JSName("fireEvent")
  def fireEvent_beforeload(name: beforeload): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_beforeload(name: beforeload, event: WebViewBeforeloadEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_blacklisturl(name: blacklisturl): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_blacklisturl(name: blacklisturl, event: WebViewBlacklisturlEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: WebViewClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: WebViewDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: WebViewDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_error(name: error): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_error(name: error, event: WebViewErrorEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: WebViewFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_handleurl(name: handleurl): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_handleurl(name: handleurl, event: WebViewHandleurlEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: WebViewKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_load(name: load): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_load(name: load, event: WebViewLoadEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: WebViewLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: WebViewLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_message(name: message): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_message(name: message, event: WebViewMessageEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_onLoadResource(name: onLoadResource): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_onLoadResource(name: onLoadResource, event: WebViewOnLoadResourceEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: WebViewPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: WebViewPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_progress(name: typings.titanium.titaniumStrings.progress): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_progress(name: typings.titanium.titaniumStrings.progress, event: WebViewProgressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_redirect(name: redirect): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_redirect(name: redirect, event: WebViewRedirectEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: WebViewSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_sslerror(name: sslerror): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_sslerror(name: sslerror, event: WebViewSslerrorEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: WebViewSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: WebViewTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: WebViewTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: WebViewTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: WebViewTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: WebViewTwofingertapEvent): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.allowedURLSchemes> property.
  			 * @deprecated Access <Titanium.UI.WebView.allowedURLSchemes> instead.
  			 */
  def getAllowedURLSchemes(): js.Array[String] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.allowsBackForwardNavigationGestures> property.
  			 * @deprecated Access <Titanium.UI.WebView.allowsBackForwardNavigationGestures> instead.
  			 */
  def getAllowsBackForwardNavigationGestures(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.allowsLinkPreview> property.
  			 * @deprecated Access <Titanium.UI.WebView.allowsLinkPreview> instead.
  			 */
  def getAllowsLinkPreview(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.assetsDirectory> property.
  			 * @deprecated Access <Titanium.UI.WebView.assetsDirectory> instead.
  			 */
  def getAssetsDirectory(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.blacklistedURLs> property.
  			 * @deprecated Access <Titanium.UI.WebView.blacklistedURLs> instead.
  			 */
  def getBlacklistedURLs(): js.Array[String] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.cacheMode> property.
  			 * @deprecated Access <Titanium.UI.WebView.cacheMode> instead.
  			 */
  def getCacheMode(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.cachePolicy> property.
  			 * @deprecated Access <Titanium.UI.WebView.cachePolicy> instead.
  			 */
  def getCachePolicy(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.configuration> property.
  			 * @deprecated Access <Titanium.UI.WebView.configuration> instead.
  			 */
  def getConfiguration(): WebViewConfiguration = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.data> property.
  			 * @deprecated Access <Titanium.UI.WebView.data> instead.
  			 */
  def getData(): Blob | File = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.disableBounce> property.
  			 * @deprecated Access <Titanium.UI.WebView.disableBounce> instead.
  			 */
  def getDisableBounce(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.disableContextMenu> property.
  			 * @deprecated Access <Titanium.UI.WebView.disableContextMenu> instead.
  			 */
  def getDisableContextMenu(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.enableJavascriptInterface> property.
  			 * @deprecated Access <Titanium.UI.WebView.enableJavascriptInterface> instead.
  			 */
  def getEnableJavascriptInterface(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.enableZoomControls> property.
  			 * @deprecated Access <Titanium.UI.WebView.enableZoomControls> instead.
  			 */
  def getEnableZoomControls(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.handlePlatformUrl> property.
  			 * @deprecated This property in no more supported in Titanium SDK 8.0.0+. Use property <Titanium.UI.WebView.allowedURLSchemes>
  			 * in conjuction with <Titanium.UI.WebView.handleurl>. See the example section
  			 * "Usage of allowedURLSchemes and handleurl in iOS".
  			 *
  			 */
  def getHandlePlatformUrl(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.hideLoadIndicator> property.
  			 * @deprecated Access <Titanium.UI.WebView.hideLoadIndicator> instead.
  			 */
  def getHideLoadIndicator(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.html> property.
  			 * @deprecated Access <Titanium.UI.WebView.html> instead.
  			 */
  def getHtml(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.ignoreSslError> property.
  			 * @deprecated Access <Titanium.UI.WebView.ignoreSslError> instead.
  			 */
  def getIgnoreSslError(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.keyboardDisplayRequiresUserAction> property.
  			 * @deprecated Access <Titanium.UI.WebView.keyboardDisplayRequiresUserAction> instead.
  			 */
  def getKeyboardDisplayRequiresUserAction(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.lightTouchEnabled> property.
  			 * @deprecated Access <Titanium.UI.WebView.lightTouchEnabled> instead.
  			 */
  def getLightTouchEnabled(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.loading> property.
  			 * @deprecated Access <Titanium.UI.WebView.loading> instead.
  			 */
  def getLoading(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.mixedContentMode> property.
  			 * @deprecated Access <Titanium.UI.WebView.mixedContentMode> instead.
  			 */
  def getMixedContentMode(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.onCreateWindow> property.
  			 * @deprecated Access <Titanium.UI.WebView.onCreateWindow> instead.
  			 */
  def getOnCreateWindow(): js.Function1[/* param0 */ js.Any, Unit] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.onlink> property.
  			 * @deprecated Access <Titanium.UI.WebView.onlink> instead.
  			 */
  def getOnlink(): js.Function1[/* param0 */ OnLinkURLResponse, Unit] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.overScrollMode> property.
  			 * @deprecated Access <Titanium.UI.WebView.overScrollMode> instead.
  			 */
  def getOverScrollMode(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.pluginState> property.
  			 * @deprecated Access <Titanium.UI.WebView.pluginState> instead.
  			 */
  def getPluginState(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.progress> property.
  			 * @deprecated Access <Titanium.UI.WebView.progress> instead.
  			 */
  def getProgress(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.requestHeaders> property.
  			 * @deprecated Access <Titanium.UI.WebView.requestHeaders> instead.
  			 */
  def getRequestHeaders(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.scalesPageToFit> property.
  			 * @deprecated Access <Titanium.UI.WebView.scalesPageToFit> instead.
  			 */
  def getScalesPageToFit(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.scrollsToTop> property.
  			 * @deprecated Access <Titanium.UI.WebView.scrollsToTop> instead.
  			 */
  def getScrollsToTop(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.secure> property.
  			 * @deprecated Access <Titanium.UI.WebView.secure> instead.
  			 */
  def getSecure(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.selectionGranularity> property.
  			 * @deprecated Access <Titanium.UI.WebView.selectionGranularity> instead.
  			 */
  def getSelectionGranularity(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.timeout> property.
  			 * @deprecated Access <Titanium.UI.WebView.timeout> instead.
  			 */
  def getTimeout(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.title> property.
  			 * @deprecated Access <Titanium.UI.WebView.title> instead.
  			 */
  def getTitle(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.url> property.
  			 * @deprecated Access <Titanium.UI.WebView.url> instead.
  			 */
  def getUrl(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.userAgent> property.
  			 * @deprecated Access <Titanium.UI.WebView.userAgent> instead.
  			 */
  def getUserAgent(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.willHandleTouches> property.
  			 * @deprecated Access <Titanium.UI.WebView.willHandleTouches> instead.
  			 */
  def getWillHandleTouches(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.zoomLevel> property.
  			 * @deprecated Access <Titanium.UI.WebView.zoomLevel> instead.
  			 */
  def getZoomLevel(): Double = js.native
  /**
  			 * Goes back one entry in the web view's history list, to the previous page.
  			 */
  def goBack(): Unit = js.native
  /**
  			 * Goes forward one entry in this web view's history list, if possible.
  			 */
  def goForward(): Unit = js.native
  /**
  			 * Callback function called when there is a request for the application to create a new window
  			 * to host new content.
  			 */
  def onCreateWindow(param0: js.Any): Unit = js.native
  /**
  			 * Fired before navigating to a link.
  			 */
  def onlink(param0: OnLinkURLResponse): Unit = js.native
  /**
  			 * Pauses native webview plugins.
  			 */
  def pause(): Unit = js.native
  /**
  			 * Releases memory when the web view is no longer needed.
  			 */
  def release(): Unit = js.native
  /**
  			 * Reloads the current webpage.
  			 */
  def reload(): Unit = js.native
  /**
  			 * Removes all associated user scripts.
  			 */
  def removeAllUserScripts(): Unit = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  @JSName("removeEventListener")
  def removeEventListener_beforeload(
    name: beforeload,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WebViewBeforeloadEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blacklisturl(
    name: blacklisturl,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WebViewBlacklisturlEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(name: error, callback: js.ThisFunction1[/* this */ this.type, /* event */ WebViewErrorEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_handleurl(
    name: handleurl,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WebViewHandleurlEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(name: load, callback: js.ThisFunction1[/* this */ this.type, /* event */ WebViewLoadEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    name: message,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WebViewMessageEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_onLoadResource(
    name: onLoadResource,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WebViewOnLoadResourceEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    name: typings.titanium.titaniumStrings.progress,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WebViewProgressEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_redirect(
    name: redirect,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WebViewRedirectEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sslerror(
    name: sslerror,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ WebViewSslerrorEvent, Unit]
  ): Unit = js.native
  /**
  			 * Removes a script message handler.
  			 */
  def removeScriptMessageHandler(name: String): Unit = js.native
  /**
  			 * Forces the web view to repaint its contents.
  			 */
  def repaint(): Unit = js.native
  /**
  			 * Resume native webview plugins.
  			 */
  def resume(): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.allowedURLSchemes> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.allowedURLSchemes> instead.
  			 */
  def setAllowedURLSchemes(allowedURLSchemes: js.Array[String]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.allowsBackForwardNavigationGestures> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.allowsBackForwardNavigationGestures> instead.
  			 */
  def setAllowsBackForwardNavigationGestures(allowsBackForwardNavigationGestures: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.allowsLinkPreview> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.allowsLinkPreview> instead.
  			 */
  def setAllowsLinkPreview(allowsLinkPreview: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.assetsDirectory> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.assetsDirectory> instead.
  			 */
  def setAssetsDirectory(assetsDirectory: String): Unit = js.native
  /**
  			 * Sets the basic authentication for this web view to use on subsequent URL requests.
  			 */
  def setBasicAuthentication(username: String, password: String, persistence: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.blacklistedURLs> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.blacklistedURLs> instead.
  			 */
  def setBlacklistedURLs(blacklistedURLs: js.Array[String]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.cacheMode> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.cacheMode> instead.
  			 */
  def setCacheMode(cacheMode: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.cachePolicy> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.cachePolicy> instead.
  			 */
  def setCachePolicy(cachePolicy: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.configuration> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.configuration> instead.
  			 */
  def setConfiguration(configuration: WebViewConfiguration): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.data> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.data> instead.
  			 */
  def setData(data: Blob): Unit = js.native
  def setData(data: File): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.disableBounce> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.disableBounce> instead.
  			 */
  def setDisableBounce(disableBounce: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.disableContextMenu> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.disableContextMenu> instead.
  			 */
  def setDisableContextMenu(disableContextMenu: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.enableJavascriptInterface> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.enableJavascriptInterface> instead.
  			 */
  def setEnableJavascriptInterface(enableJavascriptInterface: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.enableZoomControls> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.enableZoomControls> instead.
  			 */
  def setEnableZoomControls(enableZoomControls: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.handlePlatformUrl> property.
  			 * @deprecated This property in no more supported in Titanium SDK 8.0.0+. Use property <Titanium.UI.WebView.allowedURLSchemes>
  			 * in conjuction with <Titanium.UI.WebView.handleurl>. See the example section
  			 * "Usage of allowedURLSchemes and handleurl in iOS".
  			 *
  			 */
  def setHandlePlatformUrl(handlePlatformUrl: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.hideLoadIndicator> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.hideLoadIndicator> instead.
  			 */
  def setHideLoadIndicator(hideLoadIndicator: Boolean): Unit = js.native
  /**
  			 * Sets the value of [html](Titanium.UI.WebView.html) property.
  			 */
  def setHtml(html: js.Any): Unit = js.native
  def setHtml(html: js.Any, options: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.ignoreSslError> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.ignoreSslError> instead.
  			 */
  def setIgnoreSslError(ignoreSslError: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.keyboardDisplayRequiresUserAction> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.keyboardDisplayRequiresUserAction> instead.
  			 */
  def setKeyboardDisplayRequiresUserAction(keyboardDisplayRequiresUserAction: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.lightTouchEnabled> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.lightTouchEnabled> instead.
  			 */
  def setLightTouchEnabled(lightTouchEnabled: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.loading> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.loading> instead.
  			 */
  def setLoading(loading: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.mixedContentMode> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.mixedContentMode> instead.
  			 */
  def setMixedContentMode(mixedContentMode: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.onCreateWindow> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.onCreateWindow> instead.
  			 */
  def setOnCreateWindow(onCreateWindow: js.Function1[/* param0 */ js.Any, Unit]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.onlink> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.onlink> instead.
  			 */
  def setOnlink(onlink: js.Function1[/* param0 */ OnLinkURLResponse, Unit]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.overScrollMode> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.overScrollMode> instead.
  			 */
  def setOverScrollMode(overScrollMode: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.pluginState> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.pluginState> instead.
  			 */
  def setPluginState(pluginState: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.requestHeaders> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.requestHeaders> instead.
  			 */
  def setRequestHeaders(requestHeaders: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.scalesPageToFit> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.scalesPageToFit> instead.
  			 */
  def setScalesPageToFit(scalesPageToFit: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.scrollsToTop> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.scrollsToTop> instead.
  			 */
  def setScrollsToTop(scrollsToTop: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.timeout> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.timeout> instead.
  			 */
  def setTimeout(timeout: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.url> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.url> instead.
  			 */
  def setUrl(url: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.userAgent> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.userAgent> instead.
  			 */
  def setUserAgent(userAgent: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.willHandleTouches> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.willHandleTouches> instead.
  			 */
  def setWillHandleTouches(willHandleTouches: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.zoomLevel> property.
  			 * @deprecated Set the value using <Titanium.UI.WebView.zoomLevel> instead.
  			 */
  def setZoomLevel(zoomLevel: Double): Unit = js.native
  /**
  			 * Add native properties for observing for change.
  			 */
  def startListeningToProperties(propertyList: js.Array[String]): Unit = js.native
  /**
  			 * Remove native properties from observing.
  			 */
  def stopListeningToProperties(propertyList: js.Array[String]): Unit = js.native
  /**
  			 * Stops loading a currently loading page.
  			 */
  def stopLoading(): Unit = js.native
  /**
  			 * Takes a snapshot of the view's visible viewport.
  			 */
  def takeSnapshot(callback: js.Function1[/* param0 */ SnapshotResult, Unit]): Unit = js.native
}

