package typings.winrtUwp.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket control data on a DatagramSocket object. */
trait DatagramSocketControl extends js.Object {
  /** Gets or sets a Boolean value that specifies whether the DatagramSocket allows IP datagrams for UDP to be fragmented. */
  var dontFragment: Boolean
  /** Gets or sets the size, in bytes, of the buffer used for receiving data on the DatagramSocket object. */
  var inboundBufferSizeInBytes: Double
  /** Gets or sets a Boolean value that specifies whether the DatagramSocket is able to coexist with other Win32 or WinRT multicast sockets bound to the same address/port. */
  var multicastOnly: Boolean
  /** Gets or sets the hop limit on an outbound packet sent to a unicast IP address by the DatagramSocket object. */
  var outboundUnicastHopLimit: Double
  /** Gets or sets the quality of service on a DatagramSocket object. */
  var qualityOfService: SocketQualityOfService
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
}

