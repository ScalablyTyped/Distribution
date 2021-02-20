package typings.winrtUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents network usage statistics returned by the ConnectionProfile . GetNetworkUsageAsync method. */
@js.native
trait NetworkUsage extends StObject {
  
  /** Indicates the number of bytes received by the connection of a specific period of time. */
  var bytesReceived: Double = js.native
  
  /** Indicates the number of bytes sent by a connection over a specific period of time. */
  var bytesSent: Double = js.native
  
  /** Indicates the duration of connectivity. */
  var connectionDuration: Double = js.native
}
object NetworkUsage {
  
  @scala.inline
  def apply(bytesReceived: Double, bytesSent: Double, connectionDuration: Double): NetworkUsage = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], bytesSent = bytesSent.asInstanceOf[js.Any], connectionDuration = connectionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkUsage]
  }
  
  @scala.inline
  implicit class NetworkUsageMutableBuilder[Self <: NetworkUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionDuration(value: Double): Self = StObject.set(x, "connectionDuration", value.asInstanceOf[js.Any])
  }
}
