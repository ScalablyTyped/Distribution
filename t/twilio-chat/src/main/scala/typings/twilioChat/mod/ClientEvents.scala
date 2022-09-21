package typings.twilioChat.mod

import typings.twilioChat.anon.ErrorCode
import typings.twilioChat.anon.UpdateReasons
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientEvents extends StObject {
  
  def channelAdded(channel: Channel): Unit
  
  def channelInvited(channel: Channel): Unit
  
  def channelJoined(channel: Channel): Unit
  
  def channelLeft(channel: Channel): Unit
  
  def channelRemoved(channel: Channel): Unit
  
  def channelUpdated(data: typings.twilioChat.anon.Channel): Unit
  
  def connectionError(data: ErrorCode): Unit
  
  def connectionStateChanged(state: typings.twilsock.mod.ConnectionState): Unit
  
  def memberJoined(member: Member): Unit
  
  def memberLeft(member: Member): Unit
  
  def memberUpdated(data: typings.twilioChat.anon.Member): Unit
  
  def messageAdded(message: Message): Unit
  
  def messageRemoved(message: Message): Unit
  
  def messageUpdated(data: typings.twilioChat.anon.Message): Unit
  
  def pushNotification(pushNotification: PushNotification): Unit
  
  def stateChanged(state: State): Unit
  
  def tokenAboutToExpire(ttl: Double): Unit
  
  def tokenExpired(): Unit
  
  def typingEnded(member: Member): Unit
  
  def typingStarted(member: Member): Unit
  
  def userSubscribed(user: User): Unit
  
  def userUnsubscribed(user: User): Unit
  
  def userUpdated(data: UpdateReasons): Unit
}
object ClientEvents {
  
  inline def apply(
    channelAdded: Channel => Unit,
    channelInvited: Channel => Unit,
    channelJoined: Channel => Unit,
    channelLeft: Channel => Unit,
    channelRemoved: Channel => Unit,
    channelUpdated: typings.twilioChat.anon.Channel => Unit,
    connectionError: ErrorCode => Unit,
    connectionStateChanged: typings.twilsock.mod.ConnectionState => Unit,
    memberJoined: Member => Unit,
    memberLeft: Member => Unit,
    memberUpdated: typings.twilioChat.anon.Member => Unit,
    messageAdded: Message => Unit,
    messageRemoved: Message => Unit,
    messageUpdated: typings.twilioChat.anon.Message => Unit,
    pushNotification: PushNotification => Unit,
    stateChanged: State => Unit,
    tokenAboutToExpire: Double => Unit,
    tokenExpired: () => Unit,
    typingEnded: Member => Unit,
    typingStarted: Member => Unit,
    userSubscribed: User => Unit,
    userUnsubscribed: User => Unit,
    userUpdated: UpdateReasons => Unit
  ): ClientEvents = {
    val __obj = js.Dynamic.literal(channelAdded = js.Any.fromFunction1(channelAdded), channelInvited = js.Any.fromFunction1(channelInvited), channelJoined = js.Any.fromFunction1(channelJoined), channelLeft = js.Any.fromFunction1(channelLeft), channelRemoved = js.Any.fromFunction1(channelRemoved), channelUpdated = js.Any.fromFunction1(channelUpdated), connectionError = js.Any.fromFunction1(connectionError), connectionStateChanged = js.Any.fromFunction1(connectionStateChanged), memberJoined = js.Any.fromFunction1(memberJoined), memberLeft = js.Any.fromFunction1(memberLeft), memberUpdated = js.Any.fromFunction1(memberUpdated), messageAdded = js.Any.fromFunction1(messageAdded), messageRemoved = js.Any.fromFunction1(messageRemoved), messageUpdated = js.Any.fromFunction1(messageUpdated), pushNotification = js.Any.fromFunction1(pushNotification), stateChanged = js.Any.fromFunction1(stateChanged), tokenAboutToExpire = js.Any.fromFunction1(tokenAboutToExpire), tokenExpired = js.Any.fromFunction0(tokenExpired), typingEnded = js.Any.fromFunction1(typingEnded), typingStarted = js.Any.fromFunction1(typingStarted), userSubscribed = js.Any.fromFunction1(userSubscribed), userUnsubscribed = js.Any.fromFunction1(userUnsubscribed), userUpdated = js.Any.fromFunction1(userUpdated))
    __obj.asInstanceOf[ClientEvents]
  }
  
