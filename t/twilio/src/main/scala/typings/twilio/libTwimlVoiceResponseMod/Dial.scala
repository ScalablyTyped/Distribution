package typings.twilio.libTwimlVoiceResponseMod

import typings.twilio.libTwimlTwiMLMod.default
import typings.xmlbuilder.mod.XMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/twiml/VoiceResponse", "Dial")
@js.native
open class Dial protected () extends default {
  /**
    * <Dial> TwiML Verb
    */
  def this(dial: XMLElement) = this()
  
  /**
    * <Application> TwiML Noun
    *
    * @param attributes - TwiML attributes
    * @param applicationSid - Application sid
    */
  def application(): Application = js.native
  def application(applicationSid: String): Application = js.native
  def application(attributes: Unit, applicationSid: String): Application = js.native
  def application(attributes: ApplicationAttributes): Application = js.native
  def application(attributes: ApplicationAttributes, applicationSid: String): Application = js.native
  
  /**
    * <Client> TwiML Noun
    *
    * @param attributes - TwiML attributes
    * @param identity - Client identity
    */
  def client(): Client = js.native
  def client(attributes: Unit, identity: String): Client = js.native
  def client(attributes: ClientAttributes): Client = js.native
  def client(attributes: ClientAttributes, identity: String): Client = js.native
  def client(identity: String): Client = js.native
  
  def conference(attributes: ConferenceAttributes, name: String): Conference = js.native
  /**
    * <Conference> TwiML Noun
    *
    * @param attributes - TwiML attributes
    * @param name - Conference name
    */
  def conference(name: String): Conference = js.native
  
  var dial: XMLElement = js.native
  
  def number(attributes: NumberAttributes, phoneNumber: String): Number = js.native
  /**
    * <Number> TwiML Noun
    *
    * @param attributes - TwiML attributes
    * @param phoneNumber - Phone Number to dial
    */
  def number(phoneNumber: String): Number = js.native
  
  def queue(attributes: QueueAttributes, name: String): Queue = js.native
  /**
    * <Queue> TwiML Noun
    *
    * @param attributes - TwiML attributes
    * @param name - Queue name
    */
  def queue(name: String): Queue = js.native
  
  def sim(attributes: js.Object, simSid: String): Sim = js.native
  /**
    * <Sim> TwiML Noun
    *
    * @param attributes - TwiML attributes
    * @param simSid - SIM SID
    */
  def sim(simSid: String): Sim = js.native
  
  def sip(attributes: SipAttributes, sipUrl: String): Sip = js.native
  /**
    * <Sip> TwiML Noun
    *
    * @param attributes - TwiML attributes
    * @param sipUrl - SIP URL
    */
  def sip(sipUrl: String): Sip = js.native
}
