package typings.twilio.voiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/twiml/VoiceResponse", "Pay")
@js.native
open class Pay () extends StObject {
  
  /**
    * <Parameter> TwiML Noun
    *
    * @param attributes - TwiML attributes
    */
  def parameter(): Unit = js.native
  def parameter(attributes: ParameterAttributes): Unit = js.native
  
  /**
    * <Prompt> Twiml Verb
    *
    * @param attributes - TwiML attributes
    */
  def prompt(): Prompt = js.native
  def prompt(attributes: PromptAttributes): Prompt = js.native
}
