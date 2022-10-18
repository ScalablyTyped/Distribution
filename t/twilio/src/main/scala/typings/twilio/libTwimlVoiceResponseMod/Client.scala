package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/twiml/VoiceResponse", "Client")
@js.native
open class Client () extends StObject {
  
  /**
    * <Identity> TwiML Noun
    *
    * @param attributes - TwiML attributes
    * @param clientIdentity - Identity of the client to dial
    */
  def identity(attributes: js.Object, clientIdentity: String): Unit = js.native
  /**
    * <Identity> TwiML Noun
    *
    * @param clientIdentity - Identity of the client to dial
    */
  def identity(clientIdentity: String): Unit = js.native
  
  /**
    * <Parameter> TwiML Noun
    *
    * @param attributes - TwiML attributes
    */
  def parameter(): Unit = js.native
  def parameter(attributes: ParameterAttributes): Unit = js.native
}
