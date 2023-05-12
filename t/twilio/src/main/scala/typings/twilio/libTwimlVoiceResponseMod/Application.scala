package typings.twilio.libTwimlVoiceResponseMod

import typings.twilio.libTwimlTwiMLMod.default
import typings.xmlbuilder.mod.XMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/twiml/VoiceResponse", "Application")
@js.native
open class Application protected () extends default {
  /**
    * <Application> TwiML Noun
    */
  def this(application: XMLElement) = this()
  
  var application: XMLElement = js.native
  
  def applicationSid(attributes: js.Object, sid: String): ApplicationSid = js.native
  /**
    * <ApplicationSid> TwiML Noun
    *
    * @param attributes - TwiML attributes
    * @param sid - Application sid to dial
    */
  def applicationSid(sid: String): ApplicationSid = js.native
  
  /**
    * <Parameter> TwiML Noun
    *
    * @param attributes - TwiML attributes
    */
  def parameter(): Parameter = js.native
  def parameter(attributes: ParameterAttributes): Parameter = js.native
}
