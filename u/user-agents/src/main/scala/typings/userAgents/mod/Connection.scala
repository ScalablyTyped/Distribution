package typings.userAgents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends js.Object {
  
  var downlink: js.UndefOr[Double] = js.native
  
  var downlinkMax: js.UndefOr[js.Any] = js.native
  
  var effectiveType: js.UndefOr[String] = js.native
  
  var rtt: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object Connection {
  
  @scala.inline
  def apply(): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connection]
  }
  
  @scala.inline
  implicit class ConnectionOps[Self <: Connection] (val x: Self) extends AnyVal {
    
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
    def setDownlink(value: Double): Self = this.set("downlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownlink: Self = this.set("downlink", js.undefined)
    
    @scala.inline
    def setDownlinkMax(value: js.Any): Self = this.set("downlinkMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownlinkMax: Self = this.set("downlinkMax", js.undefined)
    
    @scala.inline
    def setEffectiveType(value: String): Self = this.set("effectiveType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveType: Self = this.set("effectiveType", js.undefined)
    
    @scala.inline
    def setRtt(value: Double): Self = this.set("rtt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtt: Self = this.set("rtt", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
