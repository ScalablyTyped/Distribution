package typings.workboxSw.mod.global.workbox

import typings.workboxCore.typesMod.RouteHandler
import typings.workboxCore.typesMod.RouteMatchCallback
import typings.workboxRouting.navigationRouteMod.NavigationRouteMatchOptions
import typings.workboxRouting.utilsConstantsMod.HTTPMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof WorkboxRouting` */
object routing {
  
  @JSGlobal("workbox.routing")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * NavigationRoute makes it easy to create a
    * {@link workbox-routing.Route} that matches for browser
    * [navigation requests]{@link https://developers.google.com/web/fundamentals/primers/service-workers/high-performance-loading#first_what_are_navigation_requests}.
    *
    * It will only match incoming Requests whose
    * {@link https://fetch.spec.whatwg.org/#concept-request-mode|mode}
    * is set to `navigate`.
    *
    * You can optionally only apply this route to a subset of navigation requests
    * by using one or both of the `denylist` and `allowlist` parameters.
    *
    * @memberof workbox-routing
    * @extends workbox-routing.Route
    */
  @JSGlobal("workbox.routing.NavigationRoute")
  @js.native
  open class NavigationRoute protected ()
    extends typings.workboxRouting.mod.NavigationRoute {
    /**
      * If both `denylist` and `allowlist` are provided, the `denylist` will
      * take precedence and the request will not match this route.
      *
      * The regular expressions in `allowlist` and `denylist`
      * are matched against the concatenated
      * [`pathname`]{@link https://developer.mozilla.org/en-US/docs/Web/API/HTMLHyperlinkElementUtils/pathname}
      * and [`search`]{@link https://developer.mozilla.org/en-US/docs/Web/API/HTMLHyperlinkElementUtils/search}
      * portions of the requested URL.
      *
      * *Note*: These RegExps may be evaluated against every destination URL during
      * a navigation. Avoid using
      * [complex RegExps](https://github.com/GoogleChrome/workbox/issues/3077),
      * or else your users may see delays when navigating your site.
      *
      * @param {workbox-routing~handlerCallback} handler A callback
      * function that returns a Promise resulting in a Response.
      * @param {Object} options
      * @param {Array<RegExp>} [options.denylist] If any of these patterns match,
      * the route will not handle the request (even if a allowlist RegExp matches).
      * @param {Array<RegExp>} [options.allowlist=[/./]] If any of these patterns
      * match the URL's pathname and search parameter, the route will handle the
      * request (assuming the denylist doesn't match).
      */
    def this(handler: RouteHandler) = this()
    def this(handler: RouteHandler, param1: NavigationRouteMatchOptions) = this()
  }
  
  /**
    * RegExpRoute makes it easy to create a regular expression based
    * {@link workbox-routing.Route}.
    *
    * For same-origin requests the RegExp only needs to match part of the URL. For
    * requests against third-party servers, you must define a RegExp that matches
    * the start of the URL.
    *
    * @memberof workbox-routing
    * @extends workbox-routing.Route
    */
  @JSGlobal("workbox.routing.RegExpRoute")
  @js.native
  open class RegExpRoute protected ()
    extends typings.workboxRouting.mod.RegExpRoute {
    /**
      * If the regular expression contains
      * [capture groups]{@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp#grouping-back-references},
      * the captured values will be passed to the
      * {@link workbox-routing~handlerCallback} `params`
      * argument.
      *
      * @param {RegExp} regExp The regular expression to match against URLs.
      * @param {workbox-routing~handlerCallback} handler A callback
      * function that returns a Promise resulting in a Response.
      * @param {string} [method='GET'] The HTTP method to match the Route
      * against.
      */
    def this(regExp: js.RegExp, handler: RouteHandler) = this()
    def this(regExp: js.RegExp, handler: RouteHandler, method: HTTPMethod) = this()
  }
  
  /**
    * A `Route` consists of a pair of callback functions, "match" and "handler".
    * The "match" callback determine if a route should be used to "handle" a
    * request by returning a non-falsy value if it can. The "handler" callback
    * is called when there is a match and should return a Promise that resolves
    * to a `Response`.
    *
    * @memberof workbox-routing
    */
  @JSGlobal("workbox.routing.Route")
  @js.native
  open class Route protected ()
    extends typings.workboxRouting.mod.Route {
    /**
      * Constructor for Route class.
      *
      * @param {workbox-routing~matchCallback} match
      * A callback function that determines whether the route matches a given
      * `fetch` event by returning a non-falsy value.
      * @param {workbox-routing~handlerCallback} handler A callback
      * function that returns a Promise resolving to a Response.
      * @param {string} [method='GET'] The HTTP method to match the Route
      * against.
      */
    def this(`match`: RouteMatchCallback, handler: RouteHandler) = this()
    def this(`match`: RouteMatchCallback, handler: RouteHandler, method: HTTPMethod) = this()
  }
  
  /**
    * The Router can be used to process a `FetchEvent` using one or more
    * {@link workbox-routing.Route}, responding with a `Response` if
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
    *
    * @memberof workbox-routing
    */
  @JSGlobal("workbox.routing.Router")
  @js.native
  /**
    * Initializes a new Router.
    */
  open class Router ()
    extends typings.workboxRouting.mod.Router
  
  inline def registerRoute(capture: String): typings.workboxRouting.routeMod.Route = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[typings.workboxRouting.routeMod.Route]
  inline def registerRoute(capture: String, handler: Unit, method: HTTPMethod): typings.workboxRouting.routeMod.Route = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route]
  inline def registerRoute(capture: String, handler: RouteHandler): typings.workboxRouting.routeMod.Route = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route]
  inline def registerRoute(capture: String, handler: RouteHandler, method: HTTPMethod): typings.workboxRouting.routeMod.Route = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route]
  /**
    * Easily register a RegExp, string, or function with a caching
    * strategy to a singleton Router instance.
    *
    * This method will generate a Route for you if needed and
    * call {@link workbox-routing.Router#registerRoute}.
    *
    * @param {RegExp|string|workbox-routing.Route~matchCallback|workbox-routing.Route} capture
    * If the capture param is a `Route`, all other arguments will be ignored.
    * @param {workbox-routing~handlerCallback} [handler] A callback
    * function that returns a Promise resulting in a Response. This parameter
    * is required if `capture` is not a `Route` object.
    * @param {string} [method='GET'] The HTTP method to match the Route
    * against.
    * @return {workbox-routing.Route} The generated `Route`.
    *
    * @memberof workbox-routing
    */
  inline def registerRoute(capture: js.RegExp): typings.workboxRouting.routeMod.Route = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[typings.workboxRouting.routeMod.Route]
  inline def registerRoute(capture: js.RegExp, handler: Unit, method: HTTPMethod): typings.workboxRouting.routeMod.Route = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route]
  inline def registerRoute(capture: js.RegExp, handler: RouteHandler): typings.workboxRouting.routeMod.Route = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route]
  inline def registerRoute(capture: js.RegExp, handler: RouteHandler, method: HTTPMethod): typings.workboxRouting.routeMod.Route = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route]
  inline def registerRoute(capture: RouteMatchCallback): typings.workboxRouting.routeMod.Route = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[typings.workboxRouting.routeMod.Route]
  inline def registerRoute(capture: RouteMatchCallback, handler: Unit, method: HTTPMethod): typings.workboxRouting.routeMod.Route = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route]
  inline def registerRoute(capture: RouteMatchCallback, handler: RouteHandler): typings.workboxRouting.routeMod.Route = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route]
  inline def registerRoute(capture: RouteMatchCallback, handler: RouteHandler, method: HTTPMethod): typings.workboxRouting.routeMod.Route = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route]
  inline def registerRoute(capture: typings.workboxRouting.routeMod.Route): typings.workboxRouting.routeMod.Route = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[typings.workboxRouting.routeMod.Route]
  inline def registerRoute(capture: typings.workboxRouting.routeMod.Route, handler: Unit, method: HTTPMethod): typings.workboxRouting.routeMod.Route = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route]
  inline def registerRoute(capture: typings.workboxRouting.routeMod.Route, handler: RouteHandler): typings.workboxRouting.routeMod.Route = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route]
  inline def registerRoute(capture: typings.workboxRouting.routeMod.Route, handler: RouteHandler, method: HTTPMethod): typings.workboxRouting.routeMod.Route = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route]
  
  /**
    * If a Route throws an error while handling a request, this `handler`
    * will be called and given a chance to provide a response.
    *
    * @param {workbox-routing~handlerCallback} handler A callback
    * function that returns a Promise resulting in a Response.
    *
    * @memberof workbox-routing
    */
  inline def setCatchHandler(handler: RouteHandler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCatchHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Define a default `handler` that's called when no routes explicitly
    * match the incoming request.
    *
    * Without a default handler, unmatched requests will go against the
    * network as if there were no service worker present.
    *
    * @param {workbox-routing~handlerCallback} handler A callback
    * function that returns a Promise resulting in a Response.
    *
    * @memberof workbox-routing
    */
  inline def setDefaultHandler(handler: RouteHandler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
