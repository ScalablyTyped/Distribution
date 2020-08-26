package typings.wakeOnLan.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WakeOptions extends js.Object {
  /**
    * The ip address to which the packet is send  (default: 255.255.255.255)
    */
  var address: js.UndefOr[String] = js.native
  /**
    * The interval between packets (default: 100ms)
    */
  var interval: js.UndefOr[Double] = js.native
  /**
    * Number of packets to send (default: 3)
    */
  var num_packets: js.UndefOr[Double] = js.native
  /**
    * The port to send to (default: 9)
    */
  var port: js.UndefOr[Double] = js.native
}

object WakeOptions {
  @scala.inline
  def apply(): WakeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WakeOptions]
  }
  @scala.inline
  implicit class WakeOptionsOps[Self <: WakeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setNum_packets(value: Double): Self = this.set("num_packets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNum_packets: Self = this.set("num_packets", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
  
}

