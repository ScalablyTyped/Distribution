package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/twiml/VoiceResponse", "Refer")
@js.native
open class Refer () extends StObject {
  
  /**
    * <Sip> TwiML Noun used in <Refer>
    *
    * @param attributes - TwiML attributes
    * @param sipUrl - SIP URL
    */
  def referSip(attributes: js.Object, sipUrl: String): Unit = js.native
  /**
    * <Sip> TwiML Noun used in <Refer>
    *
    * @param sipUrl - SIP URL
    */
  def referSip(sipUrl: String): Unit = js.native
  
  /**
    * <Sip> TwiML Noun used in <Refer>
    *
    * @param attributes - TwiML attributes
    * @param sipUrl - SIP URL
    */
  def sip(attributes: js.Object, sipUrl: String): Unit = js.native
  /**
    * <Sip> TwiML Noun used in <Refer>
    *
    * @param sipUrl - SIP URL
    */
  def sip(sipUrl: String): Unit = js.native
}
