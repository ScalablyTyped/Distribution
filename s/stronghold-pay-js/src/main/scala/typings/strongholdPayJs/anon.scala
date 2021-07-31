package typings.strongholdPayJs

import typings.strongholdPayJs.mod.global.Stronghold.EVENT
import typings.strongholdPayJs.mod.global.Stronghold.StrongholdPayError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: js.Any
    
    var err: StrongholdPayError | Null
  }
  object Data {
    
    @scala.inline
    def apply(data: js.Any): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], err = null)
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErr(value: StrongholdPayError): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrNull: Self = StObject.set(x, "err", null)
    }
  }
  
  trait DisplayMessage_ extends StObject {
    
    var displayMessage: js.UndefOr[String] = js.undefined
    
    var drawerId: js.UndefOr[String] = js.undefined
    
    var terminalId: js.UndefOr[String] = js.undefined
  }
  object DisplayMessage_ {
    
    @scala.inline
    def apply(): DisplayMessage_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisplayMessage_]
    }
    
    @scala.inline
    implicit class DisplayMessage_MutableBuilder[Self <: DisplayMessage_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayMessage(value: String): Self = StObject.set(x, "displayMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayMessageUndefined: Self = StObject.set(x, "displayMessage", js.undefined)
      
      @scala.inline
      def setDrawerId(value: String): Self = StObject.set(x, "drawerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerIdUndefined: Self = StObject.set(x, "drawerId", js.undefined)
      
      @scala.inline
      def setTerminalId(value: String): Self = StObject.set(x, "terminalId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerminalIdUndefined: Self = StObject.set(x, "terminalId", js.undefined)
    }
  }
  
  trait Displaymessage extends StObject {
    
    var display_message: js.UndefOr[String] = js.undefined
    
    var drawer_id: js.UndefOr[String] = js.undefined
    
    var terminal_id: js.UndefOr[String] = js.undefined
  }
  object Displaymessage {
    
    @scala.inline
    def apply(): Displaymessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Displaymessage]
    }
    
    @scala.inline
    implicit class DisplaymessageMutableBuilder[Self <: Displaymessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplay_message(value: String): Self = StObject.set(x, "display_message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay_messageUndefined: Self = StObject.set(x, "display_message", js.undefined)
      
      @scala.inline
      def setDrawer_id(value: String): Self = StObject.set(x, "drawer_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawer_idUndefined: Self = StObject.set(x, "drawer_id", js.undefined)
      
      @scala.inline
      def setTerminal_id(value: String): Self = StObject.set(x, "terminal_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerminal_idUndefined: Self = StObject.set(x, "terminal_id", js.undefined)
    }
  }
  
  trait Event extends StObject {
    
    var event: EVENT
    
    var payload: Data
  }
  object Event {
    
    @scala.inline
    def apply(event: EVENT, payload: Data): Event = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: EVENT): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: Data): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
}
