package typings.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a USSD message that is used for sending messages to and receiving messages from the network. */
trait UssdMessage extends js.Object {
  /** Gets or sets the encoding scheme of the payload of this UssdMessage . */
  var dataCodingScheme: Double
  /** Gets or sets the payload of this UssdMessage as text. */
  var payloadAsText: String
  /**
    * Gets the raw payload of this UssdMessage .
    * @return The raw payload of this UssdMessage .
    */
  def getPayload(): js.Array[Double]
  /**
    * Sets the raw payload of this UssdMessage .
    * @param value The raw payload of this UssdMessage .
    */
  def setPayload(value: js.Array[Double]): Unit
}

object UssdMessage {
  @scala.inline
  def apply(
    dataCodingScheme: Double,
    getPayload: () => js.Array[Double],
    payloadAsText: String,
    setPayload: js.Array[Double] => Unit
  ): UssdMessage = {
    val __obj = js.Dynamic.literal(dataCodingScheme = dataCodingScheme.asInstanceOf[js.Any], getPayload = js.Any.fromFunction0(getPayload), payloadAsText = payloadAsText.asInstanceOf[js.Any], setPayload = js.Any.fromFunction1(setPayload))
    __obj.asInstanceOf[UssdMessage]
  }
}

