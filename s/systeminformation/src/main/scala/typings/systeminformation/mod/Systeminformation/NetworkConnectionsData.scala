package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkConnectionsData extends js.Object {
  
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
  implicit class NetworkConnectionsDataOps[Self <: NetworkConnectionsData] (val x: Self) extends AnyVal {
    
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
    def setLocaladdress(value: String): Self = this.set("localaddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalport(value: String): Self = this.set("localport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeeraddress(value: String): Self = this.set("peeraddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerport(value: String): Self = this.set("peerport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPid(value: Double): Self = this.set("pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcess(value: String): Self = this.set("process", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
