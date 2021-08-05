package typings.workboxSw

import typings.std.HeadersInit
import typings.std.RegExp
import typings.std.Request
import typings.std.Response
import typings.workboxBackgroundSync.queueMod.QueueOptions
import typings.workboxBroadcastUpdate.broadcastCacheUpdateMod.BroadcastCacheUpdateOptions
import typings.workboxBroadcastUpdate.broadcastUpdateMod.BroadcastUpdateOptions
import typings.workboxCacheableResponse.cacheableResponseMod.CacheableResponseConfig
import typings.workboxCore.anon.PartialCacheNameDetails
import typings.workboxCore.cacheNamesMod.CacheNames_
import typings.workboxCore.workboxPluginMod.WorkboxPlugin
import typings.workboxExpiration.cacheExpirationMod.CacheExpirationConfig
import typings.workboxExpiration.pluginMod.ExpirationPluginConfig
import typings.workboxGoogleAnalytics.initializeMod.InitializeOptions
import typings.workboxPrecaching.fetchListenerOptionsMod.FetchListenerOptions
import typings.workboxPrecaching.precacheEntryMod.PrecacheEntry
import typings.workboxRouting.httpmethodMod.HTTPMethod
import typings.workboxRouting.navigationRouteMod.NavigationRouteOptions
import typings.workboxRouting.registerNavigationRouteMod.RegisterNavigationRouteOptions
import typings.workboxRouting.registerRouteMod.RegisterRouteCapture
import typings.workboxRouting.routeHandlerMod.RouteHandler
import typings.workboxRouting.routeHandlerMod.RouteHandlerCallback
import typings.workboxRouting.routeMatchCallbackMod.RouteMatchCallback
import typings.workboxStrategies.cacheFirstMod.CacheFirstOptions
import typings.workboxStrategies.cacheOnlyMod.CacheOnlyOptions
import typings.workboxStrategies.networkFirstMod.NetworkFirstOptions
import typings.workboxStrategies.networkOnlyMod.NetworkOnlyOptions
import typings.workboxStrategies.staleWhileRevalidateMod.StaleWhileRevalidateOptions
import typings.workboxStreams.concatenateMod.ConcatenateReturn
import typings.workboxStreams.concatenateToResponseMod.ConcatenateToResponseReturn
import typings.workboxStreams.strategyMod.StreamsHandlerCallback
import typings.workboxStreams.streamSourceMod.StreamSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    object workbox {
      
      @JSGlobal("workbox")
      @js.native
      val ^ : js.Any = js.native
      
      /* was `typeof WorkboxBackgroundSync` */
      object backgroundSync {
        
        @JSGlobal("workbox.backgroundSync.Plugin")
        @js.native
        class Plugin protected ()
          extends typings.workboxBackgroundSync.mod.Plugin {
          def this(name: String) = this()
          def this(name: String, options: QueueOptions) = this()
        }
        
        @JSGlobal("workbox.backgroundSync.Queue")
        @js.native
        class Queue protected ()
          extends typings.workboxBackgroundSync.mod.Queue {
          def this(name: String) = this()
          def this(name: String, options: QueueOptions) = this()
        }
      }
      
      /* was `typeof WorkboxBroadcastUpdate` */
      object broadcastUpdate {
        
        @JSGlobal("workbox.broadcastUpdate")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("workbox.broadcastUpdate.BroadcastCacheUpdate")
        @js.native
        class BroadcastCacheUpdate ()
          extends typings.workboxBroadcastUpdate.mod.BroadcastCacheUpdate {
          def this(options: BroadcastCacheUpdateOptions) = this()
        }
        
        @JSGlobal("workbox.broadcastUpdate.Plugin")
        @js.native
        class Plugin ()
          extends typings.workboxBroadcastUpdate.mod.Plugin {
          def this(options: BroadcastCacheUpdateOptions) = this()
        }
        
        inline def broadcastUpdate(options: BroadcastUpdateOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("broadcastUpdate")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
      }
      
      /* was `typeof WorkboxCacheableResponse` */
      object cacheableResponse {
        
        @JSGlobal("workbox.cacheableResponse.CacheableResponse")
        @js.native
        class CacheableResponse ()
          extends typings.workboxCacheableResponse.mod.CacheableResponse {
          def this(config: CacheableResponseConfig) = this()
        }
        
        @JSGlobal("workbox.cacheableResponse.Plugin")
        @js.native
        class Plugin ()
          extends typings.workboxCacheableResponse.mod.Plugin {
          def this(config: CacheableResponseConfig) = this()
        }
      }
      
      /* was `typeof WorkboxCore` */
      object core {
        
        @JSGlobal("workbox.core")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("workbox.core.cacheNames")
        @js.native
        val cacheNames: CacheNames_ = js.native
        
        inline def clientsClaim(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clientsClaim")().asInstanceOf[Unit]
        
        inline def registerQuotaErrorCallback(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerQuotaErrorCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
        
        inline def setCacheNameDetails(details: PartialCacheNameDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCacheNameDetails")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
        
        inline def skipWaiting(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("skipWaiting")().asInstanceOf[Unit]
      }
      
      /* was `typeof WorkboxExpiration` */
      object expiration {
        
        @JSGlobal("workbox.expiration.CacheExpiration")
        @js.native
        class CacheExpiration protected ()
          extends typings.workboxExpiration.mod.CacheExpiration {
          def this(cacheName: String) = this()
          def this(cacheName: String, config: CacheExpirationConfig) = this()
        }
        
        @JSGlobal("workbox.expiration.Plugin")
        @js.native
        class Plugin ()
          extends typings.workboxExpiration.mod.Plugin {
          def this(config: ExpirationPluginConfig) = this()
        }
      }
      
      /* was `typeof WorkboxGoogleAnalytics` */
      object googleAnalytics {
        
        @JSGlobal("workbox.googleAnalytics")
        @js.native
        val ^ : js.Any = js.native
        
        inline def initialize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")().asInstanceOf[Unit]
        inline def initialize(options: InitializeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
      }
      
      inline def loadModule(moduleName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadModule")(moduleName.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /* was `typeof WorkboxNavigationPreload` */
      object navigationPreload {
        
        @JSGlobal("workbox.navigationPreload")
        @js.native
        val ^ : js.Any = js.native
        
        inline def disable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Unit]
        
        inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
        inline def enable(headerValue: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(headerValue.asInstanceOf[js.Any]).asInstanceOf[Unit]
        
        inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
      }
      
      /* was `typeof WorkboxPrecaching` */
      object precaching {
        
        @JSGlobal("workbox.precaching")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("workbox.precaching.PrecacheController")
        @js.native
        class PrecacheController ()
          extends typings.workboxPrecaching.mod.PrecacheController {
          def this(cacheName: String) = this()
        }
        
        inline def addPlugins(newPlugins: js.Array[WorkboxPlugin]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addPlugins")(newPlugins.asInstanceOf[js.Any]).asInstanceOf[Unit]
        
        inline def addRoute(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addRoute")().asInstanceOf[Unit]
        inline def addRoute(options: FetchListenerOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addRoute")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
        
        inline def cleanupOutdatedCaches(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanupOutdatedCaches")().asInstanceOf[Unit]
        
        inline def getCacheKeyForURL(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCacheKeyForURL")(url.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def precache(entries: js.Array[String | PrecacheEntry]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("precache")(entries.asInstanceOf[js.Any]).asInstanceOf[Unit]
        
        inline def precacheAndRoute(entries: js.Array[String | PrecacheEntry]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("precacheAndRoute")(entries.asInstanceOf[js.Any]).asInstanceOf[Unit]
        inline def precacheAndRoute(entries: js.Array[String | PrecacheEntry], options: FetchListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("precacheAndRoute")(entries.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      }
      
      /* was `typeof WorkboxRangeRequests` */
      object rangeRequests {
        
        @JSGlobal("workbox.rangeRequests")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("workbox.rangeRequests.Plugin")
        @js.native
        class Plugin ()
          extends typings.workboxRangeRequests.mod.Plugin
        
        inline def createPartialResponse(request: Request, originalResponse: Response): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPartialResponse")(request.asInstanceOf[js.Any], originalResponse.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
      }
      
      /* was `typeof WorkboxRouting` */
      object routing {
        
        @JSGlobal("workbox.routing")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("workbox.routing.NavigationRoute")
        @js.native
        class NavigationRoute protected ()
          extends typings.workboxRouting.mod.NavigationRoute {
          def this(handler: RouteHandler) = this()
          def this(handler: RouteHandler, options: NavigationRouteOptions) = this()
        }
        
        @JSGlobal("workbox.routing.RegExpRoute")
        @js.native
        class RegExpRoute protected ()
          extends typings.workboxRouting.mod.RegExpRoute {
          def this(regExp: RegExp, handler: RouteHandler) = this()
          def this(regExp: RegExp, handler: RouteHandler, method: HTTPMethod) = this()
        }
        
        @JSGlobal("workbox.routing.Route")
        @js.native
        class Route[MatchReturn] protected ()
          extends typings.workboxRouting.mod.Route[MatchReturn] {
          def this(`match`: RouteMatchCallback[MatchReturn], handler: RouteHandler) = this()
          def this(`match`: RouteMatchCallback[MatchReturn], handler: RouteHandler, method: HTTPMethod) = this()
        }
        
        @JSGlobal("workbox.routing.Router")
        @js.native
        class Router ()
          extends typings.workboxRouting.mod.Router
        
        inline def registerNavigationRoute(cachedAssetUrl: String): typings.workboxRouting.navigationRouteMod.NavigationRoute = ^.asInstanceOf[js.Dynamic].applyDynamic("registerNavigationRoute")(cachedAssetUrl.asInstanceOf[js.Any]).asInstanceOf[typings.workboxRouting.navigationRouteMod.NavigationRoute]
        inline def registerNavigationRoute(cachedAssetUrl: String, options: RegisterNavigationRouteOptions): typings.workboxRouting.navigationRouteMod.NavigationRoute = (^.asInstanceOf[js.Dynamic].applyDynamic("registerNavigationRoute")(cachedAssetUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.navigationRouteMod.NavigationRoute]
        
        inline def registerRoute(capture: String): typings.workboxRouting.routeMod.Route[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[typings.workboxRouting.routeMod.Route[Boolean]]
        inline def registerRoute(capture: String, handler: Unit, method: HTTPMethod): typings.workboxRouting.routeMod.Route[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route[Boolean]]
        inline def registerRoute(capture: String, handler: RouteHandler): typings.workboxRouting.routeMod.Route[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route[Boolean]]
        inline def registerRoute(capture: String, handler: RouteHandler, method: HTTPMethod): typings.workboxRouting.routeMod.Route[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route[Boolean]]
        inline def registerRoute(capture: RegExp): typings.workboxRouting.regExpRouteMod.RegExpRoute = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[typings.workboxRouting.regExpRouteMod.RegExpRoute]
        inline def registerRoute(capture: RegExp, handler: Unit, method: HTTPMethod): typings.workboxRouting.regExpRouteMod.RegExpRoute = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.regExpRouteMod.RegExpRoute]
        inline def registerRoute(capture: RegExp, handler: RouteHandler): typings.workboxRouting.regExpRouteMod.RegExpRoute = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.regExpRouteMod.RegExpRoute]
        inline def registerRoute(capture: RegExp, handler: RouteHandler, method: HTTPMethod): typings.workboxRouting.regExpRouteMod.RegExpRoute = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.regExpRouteMod.RegExpRoute]
        inline def registerRoute(capture: RegisterRouteCapture): typings.workboxRouting.routeMod.Route[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[typings.workboxRouting.routeMod.Route[js.Any]]
        inline def registerRoute(capture: RegisterRouteCapture, handler: Unit, method: HTTPMethod): typings.workboxRouting.routeMod.Route[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route[js.Any]]
        inline def registerRoute(capture: RegisterRouteCapture, handler: RouteHandler): typings.workboxRouting.routeMod.Route[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route[js.Any]]
        inline def registerRoute(capture: RegisterRouteCapture, handler: RouteHandler, method: HTTPMethod): typings.workboxRouting.routeMod.Route[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route[js.Any]]
        inline def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn]): typings.workboxRouting.routeMod.Route[MatchReturn] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[typings.workboxRouting.routeMod.Route[MatchReturn]]
        inline def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: Unit, method: HTTPMethod): typings.workboxRouting.routeMod.Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route[MatchReturn]]
        inline def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: RouteHandler): typings.workboxRouting.routeMod.Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route[MatchReturn]]
        inline def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: RouteHandler, method: HTTPMethod): typings.workboxRouting.routeMod.Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route[MatchReturn]]
        inline def registerRoute[MatchReturn](capture: typings.workboxRouting.routeMod.Route[MatchReturn]): typings.workboxRouting.routeMod.Route[MatchReturn] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any]).asInstanceOf[typings.workboxRouting.routeMod.Route[MatchReturn]]
        inline def registerRoute[MatchReturn](capture: typings.workboxRouting.routeMod.Route[MatchReturn], handler: Unit, method: HTTPMethod): typings.workboxRouting.routeMod.Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route[MatchReturn]]
        inline def registerRoute[MatchReturn](capture: typings.workboxRouting.routeMod.Route[MatchReturn], handler: RouteHandler): typings.workboxRouting.routeMod.Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route[MatchReturn]]
        inline def registerRoute[MatchReturn](
          capture: typings.workboxRouting.routeMod.Route[MatchReturn],
          handler: RouteHandler,
          method: HTTPMethod
        ): typings.workboxRouting.routeMod.Route[MatchReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRoute")(capture.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.workboxRouting.routeMod.Route[MatchReturn]]
        
        inline def setCatchHandler(handler: RouteHandler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCatchHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
        
        inline def setDefaultHandler(handler: RouteHandler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
      }
      
      inline def setConfig(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setConfig")().asInstanceOf[Unit]
      inline def setConfig(options: WorkboxOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setConfig")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /* was `typeof WorkboxStrategies` */
      object strategies {
        
        @JSGlobal("workbox.strategies.CacheFirst")
        @js.native
        class CacheFirst ()
          extends typings.workboxStrategies.mod.CacheFirst {
          def this(options: CacheFirstOptions) = this()
        }
        
        @JSGlobal("workbox.strategies.CacheOnly")
        @js.native
        class CacheOnly ()
          extends typings.workboxStrategies.mod.CacheOnly {
          def this(options: CacheOnlyOptions) = this()
        }
        
        @JSGlobal("workbox.strategies.NetworkFirst")
        @js.native
        class NetworkFirst ()
          extends typings.workboxStrategies.mod.NetworkFirst {
          def this(options: NetworkFirstOptions) = this()
        }
        
        @JSGlobal("workbox.strategies.NetworkOnly")
        @js.native
        class NetworkOnly ()
          extends typings.workboxStrategies.mod.NetworkOnly {
          def this(options: NetworkOnlyOptions) = this()
        }
        
        @JSGlobal("workbox.strategies.StaleWhileRevalidate")
        @js.native
        class StaleWhileRevalidate ()
          extends typings.workboxStrategies.mod.StaleWhileRevalidate {
          def this(options: StaleWhileRevalidateOptions) = this()
        }
      }
      
      /* was `typeof WorkboxStreams` */
      object streams {
        
        @JSGlobal("workbox.streams")
        @js.native
        val ^ : js.Any = js.native
        
        inline def concatenate(sourcePromises: js.Array[js.Promise[StreamSource]]): ConcatenateReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("concatenate")(sourcePromises.asInstanceOf[js.Any]).asInstanceOf[ConcatenateReturn]
        
        inline def concatenateToResponse(sourcePromises: js.Array[js.Promise[StreamSource]]): ConcatenateToResponseReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("concatenateToResponse")(sourcePromises.asInstanceOf[js.Any]).asInstanceOf[ConcatenateToResponseReturn]
        inline def concatenateToResponse(sourcePromises: js.Array[js.Promise[StreamSource]], headersInit: HeadersInit): ConcatenateToResponseReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("concatenateToResponse")(sourcePromises.asInstanceOf[js.Any], headersInit.asInstanceOf[js.Any])).asInstanceOf[ConcatenateToResponseReturn]
        
        inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
        
        inline def strategy(sourceFunctions: js.Array[StreamsHandlerCallback]): RouteHandlerCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("strategy")(sourceFunctions.asInstanceOf[js.Any]).asInstanceOf[RouteHandlerCallback]
        inline def strategy(sourceFunctions: js.Array[StreamsHandlerCallback], headersInit: HeadersInit): RouteHandlerCallback = (^.asInstanceOf[js.Dynamic].applyDynamic("strategy")(sourceFunctions.asInstanceOf[js.Any], headersInit.asInstanceOf[js.Any])).asInstanceOf[RouteHandlerCallback]
      }
      
      type ModulePathCallback = js.Function2[/* moduleName */ String, /* debug */ Boolean, String]
      
      trait WorkboxOptions extends StObject {
        
        var debug: js.UndefOr[Boolean] = js.undefined
        
        var modulePathCb: js.UndefOr[ModulePathCallback] = js.undefined
        
        var modulePathPrefix: js.UndefOr[String] = js.undefined
      }
      object WorkboxOptions {
        
        inline def apply(): WorkboxOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[WorkboxOptions]
        }
        
        extension [Self <: WorkboxOptions](x: Self) {
          
          inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
          
          inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
          
          inline def setModulePathCb(value: (/* moduleName */ String, /* debug */ Boolean) => String): Self = StObject.set(x, "modulePathCb", js.Any.fromFunction2(value))
          
          inline def setModulePathCbUndefined: Self = StObject.set(x, "modulePathCb", js.undefined)
          
          inline def setModulePathPrefix(value: String): Self = StObject.set(x, "modulePathPrefix", value.asInstanceOf[js.Any])
          
          inline def setModulePathPrefixUndefined: Self = StObject.set(x, "modulePathPrefix", js.undefined)
        }
      }
    }
  }
}
