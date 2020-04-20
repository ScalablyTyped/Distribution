package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatagramSocketInformation extends js.Object {
  var localAddress: HostName
  var localPort: String
  var remoteAddress: HostName
  var remotePort: String
}

object IDatagramSocketInformation {
  @scala.inline
  def apply(localAddress: HostName, localPort: String, remoteAddress: HostName, remotePort: String): IDatagramSocketInformation = {
    val __obj = js.Dynamic.literal(localAddress = localAddress.asInstanceOf[js.Any], localPort = localPort.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatagramSocketInformation]
  }
}

