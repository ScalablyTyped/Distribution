package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Networking.HostName
import typings.winrt.Windows.Storage.Streams.DataReader
import typings.winrt.Windows.Storage.Streams.IInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDatagramSocketMessageReceivedEventArgs extends StObject {
  
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
  implicit class IDatagramSocketMessageReceivedEventArgsMutableBuilder[Self <: IDatagramSocketMessageReceivedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDataReader(value: () => DataReader): Self = StObject.set(x, "getDataReader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDataStream(value: () => IInputStream): Self = StObject.set(x, "getDataStream", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLocalAddress(value: HostName): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteAddress(value: HostName): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemotePort(value: String): Self = StObject.set(x, "remotePort", value.asInstanceOf[js.Any])
  }
}