  extension [Self <: ClientEvents](x: Self) {
    
    inline def setChannelAdded(value: Channel => Unit): Self = StObject.set(x, "channelAdded", js.Any.fromFunction1(value))
    
    inline def setChannelInvited(value: Channel => Unit): Self = StObject.set(x, "channelInvited", js.Any.fromFunction1(value))
    
    inline def setChannelJoined(value: Channel => Unit): Self = StObject.set(x, "channelJoined", js.Any.fromFunction1(value))
    
    inline def setChannelLeft(value: Channel => Unit): Self = StObject.set(x, "channelLeft", js.Any.fromFunction1(value))
    
    inline def setChannelRemoved(value: Channel => Unit): Self = StObject.set(x, "channelRemoved", js.Any.fromFunction1(value))
    
    inline def setChannelUpdated(value: typings.twilioChat.anon.Channel => Unit): Self = StObject.set(x, "channelUpdated", js.Any.fromFunction1(value))
    
    inline def setConnectionError(value: ErrorCode => Unit): Self = StObject.set(x, "connectionError", js.Any.fromFunction1(value))
    
    inline def setConnectionStateChanged(value: typings.twilsock.mod.ConnectionState => Unit): Self = StObject.set(x, "connectionStateChanged", js.Any.fromFunction1(value))
    
    inline def setMemberJoined(value: Member => Unit): Self = StObject.set(x, "memberJoined", js.Any.fromFunction1(value))
    
    inline def setMemberLeft(value: Member => Unit): Self = StObject.set(x, "memberLeft", js.Any.fromFunction1(value))
    
    inline def setMemberUpdated(value: typings.twilioChat.anon.Member => Unit): Self = StObject.set(x, "memberUpdated", js.Any.fromFunction1(value))
    
    inline def setMessageAdded(value: Message => Unit): Self = StObject.set(x, "messageAdded", js.Any.fromFunction1(value))
    
    inline def setMessageRemoved(value: Message => Unit): Self = StObject.set(x, "messageRemoved", js.Any.fromFunction1(value))
    
    inline def setMessageUpdated(value: typings.twilioChat.anon.Message => Unit): Self = StObject.set(x, "messageUpdated", js.Any.fromFunction1(value))
    
    inline def setPushNotification(value: PushNotification => Unit): Self = StObject.set(x, "pushNotification", js.Any.fromFunction1(value))
    
    inline def setStateChanged(value: State => Unit): Self = StObject.set(x, "stateChanged", js.Any.fromFunction1(value))
    
    inline def setTokenAboutToExpire(value: Double => Unit): Self = StObject.set(x, "tokenAboutToExpire", js.Any.fromFunction1(value))
    
    inline def setTokenExpired(value: () => Unit): Self = StObject.set(x, "tokenExpired", js.Any.fromFunction0(value))
    
    inline def setTypingEnded(value: Member => Unit): Self = StObject.set(x, "typingEnded", js.Any.fromFunction1(value))
    
    inline def setTypingStarted(value: Member => Unit): Self = StObject.set(x, "typingStarted", js.Any.fromFunction1(value))
    
    inline def setUserSubscribed(value: User => Unit): Self = StObject.set(x, "userSubscribed", js.Any.fromFunction1(value))
    
    inline def setUserUnsubscribed(value: User => Unit): Self = StObject.set(x, "userUnsubscribed", js.Any.fromFunction1(value))
    
    inline def setUserUpdated(value: UpdateReasons => Unit): Self = StObject.set(x, "userUpdated", js.Any.fromFunction1(value))
  }
}
