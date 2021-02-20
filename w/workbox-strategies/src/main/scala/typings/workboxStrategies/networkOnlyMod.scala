package typings.workboxStrategies

import typings.std.RequestInit
import typings.std.Response
import typings.workboxCore.workboxPluginMod.WorkboxPlugin
import typings.workboxRouting.routeHandlerMod.RouteHandlerObject
import typings.workboxStrategies.makeRequestCallbackMod.MakeRequestCallback
import typings.workboxStrategies.makeRequestCallbackMod.MakeRequestCallbackOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkOnlyMod {
  
  @JSImport("workbox-strategies/NetworkOnly", "NetworkOnly")
  @js.native
  class NetworkOnly () extends RouteHandlerObject {
    def this(options: NetworkOnlyOptions) = this()
    
    def makeRequest(options: MakeRequestCallbackOptions): js.Promise[Response] = js.native
    @JSName("makeRequest")
    var makeRequest_Original: MakeRequestCallback = js.native
  }
  
  @js.native
  trait NetworkOnlyOptions extends StObject {
    
    var cacheName: js.UndefOr[String] = js.native
    
    var fetchOptions: js.UndefOr[RequestInit] = js.native
    
    var plugins: js.UndefOr[js.Array[WorkboxPlugin]] = js.native
  }
  object NetworkOnlyOptions {
    
    @scala.inline
    def apply(): NetworkOnlyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkOnlyOptions]
    }
    
    @scala.inline
    implicit class NetworkOnlyOptionsMutableBuilder[Self <: NetworkOnlyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheNameUndefined: Self = StObject.set(x, "cacheName", js.undefined)
      
      @scala.inline
      def setFetchOptions(value: RequestInit): Self = StObject.set(x, "fetchOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchOptionsUndefined: Self = StObject.set(x, "fetchOptions", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[WorkboxPlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: WorkboxPlugin*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    }
  }
}
