package typings.twilio.libTwimlVoiceResponseMod

import typings.twilio.libTwimlTwiMLMod.default
import typings.xmlbuilder.mod.XMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/twiml/VoiceResponse", "Gather")
@js.native
open class Gather protected () extends default {
  /**
    * <Gather> TwiML Verb
    */
  def this(gather: XMLElement) = this()
  
  var gather: XMLElement = js.native
  
  /**
    * <Pause> TwiML Verb
    *
    * @param attributes - TwiML attributes
    */
  def pause(): Pause = js.native
  def pause(attributes: PauseAttributes): Pause = js.native
  
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
  
  def say(attributes: SayAttributes, message: String): Say = js.native
  /**
    * <Say> TwiML Verb
    *
    * @param attributes - TwiML attributes
    * @param message - Message to say
    */
  def say(message: String): Say = js.native
}
