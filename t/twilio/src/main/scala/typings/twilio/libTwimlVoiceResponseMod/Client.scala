package typings.twilio.libTwimlVoiceResponseMod

import typings.twilio.libTwimlTwiMLMod.default
import typings.xmlbuilder.mod.XMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/twiml/VoiceResponse", "Client")
@js.native
open class Client protected () extends default {
  /**
    * <Client> TwiML Noun
    */
  def this(client: XMLElement) = this()
  
  var client: XMLElement = js.native
  
  def identity(attributes: js.Object, clientIdentity: String): Identity = js.native
  /**
    * <Identity> TwiML Noun
    *
    * @param attributes - TwiML attributes
    * @param clientIdentity - Identity of the client to dial
    */
  def identity(clientIdentity: String): Identity = js.native
  
  /**
    * <Parameter> TwiML Noun
    *
    * @param attributes - TwiML attributes
    */
  def parameter(): Parameter = js.native
  def parameter(attributes: ParameterAttributes): Parameter = js.native
}
