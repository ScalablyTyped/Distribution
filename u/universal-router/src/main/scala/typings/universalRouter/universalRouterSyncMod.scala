package typings.universalRouter

import org.scalablytyped.runtime.StringDictionary
import typings.pathToRegexp.mod.MatchFunction
import typings.pathToRegexp.mod.Match_
import typings.pathToRegexp.mod.ParseOptions
import typings.pathToRegexp.mod.Path
import typings.pathToRegexp.mod.RegexpToFunctionOptions
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object universalRouterSyncMod {
  
  @JSImport("universal-router/src/UniversalRouterSync", JSImport.Default)
  @js.native
  class default[R, C /* <: RouterContext */] protected () extends UniversalRouterSync[R, C] {
    def this(routes: Route[R, C]) = this()
    def this(routes: Routes[R, C]) = this()
    def this(routes: Route[R, C], options: RouterOptions[R, C]) = this()
    def this(routes: Routes[R, C], options: RouterOptions[R, C]) = this()
  }
  
  type ErrorHandler[R] = js.Function2[/* error */ RouteError, /* context */ ResolveContext, RouteResultSync[R]]
  
  @js.native
  trait ResolveContext extends RouterContext {
    
    /**
      * URL which was transmitted to `router.resolve()`.
      */
    var pathname: String = js.native
  }
  object ResolveContext {
    
    @scala.inline
    def apply(pathname: String): ResolveContext = {
      val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolveContext]
    }
    
    @scala.inline
    implicit class ResolveContextMutableBuilder[Self <: ResolveContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    }
  }
  
  type ResolveRoute[R, C /* <: RouterContext */] = js.Function2[/* context */ RouteContext[R, C], /* params */ RouteParams, RouteResultSync[R]]
  
  @js.native
  trait Route[R, C /* <: RouterContext */] extends StObject {
    
    /**
      * Action method should return anything except `null` or `undefined` to be resolved by router
      * otherwise router will throw `Page not found` error if all matched routes returned nothing.
      */
    var action: js.UndefOr[
        js.Function2[/* context */ RouteContext[R, C], /* params */ RouteParams, RouteResultSync[R]]
      ] = js.native
    
    /**
      * An array of Route objects. Nested routes are perfect to be used in middleware routes.
      */
    var children: js.UndefOr[(Routes[R, C]) | Null] = js.native
    
    /**
      * The route path match function. Used for internal caching.
      */
    var `match`: js.UndefOr[MatchFunction[RouteParams]] = js.native
    
    /**
      * A unique string that can be used to generate the route URL.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * The link to the parent route is automatically populated by the router. Useful for breadcrumbs.
      */
    var parent: js.UndefOr[(Route[R, C]) | Null] = js.native
    
    /**
      * A string, array of strings, or a regular expression. Defaults to an empty string.
      */
    var path: js.UndefOr[Path] = js.native
  }
  object Route {
    
    @scala.inline
    def apply[R, C /* <: RouterContext */](): Route[R, C] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Route[R, C]]
    }
    
    @scala.inline
    implicit class RouteMutableBuilder[Self <: Route[_, _], R, C /* <: RouterContext */] (val x: Self with (Route[R, C])) extends AnyVal {
      
      @scala.inline
      def setAction(value: (/* context */ RouteContext[R, C], /* params */ RouteParams) => RouteResultSync[R]): Self = StObject.set(x, "action", js.Any.fromFunction2(value))
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setChildren(value: Routes[R, C]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenNull: Self = StObject.set(x, "children", null)
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: (Route[R, C])*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setMatch(value: /* path */ String => Match_[RouteParams]): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParent(value: Route[R, C]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentNull: Self = StObject.set(x, "parent", null)
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPathVarargs(value: (String | RegExp)*): Self = StObject.set(x, "path", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RouteContext[R, C /* <: RouterContext */] extends ResolveContext {
    
    /**
      * Base URL path relative to the path of the current route.
      */
    var baseUrl: String = js.native
    
    /**
      * Middleware style function which can continue resolving.
      */
    def next(): RouteResultSync[R] = js.native
    def next(resume: Boolean): RouteResultSync[R] = js.native
    
    /**
      * Matched path params.
      */
    var params: RouteParams = js.native
    
    /**
      * Matched path.
      */
    var path: String = js.native
    
    /**
      * Matched route object.
      */
    var route: Route[R, C] = js.native
    
    /**
      * Current router instance.
      */
    var router: UniversalRouterSync[R, C] = js.native
  }
  
  /* Inlined std.Error & {  status :number | undefined} */
  @js.native
  trait RouteError extends StObject {
    
    var message: String = js.native
    
    var name: String = js.native
    
    var stack: js.UndefOr[String] = js.native
    
    var status: js.UndefOr[Double] = js.native
  }
  object RouteError {
    
    @scala.inline
    def apply(message: String, name: String): RouteError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteError]
    }
    
    @scala.inline
    implicit class RouteErrorMutableBuilder[Self <: RouteError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  @js.native
  trait RouteMatch[R, C /* <: RouterContext */] extends StObject {
    
    var baseUrl: String = js.native
    
    var params: RouteParams = js.native
    
    var path: String = js.native
    
    var route: Route[R, C] = js.native
  }
  object RouteMatch {
    
    @scala.inline
    def apply[R, C /* <: RouterContext */](baseUrl: String, params: RouteParams, path: String, route: Route[R, C]): RouteMatch[R, C] = {
      val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteMatch[R, C]]
    }
    
    @scala.inline
    implicit class RouteMatchMutableBuilder[Self <: RouteMatch[_, _], R, C /* <: RouterContext */] (val x: Self with (RouteMatch[R, C])) extends AnyVal {
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: RouteParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoute(value: Route[R, C]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  type RouteParams = StringDictionary[String | js.Array[String]]
  
  type RouteResultSync[T] = js.UndefOr[T | Null]
  
  type RouterContext = StringDictionary[js.Any]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.pathToRegexp.mod.TokensToRegexpOptions because var conflicts: delimiter. Inlined sensitive, start, encode, endsWith, end, strict */ @js.native
  trait RouterOptions[R, C /* <: RouterContext */]
    extends ParseOptions
       with RegexpToFunctionOptions {
    
    var baseUrl: js.UndefOr[String] = js.native
    
    var context: js.UndefOr[C] = js.native
    
    /**
      * Encode path tokens for use in the `RegExp`.
      */
    var encode: js.UndefOr[js.Function1[/* value */ String, String]] = js.native
    
    /**
      * When `true` the regexp will match to the end of the string. (default: `true`)
      */
    var end: js.UndefOr[Boolean] = js.native
    
    /**
      * List of characters that can also be "end" characters.
      */
    var endsWith: js.UndefOr[String] = js.native
    
    var errorHandler: js.UndefOr[ErrorHandler[R]] = js.native
    
    var resolveRoute: js.UndefOr[ResolveRoute[R, C]] = js.native
    
    /**
      * When `true` the regexp will be case sensitive. (default: `false`)
      */
    var sensitive: js.UndefOr[Boolean] = js.native
    
    /**
      * When `true` the regexp will match from the beginning of the string. (default: `true`)
      */
    var start: js.UndefOr[Boolean] = js.native
    
    /**
      * When `true` the regexp won't allow an optional trailing delimiter to match. (default: `false`)
      */
    var strict: js.UndefOr[Boolean] = js.native
  }
  object RouterOptions {
    
    @scala.inline
    def apply[R, C /* <: RouterContext */](): RouterOptions[R, C] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouterOptions[R, C]]
    }
    
    @scala.inline
    implicit class RouterOptionsMutableBuilder[Self <: RouterOptions[_, _], R, C /* <: RouterContext */] (val x: Self with (RouterOptions[R, C])) extends AnyVal {
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setContext(value: C): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setEncode(value: /* value */ String => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      @scala.inline
      def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setEndsWith(value: String): Self = StObject.set(x, "endsWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndsWithUndefined: Self = StObject.set(x, "endsWith", js.undefined)
      
      @scala.inline
      def setErrorHandler(value: (/* error */ RouteError, /* context */ ResolveContext) => RouteResultSync[R]): Self = StObject.set(x, "errorHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      @scala.inline
      def setResolveRoute(value: (/* context */ RouteContext[R, C], /* params */ RouteParams) => RouteResultSync[R]): Self = StObject.set(x, "resolveRoute", js.Any.fromFunction2(value))
      
      @scala.inline
      def setResolveRouteUndefined: Self = StObject.set(x, "resolveRoute", js.undefined)
      
      @scala.inline
      def setSensitive(value: Boolean): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
      
      @scala.inline
      def setStart(value: Boolean): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  type Routes[R, C /* <: RouterContext */] = js.Array[Route[R, C]]
  
  @js.native
  trait UniversalRouterSync[R, C /* <: RouterContext */] extends StObject {
    
    var baseUrl: String = js.native
    
    var options: RouterOptions[R, C] = js.native
    
    /**
      * Traverses the list of routes in the order they are defined until it finds
      * the first route that matches provided URL path string and whose action function
      * returns anything other than `null` or `undefined`.
      */
    def resolve(pathnameOrContext: String): RouteResultSync[R] = js.native
    def resolve(pathnameOrContext: ResolveContext): RouteResultSync[R] = js.native
    
    var root: Route[R, C] = js.native
  }
}
