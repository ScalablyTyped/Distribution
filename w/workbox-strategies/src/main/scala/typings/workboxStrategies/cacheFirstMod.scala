package typings.workboxStrategies

import typings.std.CacheQueryOptions
import typings.std.RequestInit
import typings.std.Response
import typings.workboxCore.typesWorkboxPluginMod.WorkboxPlugin
import typings.workboxRouting.typesRouteHandlerMod.RouteHandlerCallback
import typings.workboxRouting.typesRouteHandlerMod.RouteHandlerCallbackContext
import typings.workboxRouting.typesRouteHandlerMod.RouteHandlerObject
import typings.workboxStrategies.typesMakeRequestCallbackMod.MakeRequestCallback
import typings.workboxStrategies.typesMakeRequestCallbackMod.MakeRequestCallbackOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheFirstMod {
  
  @JSImport("workbox-strategies/CacheFirst", "CacheFirst")
  @js.native
  open class CacheFirst ()
    extends StObject
       with RouteHandlerObject {
    def this(options: CacheFirstOptions) = this()
    
    /* CompleteClass */
    override def handle(context: RouteHandlerCallbackContext): js.Promise[Response] = js.native
    /* CompleteClass */
    @JSName("handle")
    var handle_Original: RouteHandlerCallback = js.native
    
    def makeRequest(options: MakeRequestCallbackOptions): js.Promise[Response] = js.native
    @JSName("makeRequest")
    var makeRequest_Original: MakeRequestCallback = js.native
  }
  
  trait CacheFirstOptions extends StObject {
    
    var cacheName: js.UndefOr[String] = js.undefined
    
    var fetchOptions: js.UndefOr[RequestInit] = js.undefined
    
    var matchOptions: js.UndefOr[CacheQueryOptions] = js.undefined
    
    var plugins: js.UndefOr[js.Array[WorkboxPlugin]] = js.undefined
  }
  object CacheFirstOptions {
    
    inline def apply(): CacheFirstOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheFirstOptions]
    }
    
    extension [Self <: CacheFirstOptions](x: Self) {
      
      inline def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
      
      inline def setCacheNameUndefined: Self = StObject.set(x, "cacheName", js.undefined)
      
      inline def setFetchOptions(value: RequestInit): Self = StObject.set(x, "fetchOptions", value.asInstanceOf[js.Any])
      
      inline def setFetchOptionsUndefined: Self = StObject.set(x, "fetchOptions", js.undefined)
      
      inline def setMatchOptions(value: CacheQueryOptions): Self = StObject.set(x, "matchOptions", value.asInstanceOf[js.Any])
      
      inline def setMatchOptionsUndefined: Self = StObject.set(x, "matchOptions", js.undefined)
      
      inline def setPlugins(value: js.Array[WorkboxPlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: WorkboxPlugin*): Self = StObject.set(x, "plugins", js.Array(value*))
    }
  }
}
