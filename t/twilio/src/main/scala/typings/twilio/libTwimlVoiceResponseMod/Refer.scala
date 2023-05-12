package typings.twilio.libTwimlVoiceResponseMod

import typings.twilio.libTwimlTwiMLMod.default
import typings.xmlbuilder.mod.XMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/twiml/VoiceResponse", "Refer")
@js.native
open class Refer protected () extends default {
  /**
    * <Refer> TwiML Verb
    */
  def this(refer: XMLElement) = this()
  
  var refer: XMLElement = js.native
  
  def sip(attributes: js.Object, sipUrl: String): ReferSip = js.native
  /**
    * <Sip> TwiML Noun used in <Refer>
    *
    * @param attributes - TwiML attributes
    * @param sipUrl - SIP URL
    */
  def sip(sipUrl: String): ReferSip = js.native
}
