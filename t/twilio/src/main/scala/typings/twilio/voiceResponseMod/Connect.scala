package typings.twilio.voiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/twiml/VoiceResponse", "Connect")
@js.native
open class Connect () extends StObject {
  
  /**
    * <Autopilot> TwiML Noun
    *
    * @param attributes - TwiML attributes
    * @param name - Autopilot assistant sid or unique name
    */
  def autopilot(attributes: js.Object, name: String): Unit = js.native
  /**
    * <Autopilot> TwiML Noun
    *
    * @param name - Autopilot assistant sid or unique name
    */
  def autopilot(name: String): Unit = js.native
  
  /**
    * <Conversation> TwiML Noun
    *
    * @param attributes - TwiML attributes
    */
  def conversation(): Unit = js.native
  def conversation(attributes: ConversationAttributes): Unit = js.native
  
  /**
    * <Room> TwiML Noun
    *
    * @param attributes - TwiML attributes
    * @param name - Room name
    */
  def room(attributes: RoomAttributes, name: String): Unit = js.native
  /**
    * <Room> TwiML Noun
    *
    * @param name - Room name
    */
  def room(name: String): Unit = js.native
  
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
