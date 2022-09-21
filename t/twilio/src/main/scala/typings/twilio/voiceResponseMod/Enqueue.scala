package typings.twilio.voiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/twiml/VoiceResponse", "Enqueue")
@js.native
open class Enqueue () extends StObject {
  
  /**
    * <Task> TwiML Noun
    *
    * @param attributes - TwiML attributes
    * @param body - TaskRouter task attributes
    */
  def task(attributes: TaskAttributes, body: String): Unit = js.native
  /**
    * <Task> TwiML Noun
    *
    * @param body - TaskRouter task attributes
    */
  def task(body: String): Unit = js.native
}
