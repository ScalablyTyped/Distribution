package typings
package winrtLib.WindowsNs.NetworkingNs.ProximityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProximityMessage extends js.Object {
  var data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  var dataAsString: java.lang.String
  var messageType: java.lang.String
  var subscriptionId: scala.Double
}

object IProximityMessage {
  @scala.inline
  def apply(
    data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    dataAsString: java.lang.String,
    messageType: java.lang.String,
    subscriptionId: scala.Double
  ): IProximityMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("dataAsString")(dataAsString)
    __obj.updateDynamic("messageType")(messageType)
    __obj.updateDynamic("subscriptionId")(subscriptionId)
    __obj.asInstanceOf[IProximityMessage]
  }
}

