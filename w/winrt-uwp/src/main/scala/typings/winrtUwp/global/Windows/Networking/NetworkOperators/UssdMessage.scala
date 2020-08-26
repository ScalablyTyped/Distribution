package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a USSD message that is used for sending messages to and receiving messages from the network. */
@JSGlobal("Windows.Networking.NetworkOperators.UssdMessage")
@js.native
class UssdMessage protected ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.UssdMessage {
  /**
    * Creates a new instance of a UssdMessage and encodes the supplied string into the message payload.
    * @param messageText The payload for the UssdMessage.
    */
  def this(messageText: String) = this()
}

