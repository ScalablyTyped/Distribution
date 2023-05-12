package typings.twilio.libTwimlVoiceResponseMod

import typings.twilio.libTwimlTwiMLMod.default
import typings.xmlbuilder.mod.XMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/twiml/VoiceResponse", "Enqueue")
@js.native
open class Enqueue protected () extends default {
  /**
    * <Enqueue> TwiML Noun
    */
  def this(enqueue: XMLElement) = this()
  
  var enqueue: XMLElement = js.native
  
  def task(attributes: TaskAttributes, body: String): Task = js.native
  /**
    * <Task> TwiML Noun
    *
    * @param attributes - TwiML attributes
    * @param body - TaskRouter task attributes
    */
  def task(body: String): Task = js.native
}
