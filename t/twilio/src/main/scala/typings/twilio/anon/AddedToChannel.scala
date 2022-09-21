package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddedToChannel extends StObject {
  
  var addedToChannel: js.UndefOr[Enabled] = js.undefined
  
  var invitedToChannel: js.UndefOr[Enabled] = js.undefined
  
  var newMessage: js.UndefOr[Enabled] = js.undefined
  
  var removedFromChannel: js.UndefOr[Enabled] = js.undefined
}
object AddedToChannel {
  
  inline def apply(): AddedToChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddedToChannel]
  }
  
  extension [Self <: AddedToChannel](x: Self) {
    
    inline def setAddedToChannel(value: Enabled): Self = StObject.set(x, "addedToChannel", value.asInstanceOf[js.Any])
    
    inline def setAddedToChannelUndefined: Self = StObject.set(x, "addedToChannel", js.undefined)
    
    inline def setInvitedToChannel(value: Enabled): Self = StObject.set(x, "invitedToChannel", value.asInstanceOf[js.Any])
    
    inline def setInvitedToChannelUndefined: Self = StObject.set(x, "invitedToChannel", js.undefined)
    
    inline def setNewMessage(value: Enabled): Self = StObject.set(x, "newMessage", value.asInstanceOf[js.Any])
    
    inline def setNewMessageUndefined: Self = StObject.set(x, "newMessage", js.undefined)
    
    inline def setRemovedFromChannel(value: Enabled): Self = StObject.set(x, "removedFromChannel", value.asInstanceOf[js.Any])
    
    inline def setRemovedFromChannelUndefined: Self = StObject.set(x, "removedFromChannel", js.undefined)
  }
}
