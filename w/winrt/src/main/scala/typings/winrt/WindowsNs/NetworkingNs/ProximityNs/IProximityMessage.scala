package typings.winrt.WindowsNs.NetworkingNs.ProximityNs

import typings.winrt.WindowsNs.StorageNs.StreamsNs.IBuffer
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
    val __obj = js.Dynamic.literal(data = data, dataAsString = dataAsString, messageType = messageType, subscriptionId = subscriptionId)
  
    __obj.asInstanceOf[IProximityMessage]
  }
}

