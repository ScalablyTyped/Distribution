package typings.twilio.libTwimlVoiceResponseMod

import typings.twilio.libTwimlTwiMLMod.default
import typings.xmlbuilder.mod.XMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/twiml/VoiceResponse", "Connect")
@js.native
open class Connect protected () extends default {
  /**
    * <Connect> TwiML Verb
    */
  def this(connect: XMLElement) = this()
  
  def autopilot(attributes: js.Object, name: String): Autopilot = js.native
  /**
    * <Autopilot> TwiML Noun
    *
    * @param attributes - TwiML attributes
    * @param name - Autopilot assistant sid or unique name
    */
  def autopilot(name: String): Autopilot = js.native
  
  var connect: XMLElement = js.native
  
  /**
    * <Conversation> TwiML Noun
    *
    * @param attributes - TwiML attributes
    */
  def conversation(): Conversation = js.native
  def conversation(attributes: ConversationAttributes): Conversation = js.native
  
  def room(attributes: RoomAttributes, name: String): Room = js.native
  /**
    * <Room> TwiML Noun
    *
    * @param attributes - TwiML attributes
    * @param name - Room name
    */
  def room(name: String): Room = js.native
  
  /**
    * <Stream> TwiML Noun
    *
    * @param attributes - TwiML attributes
    */
  def stream(): Stream = js.native
  def stream(attributes: StreamAttributes): Stream = js.native
  
  /**
    * <VirtualAgent> TwiML Noun
    *
    * @param attributes - TwiML attributes
    */
  def virtualAgent(): VirtualAgent = js.native
  def virtualAgent(attributes: VirtualAgentAttributes): VirtualAgent = js.native
}
