package typings.twilioChat.mod

import typings.twilioChat.anon.UpdateReasons
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersEvents extends StObject {
  
  def userSubscribed(user: User): Unit
  
  def userUnsubscribed(user: User): Unit
  
  def userUpdated(data: UpdateReasons): Unit
}
object UsersEvents {
  
  inline def apply(userSubscribed: User => Unit, userUnsubscribed: User => Unit, userUpdated: UpdateReasons => Unit): UsersEvents = {
    val __obj = js.Dynamic.literal(userSubscribed = js.Any.fromFunction1(userSubscribed), userUnsubscribed = js.Any.fromFunction1(userUnsubscribed), userUpdated = js.Any.fromFunction1(userUpdated))
    __obj.asInstanceOf[UsersEvents]
  }
  
  extension [Self <: UsersEvents](x: Self) {
    
    inline def setUserSubscribed(value: User => Unit): Self = StObject.set(x, "userSubscribed", js.Any.fromFunction1(value))
    
    inline def setUserUnsubscribed(value: User => Unit): Self = StObject.set(x, "userUnsubscribed", js.Any.fromFunction1(value))
    
    inline def setUserUpdated(value: UpdateReasons => Unit): Self = StObject.set(x, "userUpdated", js.Any.fromFunction1(value))
  }
}
