package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Networking.HostName
import typings.winrt.Windows.Storage.Streams.DataReader
import typings.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDatagramSocketMessageReceivedEventArgs extends js.Object {
  
  def getDataReader(): DataReader = js.native
  
  def getDataStream(): IInputStream = js.native
  
  var localAddress: HostName = js.native
  
  var remoteAddress: HostName = js.native
  
  var remotePort: String = js.native
}
object IDatagramSocketMessageReceivedEventArgs {
  
  @scala.inline
  def apply(
    getDataReader: () => DataReader,
    getDataStream: () => IInputStream,
    localAddress: HostName,
    remoteAddress: HostName,
    remotePort: String
  ): IDatagramSocketMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(getDataReader = js.Any.fromFunction0(getDataReader), getDataStream = js.Any.fromFunction0(getDataStream), localAddress = localAddress.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatagramSocketMessageReceivedEventArgs]
  }
  
  @scala.inline
  implicit class IDatagramSocketMessageReceivedEventArgsOps[Self <: IDatagramSocketMessageReceivedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setGetDataReader(value: () => DataReader): Self = this.set("getDataReader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDataStream(value: () => IInputStream): Self = this.set("getDataStream", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLocalAddress(value: HostName): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteAddress(value: HostName): Self = this.set("remoteAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemotePort(value: String): Self = this.set("remotePort", value.asInstanceOf[js.Any])
  }
}
