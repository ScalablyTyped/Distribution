package typings.workboxBroadcastUpdate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object broadcastUpdateMod {
  
  @JSImport("workbox-broadcast-update/broadcastUpdate", "broadcastUpdate")
  @js.native
  def broadcastUpdate(options: BroadcastUpdateOptions): js.Promise[Unit] = js.native
  
  @js.native
  trait BroadcastUpdateOptions extends StObject {
    
    var cacheName: String = js.native
    
    var channel: js.UndefOr[String] = js.native
    
    var url: String = js.native
  }
  object BroadcastUpdateOptions {
    
    @scala.inline
    def apply(cacheName: String, url: String): BroadcastUpdateOptions = {
      val __obj = js.Dynamic.literal(cacheName = cacheName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BroadcastUpdateOptions]
    }
    
    @scala.inline
    implicit class BroadcastUpdateOptionsMutableBuilder[Self <: BroadcastUpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
