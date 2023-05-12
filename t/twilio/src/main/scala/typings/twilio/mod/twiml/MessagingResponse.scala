package typings.twilio.mod.twiml

import typings.xmlbuilder.mod.XMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof IMessagingResponse` */
@JSImport("twilio", "twiml.MessagingResponse")
@js.native
/**
  * <Response> TwiML for Messages
  */
open class MessagingResponse ()
  extends typings.twilio.libMod.twiml.MessagingResponse
/* was `typeof IMessagingResponse` */
object MessagingResponse {
  
  @JSImport("twilio", "twiml.MessagingResponse.Body")
  @js.native
  open class Body protected ()
    extends typings.twilio.libMod.twiml.MessagingResponse.Body {
    /**
      * <Body> TwiML Noun
      */
    def this(body: XMLElement) = this()
  }
  
  @JSImport("twilio", "twiml.MessagingResponse.Media")
  @js.native
  open class Media protected ()
    extends typings.twilio.libMod.twiml.MessagingResponse.Media {
    /**
      * <Media> TwiML Noun
      */
    def this(media: XMLElement) = this()
  }
  
  @JSImport("twilio", "twiml.MessagingResponse.Message")
  @js.native
  open class Message protected ()
    extends typings.twilio.libMod.twiml.MessagingResponse.Message {
    /**
      * <Message> TwiML Verb
      */
    def this(message: XMLElement) = this()
  }
  
  @JSImport("twilio", "twiml.MessagingResponse.Redirect")
  @js.native
  open class Redirect protected ()
    extends typings.twilio.libMod.twiml.MessagingResponse.Redirect {
    /**
      * <Redirect> TwiML Verb
      */
    def this(redirect: XMLElement) = this()
  }
}
