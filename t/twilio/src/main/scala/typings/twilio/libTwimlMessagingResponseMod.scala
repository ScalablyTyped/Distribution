package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTwimlMessagingResponseMod {
  
  @JSImport("twilio/lib/twiml/MessagingResponse", JSImport.Namespace)
  @js.native
  /**
    * <Response> TwiML for Messages
    */
  open class ^ ()
    extends StObject
       with MessagingResponse
  
  @JSImport("twilio/lib/twiml/MessagingResponse", "Message")
  @js.native
  open class Message () extends StObject {
    
    /**
      * <Body> TwiML Noun
      *
      * @param attributes - TwiML attributes
      * @param message - Message Body
      */
    def body(attributes: js.Object, message: String): Unit = js.native
    /**
      * <Body> TwiML Noun
      *
      * @param message - Message Body
      */
    def body(message: String): Unit = js.native
    
    /**
      * <Media> TwiML Noun
      *
      * @param attributes - TwiML attributes
      * @param url - Media URL
      */
    def media(attributes: js.Object, url: String): Unit = js.native
    /**
      * <Media> TwiML Noun
      *
      * @param url - Media URL
      */
    def media(url: String): Unit = js.native
  }
  
  trait MessageAttributes extends StObject {
    
    var action: js.UndefOr[String] = js.undefined
    
    var from: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var statusCallback: js.UndefOr[String] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
  }
  object MessageAttributes {
    
    inline def apply(): MessageAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageAttributes]
    }
    
    extension [Self <: MessageAttributes](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  @js.native
  trait MessagingResponse extends StObject {
    
    /**
      * <Message> TwiML Verb
      *
      * @param attributes - TwiML attributes
      * @param body - Message Body
      */
    def message(attributes: MessageAttributes, body: String): Message = js.native
    /**
      * <Message> TwiML Verb
      *
      * @param body - Message Body
      */
    def message(body: String): Message = js.native
    
    /**
      * <Redirect> TwiML Verb
      *
      * @param attributes - TwiML attributes
      * @param url - Redirect URL
      */
    def redirect(attributes: RedirectAttributes, url: String): Unit = js.native
    /**
      * <Redirect> TwiML Verb
      *
      * @param url - Redirect URL
      */
    def redirect(url: String): Unit = js.native
  }
  
  trait RedirectAttributes extends StObject {
    
    var method: js.UndefOr[String] = js.undefined
  }
  object RedirectAttributes {
    
    inline def apply(): RedirectAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedirectAttributes]
    }
    
    extension [Self <: RedirectAttributes](x: Self) {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    }
  }
}
