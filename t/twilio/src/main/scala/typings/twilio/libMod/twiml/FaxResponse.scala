package typings.twilio.libMod.twiml

import typings.twilio.libTwimlFaxResponseMod.^
import typings.xmlbuilder.mod.XMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof IFaxResponse` */
@JSImport("twilio/lib", "twiml.FaxResponse")
@js.native
/**
  * <Response> TwiML for Faxes
  */
open class FaxResponse () extends ^
/* was `typeof IFaxResponse` */
object FaxResponse {
  
  @JSImport("twilio/lib", "twiml.FaxResponse.Receive")
  @js.native
  open class Receive protected ()
    extends typings.twilio.libTwimlFaxResponseMod.Receive {
    /**
      * <Receive> TwiML Verb
      */
    def this(receive: XMLElement) = this()
  }
}
