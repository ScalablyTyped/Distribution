package typings.twilio.libTwimlVoiceResponseMod

import typings.twilio.libTwimlTwiMLMod.default
import typings.xmlbuilder.mod.XMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/twiml/VoiceResponse", "Start")
@js.native
open class Start protected () extends default {
  /**
    * <Start> TwiML Verb
    */
  def this(start: XMLElement) = this()
  
  /**
    * <Siprec> TwiML Noun
    *
    * @param attributes - TwiML attributes
    */
  def siprec(): Siprec = js.native
  def siprec(attributes: SiprecAttributes): Siprec = js.native
  
  var start: XMLElement = js.native
  
  /**
    * <Stream> TwiML Noun
    *
    * @param attributes - TwiML attributes
    */
  def stream(): Stream = js.native
  def stream(attributes: StreamAttributes): Stream = js.native
}
