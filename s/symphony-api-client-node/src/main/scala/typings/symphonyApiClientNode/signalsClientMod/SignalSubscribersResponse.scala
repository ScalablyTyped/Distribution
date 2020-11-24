package typings.symphonyApiClientNode.signalsClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignalSubscribersResponse extends js.Object {
  
  var data: js.Array[SignalSubscriber] = js.native
  
  var hasMore: Boolean = js.native
  
  var offset: Double = js.native
  
  var total: Double = js.native
}
object SignalSubscribersResponse {
  
  @scala.inline
  def apply(data: js.Array[SignalSubscriber], hasMore: Boolean, offset: Double, total: Double): SignalSubscribersResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], hasMore = hasMore.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalSubscribersResponse]
  }
  
  @scala.inline
  implicit class SignalSubscribersResponseOps[Self <: SignalSubscribersResponse] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: SignalSubscriber*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[SignalSubscriber]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasMore(value: Boolean): Self = this.set("hasMore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
}
