package typings.winrtUwp.Windows.Networking.Proximity

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a message that's received from a subscription. */
trait ProximityMessage extends js.Object {
  /** Gets the binary data of the message. */
  var data: IBuffer
  /** Gets the message data as text. */
  var dataAsString: String
  /** Gets the type of the message. */
  var messageType: String
  /** Gets the subscription ID of the message. */
  var subscriptionId: Double
}

object ProximityMessage {
  @scala.inline
  def apply(data: IBuffer, dataAsString: String, messageType: String, subscriptionId: Double): ProximityMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataAsString = dataAsString.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProximityMessage]
  }
}

