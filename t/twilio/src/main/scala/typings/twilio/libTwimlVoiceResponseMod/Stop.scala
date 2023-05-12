package typings.twilio.libTwimlVoiceResponseMod

import typings.twilio.libTwimlTwiMLMod.default
import typings.xmlbuilder.mod.XMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/twiml/VoiceResponse", "Stop")
@js.native
open class Stop protected () extends default {
  /**
    * <Stop> TwiML Verb
    */
  def this(stop: XMLElement) = this()
  
  /**
    * <Siprec> TwiML Noun
    *
    * @param attributes - TwiML attributes
    */
  def siprec(): Siprec = js.native
  def siprec(attributes: SiprecAttributes): Siprec = js.native
  
  var stop: XMLElement = js.native
  
  /**
    * <Stream> TwiML Noun
    *
    * @param attributes - TwiML attributes
    */
  def stream(): Stream = js.native
  def stream(attributes: StreamAttributes): Stream = js.native
}
