package typings.universalRouter

import org.scalablytyped.runtime.StringDictionary
import typings.pathToRegexp.mod.MatchFunction
import typings.pathToRegexp.mod.Match_
import typings.pathToRegexp.mod.ParseOptions
import typings.pathToRegexp.mod.Path
import typings.pathToRegexp.mod.RegexpToFunctionOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("universal-router", JSImport.Default)
  @js.native
  open class default[R, C /* <: RouterContext */] protected ()
    extends StObject
       with UniversalRouter[R, C] {
    def this(routes: Route[R, C]) = this()
    def this(routes: Routes[R, C]) = this()
    def this(routes: Route[R, C], options: RouterOptions[R, C]) = this()
    def this(routes: Routes[R, C], options: RouterOptions[R, C]) = this()
  }
  
  type ErrorHandler[R] = js.Function2[/* error */ RouteError, /* context */ ResolveContext, RouteResult[R]]
  
  trait ResolveContext
    extends StObject
       with RouterContext {
    
    /**
      * URL which was transmitted to `router.resolve()`.
      */
    var pathname: String
  }
  object ResolveContext {
    
    inline def apply(pathname: String): ResolveContext = {
      val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolveContext]
    }
    
    extension [Self <: ResolveContext](x: Self) {
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    }
  }
  
  type ResolveRoute[R, C /* <: RouterContext */] = js.Function2[/* context */ RouteContext[R, C], /* params */ RouteParams, RouteResult[R]]
  
  trait Route[R, C /* <: RouterContext */] extends StObject {
    
    /**
      * Action method should return anything except `null` or `undefined` to be resolved by router
      * otherwise router will throw `Page not found` error if all matched routes returned nothing.
      */
    var action: js.UndefOr[
        js.Function2[/* context */ RouteContext[R, C], /* params */ RouteParams, RouteResult[R]]
      ] = js.undefined
    
    /**
      * An array of Route objects. Nested routes are perfect to be used in middleware routes.
      */
    var children: js.UndefOr[(Routes[R, C]) | Null] = js.undefined
    
    /**
      * The route path match function. Used for internal caching.
      */
    var `match`: js.UndefOr[MatchFunction[RouteParams]] = js.undefined
    
    /**
      * A unique string that can be used to generate the route URL.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The link to the parent route is automatically populated by the router. Useful for breadcrumbs.
      */
    var parent: js.UndefOr[(Route[R, C]) | Null] = js.undefined
    
    /**
      * A string, array of strings, or a regular expression. Defaults to an empty string.
      */
    var path: js.UndefOr[Path] = js.undefined
  }
  object Route {
    
    inline def apply[R, C /* <: RouterContext */](): Route[R, C] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Route[R, C]]
    }
    
    extension [Self <: Route[?, ?], R, C /* <: RouterContext */](x: Self & (Route[R, C])) {
      
      inline def setAction(value: (/* context */ RouteContext[R, C], /* params */ RouteParams) => RouteResult[R]): Self = StObject.set(x, "action", js.Any.fromFunction2(value))
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setChildren(value: Routes[R, C]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Route[R, C])*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setMatch(value: /* path */ String => Match_[RouteParams]): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParent(value: Route[R, C]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
  
  @js.native
  trait RouteContext[R, C /* <: RouterContext */]
    extends StObject
       with ResolveContext {
    
    /**
      * Base URL path relative to the path of the current route.
      */
    var baseUrl: String = js.native
    
    /**
      * Middleware style function which can continue resolving.
      */
    def next(): js.Promise[R] = js.native
    def next(resume: Boolean): js.Promise[R] = js.native
    
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
    var router: UniversalRouter[R, C] = js.native
  }
  
  trait RouteError
    extends StObject
       with Error {
    
    var status: js.UndefOr[Double] = js.undefined
  }
  object RouteError {
    
    inline def apply(message: String, name: String): RouteError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteError]
    }
    
    extension [Self <: RouteError](x: Self) {
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait RouteMatch[R, C /* <: RouterContext */] extends StObject {
    
    var baseUrl: String
    
    var params: RouteParams
    
    var path: String
    
    var route: Route[R, C]
  }
  object RouteMatch {
    
    inline def apply[R, C /* <: RouterContext */](baseUrl: String, params: RouteParams, path: String, route: Route[R, C]): RouteMatch[R, C] = {
      val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteMatch[R, C]]
    }
    
    extension [Self <: RouteMatch[?, ?], R, C /* <: RouterContext */](x: Self & (RouteMatch[R, C])) {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setParams(value: RouteParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: Route[R, C]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  type RouteParams = StringDictionary[String | js.Array[String]]
  
  type RouteResult[T] = js.UndefOr[T | Null | (js.Promise[js.UndefOr[T | Null]])]
  
  type RouterContext = StringDictionary[Any]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.pathToRegexp.mod.TokensToRegexpOptions because var conflicts: delimiter. Inlined sensitive, start, encode, endsWith, end, strict */ trait RouterOptions[R, C /* <: RouterContext */]
    extends StObject
       with ParseOptions
       with RegexpToFunctionOptions {
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var context: js.UndefOr[C] = js.undefined
    
    /**
      * Encode path tokens for use in the `RegExp`.
      */
    var encode: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
    
    /**
      * When `true` the regexp will match to the end of the string. (default: `true`)
      */
    var end: js.UndefOr[Boolean] = js.undefined
    
    /**
      * List of characters that can also be "end" characters.
      */
    var endsWith: js.UndefOr[String] = js.undefined
    
    var errorHandler: js.UndefOr[ErrorHandler[R]] = js.undefined
    
    var resolveRoute: js.UndefOr[ResolveRoute[R, C]] = js.undefined
    
    /**
      * When `true` the regexp will be case sensitive. (default: `false`)
      */
    var sensitive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When `true` the regexp will match from the beginning of the string. (default: `true`)
      */
    var start: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When `true` the regexp won't allow an optional trailing delimiter to match. (default: `false`)
      */
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object RouterOptions {
    
    inline def apply[R, C /* <: RouterContext */](): RouterOptions[R, C] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouterOptions[R, C]]
    }
    
    extension [Self <: RouterOptions[?, ?], R, C /* <: RouterContext */](x: Self & (RouterOptions[R, C])) {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setContext(value: C): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setEncode(value: /* value */ String => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setEndsWith(value: String): Self = StObject.set(x, "endsWith", value.asInstanceOf[js.Any])
      
      inline def setEndsWithUndefined: Self = StObject.set(x, "endsWith", js.undefined)
      
      inline def setErrorHandler(value: (/* error */ RouteError, /* context */ ResolveContext) => RouteResult[R]): Self = StObject.set(x, "errorHandler", js.Any.fromFunction2(value))
      
      inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      inline def setResolveRoute(value: (/* context */ RouteContext[R, C], /* params */ RouteParams) => RouteResult[R]): Self = StObject.set(x, "resolveRoute", js.Any.fromFunction2(value))
      
      inline def setResolveRouteUndefined: Self = StObject.set(x, "resolveRoute", js.undefined)
      
      inline def setSensitive(value: Boolean): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
      
      inline def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
      
      inline def setStart(value: Boolean): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  type Routes[R, C /* <: RouterContext */] = js.Array[Route[R, C]]
  
  @js.native
  trait UniversalRouter[R, C /* <: RouterContext */] extends StObject {
    
    var baseUrl: String = js.native
    
    var options: RouterOptions[R, C] = js.native
    
    /**
      * Traverses the list of routes in the order they are defined until it finds
      * the first route that matches provided URL path string and whose action function
      * returns anything other than `null` or `undefined`.
      */
    def resolve(pathnameOrContext: String): js.Promise[RouteResult[R]] = js.native
    def resolve(pathnameOrContext: ResolveContext): js.Promise[RouteResult[R]] = js.native
    
    var root: Route[R, C] = js.native
  }
}
