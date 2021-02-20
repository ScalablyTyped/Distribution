package typings.workboxStrategies

import typings.std.CacheQueryOptions
import typings.std.Response
import typings.workboxCore.workboxPluginMod.WorkboxPlugin
import typings.workboxRouting.routeHandlerMod.RouteHandlerObject
import typings.workboxStrategies.makeRequestCallbackMod.MakeRequestCallback
import typings.workboxStrategies.makeRequestCallbackMod.MakeRequestCallbackOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheOnlyMod {
  
  @JSImport("workbox-strategies/CacheOnly", "CacheOnly")
  @js.native
  class CacheOnly () extends RouteHandlerObject {
    def this(options: CacheOnlyOptions) = this()
    
    def makeRequest(options: MakeRequestCallbackOptions): js.Promise[Response] = js.native
    @JSName("makeRequest")
    var makeRequest_Original: MakeRequestCallback = js.native
  }
  
  @js.native
  trait CacheOnlyOptions extends StObject {
    
    var cacheName: js.UndefOr[String] = js.native
    
    var matchOptions: js.UndefOr[CacheQueryOptions] = js.native
    
    var plugins: js.UndefOr[js.Array[WorkboxPlugin]] = js.native
  }
  object CacheOnlyOptions {
    
    @scala.inline
    def apply(): CacheOnlyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheOnlyOptions]
    }
    
    @scala.inline
    implicit class CacheOnlyOptionsMutableBuilder[Self <: CacheOnlyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheNameUndefined: Self = StObject.set(x, "cacheName", js.undefined)
      
      @scala.inline
      def setMatchOptions(value: CacheQueryOptions): Self = StObject.set(x, "matchOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchOptionsUndefined: Self = StObject.set(x, "matchOptions", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[WorkboxPlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: WorkboxPlugin*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    }
  }
}
