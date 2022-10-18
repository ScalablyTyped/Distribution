package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/twiml/VoiceResponse", "Dial")
@js.native
open class Dial () extends StObject {
  
  /**
    * <Client> TwiML Noun
    *
    * @param identity - Client identity
    */
  def client(): Client = js.native
  def client(attributes: Unit, identity: String): Client = js.native
  def client(attributes: ClientAttributes): Client = js.native
  def client(attributes: ClientAttributes, identity: String): Client = js.native
  def client(identity: String): Client = js.native
  
  /**
    * <Conference> TwiML Noun
    *
    * @param attributes - TwiML attributes
    * @param name - Conference name
    */
  def conference(attributes: ConferenceAttributes, name: String): Unit = js.native
  /**
    * <Conference> TwiML Noun
    *
    * @param name - Conference name
    */
  def conference(name: String): Unit = js.native
  
  /**
    * <Number> TwiML Noun
    *
    * @param attributes - TwiML attributes
    * @param phoneNumber - Phone Number to dial
    */
  def number(attributes: NumberAttributes, phoneNumber: String): Unit = js.native
  /**
    * <Number> TwiML Noun
    *
    * @param phoneNumber - Phone Number to dial
    */
  def number(phoneNumber: String): Unit = js.native
  
  /**
    * <Queue> TwiML Noun
    *
    * @param attributes - TwiML attributes
    * @param name - Queue name
    */
  def queue(attributes: QueueAttributes, name: String): Unit = js.native
  /**
    * <Queue> TwiML Noun
    *
    * @param name - Queue name
    */
  def queue(name: String): Unit = js.native
  
  /**
    * <Sim> TwiML Noun
    *
    * @param attributes - TwiML attributes
    * @param simSid - SIM SID
    */
  def sim(attributes: js.Object, simSid: String): Unit = js.native
  /**
    * <Sim> TwiML Noun
    *
    * @param simSid - SIM SID
    */
  def sim(simSid: String): Unit = js.native
  
  /**
    * <Sip> TwiML Noun
    *
    * @param attributes - TwiML attributes
    * @param sipUrl - SIP URL
    */
  def sip(attributes: SipAttributes, sipUrl: String): Unit = js.native
  /**
    * <Sip> TwiML Noun
    *
    * @param sipUrl - SIP URL
    */
  def sip(sipUrl: String): Unit = js.native
}
