package typings.wakeOnLan.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WakeOptions extends js.Object {
  /**
    * The ip address to which the packet is send  (default: 255.255.255.255)
    */
  var address: js.UndefOr[String] = js.undefined
  /**
    * The interval between packets (default: 100ms)
    */
  var interval: js.UndefOr[Double] = js.undefined
  /**
    * Number of packets to send (default: 3)
    */
  var num_packets: js.UndefOr[Double] = js.undefined
  /**
    * The port to send to (default: 9)
    */
  var port: js.UndefOr[Double] = js.undefined
}

object WakeOptions {
  @scala.inline
  def apply(
    address: String = null,
    interval: js.UndefOr[Double] = js.undefined,
    num_packets: js.UndefOr[Double] = js.undefined,
    port: js.UndefOr[Double] = js.undefined
  ): WakeOptions = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(num_packets)) __obj.updateDynamic("num_packets")(num_packets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WakeOptions]
  }
}

