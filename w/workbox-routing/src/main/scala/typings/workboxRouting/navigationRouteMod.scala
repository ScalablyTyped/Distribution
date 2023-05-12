package typings.workboxRouting

import typings.workboxCore.typesMod.RouteHandler
import typings.workboxRouting.routeMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationRouteMod {
  
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
  @JSImport("workbox-routing/NavigationRoute", "NavigationRoute")
  @js.native
  open class NavigationRoute protected () extends Route {
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
    
    /* private */ val _allowlist: Any = js.native
    
    /* private */ val _denylist: Any = js.native
    
    /**
      * Routes match handler.
      *
      * @param {Object} options
      * @param {URL} options.url
      * @param {Request} options.request
      * @return {boolean}
      *
      * @private
      */
    /* private */ var _match: Any = js.native
  }
  
  trait NavigationRouteMatchOptions extends StObject {
    
    var allowlist: js.UndefOr[js.Array[js.RegExp]] = js.undefined
    
    var denylist: js.UndefOr[js.Array[js.RegExp]] = js.undefined
  }
  object NavigationRouteMatchOptions {
    
    inline def apply(): NavigationRouteMatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationRouteMatchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavigationRouteMatchOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowlist(value: js.Array[js.RegExp]): Self = StObject.set(x, "allowlist", value.asInstanceOf[js.Any])
      
      inline def setAllowlistUndefined: Self = StObject.set(x, "allowlist", js.undefined)
      
      inline def setAllowlistVarargs(value: js.RegExp*): Self = StObject.set(x, "allowlist", js.Array(value*))
      
      inline def setDenylist(value: js.Array[js.RegExp]): Self = StObject.set(x, "denylist", value.asInstanceOf[js.Any])
      
      inline def setDenylistUndefined: Self = StObject.set(x, "denylist", js.undefined)
      
      inline def setDenylistVarargs(value: js.RegExp*): Self = StObject.set(x, "denylist", js.Array(value*))
    }
  }
}
