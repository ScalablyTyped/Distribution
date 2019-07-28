package typings.workboxDashSw

import org.scalablytyped.runtime.Instantiable0
import typings.std.Partial
import typings.std.RegExp
import typings.std.Response
import typings.workboxDashSw.workboxDashSwMod.HandlerCallback
import typings.workboxDashSw.workboxDashSwMod.MatchCallback
import typings.workboxDashSw.workboxDashSwMod.NavigationRouteConstructor
import typings.workboxDashSw.workboxDashSwMod.RegExpRouteConstructor
import typings.workboxDashSw.workboxDashSwMod.RegisterNavigationRouteOptions
import typings.workboxDashSw.workboxDashSwMod.RouteConstructor
import typings.workboxDashSw.workboxDashSwMod.RouterConstructor
import typings.workboxDashSw.workboxDashSwMod.RoutingNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassRoutingNamespace extends Instantiable0[RoutingNamespace] {
  /**
  	 * NavigationRoute makes it easy to create a Route that matches for browser
  	 * [navigation requests]{@link https://developers.google.com/web/fundamentals/primers/service-workers/high-performance-loading#first_what_are_navigation_requests}.
  	 *
  	 * It will only match incoming Requests whose
  	 * [`mode`]{@link https://fetch.spec.whatwg.org/#concept-request-mode}
  	 * is set to `navigate`.
  	 *
  	 * You can optionally only apply this route to a subset of navigation requests
  	 * by using one or both of the `blacklist` and `whitelist` parameters.
  	 */
  val NavigationRoute: NavigationRouteConstructor = js.native
  /**
  	 * RegExpRoute makes it easy to create a regular expression based
  	 * Route.
  	 *
  	 * For same-origin requests the RegExp only needs to match part of the URL. For
  	 * requests against third-party servers, you must define a RegExp that matches
  	 * the start of the URL.
  	 *
  	 * [See the module docs for info.]{@link https://developers.google.com/web/tools/workbox/modules/workbox-routing}
  	 */
  val RegExpRoute: RegExpRouteConstructor = js.native
  /**
  	 * A `Route` consists of a pair of callback functions, "match" and "handler".
  	 * The "match" callback determine if a route should be used to "handle" a
  	 * request by returning a non-falsy value if it can. The "handler" callback
  	 * is called when there is a match and should return a Promise that resolves
  	 * to a `Response`.
  	 */
  val Route: RouteConstructor = js.native
  /**
  	 * The Router can be used to process a FetchEvent through one or more
  	 * Routes responding  with a Request if
  	 * a matching route exists.
  	 *
  	 * If no route matches a given a request, the Router will use a "default"
  	 * handler if one is defined.
  	 *
  	 * Should the matching Route throw an error, the Router will use a "catch"
  	 * handler if one is defined to gracefully deal with issues and respond with a
  	 * Request.
  	 *
  	 * If a request matches multiple routes, the **earliest** registered route will
  	 * be used to respond to the request.
  	 */
  val Router: RouterConstructor = js.native
  /**
  	 * Registers a route that will return a precached file for a navigation
  	 * request. This is useful for the
  	 * [application shell pattern]{@link https://developers.google.com/web/fundamentals/architecture/app-shell}.
  	 *
  	 * When determining the URL of the precached HTML document, you will likely need
  	 * to call `workbox.precaching.getCacheKeyForURL(originalUrl)`, to account for
  	 * the fact that Workbox's precaching naming conventions often results in URL
  	 * cache keys that contain extra revisioning info.
  	 *
  	 * This method will generate a NavigationRoute and call Router.registerRoute() on a singleton Router instance.
  	 * @param {string} cachedAssetUrl - The cache key to use for the HTML file.
  	 * @param {Partial<RegisterNavigationRouteOptions>} [options]
  	 * @returns {NavigationRoute} Returns the generated Route.
  	 */
  def registerNavigationRoute(cachedAssetUrl: String): typings.workboxDashSw.workboxDashSwMod.NavigationRoute = js.native
  def registerNavigationRoute(cachedAssetUrl: String, options: Partial[RegisterNavigationRouteOptions]): typings.workboxDashSw.workboxDashSwMod.NavigationRoute = js.native
  /**
  	 * Easily register a RegExp, string, or function with a caching
  	 * strategy to a singleton Router instance.
  	 *
  	 * This method will generate a Route for you if needed and
  	 * call Router.registerRoute().
  	 * @param {string | RegExp | MatchCallback | Route} capture - If the capture param is a `Route`, all other arguments will be ignored.
  	 * @param {HandlerCallback} handler - A callback function that returns a Promise resulting in a Response.
  	 * @param {string} [method="GET"] - The HTTP method to match the Route against.
  	 * @returns {Route} The generated `Route` (Useful for unregistering).
  	 */
  def registerRoute(capture: String, handler: HandlerCallback): typings.workboxDashSw.workboxDashSwMod.Route = js.native
  def registerRoute(capture: String, handler: HandlerCallback, method: String): typings.workboxDashSw.workboxDashSwMod.Route = js.native
  def registerRoute(capture: RegExp, handler: HandlerCallback): typings.workboxDashSw.workboxDashSwMod.Route = js.native
  def registerRoute(capture: RegExp, handler: HandlerCallback, method: String): typings.workboxDashSw.workboxDashSwMod.Route = js.native
  def registerRoute(capture: MatchCallback, handler: HandlerCallback): typings.workboxDashSw.workboxDashSwMod.Route = js.native
  def registerRoute(capture: MatchCallback, handler: HandlerCallback, method: String): typings.workboxDashSw.workboxDashSwMod.Route = js.native
  def registerRoute(capture: typings.workboxDashSw.workboxDashSwMod.Route, handler: HandlerCallback): typings.workboxDashSw.workboxDashSwMod.Route = js.native
  def registerRoute(capture: typings.workboxDashSw.workboxDashSwMod.Route, handler: HandlerCallback, method: String): typings.workboxDashSw.workboxDashSwMod.Route = js.native
  /**
  	 * If a Route throws an error while handling a request, this `handler`
  	 * will be called and given a chance to provide a response.
  	 * @param {HandlerCallback} handler - A callback function that returns a Promise resulting in a Response.
  	 */
  def setCatchHandler(handler: HandlerCallback): Unit = js.native
  /**
  	 * Define a default `handler` that's called when no routes explicitly
  	 * match the incoming request.
  	 *
  	 * Without a default handler, unmatched requests will go against the
  	 * network as if there were no service worker present.
  	 * @param {HandlerCallback} handler - A callback function that returns a Promise resulting in a Response.
  	 */
  def setDefaultHandler(handler: HandlerCallback): js.Promise[Response] = js.native
}

