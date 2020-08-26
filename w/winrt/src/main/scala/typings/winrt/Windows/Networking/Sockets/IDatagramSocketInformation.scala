package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatagramSocketInformation extends js.Object {
  var localAddress: HostName = js.native
  var localPort: String = js.native
  var remoteAddress: HostName = js.native
  var remotePort: String = js.native
}

object IDatagramSocketInformation {
  @scala.inline
  def apply(localAddress: HostName, localPort: String, remoteAddress: HostName, remotePort: String): IDatagramSocketInformation = {
    val __obj = js.Dynamic.literal(localAddress = localAddress.asInstanceOf[js.Any], localPort = localPort.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatagramSocketInformation]
  }
  @scala.inline
  implicit class IDatagramSocketInformationOps[Self <: IDatagramSocketInformation] (val x: Self) extends AnyVal {
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
    def setLocalAddress(value: HostName): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalPort(value: String): Self = this.set("localPort", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteAddress(value: HostName): Self = this.set("remoteAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemotePort(value: String): Self = this.set("remotePort", value.asInstanceOf[js.Any])
  }
  
}

