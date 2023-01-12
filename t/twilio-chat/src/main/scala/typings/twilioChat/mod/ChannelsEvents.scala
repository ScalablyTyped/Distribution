package typings.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelsEvents extends StObject {
  
  def channelAdded(channel: Channel): Unit
  
  def channelInvited(channel: Channel): Unit
  
  def channelJoined(channel: Channel): Unit
  
  def channelLeft(channel: Channel): Unit
  
  def channelRemoved(channel: Channel): Unit
  
  def channelUpdated(data: typings.twilioChat.anon.Channel): Unit
  
  def memberJoined(member: Member): Unit
  
  def memberLeft(member: Member): Unit
  
  def memberUpdated(data: typings.twilioChat.anon.Member): Unit
  
  def messageAdded(message: Message): Unit
  
  def messageRemoved(message: Message): Unit
  
  def messageUpdated(data: typings.twilioChat.anon.Message): Unit
  
  def typingEnded(member: Member): Unit
  
  def typingStarted(member: Member): Unit
}
object ChannelsEvents {
  
  inline def apply(
    channelAdded: Channel => Unit,
    channelInvited: Channel => Unit,
    channelJoined: Channel => Unit,
    channelLeft: Channel => Unit,
    channelRemoved: Channel => Unit,
    channelUpdated: typings.twilioChat.anon.Channel => Unit,
    memberJoined: Member => Unit,
    memberLeft: Member => Unit,
    memberUpdated: typings.twilioChat.anon.Member => Unit,
    messageAdded: Message => Unit,
    messageRemoved: Message => Unit,
    messageUpdated: typings.twilioChat.anon.Message => Unit,
    typingEnded: Member => Unit,
    typingStarted: Member => Unit
  ): ChannelsEvents = {
    val __obj = js.Dynamic.literal(channelAdded = js.Any.fromFunction1(channelAdded), channelInvited = js.Any.fromFunction1(channelInvited), channelJoined = js.Any.fromFunction1(channelJoined), channelLeft = js.Any.fromFunction1(channelLeft), channelRemoved = js.Any.fromFunction1(channelRemoved), channelUpdated = js.Any.fromFunction1(channelUpdated), memberJoined = js.Any.fromFunction1(memberJoined), memberLeft = js.Any.fromFunction1(memberLeft), memberUpdated = js.Any.fromFunction1(memberUpdated), messageAdded = js.Any.fromFunction1(messageAdded), messageRemoved = js.Any.fromFunction1(messageRemoved), messageUpdated = js.Any.fromFunction1(messageUpdated), typingEnded = js.Any.fromFunction1(typingEnded), typingStarted = js.Any.fromFunction1(typingStarted))
    __obj.asInstanceOf[ChannelsEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelsEvents] (val x: Self) extends AnyVal {
    
    inline def setChannelAdded(value: Channel => Unit): Self = StObject.set(x, "channelAdded", js.Any.fromFunction1(value))
    
    inline def setChannelInvited(value: Channel => Unit): Self = StObject.set(x, "channelInvited", js.Any.fromFunction1(value))
    
    inline def setChannelJoined(value: Channel => Unit): Self = StObject.set(x, "channelJoined", js.Any.fromFunction1(value))
    
    inline def setChannelLeft(value: Channel => Unit): Self = StObject.set(x, "channelLeft", js.Any.fromFunction1(value))
    
    inline def setChannelRemoved(value: Channel => Unit): Self = StObject.set(x, "channelRemoved", js.Any.fromFunction1(value))
    
    inline def setChannelUpdated(value: typings.twilioChat.anon.Channel => Unit): Self = StObject.set(x, "channelUpdated", js.Any.fromFunction1(value))
    
    inline def setMemberJoined(value: Member => Unit): Self = StObject.set(x, "memberJoined", js.Any.fromFunction1(value))
    
    inline def setMemberLeft(value: Member => Unit): Self = StObject.set(x, "memberLeft", js.Any.fromFunction1(value))
    
    inline def setMemberUpdated(value: typings.twilioChat.anon.Member => Unit): Self = StObject.set(x, "memberUpdated", js.Any.fromFunction1(value))
    
    inline def setMessageAdded(value: Message => Unit): Self = StObject.set(x, "messageAdded", js.Any.fromFunction1(value))
    
    inline def setMessageRemoved(value: Message => Unit): Self = StObject.set(x, "messageRemoved", js.Any.fromFunction1(value))
    
    inline def setMessageUpdated(value: typings.twilioChat.anon.Message => Unit): Self = StObject.set(x, "messageUpdated", js.Any.fromFunction1(value))
    
    inline def setTypingEnded(value: Member => Unit): Self = StObject.set(x, "typingEnded", js.Any.fromFunction1(value))
    
    inline def setTypingStarted(value: Member => Unit): Self = StObject.set(x, "typingStarted", js.Any.fromFunction1(value))
  }
}
