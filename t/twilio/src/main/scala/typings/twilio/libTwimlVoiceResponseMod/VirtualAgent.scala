package typings.twilio.libTwimlVoiceResponseMod

import typings.twilio.libTwimlTwiMLMod.default
import typings.xmlbuilder.mod.XMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/twiml/VoiceResponse", "VirtualAgent")
@js.native
open class VirtualAgent protected () extends default {
  /**
    * <VirtualAgent> TwiML Noun
    */
  def this(virtualAgent: XMLElement) = this()
  
  /**
    * <Config> TwiML Noun
    *
    * @param attributes - TwiML attributes
    */
  def config(): Config = js.native
  def config(attributes: ConfigAttributes): Config = js.native
  
  /**
    * <Parameter> TwiML Noun
    *
    * @param attributes - TwiML attributes
    */
  def parameter(): Parameter = js.native
  def parameter(attributes: ParameterAttributes): Parameter = js.native
  
  var virtualAgent: XMLElement = js.native
}
