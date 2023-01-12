package typings.twilioChat.mod

import typings.twilioChat.anon.UpdateReasons
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserEvents extends StObject {
  
  def updated(data: UpdateReasons): Unit
  
  def userSubscribed(user: User): Unit
  
  def userUnsubscribed(user: User): Unit
}
object UserEvents {
  
  inline def apply(updated: UpdateReasons => Unit, userSubscribed: User => Unit, userUnsubscribed: User => Unit): UserEvents = {
    val __obj = js.Dynamic.literal(updated = js.Any.fromFunction1(updated), userSubscribed = js.Any.fromFunction1(userSubscribed), userUnsubscribed = js.Any.fromFunction1(userUnsubscribed))
    __obj.asInstanceOf[UserEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserEvents] (val x: Self) extends AnyVal {
    
    inline def setUpdated(value: UpdateReasons => Unit): Self = StObject.set(x, "updated", js.Any.fromFunction1(value))
    
    inline def setUserSubscribed(value: User => Unit): Self = StObject.set(x, "userSubscribed", js.Any.fromFunction1(value))
    
    inline def setUserUnsubscribed(value: User => Unit): Self = StObject.set(x, "userUnsubscribed", js.Any.fromFunction1(value))
  }
}
