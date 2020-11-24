package typings.symphonyApiClientNode.connectionsClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends js.Object {
  
  var firstRequestedAt: js.UndefOr[Double] = js.native
  
  var requestCounter: js.UndefOr[Double] = js.native
  
  var status: typings.symphonyApiClientNode.symphonyApiClientNodeStrings.REJECTED | typings.symphonyApiClientNode.symphonyApiClientNodeStrings.ACCEPTED | typings.symphonyApiClientNode.symphonyApiClientNodeStrings.PENDING_INCOMING | typings.symphonyApiClientNode.symphonyApiClientNodeStrings.PENDING_OUTGOING = js.native
  
  var updatedAt: js.UndefOr[Double] = js.native
  
  var userId: Double = js.native
}
object Connection {
  
  @scala.inline
  def apply(
    status: typings.symphonyApiClientNode.symphonyApiClientNodeStrings.REJECTED | typings.symphonyApiClientNode.symphonyApiClientNodeStrings.ACCEPTED | typings.symphonyApiClientNode.symphonyApiClientNodeStrings.PENDING_INCOMING | typings.symphonyApiClientNode.symphonyApiClientNodeStrings.PENDING_OUTGOING,
    userId: Double
  ): Connection = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
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
    def setStatus(
      value: typings.symphonyApiClientNode.symphonyApiClientNodeStrings.REJECTED | typings.symphonyApiClientNode.symphonyApiClientNodeStrings.ACCEPTED | typings.symphonyApiClientNode.symphonyApiClientNodeStrings.PENDING_INCOMING | typings.symphonyApiClientNode.symphonyApiClientNodeStrings.PENDING_OUTGOING
    ): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: Double): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstRequestedAt(value: Double): Self = this.set("firstRequestedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstRequestedAt: Self = this.set("firstRequestedAt", js.undefined)
    
    @scala.inline
    def setRequestCounter(value: Double): Self = this.set("requestCounter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestCounter: Self = this.set("requestCounter", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: Double): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedAt: Self = this.set("updatedAt", js.undefined)
  }
}
