package typings.winrtDashUwp.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket control data on a DatagramSocket object. */
@JSGlobal("Windows.Networking.Sockets.DatagramSocketControl")
@js.native
abstract class DatagramSocketControl () extends js.Object {
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

