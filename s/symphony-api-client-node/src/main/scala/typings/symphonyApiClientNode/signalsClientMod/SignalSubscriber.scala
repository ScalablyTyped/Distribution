package typings.symphonyApiClientNode.signalsClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignalSubscriber extends js.Object {
  
  var owner: Boolean = js.native
  
  var pushed: Boolean = js.native
  
  var subscriberName: String = js.native
  
  var timestamp: Double = js.native
  
  var userId: Double = js.native
}
object SignalSubscriber {
  
  @scala.inline
  def apply(owner: Boolean, pushed: Boolean, subscriberName: String, timestamp: Double, userId: Double): SignalSubscriber = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], pushed = pushed.asInstanceOf[js.Any], subscriberName = subscriberName.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalSubscriber]
  }
  
  @scala.inline
  implicit class SignalSubscriberOps[Self <: SignalSubscriber] (val x: Self) extends AnyVal {
    
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
    def setOwner(value: Boolean): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushed(value: Boolean): Self = this.set("pushed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriberName(value: String): Self = this.set("subscriberName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: Double): Self = this.set("userId", value.asInstanceOf[js.Any])
  }
}
