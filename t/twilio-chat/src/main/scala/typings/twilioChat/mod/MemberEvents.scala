package typings.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberEvents extends StObject {
  
  def typingEnded(member: Member): Unit
  
  def typingStarted(member: Member): Unit
  
  def updated(data: typings.twilioChat.anon.Member): Unit
}
object MemberEvents {
  
  inline def apply(
    typingEnded: Member => Unit,
    typingStarted: Member => Unit,
    updated: typings.twilioChat.anon.Member => Unit
  ): MemberEvents = {
    val __obj = js.Dynamic.literal(typingEnded = js.Any.fromFunction1(typingEnded), typingStarted = js.Any.fromFunction1(typingStarted), updated = js.Any.fromFunction1(updated))
    __obj.asInstanceOf[MemberEvents]
  }
  
  extension [Self <: MemberEvents](x: Self) {
    
    inline def setTypingEnded(value: Member => Unit): Self = StObject.set(x, "typingEnded", js.Any.fromFunction1(value))
    
    inline def setTypingStarted(value: Member => Unit): Self = StObject.set(x, "typingStarted", js.Any.fromFunction1(value))
    
    inline def setUpdated(value: typings.twilioChat.anon.Member => Unit): Self = StObject.set(x, "updated", js.Any.fromFunction1(value))
  }
}
