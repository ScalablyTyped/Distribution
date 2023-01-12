package typings.winrtUwp.Windows.Networking.Sockets

import typings.winrtUwp.Windows.Networking.HostName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides socket information on a DatagramSocket object. */
trait DatagramSocketInformation extends StObject {
  
  /** The local IP address associated with a DatagramSocket object. */
  var localAddress: HostName
  
  /** The local service name or UDP port number associated with a DatagramSocket . */
  var localPort: String
  
  /** The IP address of the remote network destination associated with a DatagramSocket object. */
  var remoteAddress: HostName
  
  /** The UDP port number of the remote network destination associated with a DatagramSocket object. */
  var remotePort: String
}
object DatagramSocketInformation {
  
  inline def apply(localAddress: HostName, localPort: String, remoteAddress: HostName, remotePort: String): DatagramSocketInformation = {
    val __obj = js.Dynamic.literal(localAddress = localAddress.asInstanceOf[js.Any], localPort = localPort.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatagramSocketInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatagramSocketInformation] (val x: Self) extends AnyVal {
    
    inline def setLocalAddress(value: HostName): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    inline def setLocalPort(value: String): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
    
    inline def setRemoteAddress(value: HostName): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
    
    inline def setRemotePort(value: String): Self = StObject.set(x, "remotePort", value.asInstanceOf[js.Any])
  }
}
