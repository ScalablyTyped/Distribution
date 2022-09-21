package typings.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageEvents extends StObject {
  
  def updated(data: typings.twilioChat.anon.Message): Unit
}
object MessageEvents {
  
  inline def apply(updated: typings.twilioChat.anon.Message => Unit): MessageEvents = {
    val __obj = js.Dynamic.literal(updated = js.Any.fromFunction1(updated))
    __obj.asInstanceOf[MessageEvents]
  }
  
  extension [Self <: MessageEvents](x: Self) {
    
    inline def setUpdated(value: typings.twilioChat.anon.Message => Unit): Self = StObject.set(x, "updated", js.Any.fromFunction1(value))
  }
}
