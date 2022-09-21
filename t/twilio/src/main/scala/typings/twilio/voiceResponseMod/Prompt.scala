package typings.twilio.voiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/twiml/VoiceResponse", "Prompt")
@js.native
open class Prompt () extends StObject {
  
  /**
    * <Pause> TwiML Verb
    *
    * @param attributes - TwiML attributes
    */
  def pause(): Unit = js.native
  def pause(attributes: PauseAttributes): Unit = js.native
  
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
}
