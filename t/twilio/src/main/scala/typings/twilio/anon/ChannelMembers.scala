package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelMembers extends StObject {
  
  var channelMembers: js.UndefOr[Double] = js.undefined
  
  var userChannels: js.UndefOr[Double] = js.undefined
}
object ChannelMembers {
  
  inline def apply(): ChannelMembers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMembers]
  }
  
  extension [Self <: ChannelMembers](x: Self) {
    
    inline def setChannelMembers(value: Double): Self = StObject.set(x, "channelMembers", value.asInstanceOf[js.Any])
    
    inline def setChannelMembersUndefined: Self = StObject.set(x, "channelMembers", js.undefined)
    
    inline def setUserChannels(value: Double): Self = StObject.set(x, "userChannels", value.asInstanceOf[js.Any])
    
    inline def setUserChannelsUndefined: Self = StObject.set(x, "userChannels", js.undefined)
  }
}
