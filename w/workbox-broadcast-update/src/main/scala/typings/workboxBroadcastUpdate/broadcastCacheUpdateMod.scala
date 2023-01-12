package typings.workboxBroadcastUpdate

import typings.std.Event
import typings.std.Response
import typings.workboxBroadcastUpdate.broadcastCacheUpdateMod.BroadcastCacheUpdate.NotifyIfUpdatedOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object broadcastCacheUpdateMod {
  
  @JSImport("workbox-broadcast-update/BroadcastCacheUpdate", "BroadcastCacheUpdate")
  @js.native
  open class BroadcastCacheUpdate () extends StObject {
    def this(options: BroadcastCacheUpdateOptions) = this()
    
    def notifyIfUpdated(options: NotifyIfUpdatedOptions): js.Promise[Unit] = js.native
  }
  object BroadcastCacheUpdate {
    
    trait NotifyIfUpdatedOptions extends StObject {
      
      var cacheName: String
      
      var event: js.UndefOr[Event] = js.undefined
      
      var newResponse: Response
      
      var oldResponse: js.UndefOr[Response] = js.undefined
      
      var url: String
    }
    object NotifyIfUpdatedOptions {
      
      inline def apply(cacheName: String, newResponse: Response, url: String): NotifyIfUpdatedOptions = {
        val __obj = js.Dynamic.literal(cacheName = cacheName.asInstanceOf[js.Any], newResponse = newResponse.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[NotifyIfUpdatedOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: NotifyIfUpdatedOptions] (val x: Self) extends AnyVal {
        
        inline def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
        
        inline def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
        
        inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
        
        inline def setNewResponse(value: Response): Self = StObject.set(x, "newResponse", value.asInstanceOf[js.Any])
        
        inline def setOldResponse(value: Response): Self = StObject.set(x, "oldResponse", value.asInstanceOf[js.Any])
        
        inline def setOldResponseUndefined: Self = StObject.set(x, "oldResponse", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
  }
  
  trait BroadcastCacheUpdateOptions extends StObject {
    
    var channelName: js.UndefOr[String] = js.undefined
    
    var deferNoticationTimeout: js.UndefOr[Double] = js.undefined
    
    var headersToCheck: js.UndefOr[js.Array[String]] = js.undefined
  }
  object BroadcastCacheUpdateOptions {
    
    inline def apply(): BroadcastCacheUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BroadcastCacheUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BroadcastCacheUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setChannelName(value: String): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
      
      inline def setChannelNameUndefined: Self = StObject.set(x, "channelName", js.undefined)
      
      inline def setDeferNoticationTimeout(value: Double): Self = StObject.set(x, "deferNoticationTimeout", value.asInstanceOf[js.Any])
      
      inline def setDeferNoticationTimeoutUndefined: Self = StObject.set(x, "deferNoticationTimeout", js.undefined)
      
      inline def setHeadersToCheck(value: js.Array[String]): Self = StObject.set(x, "headersToCheck", value.asInstanceOf[js.Any])
      
      inline def setHeadersToCheckUndefined: Self = StObject.set(x, "headersToCheck", js.undefined)
      
      inline def setHeadersToCheckVarargs(value: String*): Self = StObject.set(x, "headersToCheck", js.Array(value*))
    }
  }
}
