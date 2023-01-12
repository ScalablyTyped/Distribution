package typings.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelEvents extends StObject {
  
  def memberInvited(member: Member): Unit
  
  def memberJoined(member: Member): Unit
  
  def memberLeft(member: Member): Unit
  
  def memberUpdated(data: typings.twilioChat.anon.Member): Unit
  
  def messageAdded(message: Message): Unit
  
  def messageRemoved(message: Message): Unit
  
  def messageUpdated(data: typings.twilioChat.anon.Message): Unit
  
  def removed(channel: Channel): Unit
  
  def typingEnded(member: Member): Unit
  
  def typingStarted(member: Member): Unit
  
  def updated(data: typings.twilioChat.anon.Channel): Unit
}
object ChannelEvents {
  
  inline def apply(
    memberInvited: Member => Unit,
    memberJoined: Member => Unit,
    memberLeft: Member => Unit,
    memberUpdated: typings.twilioChat.anon.Member => Unit,
    messageAdded: Message => Unit,
    messageRemoved: Message => Unit,
    messageUpdated: typings.twilioChat.anon.Message => Unit,
    removed: Channel => Unit,
    typingEnded: Member => Unit,
    typingStarted: Member => Unit,
    updated: typings.twilioChat.anon.Channel => Unit
  ): ChannelEvents = {
    val __obj = js.Dynamic.literal(memberInvited = js.Any.fromFunction1(memberInvited), memberJoined = js.Any.fromFunction1(memberJoined), memberLeft = js.Any.fromFunction1(memberLeft), memberUpdated = js.Any.fromFunction1(memberUpdated), messageAdded = js.Any.fromFunction1(messageAdded), messageRemoved = js.Any.fromFunction1(messageRemoved), messageUpdated = js.Any.fromFunction1(messageUpdated), removed = js.Any.fromFunction1(removed), typingEnded = js.Any.fromFunction1(typingEnded), typingStarted = js.Any.fromFunction1(typingStarted), updated = js.Any.fromFunction1(updated))
    __obj.asInstanceOf[ChannelEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelEvents] (val x: Self) extends AnyVal {
    
    inline def setMemberInvited(value: Member => Unit): Self = StObject.set(x, "memberInvited", js.Any.fromFunction1(value))
    
    inline def setMemberJoined(value: Member => Unit): Self = StObject.set(x, "memberJoined", js.Any.fromFunction1(value))
    
    inline def setMemberLeft(value: Member => Unit): Self = StObject.set(x, "memberLeft", js.Any.fromFunction1(value))
    
    inline def setMemberUpdated(value: typings.twilioChat.anon.Member => Unit): Self = StObject.set(x, "memberUpdated", js.Any.fromFunction1(value))
    
    inline def setMessageAdded(value: Message => Unit): Self = StObject.set(x, "messageAdded", js.Any.fromFunction1(value))
    
    inline def setMessageRemoved(value: Message => Unit): Self = StObject.set(x, "messageRemoved", js.Any.fromFunction1(value))
    
    inline def setMessageUpdated(value: typings.twilioChat.anon.Message => Unit): Self = StObject.set(x, "messageUpdated", js.Any.fromFunction1(value))
    
    inline def setRemoved(value: Channel => Unit): Self = StObject.set(x, "removed", js.Any.fromFunction1(value))
    
    inline def setTypingEnded(value: Member => Unit): Self = StObject.set(x, "typingEnded", js.Any.fromFunction1(value))
    
    inline def setTypingStarted(value: Member => Unit): Self = StObject.set(x, "typingStarted", js.Any.fromFunction1(value))
    
    inline def setUpdated(value: typings.twilioChat.anon.Channel => Unit): Self = StObject.set(x, "updated", js.Any.fromFunction1(value))
  }
}
