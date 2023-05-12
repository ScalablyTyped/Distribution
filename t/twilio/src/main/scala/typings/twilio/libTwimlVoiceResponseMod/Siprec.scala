package typings.twilio.libTwimlVoiceResponseMod

import typings.twilio.libTwimlTwiMLMod.default
import typings.xmlbuilder.mod.XMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/twiml/VoiceResponse", "Siprec")
@js.native
open class Siprec protected () extends default {
  /**
    * <Siprec> TwiML Noun
    */
  def this(siprec: XMLElement) = this()
  
  /**
    * <Parameter> TwiML Noun
    *
    * @param attributes - TwiML attributes
    */
  def parameter(): Parameter = js.native
  def parameter(attributes: ParameterAttributes): Parameter = js.native
  
  var siprec: XMLElement = js.native
}
