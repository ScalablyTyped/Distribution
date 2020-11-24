package typings.voximplantWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Network information
  */
@js.native
trait NetworkInfo extends js.Object {
  
  /**
    *    Packet loss percentage
    */
  var packetLoss: Double = js.native
}
object NetworkInfo {
  
  @scala.inline
  def apply(packetLoss: Double): NetworkInfo = {
    val __obj = js.Dynamic.literal(packetLoss = packetLoss.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInfo]
  }
  
  @scala.inline
  implicit class NetworkInfoOps[Self <: NetworkInfo] (val x: Self) extends AnyVal {
    
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
    def setPacketLoss(value: Double): Self = this.set("packetLoss", value.asInstanceOf[js.Any])
  }
}
