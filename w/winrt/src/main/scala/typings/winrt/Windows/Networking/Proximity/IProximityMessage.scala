package typings.winrt.Windows.Networking.Proximity

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProximityMessage extends js.Object {
  var data: IBuffer
  var dataAsString: String
  var messageType: String
  var subscriptionId: Double
}

object IProximityMessage {
  @scala.inline
  def apply(data: IBuffer, dataAsString: String, messageType: String, subscriptionId: Double): IProximityMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataAsString = dataAsString.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProximityMessage]
  }
}

