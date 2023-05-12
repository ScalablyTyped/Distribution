package typings.twilio.libMod.twiml

import typings.twilio.libTwimlMessagingResponseMod.^
import typings.xmlbuilder.mod.XMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof IMessagingResponse` */
@JSImport("twilio/lib", "twiml.MessagingResponse")
@js.native
/**
  * <Response> TwiML for Messages
  */
open class MessagingResponse () extends ^
/* was `typeof IMessagingResponse` */
object MessagingResponse {
  
  @JSImport("twilio/lib", "twiml.MessagingResponse.Body")
  @js.native
  open class Body protected ()
    extends typings.twilio.libTwimlMessagingResponseMod.Body {
    /**
      * <Body> TwiML Noun
      */
    def this(body: XMLElement) = this()
  }
  
  @JSImport("twilio/lib", "twiml.MessagingResponse.Media")
  @js.native
  open class Media protected ()
    extends typings.twilio.libTwimlMessagingResponseMod.Media {
    /**
      * <Media> TwiML Noun
      */
    def this(media: XMLElement) = this()
  }
  
  @JSImport("twilio/lib", "twiml.MessagingResponse.Message")
  @js.native
  open class Message protected ()
    extends typings.twilio.libTwimlMessagingResponseMod.Message {
    /**
      * <Message> TwiML Verb
      */
    def this(message: XMLElement) = this()
  }
  
  @JSImport("twilio/lib", "twiml.MessagingResponse.Redirect")
  @js.native
  open class Redirect protected ()
    extends typings.twilio.libTwimlMessagingResponseMod.Redirect {
    /**
      * <Redirect> TwiML Verb
      */
    def this(redirect: XMLElement) = this()
  }
}
