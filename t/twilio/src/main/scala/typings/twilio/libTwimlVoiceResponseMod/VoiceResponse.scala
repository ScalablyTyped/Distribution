package typings.twilio.libTwimlVoiceResponseMod

import typings.twilio.libTwimlTwiMLMod.default
import typings.xmlbuilder.mod.XMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoiceResponse extends default {
  
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
  
  /**
    * <Connect> TwiML Verb
    *
    * @param attributes - TwiML attributes
    */
  def connect(): Connect = js.native
  def connect(attributes: ConnectAttributes): Connect = js.native
  
  /**
    * <Dial> TwiML Verb
    *
    * @param attributes - TwiML attributes
    * @param number - Phone number to dial
    */
  def dial(): Dial = js.native
  def dial(attributes: Unit, number: String): Dial = js.native
  def dial(attributes: DialAttributes): Dial = js.native
  def dial(attributes: DialAttributes, number: String): Dial = js.native
  def dial(number: String): Dial = js.native
  
  /**
    * <Echo> TwiML Verb
    *
    * @param attributes - TwiML attributes
    */
  def echo(): Echo = js.native
  def echo(attributes: js.Object): Echo = js.native
  
  /**
    * <Enqueue> TwiML Noun
    *
    * @param attributes - TwiML attributes
    * @param name - Friendly name
    */
  def enqueue(): Enqueue = js.native
  def enqueue(attributes: Unit, name: String): Enqueue = js.native
  def enqueue(attributes: EnqueueAttributes): Enqueue = js.native
  def enqueue(attributes: EnqueueAttributes, name: String): Enqueue = js.native
  def enqueue(name: String): Enqueue = js.native
  
  /**
    * <Gather> TwiML Verb
    *
    * @param attributes - TwiML attributes
    */
  def gather(): Gather = js.native
  def gather(attributes: GatherAttributes): Gather = js.native
  
  /**
    * <Hangup> TwiML Verb
    *
    * @param attributes - TwiML attributes
    */
  def hangup(): Hangup = js.native
  def hangup(attributes: js.Object): Hangup = js.native
  
  /**
    * <Leave> TwiML Verb
    *
    * @param attributes - TwiML attributes
    */
  def leave(): Leave = js.native
  def leave(attributes: js.Object): Leave = js.native
  
  /**
    * <Pause> TwiML Verb
    *
    * @param attributes - TwiML attributes
    */
  def pause(): Pause = js.native
  def pause(attributes: PauseAttributes): Pause = js.native
  
  /**
    * <Pay> Twiml Verb
    *
    * @param attributes - TwiML attributes
    */
  def pay(): Pay = js.native
  def pay(attributes: PayAttributes): Pay = js.native
  
  /**
    * <Play> TwiML Verb
    *
    * @param attributes - TwiML attributes
    * @param url - Media URL
    */
  def play(): Play = js.native
  def play(attributes: Unit, url: String): Play = js.native
  def play(attributes: PlayAttributes): Play = js.native
  def play(attributes: PlayAttributes, url: String): Play = js.native
  def play(url: String): Play = js.native
  
  /**
    * <Prompt> Twiml Verb
    *
    * @param attributes - TwiML attributes
    */
  def prompt(): Prompt = js.native
  def prompt(attributes: PromptAttributes): Prompt = js.native
  
  def queue(attributes: QueueAttributes, name: String): Queue = js.native
  /**
    * <Queue> TwiML Noun
    *
    * @param attributes - TwiML attributes
    * @param name - Queue name
    */
  def queue(name: String): Queue = js.native
  
  /**
    * <Record> TwiML Verb
    *
    * @param attributes - TwiML attributes
    */
  def record(): Record = js.native
  def record(attributes: RecordAttributes): Record = js.native
  
  def redirect(attributes: RedirectAttributes, url: String): Redirect = js.native
  /**
    * <Redirect> TwiML Verb
    *
    * @param attributes - TwiML attributes
    * @param url - Redirect URL
    */
  def redirect(url: String): Redirect = js.native
  
  /**
    * <Refer> TwiML Verb
    *
    * @param attributes - TwiML attributes
    */
  def refer(): Refer = js.native
  def refer(attributes: ReferAttributes): Refer = js.native
  
  /**
    * <Reject> TwiML Verb
    *
    * @param attributes - TwiML attributes
    */
  def reject(): Reject = js.native
  def reject(attributes: RejectAttributes): Reject = js.native
  
  def say(attributes: SayAttributes, message: String): Say = js.native
  /**
    * <Say> TwiML Verb
    *
    * @param attributes - TwiML attributes
    * @param message - Message to say
    */
  def say(message: String): Say = js.native
  
  def sms(attributes: SmsAttributes, message: String): Sms = js.native
  /**
    * <Sms> TwiML Noun
    *
    * @param attributes - TwiML attributes
    * @param message - Message body
    */
  def sms(message: String): Sms = js.native
  
  /**
    * <Start> TwiML Verb
    *
    * @param attributes - TwiML attributes
    */
  def start(): Start = js.native
  def start(attributes: StartAttributes): Start = js.native
  
  /**
    * <Stop> TwiML Verb
    *
    * @param attributes - TwiML attributes
    */
  def stop(): Stop = js.native
  def stop(attributes: js.Object): Stop = js.native
}
