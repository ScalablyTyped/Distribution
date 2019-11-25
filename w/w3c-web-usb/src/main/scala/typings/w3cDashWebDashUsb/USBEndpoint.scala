package typings.w3cDashWebDashUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait USBEndpoint extends js.Object {
  val direction: USBDirection
  val endpointNumber: Double
  val packetSize: Double
  val `type`: USBEndpointType
}

object USBEndpoint {
  @scala.inline
  def apply(direction: USBDirection, endpointNumber: Double, packetSize: Double, `type`: USBEndpointType): USBEndpoint = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], endpointNumber = endpointNumber.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBEndpoint]
  }
}

