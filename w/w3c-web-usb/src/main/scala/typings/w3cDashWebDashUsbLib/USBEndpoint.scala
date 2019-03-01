package typings
package w3cDashWebDashUsbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait USBEndpoint extends js.Object {
  val direction: USBDirection
  val endpointNumber: scala.Double
  val packetSize: scala.Double
  val `type`: USBEndpointType
}

object USBEndpoint {
  @scala.inline
  def apply(
    direction: USBDirection,
    endpointNumber: scala.Double,
    packetSize: scala.Double,
    `type`: USBEndpointType
  ): USBEndpoint = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("direction")(direction)
    __obj.updateDynamic("endpointNumber")(endpointNumber)
    __obj.updateDynamic("packetSize")(packetSize)
    __obj.asInstanceOf[USBEndpoint]
  }
}

