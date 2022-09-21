package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvitedToChannel extends StObject {
  
  var addedToChannel: js.UndefOr[Sound] = js.undefined
  
  var invitedToChannel: js.UndefOr[Sound] = js.undefined
  
  var logEnabled: js.UndefOr[Boolean] = js.undefined
  
  var newMessage: js.UndefOr[BadgeCountEnabled] = js.undefined
  
  var removedFromChannel: js.UndefOr[Sound] = js.undefined
}
object InvitedToChannel {
  
  inline def apply(): InvitedToChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvitedToChannel]
  }
  
  extension [Self <: InvitedToChannel](x: Self) {
    
    inline def setAddedToChannel(value: Sound): Self = StObject.set(x, "addedToChannel", value.asInstanceOf[js.Any])
    
    inline def setAddedToChannelUndefined: Self = StObject.set(x, "addedToChannel", js.undefined)
    
    inline def setInvitedToChannel(value: Sound): Self = StObject.set(x, "invitedToChannel", value.asInstanceOf[js.Any])
    
    inline def setInvitedToChannelUndefined: Self = StObject.set(x, "invitedToChannel", js.undefined)
    
    inline def setLogEnabled(value: Boolean): Self = StObject.set(x, "logEnabled", value.asInstanceOf[js.Any])
    
    inline def setLogEnabledUndefined: Self = StObject.set(x, "logEnabled", js.undefined)
    
    inline def setNewMessage(value: BadgeCountEnabled): Self = StObject.set(x, "newMessage", value.asInstanceOf[js.Any])
    
    inline def setNewMessageUndefined: Self = StObject.set(x, "newMessage", js.undefined)
    
    inline def setRemovedFromChannel(value: Sound): Self = StObject.set(x, "removedFromChannel", value.asInstanceOf[js.Any])
    
    inline def setRemovedFromChannelUndefined: Self = StObject.set(x, "removedFromChannel", js.undefined)
  }
}
