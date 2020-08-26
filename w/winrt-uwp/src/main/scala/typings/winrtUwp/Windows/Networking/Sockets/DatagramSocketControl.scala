package typings.winrtUwp.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket control data on a DatagramSocket object. */
@js.native
trait DatagramSocketControl extends js.Object {
  /** Gets or sets a Boolean value that specifies whether the DatagramSocket allows IP datagrams for UDP to be fragmented. */
  var dontFragment: Boolean = js.native
  /** Gets or sets the size, in bytes, of the buffer used for receiving data on the DatagramSocket object. */
  var inboundBufferSizeInBytes: Double = js.native
  /** Gets or sets a Boolean value that specifies whether the DatagramSocket is able to coexist with other Win32 or WinRT multicast sockets bound to the same address/port. */
  var multicastOnly: Boolean = js.native
  /** Gets or sets the hop limit on an outbound packet sent to a unicast IP address by the DatagramSocket object. */
  var outboundUnicastHopLimit: Double = js.native
  /** Gets or sets the quality of service on a DatagramSocket object. */
  var qualityOfService: SocketQualityOfService = js.native
}

object DatagramSocketControl {
  @scala.inline
  def apply(
    dontFragment: Boolean,
    inboundBufferSizeInBytes: Double,
    multicastOnly: Boolean,
    outboundUnicastHopLimit: Double,
    qualityOfService: SocketQualityOfService
  ): DatagramSocketControl = {
    val __obj = js.Dynamic.literal(dontFragment = dontFragment.asInstanceOf[js.Any], inboundBufferSizeInBytes = inboundBufferSizeInBytes.asInstanceOf[js.Any], multicastOnly = multicastOnly.asInstanceOf[js.Any], outboundUnicastHopLimit = outboundUnicastHopLimit.asInstanceOf[js.Any], qualityOfService = qualityOfService.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatagramSocketControl]
  }
  @scala.inline
  implicit class DatagramSocketControlOps[Self <: DatagramSocketControl] (val x: Self) extends AnyVal {
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
    def setDontFragment(value: Boolean): Self = this.set("dontFragment", value.asInstanceOf[js.Any])
    @scala.inline
    def setInboundBufferSizeInBytes(value: Double): Self = this.set("inboundBufferSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setMulticastOnly(value: Boolean): Self = this.set("multicastOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutboundUnicastHopLimit(value: Double): Self = this.set("outboundUnicastHopLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setQualityOfService(value: SocketQualityOfService): Self = this.set("qualityOfService", value.asInstanceOf[js.Any])
  }
  
}

