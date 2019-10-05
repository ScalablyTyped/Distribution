package typings.winrtDashUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a USSD message that is used for sending messages to and receiving messages from the network. */
@JSGlobal("Windows.Networking.NetworkOperators.UssdMessage")
@js.native
class UssdMessage protected () extends js.Object {
  /**
    * Creates a new instance of a UssdMessage and encodes the supplied string into the message payload.
    * @param messageText The payload for the UssdMessage.
    */
  def this(messageText: String) = this()
  /** Gets or sets the encoding scheme of the payload of this UssdMessage . */
  var dataCodingScheme: Double = js.native
  /** Gets or sets the payload of this UssdMessage as text. */
  var payloadAsText: String = js.native
  /**
    * Gets the raw payload of this UssdMessage .
    * @return The raw payload of this UssdMessage .
    */
  def getPayload(): js.Array[Double] = js.native
  /**
    * Sets the raw payload of this UssdMessage .
    * @param value The raw payload of this UssdMessage .
    */
  def setPayload(value: js.Array[Double]): Unit = js.native
}

