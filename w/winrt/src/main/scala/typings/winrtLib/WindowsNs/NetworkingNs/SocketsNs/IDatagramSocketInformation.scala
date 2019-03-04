package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatagramSocketInformation extends js.Object {
  var localAddress: winrtLib.WindowsNs.NetworkingNs.HostName
  var localPort: java.lang.String
  var remoteAddress: winrtLib.WindowsNs.NetworkingNs.HostName
  var remotePort: java.lang.String
}

object IDatagramSocketInformation {
  @scala.inline
  def apply(
    localAddress: winrtLib.WindowsNs.NetworkingNs.HostName,
    localPort: java.lang.String,
    remoteAddress: winrtLib.WindowsNs.NetworkingNs.HostName,
    remotePort: java.lang.String
  ): IDatagramSocketInformation = {
    val __obj = js.Dynamic.literal(localAddress = localAddress, localPort = localPort, remoteAddress = remoteAddress, remotePort = remotePort)
  
    __obj.asInstanceOf[IDatagramSocketInformation]
  }
}

