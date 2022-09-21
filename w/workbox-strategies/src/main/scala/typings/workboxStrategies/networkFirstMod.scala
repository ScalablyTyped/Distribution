package typings.workboxStrategies

import typings.std.CacheQueryOptions
import typings.std.RequestInit
import typings.std.Response
import typings.workboxCore.workboxPluginMod.WorkboxPlugin
import typings.workboxRouting.routeHandlerMod.RouteHandlerCallback
import typings.workboxRouting.routeHandlerMod.RouteHandlerCallbackContext
import typings.workboxRouting.routeHandlerMod.RouteHandlerObject
import typings.workboxStrategies.makeRequestCallbackMod.MakeRequestCallback
import typings.workboxStrategies.makeRequestCallbackMod.MakeRequestCallbackOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkFirstMod {
  
  @JSImport("workbox-strategies/NetworkFirst", "NetworkFirst")
  @js.native
  open class NetworkFirst ()
    extends StObject
       with RouteHandlerObject {
    def this(options: NetworkFirstOptions) = this()
    
    /* CompleteClass */
    override def handle(context: RouteHandlerCallbackContext): js.Promise[Response] = js.native
    /* CompleteClass */
    @JSName("handle")
    var handle_Original: RouteHandlerCallback = js.native
    
    def makeRequest(options: MakeRequestCallbackOptions): js.Promise[Response] = js.native
    @JSName("makeRequest")
    var makeRequest_Original: MakeRequestCallback = js.native
  }
  
  trait NetworkFirstOptions extends StObject {
    
    var cacheName: js.UndefOr[String] = js.undefined
    
    var fetchOptions: js.UndefOr[RequestInit] = js.undefined
    
    var matchOptions: js.UndefOr[CacheQueryOptions] = js.undefined
    
    var networkTimeoutSeconds: js.UndefOr[Double] = js.undefined
    
    var plugins: js.UndefOr[js.Array[WorkboxPlugin]] = js.undefined
  }
  object NetworkFirstOptions {
    
    inline def apply(): NetworkFirstOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkFirstOptions]
    }
    
    extension [Self <: NetworkFirstOptions](x: Self) {
      
      inline def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
      
      inline def setCacheNameUndefined: Self = StObject.set(x, "cacheName", js.undefined)
      
      inline def setFetchOptions(value: RequestInit): Self = StObject.set(x, "fetchOptions", value.asInstanceOf[js.Any])
      
      inline def setFetchOptionsUndefined: Self = StObject.set(x, "fetchOptions", js.undefined)
      
      inline def setMatchOptions(value: CacheQueryOptions): Self = StObject.set(x, "matchOptions", value.asInstanceOf[js.Any])
      
      inline def setMatchOptionsUndefined: Self = StObject.set(x, "matchOptions", js.undefined)
      
      inline def setNetworkTimeoutSeconds(value: Double): Self = StObject.set(x, "networkTimeoutSeconds", value.asInstanceOf[js.Any])
      
      inline def setNetworkTimeoutSecondsUndefined: Self = StObject.set(x, "networkTimeoutSeconds", js.undefined)
      
      inline def setPlugins(value: js.Array[WorkboxPlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: WorkboxPlugin*): Self = StObject.set(x, "plugins", js.Array(value*))
    }
  }
}
