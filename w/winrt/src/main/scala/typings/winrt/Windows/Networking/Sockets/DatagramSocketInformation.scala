package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Sockets.DatagramSocketInformation")
@js.native
class DatagramSocketInformation () extends IDatagramSocketInformation {
  /* CompleteClass */
  override var localAddress: HostName = js.native
  /* CompleteClass */
  override var localPort: String = js.native
  /* CompleteClass */
  override var remoteAddress: HostName = js.native
  /* CompleteClass */
  override var remotePort: String = js.native
}

