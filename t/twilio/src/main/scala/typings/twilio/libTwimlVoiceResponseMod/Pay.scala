package typings.twilio.libTwimlVoiceResponseMod

import typings.twilio.libTwimlTwiMLMod.default
import typings.xmlbuilder.mod.XMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/twiml/VoiceResponse", "Pay")
@js.native
open class Pay protected () extends default {
  /**
    * <Pay> Twiml Verb
    */
  def this(pay: XMLElement) = this()
  
  /**
    * <Parameter> TwiML Noun
    *
    * @param attributes - TwiML attributes
    */
  def parameter(): Parameter = js.native
  def parameter(attributes: ParameterAttributes): Parameter = js.native
  
  var pay: XMLElement = js.native
  
  /**
    * <Prompt> Twiml Verb
    *
    * @param attributes - TwiML attributes
    */
  def prompt(): Prompt = js.native
  def prompt(attributes: PromptAttributes): Prompt = js.native
}
