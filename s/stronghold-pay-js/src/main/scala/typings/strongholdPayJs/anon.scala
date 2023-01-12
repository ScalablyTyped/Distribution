package typings.strongholdPayJs

import typings.strongholdPayJs.mod.global.Stronghold.EVENT
import typings.strongholdPayJs.mod.global.Stronghold.StrongholdPayError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: Any
    
    var err: StrongholdPayError | Null
  }
  object Data {
    
    inline def apply(data: Any): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], err = null)
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setErr(value: StrongholdPayError): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setErrNull: Self = StObject.set(x, "err", null)
    }
  }
  
  trait DisplayMessage_ extends StObject {
    
    var displayMessage: js.UndefOr[String] = js.undefined
    
    var drawerId: js.UndefOr[String] = js.undefined
    
    var terminalId: js.UndefOr[String] = js.undefined
  }
  object DisplayMessage_ {
    
    inline def apply(): DisplayMessage_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisplayMessage_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DisplayMessage_] (val x: Self) extends AnyVal {
      
      inline def setDisplayMessage(value: String): Self = StObject.set(x, "displayMessage", value.asInstanceOf[js.Any])
      
      inline def setDisplayMessageUndefined: Self = StObject.set(x, "displayMessage", js.undefined)
      
      inline def setDrawerId(value: String): Self = StObject.set(x, "drawerId", value.asInstanceOf[js.Any])
      
      inline def setDrawerIdUndefined: Self = StObject.set(x, "drawerId", js.undefined)
      
      inline def setTerminalId(value: String): Self = StObject.set(x, "terminalId", value.asInstanceOf[js.Any])
      
      inline def setTerminalIdUndefined: Self = StObject.set(x, "terminalId", js.undefined)
    }
  }
  
  trait Displaymessage extends StObject {
    
    var display_message: js.UndefOr[String] = js.undefined
    
    var drawer_id: js.UndefOr[String] = js.undefined
    
    var terminal_id: js.UndefOr[String] = js.undefined
  }
  object Displaymessage {
    
    inline def apply(): Displaymessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Displaymessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Displaymessage] (val x: Self) extends AnyVal {
      
      inline def setDisplay_message(value: String): Self = StObject.set(x, "display_message", value.asInstanceOf[js.Any])
      
      inline def setDisplay_messageUndefined: Self = StObject.set(x, "display_message", js.undefined)
      
      inline def setDrawer_id(value: String): Self = StObject.set(x, "drawer_id", value.asInstanceOf[js.Any])
      
      inline def setDrawer_idUndefined: Self = StObject.set(x, "drawer_id", js.undefined)
      
      inline def setTerminal_id(value: String): Self = StObject.set(x, "terminal_id", value.asInstanceOf[js.Any])
      
      inline def setTerminal_idUndefined: Self = StObject.set(x, "terminal_id", js.undefined)
    }
  }
  
  trait Event extends StObject {
    
    var event: EVENT
    
    var payload: Data
  }
  object Event {
    
    inline def apply(event: EVENT, payload: Data): Event = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      inline def setEvent(value: EVENT): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: Data): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
}
