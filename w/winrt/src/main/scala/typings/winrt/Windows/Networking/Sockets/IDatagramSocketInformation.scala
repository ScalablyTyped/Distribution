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
    val __obj = js.Dynamic.literal(localAddress = localAddress, localPort = localPort, remoteAddress = remoteAddress, remotePort = remotePort)
  
    __obj.asInstanceOf[IDatagramSocketInformation]
  }
}

