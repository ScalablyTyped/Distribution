package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkConnectionsData extends StObject {
  
  var localaddress: String = js.native
  
  var localport: String = js.native
  
  var peeraddress: String = js.native
  
  var peerport: String = js.native
  
  var pid: Double = js.native
  
  var process: String = js.native
  
  var protocol: String = js.native
  
  var state: String = js.native
}
object NetworkConnectionsData {
  
  @scala.inline
  def apply(
    localaddress: String,
    localport: String,
    peeraddress: String,
    peerport: String,
    pid: Double,
    process: String,
    protocol: String,
    state: String
  ): NetworkConnectionsData = {
    val __obj = js.Dynamic.literal(localaddress = localaddress.asInstanceOf[js.Any], localport = localport.asInstanceOf[js.Any], peeraddress = peeraddress.asInstanceOf[js.Any], peerport = peerport.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkConnectionsData]
  }
  
  @scala.inline
  implicit class NetworkConnectionsDataMutableBuilder[Self <: NetworkConnectionsData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocaladdress(value: String): Self = StObject.set(x, "localaddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalport(value: String): Self = StObject.set(x, "localport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeeraddress(value: String): Self = StObject.set(x, "peeraddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerport(value: String): Self = StObject.set(x, "peerport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcess(value: String): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
