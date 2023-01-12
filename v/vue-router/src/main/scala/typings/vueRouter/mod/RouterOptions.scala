package typings.vueRouter.mod

import typings.vueRouter.anon.ReadonlyArrayRouteRecordR
import typings.vueRouter.vueRouterBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterOptions
  extends StObject
     with PathParserOptions {
  
  /**
    * History implementation used by the router. Most web applications should use
    * `createWebHistory` but it requires the server to be properly configured.
    * You can also use a _hash_ based history with `createWebHashHistory` that
    * does not require any configuration on the server but isn't handled at all
    * by search engines and does poorly on SEO.
    *
    * @example
    * ```js
    * createRouter({
    *   history: createWebHistory(),
    *   // other options...
    * })
    * ```
    */
  var history: RouterHistory
  
  /**
    * Default class applied to active {@link RouterLink}. If none is provided,
    * `router-link-active` will be applied.
    */
  var linkActiveClass: js.UndefOr[String] = js.undefined
  
  /**
    * Default class applied to exact active {@link RouterLink}. If none is provided,
    * `router-link-exact-active` will be applied.
    */
  var linkExactActiveClass: js.UndefOr[String] = js.undefined
  
  /**
    * Custom implementation to parse a query. See its counterpart,
    * {@link RouterOptions.stringifyQuery}.
    *
    * @example
    * Let's say you want to use the [qs package](https://github.com/ljharb/qs)
    * to parse queries, you can provide both `parseQuery` and `stringifyQuery`:
    * ```js
    * import qs from 'qs'
    *
    * createRouter({
    *   // other options...
    *   parseQuery: qs.parse,
    *   stringifyQuery: qs.stringify,
    * })
    * ```
    */
  var parseQuery: js.UndefOr[js.Function1[/* search */ String, LocationQuery]] = js.undefined
  
  /**
    * Initial list of routes that should be added to the router.
    */
  var routes: ReadonlyArrayRouteRecordR
  
  /**
    * Function to control scrolling when navigating between pages. Can return a
    * Promise to delay scrolling. Check {@link ScrollBehavior}.
    *
    * @example
    * ```js
    * function scrollBehavior(to, from, savedPosition) {
    *   // `to` and `from` are both route locations
    *   // `savedPosition` can be null if there isn't one
    * }
    * ```
    */
  var scrollBehavior: js.UndefOr[RouterScrollBehavior] = js.undefined
  
  /**
    * Custom implementation to stringify a query object. Should not prepend a leading `?`.
    * {@link RouterOptions.parseQuery | parseQuery} counterpart to handle query parsing.
    */
  var stringifyQuery: js.UndefOr[js.Function1[/* query */ LocationQueryRaw, String]] = js.undefined
}
object RouterOptions {
  
  inline def apply(history: RouterHistory, routes: ReadonlyArrayRouteRecordR): RouterOptions = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouterOptions] (val x: Self) extends AnyVal {
    
    inline def setHistory(value: RouterHistory): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setLinkActiveClass(value: String): Self = StObject.set(x, "linkActiveClass", value.asInstanceOf[js.Any])
    
    inline def setLinkActiveClassUndefined: Self = StObject.set(x, "linkActiveClass", js.undefined)
    
    inline def setLinkExactActiveClass(value: String): Self = StObject.set(x, "linkExactActiveClass", value.asInstanceOf[js.Any])
    
    inline def setLinkExactActiveClassUndefined: Self = StObject.set(x, "linkExactActiveClass", js.undefined)
    
    inline def setParseQuery(value: /* search */ String => LocationQuery): Self = StObject.set(x, "parseQuery", js.Any.fromFunction1(value))
    
    inline def setParseQueryUndefined: Self = StObject.set(x, "parseQuery", js.undefined)
    
    inline def setRoutes(value: ReadonlyArrayRouteRecordR): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setScrollBehavior(
      value: (/* to */ RouteLocationNormalized, /* from */ RouteLocationNormalizedLoaded, /* savedPosition */ ScrollPositionNormalized | Null) => Awaitable[ScrollPosition | `false` | Unit]
    ): Self = StObject.set(x, "scrollBehavior", js.Any.fromFunction3(value))
    
    inline def setScrollBehaviorUndefined: Self = StObject.set(x, "scrollBehavior", js.undefined)
    
    inline def setStringifyQuery(value: /* query */ LocationQueryRaw => String): Self = StObject.set(x, "stringifyQuery", js.Any.fromFunction1(value))
    
    inline def setStringifyQueryUndefined: Self = StObject.set(x, "stringifyQuery", js.undefined)
  }
}
