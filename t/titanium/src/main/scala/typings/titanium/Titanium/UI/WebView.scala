package typings.titanium.Titanium.UI

import typings.titanium.BackForwardList
import typings.titanium.OnLinkURLResponse
import typings.titanium.SnapshotResult
import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Filesystem.File
import typings.titanium.Titanium.UI.iOS.WebViewConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The web view allows you to open an HTML5 based view which can load either local or remote content.
		 */
@js.native
trait WebView extends View {
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
  def evalJS(code: String, callback: js.Function1[/* param0 */ String, _]): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.allowedURLSchemes> property.
  			 */
  def getAllowedURLSchemes(): js.Array[String] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.allowsBackForwardNavigationGestures> property.
  			 */
  def getAllowsBackForwardNavigationGestures(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.allowsLinkPreview> property.
  			 */
  def getAllowsLinkPreview(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.blacklistedURLs> property.
  			 */
  def getBlacklistedURLs(): js.Array[String] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.cacheMode> property.
  			 */
  def getCacheMode(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.cachePolicy> property.
  			 */
  def getCachePolicy(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.configuration> property.
  			 */
  def getConfiguration(): WebViewConfiguration = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.data> property.
  			 */
  def getData(): Blob | File = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.disableBounce> property.
  			 */
  def getDisableBounce(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.disableContextMenu> property.
  			 */
  def getDisableContextMenu(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.enableJavascriptInterface> property.
  			 */
  def getEnableJavascriptInterface(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.enableZoomControls> property.
  			 */
  def getEnableZoomControls(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.handlePlatformUrl> property.
  			 */
  def getHandlePlatformUrl(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.hideLoadIndicator> property.
  			 */
  def getHideLoadIndicator(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.html> property.
  			 */
  def getHtml(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.ignoreSslError> property.
  			 */
  def getIgnoreSslError(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.keyboardDisplayRequiresUserAction> property.
  			 */
  def getKeyboardDisplayRequiresUserAction(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.lightTouchEnabled> property.
  			 */
  def getLightTouchEnabled(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.loading> property.
  			 */
  def getLoading(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.mixedContentMode> property.
  			 */
  def getMixedContentMode(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.onCreateWindow> property.
  			 */
  def getOnCreateWindow(): js.Function1[/* param0 */ js.Any, _] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.onlink> property.
  			 */
  def getOnlink(): js.Function1[/* param0 */ OnLinkURLResponse, _] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.overScrollMode> property.
  			 */
  def getOverScrollMode(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.pluginState> property.
  			 */
  def getPluginState(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.progress> property.
  			 */
  def getProgress(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.requestHeaders> property.
  			 */
  def getRequestHeaders(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.scalesPageToFit> property.
  			 */
  def getScalesPageToFit(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.scrollsToTop> property.
  			 */
  def getScrollsToTop(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.secure> property.
  			 */
  def getSecure(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.selectionGranularity> property.
  			 */
  def getSelectionGranularity(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.timeout> property.
  			 */
  def getTimeout(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.title> property.
  			 */
  def getTitle(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.url> property.
  			 */
  def getUrl(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.userAgent> property.
  			 */
  def getUserAgent(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.willHandleTouches> property.
  			 */
  def getWillHandleTouches(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.zoomLevel> property.
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
  def onCreateWindow(param0: js.Any): js.Any = js.native
  /**
  			 * Fired before navigating to a link.
  			 */
  def onlink(param0: OnLinkURLResponse): js.Any = js.native
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
  			 */
  def setAllowedURLSchemes(allowedURLSchemes: js.Array[String]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.allowsBackForwardNavigationGestures> property.
  			 */
  def setAllowsBackForwardNavigationGestures(allowsBackForwardNavigationGestures: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.allowsLinkPreview> property.
  			 */
  def setAllowsLinkPreview(allowsLinkPreview: Boolean): Unit = js.native
  /**
  			 * Sets the basic authentication for this web view to use on subsequent URL requests.
  			 */
  def setBasicAuthentication(username: String, password: String, persistence: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.blacklistedURLs> property.
  			 */
  def setBlacklistedURLs(blacklistedURLs: js.Array[String]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.cacheMode> property.
  			 */
  def setCacheMode(cacheMode: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.cachePolicy> property.
  			 */
  def setCachePolicy(cachePolicy: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.configuration> property.
  			 */
  def setConfiguration(configuration: WebViewConfiguration): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.data> property.
  			 */
  def setData(data: Blob): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.data> property.
  			 */
  def setData(data: File): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.disableBounce> property.
  			 */
  def setDisableBounce(disableBounce: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.disableContextMenu> property.
  			 */
  def setDisableContextMenu(disableContextMenu: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.enableJavascriptInterface> property.
  			 */
  def setEnableJavascriptInterface(enableJavascriptInterface: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.enableZoomControls> property.
  			 */
  def setEnableZoomControls(enableZoomControls: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.handlePlatformUrl> property.
  			 */
  def setHandlePlatformUrl(handlePlatformUrl: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.hideLoadIndicator> property.
  			 */
  def setHideLoadIndicator(hideLoadIndicator: Boolean): Unit = js.native
  /**
  			 * Sets the value of [html](Titanium.UI.WebView.html) property.
  			 */
  def setHtml(html: js.Any): Unit = js.native
  def setHtml(html: js.Any, options: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.ignoreSslError> property.
  			 */
  def setIgnoreSslError(ignoreSslError: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.keyboardDisplayRequiresUserAction> property.
  			 */
  def setKeyboardDisplayRequiresUserAction(keyboardDisplayRequiresUserAction: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.lightTouchEnabled> property.
  			 */
  def setLightTouchEnabled(lightTouchEnabled: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.loading> property.
  			 */
  def setLoading(loading: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.mixedContentMode> property.
  			 */
  def setMixedContentMode(mixedContentMode: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.onCreateWindow> property.
  			 */
  def setOnCreateWindow(onCreateWindow: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.onlink> property.
  			 */
  def setOnlink(onlink: js.Function1[/* param0 */ OnLinkURLResponse, _]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.overScrollMode> property.
  			 */
  def setOverScrollMode(overScrollMode: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.pluginState> property.
  			 */
  def setPluginState(pluginState: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.requestHeaders> property.
  			 */
  def setRequestHeaders(requestHeaders: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.scalesPageToFit> property.
  			 */
  def setScalesPageToFit(scalesPageToFit: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.scrollsToTop> property.
  			 */
  def setScrollsToTop(scrollsToTop: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.timeout> property.
  			 */
  def setTimeout(timeout: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.url> property.
  			 */
  def setUrl(url: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.userAgent> property.
  			 */
  def setUserAgent(userAgent: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.willHandleTouches> property.
  			 */
  def setWillHandleTouches(willHandleTouches: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.zoomLevel> property.
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
  def takeSnapshot(callback: js.Function1[/* param0 */ SnapshotResult, _]): Unit = js.native
}

