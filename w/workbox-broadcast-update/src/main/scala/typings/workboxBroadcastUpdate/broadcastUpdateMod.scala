package typings.workboxBroadcastUpdate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object broadcastUpdateMod {
  
  @JSImport("workbox-broadcast-update/broadcastUpdate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def broadcastUpdate(options: BroadcastUpdateOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("broadcastUpdate")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait BroadcastUpdateOptions extends StObject {
    
    var cacheName: String
    
    var channel: js.UndefOr[String] = js.undefined
    
    var url: String
  }
  object BroadcastUpdateOptions {
    
    inline def apply(cacheName: String, url: String): BroadcastUpdateOptions = {
      val __obj = js.Dynamic.literal(cacheName = cacheName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BroadcastUpdateOptions]
    }
    
    extension [Self <: BroadcastUpdateOptions](x: Self) {
      
      inline def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
