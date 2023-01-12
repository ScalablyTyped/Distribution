package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkConnectionsData extends StObject {
  
  var localAddress: String
  
  var localPort: String
  
  var peerAddress: String
  
  var peerPort: String
  
  var pid: Double
  
  var process: String
  
  var protocol: String
  
  var state: String
}
object NetworkConnectionsData {
  
  inline def apply(
    localAddress: String,
    localPort: String,
    peerAddress: String,
    peerPort: String,
    pid: Double,
    process: String,
    protocol: String,
    state: String
  ): NetworkConnectionsData = {
    val __obj = js.Dynamic.literal(localAddress = localAddress.asInstanceOf[js.Any], localPort = localPort.asInstanceOf[js.Any], peerAddress = peerAddress.asInstanceOf[js.Any], peerPort = peerPort.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkConnectionsData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkConnectionsData] (val x: Self) extends AnyVal {
    
    inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    inline def setLocalPort(value: String): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
    
    inline def setPeerAddress(value: String): Self = StObject.set(x, "peerAddress", value.asInstanceOf[js.Any])
    
    inline def setPeerPort(value: String): Self = StObject.set(x, "peerPort", value.asInstanceOf[js.Any])
    
    inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    inline def setProcess(value: String): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
