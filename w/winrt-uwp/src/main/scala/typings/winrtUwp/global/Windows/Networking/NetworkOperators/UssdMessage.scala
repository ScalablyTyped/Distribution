package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a USSD message that is used for sending messages to and receiving messages from the network. */
@JSGlobal("Windows.Networking.NetworkOperators.UssdMessage")
@js.native
class UssdMessage protected ()
  extends StObject
     with typings.winrtUwp.Windows.Networking.NetworkOperators.UssdMessage {
  /**
    * Creates a new instance of a UssdMessage and encodes the supplied string into the message payload.
    * @param messageText The payload for the UssdMessage.
    */
  def this(messageText: String) = this()
  
  /** Gets or sets the encoding scheme of the payload of this UssdMessage . */
  /* CompleteClass */
  var dataCodingScheme: Double = js.native
  
  /**
    * Gets the raw payload of this UssdMessage .
    * @return The raw payload of this UssdMessage .
    */
  /* CompleteClass */
  override def getPayload(): js.Array[Double] = js.native
  
  /** Gets or sets the payload of this UssdMessage as text. */
  /* CompleteClass */
  var payloadAsText: String = js.native
  
  /**
    * Sets the raw payload of this UssdMessage .
    * @param value The raw payload of this UssdMessage .
    */
  /* CompleteClass */
  override def setPayload(value: js.Array[Double]): Unit = js.native
}
