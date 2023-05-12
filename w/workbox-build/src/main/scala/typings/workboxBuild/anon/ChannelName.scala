package typings.workboxBuild.anon

import typings.workboxBroadcastUpdate.broadcastCacheUpdateMod.BroadcastCacheUpdateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelName extends StObject {
  
  var channelName: js.UndefOr[String] = js.undefined
  
  var options: BroadcastCacheUpdateOptions
}
object ChannelName {
  
  inline def apply(options: BroadcastCacheUpdateOptions): ChannelName = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelName] (val x: Self) extends AnyVal {
    
    inline def setChannelName(value: String): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
    
    inline def setChannelNameUndefined: Self = StObject.set(x, "channelName", js.undefined)
    
    inline def setOptions(value: BroadcastCacheUpdateOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
