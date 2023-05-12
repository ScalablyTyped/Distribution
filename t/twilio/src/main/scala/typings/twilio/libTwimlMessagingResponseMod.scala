package typings.twilio

import typings.twilio.libTwimlTwiMLMod.default
import typings.xmlbuilder.mod.XMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTwimlMessagingResponseMod {
  
  @JSImport("twilio/lib/twiml/MessagingResponse", JSImport.Namespace)
  @js.native
  /**
    * <Response> TwiML for Messages
    */
  open class ^ () extends MessagingResponse
  
  @JSImport("twilio/lib/twiml/MessagingResponse", "Body")
  @js.native
  open class Body protected () extends default {
    /**
      * <Body> TwiML Noun
      */
    def this(body: XMLElement) = this()
    
    var body: XMLElement = js.native
  }
  
  @JSImport("twilio/lib/twiml/MessagingResponse", "Media")
  @js.native
  open class Media protected () extends default {
    /**
      * <Media> TwiML Noun
      */
    def this(media: XMLElement) = this()
    
    var media: XMLElement = js.native
  }
  
  @JSImport("twilio/lib/twiml/MessagingResponse", "Message")
  @js.native
  open class Message protected () extends default {
    /**
      * <Message> TwiML Verb
      */
    def this(message: XMLElement) = this()
    
    def body(attributes: js.Object, message: String): Body = js.native
    /**
      * <Body> TwiML Noun
      *
      * @param attributes - TwiML attributes
      * @param message - Message Body
      */
    def body(message: String): Body = js.native
    
    def media(attributes: js.Object, url: String): Media = js.native
    /**
      * <Media> TwiML Noun
      *
      * @param attributes - TwiML attributes
      * @param url - Media URL
      */
    def media(url: String): Media = js.native
    
    var message: XMLElement = js.native
  }
  
  @JSImport("twilio/lib/twiml/MessagingResponse", "Redirect")
  @js.native
  open class Redirect protected () extends default {
    /**
      * <Redirect> TwiML Verb
      */
    def this(redirect: XMLElement) = this()
    
    var redirect: XMLElement = js.native
  }
  
  /**
    * Attributes to pass to message
    */
  trait MessageAttributes extends StObject {
    
    /** action - Action URL */
    var action: js.UndefOr[String] = js.undefined
    
    /** from - Phone Number to send Message from */
    var from: js.UndefOr[String] = js.undefined
    
    /** method - Action URL Method */
    var method: js.UndefOr[String] = js.undefined
    
    /** statusCallback - Status callback URL. Deprecated in favor of action. */
    var statusCallback: js.UndefOr[String] = js.undefined
    
    /** to - Phone Number to send Message to */
    var to: js.UndefOr[String] = js.undefined
  }
  object MessageAttributes {
    
    inline def apply(): MessageAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageAttributes] (val x: Self) extends AnyVal {
      
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
  trait MessagingResponse extends default {
    
    /**
      * Comments in <Response>
      *
      * @param comment - XML Comment
      */
    def comment(comment: String): XMLElement = js.native
    
    /**
      * Comments after <Response>
      *
      * @param comment - XML Comment
      */
    def commentAfter(comment: String): XMLElement = js.native
    
    /**
      * Comments before <Response>
      *
      * @param comment - XML Comment
      */
    def commentBefore(comment: String): XMLElement = js.native
    
    def message(attributes: MessageAttributes, body: String): Message = js.native
    /**
      * <Message> TwiML Verb
      *
      * @param attributes - TwiML attributes
      * @param body - Message Body
      */
    def message(body: String): Message = js.native
    
    def redirect(attributes: RedirectAttributes, url: String): Redirect = js.native
    /**
      * <Redirect> TwiML Verb
      *
      * @param attributes - TwiML attributes
      * @param url - Redirect URL
      */
    def redirect(url: String): Redirect = js.native
  }
  
  /**
    * Attributes to pass to redirect
    */
  trait RedirectAttributes extends StObject {
    
    /** method - Redirect URL method */
    var method: js.UndefOr[String] = js.undefined
  }
  object RedirectAttributes {
    
    inline def apply(): RedirectAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedirectAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RedirectAttributes] (val x: Self) extends AnyVal {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    }
  }
}
