package typings.winrtUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents network usage statistics returned by the ConnectionProfile . GetNetworkUsageAsync method. */
trait NetworkUsage extends StObject {
  
  /** Indicates the number of bytes received by the connection of a specific period of time. */
  var bytesReceived: Double
  
  /** Indicates the number of bytes sent by a connection over a specific period of time. */
  var bytesSent: Double
  
  /** Indicates the duration of connectivity. */
  var connectionDuration: Double
}
object NetworkUsage {
  
  inline def apply(bytesReceived: Double, bytesSent: Double, connectionDuration: Double): NetworkUsage = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], bytesSent = bytesSent.asInstanceOf[js.Any], connectionDuration = connectionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkUsage]
  }
  
  extension [Self <: NetworkUsage](x: Self) {
    
    inline def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
    
    inline def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
    
    inline def setConnectionDuration(value: Double): Self = StObject.set(x, "connectionDuration", value.asInstanceOf[js.Any])
  }
}
