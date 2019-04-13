package typings
package titaniumLib.TitaniumNs.UINs

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
  var allowedURLSchemes: js.Array[java.lang.String] = js.native
  /**
  			 * A Boolean value indicating whether horizontal swipe gestures will trigger back-forward list navigations.
  			 */
  var allowsBackForwardNavigationGestures: scala.Boolean = js.native
  /**
  			 * A Boolean value that determines whether pressing on a link displays a preview of the
  			 * destination for the link.
  			 */
  var allowsLinkPreview: scala.Boolean = js.native
  /**
  			 * An array of url strings to blacklist.
  			 */
  var blacklistedURLs: js.Array[java.lang.String] = js.native
  /**
  			 * Determines how a cache is used in this web view.
  			 */
  var cacheMode: scala.Double = js.native
  /**
  			 * The cache policy for the request.
  			 */
  var cachePolicy: scala.Double = js.native
  /**
  			 * The configuration for the new web view.
  			 */
  var configuration: titaniumLib.TitaniumNs.UINs.iOSNs.WebViewConfiguration = js.native
  /**
  			 * Web content to load.
  			 */
  var data: titaniumLib.TitaniumNs.Blob | titaniumLib.TitaniumNs.FilesystemNs.File = js.native
  /**
  			 * Determines whether the view will bounce when scrolling to the edge of the scrollable region.
  			 */
  var disableBounce: scala.Boolean = js.native
  /**
  			 * Determines whether or not the webview should not be able to display the context menu.
  			 */
  var disableContextMenu: scala.Boolean = js.native
  /**
  			 * Enable adding javascript interfaces internally to webview prior to JELLY_BEAN_MR1 (Android 4.2)
  			 */
  var enableJavascriptInterface: scala.Boolean = js.native
  /**
  			 * If `true`, zoom controls are enabled.
  			 */
  var enableZoomControls: scala.Boolean = js.native
  /**
  			 * Lets the webview handle platform supported urls
  			 */
  var handlePlatformUrl: scala.Boolean = js.native
  /**
  			 * Hides activity indicator when loading remote URL.
  			 */
  var hideLoadIndicator: scala.Boolean = js.native
  /**
  			 * HTML content of this web view.
  			 */
  var html: java.lang.String = js.native
  /**
  			 * Controls whether to ignore invalid SSL certificates or not.
  			 */
  var ignoreSslError: scala.Boolean = js.native
  /**
  			 * A Boolean value indicating whether web content can programmatically display the keyboard.
  			 */
  var keyboardDisplayRequiresUserAction: scala.Boolean = js.native
  /**
  			 * Enables using light touches to make a selection and activate mouseovers.
  			 */
  var lightTouchEnabled: scala.Boolean = js.native
  /**
  			 * Indicates if the webview is loading content.
  			 */
  var loading: scala.Boolean = js.native
  /**
  			 * If `true`, allows the loading of insecure resources from a secure origin.
  			 */
  var mixedContentMode: scala.Boolean = js.native
  /**
  			 * Determines the behavior when the user overscrolls the view.
  			 */
  var overScrollMode: scala.Double = js.native
  /**
  			 * Determines how to treat content that requires plugins in this web view.
  			 */
  var pluginState: scala.Double = js.native
  /**
  			 * An estimate of what fraction of the current navigation has been loaded.
  			 */
  val progress: scala.Double = js.native
  /**
  			 * Sets extra request headers for this web view to use on subsequent URL requests.
  			 */
  var requestHeaders: js.Any = js.native
  /**
  			 * If `true`, scale contents to fit the web view.
  			 */
  var scalesPageToFit: scala.Boolean = js.native
  /**
  			 * Controls whether the scroll-to-top gesture is effective.
  			 */
  var scrollsToTop: scala.Boolean = js.native
  /**
  			 * A Boolean value indicating whether all resources on the page have been loaded through
  			 * securely encrypted connections.
  			 */
  val secure: scala.Boolean = js.native
  /**
  			 * The level of granularity with which the user can interactively select content in the web view.
  			 */
  val selectionGranularity: scala.Double = js.native
  /**
  			 * The timeout interval for the request, in seconds.
  			 */
  var timeout: scala.Double = js.native
  /**
  			 * Returns page title of webpage.
  			 */
  val title: java.lang.String = js.native
  /**
  			 * URL to the web document.
  			 */
  var url: java.lang.String = js.native
  /**
  			 * The User-Agent header used by the web view when requesting content.
  			 */
  var userAgent: java.lang.String = js.native
  /**
  			 * Explicitly specifies if this web view handles touches.
  			 */
  var willHandleTouches: scala.Boolean = js.native
  /**
  			 * Manage the zoom-level of the current page.
  			 */
  var zoomLevel: scala.Double = js.native
  /**
  			 * Adds a script message handler.
  			 */
  def addScriptMessageHandler(handlerName: java.lang.String): scala.Unit = js.native
  /**
  			 * Adds a user script.
  			 */
  def addUserScript(source: java.lang.String, injectionTime: scala.Double, mainFrameOnly: scala.Boolean): scala.Unit = js.native
  /**
  			 * An object which maintains a list of visited pages used to go back and forward to the most recent page.
  			 */
  def backForwardList(): titaniumLib.BackForwardList = js.native
  /**
  			 * Returns `true` if the web view can go back in its history list.
  			 */
  def canGoBack(): scala.Boolean = js.native
  /**
  			 * Returns `true` if the web view can go forward in its history list.
  			 */
  def canGoForward(): scala.Boolean = js.native
  /**
  			 * Evaluates a JavaScript expression inside the context of the web view and
  			 * optionally, returns a result. If a callback function is passed in as second argument,
  			 * the evaluation will take place asynchronously and the the callback function will be called with the result.
  			 */
  def evalJS(code: java.lang.String): java.lang.String = js.native
  def evalJS(code: java.lang.String, callback: js.Function1[/* param0 */ java.lang.String, _]): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.allowedURLSchemes> property.
  			 */
  def getAllowedURLSchemes(): js.Array[java.lang.String] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.allowsBackForwardNavigationGestures> property.
  			 */
  def getAllowsBackForwardNavigationGestures(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.allowsLinkPreview> property.
  			 */
  def getAllowsLinkPreview(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.blacklistedURLs> property.
  			 */
  def getBlacklistedURLs(): js.Array[java.lang.String] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.cacheMode> property.
  			 */
  def getCacheMode(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.cachePolicy> property.
  			 */
  def getCachePolicy(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.configuration> property.
  			 */
  def getConfiguration(): titaniumLib.TitaniumNs.UINs.iOSNs.WebViewConfiguration = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.data> property.
  			 */
  def getData(): titaniumLib.TitaniumNs.Blob | titaniumLib.TitaniumNs.FilesystemNs.File = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.disableBounce> property.
  			 */
  def getDisableBounce(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.disableContextMenu> property.
  			 */
  def getDisableContextMenu(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.enableJavascriptInterface> property.
  			 */
  def getEnableJavascriptInterface(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.enableZoomControls> property.
  			 */
  def getEnableZoomControls(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.handlePlatformUrl> property.
  			 */
  def getHandlePlatformUrl(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.hideLoadIndicator> property.
  			 */
  def getHideLoadIndicator(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.html> property.
  			 */
  def getHtml(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.ignoreSslError> property.
  			 */
  def getIgnoreSslError(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.keyboardDisplayRequiresUserAction> property.
  			 */
  def getKeyboardDisplayRequiresUserAction(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.lightTouchEnabled> property.
  			 */
  def getLightTouchEnabled(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.loading> property.
  			 */
  def getLoading(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.mixedContentMode> property.
  			 */
  def getMixedContentMode(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.onCreateWindow> property.
  			 */
  def getOnCreateWindow(): js.Function1[/* param0 */ js.Any, _] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.onlink> property.
  			 */
  def getOnlink(): js.Function1[/* param0 */ titaniumLib.OnLinkURLResponse, _] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.overScrollMode> property.
  			 */
  def getOverScrollMode(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.pluginState> property.
  			 */
  def getPluginState(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.progress> property.
  			 */
  def getProgress(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.requestHeaders> property.
  			 */
  def getRequestHeaders(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.scalesPageToFit> property.
  			 */
  def getScalesPageToFit(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.scrollsToTop> property.
  			 */
  def getScrollsToTop(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.secure> property.
  			 */
  def getSecure(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.selectionGranularity> property.
  			 */
  def getSelectionGranularity(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.timeout> property.
  			 */
  def getTimeout(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.title> property.
  			 */
  def getTitle(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.url> property.
  			 */
  def getUrl(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.userAgent> property.
  			 */
  def getUserAgent(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.willHandleTouches> property.
  			 */
  def getWillHandleTouches(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.WebView.zoomLevel> property.
  			 */
  def getZoomLevel(): scala.Double = js.native
  /**
  			 * Goes back one entry in the web view's history list, to the previous page.
  			 */
  def goBack(): scala.Unit = js.native
  /**
  			 * Goes forward one entry in this web view's history list, if possible.
  			 */
  def goForward(): scala.Unit = js.native
  /**
  			 * Callback function called when there is a request for the application to create a new window
  			 * to host new content.
  			 */
  def onCreateWindow(param0: js.Any): js.Any = js.native
  /**
  			 * Fired before navigating to a link.
  			 */
  def onlink(param0: titaniumLib.OnLinkURLResponse): js.Any = js.native
  /**
  			 * Pauses native webview plugins.
  			 */
  def pause(): scala.Unit = js.native
  /**
  			 * Releases memory when the web view is no longer needed.
  			 */
  def release(): scala.Unit = js.native
  /**
  			 * Reloads the current webpage.
  			 */
  def reload(): scala.Unit = js.native
  /**
  			 * Removes all associated user scripts.
  			 */
  def removeAllUserScripts(): scala.Unit = js.native
  /**
  			 * Removes a script message handler.
  			 */
  def removeScriptMessageHandler(name: java.lang.String): scala.Unit = js.native
  /**
  			 * Forces the web view to repaint its contents.
  			 */
  def repaint(): scala.Unit = js.native
  /**
  			 * Resume native webview plugins.
  			 */
  def resume(): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.allowedURLSchemes> property.
  			 */
  def setAllowedURLSchemes(allowedURLSchemes: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.allowsBackForwardNavigationGestures> property.
  			 */
  def setAllowsBackForwardNavigationGestures(allowsBackForwardNavigationGestures: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.allowsLinkPreview> property.
  			 */
  def setAllowsLinkPreview(allowsLinkPreview: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the basic authentication for this web view to use on subsequent URL requests.
  			 */
  def setBasicAuthentication(username: java.lang.String, password: java.lang.String, persistence: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.blacklistedURLs> property.
  			 */
  def setBlacklistedURLs(blacklistedURLs: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.cacheMode> property.
  			 */
  def setCacheMode(cacheMode: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.cachePolicy> property.
  			 */
  def setCachePolicy(cachePolicy: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.configuration> property.
  			 */
  def setConfiguration(configuration: titaniumLib.TitaniumNs.UINs.iOSNs.WebViewConfiguration): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.data> property.
  			 */
  def setData(data: titaniumLib.TitaniumNs.Blob): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.data> property.
  			 */
  def setData(data: titaniumLib.TitaniumNs.FilesystemNs.File): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.disableBounce> property.
  			 */
  def setDisableBounce(disableBounce: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.disableContextMenu> property.
  			 */
  def setDisableContextMenu(disableContextMenu: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.enableJavascriptInterface> property.
  			 */
  def setEnableJavascriptInterface(enableJavascriptInterface: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.enableZoomControls> property.
  			 */
  def setEnableZoomControls(enableZoomControls: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.handlePlatformUrl> property.
  			 */
  def setHandlePlatformUrl(handlePlatformUrl: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.hideLoadIndicator> property.
  			 */
  def setHideLoadIndicator(hideLoadIndicator: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of [html](Titanium.UI.WebView.html) property.
  			 */
  def setHtml(html: js.Any): scala.Unit = js.native
  def setHtml(html: js.Any, options: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.ignoreSslError> property.
  			 */
  def setIgnoreSslError(ignoreSslError: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.keyboardDisplayRequiresUserAction> property.
  			 */
  def setKeyboardDisplayRequiresUserAction(keyboardDisplayRequiresUserAction: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.lightTouchEnabled> property.
  			 */
  def setLightTouchEnabled(lightTouchEnabled: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.loading> property.
  			 */
  def setLoading(loading: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.mixedContentMode> property.
  			 */
  def setMixedContentMode(mixedContentMode: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.onCreateWindow> property.
  			 */
  def setOnCreateWindow(onCreateWindow: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.onlink> property.
  			 */
  def setOnlink(onlink: js.Function1[/* param0 */ titaniumLib.OnLinkURLResponse, _]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.overScrollMode> property.
  			 */
  def setOverScrollMode(overScrollMode: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.pluginState> property.
  			 */
  def setPluginState(pluginState: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.requestHeaders> property.
  			 */
  def setRequestHeaders(requestHeaders: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.scalesPageToFit> property.
  			 */
  def setScalesPageToFit(scalesPageToFit: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.scrollsToTop> property.
  			 */
  def setScrollsToTop(scrollsToTop: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.timeout> property.
  			 */
  def setTimeout(timeout: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.url> property.
  			 */
  def setUrl(url: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.userAgent> property.
  			 */
  def setUserAgent(userAgent: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.willHandleTouches> property.
  			 */
  def setWillHandleTouches(willHandleTouches: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.WebView.zoomLevel> property.
  			 */
  def setZoomLevel(zoomLevel: scala.Double): scala.Unit = js.native
  /**
  			 * Add native properties for observing for change.
  			 */
  def startListeningToProperties(propertyList: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  			 * Remove native properties from observing.
  			 */
  def stopListeningToProperties(propertyList: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  			 * Stops loading a currently loading page.
  			 */
  def stopLoading(): scala.Unit = js.native
  /**
  			 * Takes a snapshot of the view's visible viewport.
  			 */
  def takeSnapshot(callback: js.Function1[/* param0 */ titaniumLib.SnapshotResult, _]): scala.Unit = js.native
}

