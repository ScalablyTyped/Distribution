package typings.workboxRouting

import typings.std.Map
import typings.std.Request
import typings.std.Response
import typings.std.URL
import typings.workboxRouting.routeMod.Route
import typings.workboxRouting.routerMod.Router.FindMatchingRouteOptions
import typings.workboxRouting.routerMod.Router.FindMatchingRouteReturn
import typings.workboxRouting.routerMod.Router.HandleRequestOptions
import typings.workboxRouting.typesHttpmethodMod.HTTPMethod
import typings.workboxRouting.typesRouteHandlerMod.RouteHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerMod {
  
  @JSImport("workbox-routing/Router", "Router")
  @js.native
  open class Router () extends StObject {
    
    def addCacheListener(): Unit = js.native
    
    def addFetchListener(): Unit = js.native
    
    def findMatchingRoute(options: FindMatchingRouteOptions): js.Object | FindMatchingRouteReturn[Any] = js.native
    
    def handleRequest(options: HandleRequestOptions): js.Promise[js.UndefOr[Response]] = js.native
    
    def registerRoute(route: Route[Any]): Unit = js.native
    
    val routes: Map[HTTPMethod, js.Array[Route[Any]]] = js.native
    
    def setCatchHandler(handler: RouteHandler): Unit = js.native
    
    def setDefaultHandler(handler: RouteHandler): Unit = js.native
    
    def unregisterRoute(route: Route[Any]): Unit = js.native
  }
  object Router {
    
    trait FindMatchingRouteOptions
      extends StObject
         with HandleRequestOptions {
      
      var url: URL
    }
    object FindMatchingRouteOptions {
      
      inline def apply(request: Request, url: URL): FindMatchingRouteOptions = {
        val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[FindMatchingRouteOptions]
      }
      
      extension [Self <: FindMatchingRouteOptions](x: Self) {
        
        inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    trait FindMatchingRouteReturn[MatchReturn] extends StObject {
      
      var params: Any
      
      // Exclude<MatchReturn, Falsy> | undefined; <-- TypeScript 2.8
      var route: Route[MatchReturn]
    }
    object FindMatchingRouteReturn {
      
      inline def apply[MatchReturn](params: Any, route: Route[MatchReturn]): FindMatchingRouteReturn[MatchReturn] = {
        val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
        __obj.asInstanceOf[FindMatchingRouteReturn[MatchReturn]]
      }
      
      extension [Self <: FindMatchingRouteReturn[?], MatchReturn](x: Self & FindMatchingRouteReturn[MatchReturn]) {
        
        inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        inline def setRoute(value: Route[MatchReturn]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      }
    }
    
    trait HandleRequestOptions extends StObject {
      
      var event: js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FetchEvent */ Any
          ] = js.undefined
      
      var request: Request
    }
    object HandleRequestOptions {
      
      inline def apply(request: Request): HandleRequestOptions = {
        val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
        __obj.asInstanceOf[HandleRequestOptions]
      }
      
      extension [Self <: HandleRequestOptions](x: Self) {
        
        inline def setEvent(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FetchEvent */ Any
        ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
        
        inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
        
        inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      }
    }
  }
}
