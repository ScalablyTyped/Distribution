package typings.workboxRouting

import typings.std.Map
import typings.std.Request
import typings.std.Response
import typings.std.URL
import typings.workboxRouting.httpmethodMod.HTTPMethod
import typings.workboxRouting.routeHandlerMod.RouteHandler
import typings.workboxRouting.routeMod.Route
import typings.workboxRouting.routerMod.Router.FindMatchingRouteOptions
import typings.workboxRouting.routerMod.Router.FindMatchingRouteReturn
import typings.workboxRouting.routerMod.Router.HandleRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerMod {
  
  @JSImport("workbox-routing/Router", "Router")
  @js.native
  class Router () extends StObject {
    
    def addCacheListener(): Unit = js.native
    
    def addFetchListener(): Unit = js.native
    
    def findMatchingRoute(options: FindMatchingRouteOptions): js.Object | FindMatchingRouteReturn[_] = js.native
    
    def handleRequest(options: HandleRequestOptions): js.Promise[js.UndefOr[Response]] = js.native
    
    def registerRoute(route: Route[_]): Unit = js.native
    
    val routes: Map[HTTPMethod, js.Array[Route[_]]] = js.native
    
    def setCatchHandler(handler: RouteHandler): Unit = js.native
    
    def setDefaultHandler(handler: RouteHandler): Unit = js.native
    
    def unregisterRoute(route: Route[_]): Unit = js.native
  }
  object Router {
    
    @js.native
    trait FindMatchingRouteOptions extends HandleRequestOptions {
      
      var url: URL = js.native
    }
    object FindMatchingRouteOptions {
      
      @scala.inline
      def apply(request: Request, url: URL): FindMatchingRouteOptions = {
        val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[FindMatchingRouteOptions]
      }
      
      @scala.inline
      implicit class FindMatchingRouteOptionsMutableBuilder[Self <: FindMatchingRouteOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait FindMatchingRouteReturn[MatchReturn] extends StObject {
      
      var params: js.Any = js.native
      
      // Exclude<MatchReturn, Falsy> | undefined; <-- TypeScript 2.8
      var route: Route[MatchReturn] = js.native
    }
    object FindMatchingRouteReturn {
      
      @scala.inline
      def apply[MatchReturn](params: js.Any, route: Route[MatchReturn]): FindMatchingRouteReturn[MatchReturn] = {
        val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
        __obj.asInstanceOf[FindMatchingRouteReturn[MatchReturn]]
      }
      
      @scala.inline
      implicit class FindMatchingRouteReturnMutableBuilder[Self <: FindMatchingRouteReturn[_], MatchReturn] (val x: Self with FindMatchingRouteReturn[MatchReturn]) extends AnyVal {
        
        @scala.inline
        def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRoute(value: Route[MatchReturn]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait HandleRequestOptions extends StObject {
      
      var event: js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FetchEvent */ js.Any
          ] = js.native
      
      var request: Request = js.native
    }
    object HandleRequestOptions {
      
      @scala.inline
      def apply(request: Request): HandleRequestOptions = {
        val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
        __obj.asInstanceOf[HandleRequestOptions]
      }
      
      @scala.inline
      implicit class HandleRequestOptionsMutableBuilder[Self <: HandleRequestOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEvent(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FetchEvent */ js.Any
        ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
        
        @scala.inline
        def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      }
    }
  }
}
