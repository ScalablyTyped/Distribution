package typings.twilio.mod.twiml

import typings.xmlbuilder.mod.XMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof IFaxResponse` */
@JSImport("twilio", "twiml.FaxResponse")
@js.native
/**
  * <Response> TwiML for Faxes
  */
open class FaxResponse ()
  extends typings.twilio.libMod.twiml.FaxResponse
/* was `typeof IFaxResponse` */
object FaxResponse {
  
  @JSImport("twilio", "twiml.FaxResponse.Receive")
  @js.native
  open class Receive protected ()
    extends typings.twilio.libMod.twiml.FaxResponse.Receive {
    /**
      * <Receive> TwiML Verb
      */
    def this(receive: XMLElement) = this()
  }
}
