package typings
package atUirouterCoreLib.libUrlUrlServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/url/urlService", "UrlService")
@js.native
class UrlService protected ()
  extends atUirouterCoreLib.libCommonCoreservicesMod.LocationServices
     with atUirouterCoreLib.libUrlInterfaceMod.UrlSyncApi {
  /** @hidden */
  def this(/** @hidden */ router: atUirouterCoreLib.libRouterMod.UIRouter) = this()
  /** @hidden */ var _stopListeningFn: js.Any = js.native
  /**
    * The nested [[UrlConfig]] API to configure the URL and retrieve URL information
    *
    * See: [[UrlConfig]] for details
    */
  var config: atUirouterCoreLib.libUrlUrlConfigMod.UrlConfig = js.native
  /** See: [[UrlService.deferIntercept]] */ /* CompleteClass */
  override var deferIntercept: (js.Function1[/* defer */ js.UndefOr[scala.Boolean], scala.Unit]) | (/* import warning: ImportType.apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['deferIntercept'] */ js.Any) = js.native
  /** @hidden */ var interceptDeferred: scala.Boolean = js.native
  /** See: [[UrlService.listen]] */ /* CompleteClass */
  override var listen: (js.Function1[/* enabled */ js.UndefOr[scala.Boolean], js.Function]) | (/* import warning: ImportType.apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['listen'] */ js.Any) = js.native
  var router: js.Any = js.native
  /**
    * The nested [[UrlRules]] API for managing URL rules and rewrites
    *
    * See: [[UrlRules]] for details
    */
  var rules: atUirouterCoreLib.libUrlUrlRulesMod.UrlRules = js.native
  /** See: [[UrlService.sync]] */ /* CompleteClass */
  override var sync: (js.Function1[/* evt */ js.UndefOr[js.Any], scala.Unit]) | (/* import warning: ImportType.apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['sync'] */ js.Any) = js.native
  /**
    * Disables monitoring of the URL.
    *
    * Call this method before UI-Router has bootstrapped.
    * It will stop UI-Router from performing the initial url sync.
    *
    * This can be useful to perform some asynchronous initialization before the router starts.
    * Once the initialization is complete, call [[listen]] to tell UI-Router to start watching and synchronizing the URL.
    *
    * #### Example:
    * ```js
    * // Prevent UI-Router from automatically intercepting URL changes when it starts;
    * urlService.deferIntercept();
    *
    * fetch('/states.json').then(resp => resp.json()).then(data => {
    *   data.forEach(state => $stateRegistry.register(state));
    *   urlService.listen();
    *   urlService.sync();
    * });
    * ```
    *
    * @param defer Indicates whether to defer location change interception.
    *        Passing no parameter is equivalent to `true`.
    */
  @JSName("deferIntercept")
  def deferIntercept_MUrlService(): scala.Unit = js.native
  @JSName("deferIntercept")
  def deferIntercept_MUrlService(defer: scala.Boolean): scala.Unit = js.native
  /**
    * Gets the hash part of the current url
    *
    * If the current URL is `/some/path?query=value#anchor`, this returns `anchor`
    *
    * @return the hash (anchor) portion of the url
    */
  @JSName("hash")
  def hash_MUrlService(): java.lang.String = js.native
  /**
    * Starts or stops listening for URL changes
    *
    * Call this sometime after calling [[deferIntercept]] to start monitoring the url.
    * This causes UI-Router to start listening for changes to the URL, if it wasn't already listening.
    *
    * If called with `false`, UI-Router will stop listening (call listen(true) to start listening again).
    *
    * #### Example:
    * ```js
    * urlService.deferIntercept();
    *
    * fetch('/states.json').then(resp => resp.json()).then(data => {
    *   data.forEach(state => $stateRegistry.register(state));
    *   // Start responding to URL changes
    *   urlService.listen();
    *   urlService.sync();
    * });
    * ```
    *
    * @param enabled `true` or `false` to start or stop listening to URL changes
    */
  @JSName("listen")
  def listen_MUrlService(): js.Function = js.native
  @JSName("listen")
  def listen_MUrlService(enabled: scala.Boolean): js.Function = js.native
  /**
    * Matches a URL
    *
    * Given a URL (as a [[UrlParts]] object), check all rules and determine the best matching rule.
    * Return the result as a [[MatchResult]].
    */
  def `match`(url: atUirouterCoreLib.libUrlInterfaceMod.UrlParts): atUirouterCoreLib.libUrlInterfaceMod.MatchResult = js.native
  /**
    * @internalapi
    *
    * Registers a low level url change handler
    *
    * Note: Because this is a low level handler, it's not recommended for general use.
    *
    * #### Example:
    * ```js
    * let deregisterFn = locationServices.onChange((evt) => console.log("url change", evt));
    * ```
    *
    * @param callback a function that will be called when the url is changing
    * @return a function that de-registers the callback
    */
  @JSName("onChange")
  def onChange_MUrlService(callback: js.Function): js.Function = js.native
  /**
    * Gets the current URL parts
    *
    * This method returns the different parts of the current URL (the [[path]], [[search]], and [[hash]]) as a [[UrlParts]] object.
    */
  def parts(): atUirouterCoreLib.libUrlInterfaceMod.UrlParts = js.native
  /**
    * Gets the path part of the current url
    *
    * If the current URL is `/some/path?query=value#anchor`, this returns `/some/path`
    *
    * @return the path portion of the url
    */
  @JSName("path")
  def path_MUrlService(): java.lang.String = js.native
  /**
    * Gets the search part of the current url as an object
    *
    * If the current URL is `/some/path?query=value#anchor`, this returns `{ query: 'value' }`
    *
    * @return the search (query) portion of the url, as an object
    */
  @JSName("search")
  def search_MUrlService(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
    * Activates the best rule for the current URL
    *
    * Checks the current URL for a matching [[UrlRule]], then invokes that rule's handler.
    * This method is called internally any time the URL has changed.
    *
    * This effectively activates the state (or redirect, etc) which matches the current URL.
    *
    * #### Example:
    * ```js
    * urlService.deferIntercept();
    *
    * fetch('/states.json').then(resp => resp.json()).then(data => {
    *   data.forEach(state => $stateRegistry.register(state));
    *   urlService.listen();
    *   // Find the matching URL and invoke the handler.
    *   urlService.sync();
    * });
    * ```
    */
  @JSName("sync")
  def sync_MUrlService(): scala.Unit = js.native
  @JSName("sync")
  def sync_MUrlService(evt: js.Any): scala.Unit = js.native
  /**
    * Gets the current url, or updates the url
    *
    * ### Getting the current URL
    *
    * When no arguments are passed, returns the current URL.
    * The URL is normalized using the internal [[path]]/[[search]]/[[hash]] values.
    *
    * For example, the URL may be stored in the hash ([[HashLocationServices]]) or
    * have a base HREF prepended ([[PushStateLocationServices]]).
    *
    * The raw URL in the browser might be:
    *
    * ```
    * http://mysite.com/somepath/index.html#/internal/path/123?param1=foo#anchor
    * ```
    *
    * or
    *
    * ```
    * http://mysite.com/basepath/internal/path/123?param1=foo#anchor
    * ```
    *
    * then this method returns:
    *
    * ```
    * /internal/path/123?param1=foo#anchor
    * ```
    *
    *
    * #### Example:
    * ```js
    * locationServices.url(); // "/some/path?query=value#anchor"
    * ```
    *
    * ### Updating the URL
    *
    * When `newurl` arguments is provided, changes the URL to reflect `newurl`
    *
    * #### Example:
    * ```js
    * locationServices.url("/some/path?query=value#anchor", true);
    * ```
    *
    * @param newurl The new value for the URL.
    *               This url should reflect only the new internal [[path]], [[search]], and [[hash]] values.
    *               It should not include the protocol, site, port, or base path of an absolute HREF.
    * @param replace When true, replaces the current history entry (instead of appending it) with this new url
    * @param state The history's state object, i.e., pushState (if the LocationServices implementation supports it)
    *
    * @return the url (after potentially being processed)
    */
  @JSName("url")
  def url_MUrlService(): java.lang.String = js.native
  @JSName("url")
  def url_MUrlService(newurl: java.lang.String): java.lang.String = js.native
  @JSName("url")
  def url_MUrlService(newurl: java.lang.String, replace: scala.Boolean): java.lang.String = js.native
  @JSName("url")
  def url_MUrlService(newurl: java.lang.String, replace: scala.Boolean, state: js.Any): java.lang.String = js.native
}

