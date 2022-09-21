package typings.twilio.voiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoiceResponse extends StObject {
  
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
  def echo(): Unit = js.native
  def echo(attributes: js.Object): Unit = js.native
  
  /**
    * <Enqueue> TwiML Noun
    *
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
  def hangup(): Unit = js.native
  def hangup(attributes: js.Object): Unit = js.native
  
  /**
    * <Leave> TwiML Verb
    *
    * @param attributes - TwiML attributes
    */
  def leave(): Unit = js.native
  def leave(attributes: js.Object): Unit = js.native
  
  /**
    * <Pause> TwiML Verb
    *
    * @param attributes - TwiML attributes
    */
  def pause(): Unit = js.native
  def pause(attributes: PauseAttributes): Unit = js.native
  
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
    * @param url - Media URL
    */
  def play(): Unit = js.native
  def play(attributes: Unit, url: String): Unit = js.native
  def play(attributes: PlayAttributes): Unit = js.native
  def play(attributes: PlayAttributes, url: String): Unit = js.native
  def play(url: String): Unit = js.native
  
  /**
    * <Prompt> Twiml Verb
    *
    * @param attributes - TwiML attributes
    */
  def prompt(): Prompt = js.native
  def prompt(attributes: PromptAttributes): Prompt = js.native
  
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
    * <Record> TwiML Verb
    *
    * @param attributes - TwiML attributes
    */
  def record(): Unit = js.native
  def record(attributes: RecordAttributes): Unit = js.native
  
  /**
    * <Redirect> TwiML Verb
    *
    * @param attributes - TwiML attributes
    * @param url - Redirect URL
    */
  def redirect(attributes: RedirectAttributes, url: String): Unit = js.native
  /**
    * <Redirect> TwiML Verb
    *
    * @param url - Redirect URL
    */
  def redirect(url: String): Unit = js.native
  
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
  def reject(): Unit = js.native
  def reject(attributes: RejectAttributes): Unit = js.native
  
  /**
    * <Say> TwiML Verb
    *
    * @param attributes - TwiML attributes
    * @param message - Message to say
    */
  def say(attributes: SayAttributes, message: String): Say = js.native
  /**
    * <Say> TwiML Verb
    *
    * @param message - Message to say
    */
  def say(message: String): Say = js.native
  
  /**
    * <Sms> TwiML Noun
    *
    * @param attributes - TwiML attributes
    * @param message - Message body
    */
  def sms(attributes: SmsAttributes, message: String): Unit = js.native
  /**
    * <Sms> TwiML Noun
    *
    * @param message - Message body
    */
  def sms(message: String): Unit = js.native
  
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
