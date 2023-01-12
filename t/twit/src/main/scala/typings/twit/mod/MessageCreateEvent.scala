package typings.twit.mod

import typings.twit.anon.Messagedata
import typings.twit.twitStrings.message_create
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageCreateEvent extends StObject {
  
  var message_create: Messagedata
  
  var `type`: message_create
}
object MessageCreateEvent {
  
  inline def apply(message_create: Messagedata): MessageCreateEvent = {
    val __obj = js.Dynamic.literal(message_create = message_create.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("message_create")
    __obj.asInstanceOf[MessageCreateEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageCreateEvent] (val x: Self) extends AnyVal {
    
    inline def setMessage_create(value: Messagedata): Self = StObject.set(x, "message_create", value.asInstanceOf[js.Any])
    
    inline def setType(value: message_create): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
