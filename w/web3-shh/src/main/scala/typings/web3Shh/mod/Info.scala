package typings.web3Shh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Info extends js.Object {
  
  var maxMessageSize: Double = js.native
  
  var memory: Double = js.native
  
  var messages: Double = js.native
  
  var minPow: Double = js.native
}
object Info {
  
  @scala.inline
  def apply(maxMessageSize: Double, memory: Double, messages: Double, minPow: Double): Info = {
    val __obj = js.Dynamic.literal(maxMessageSize = maxMessageSize.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], minPow = minPow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
  
  @scala.inline
  implicit class InfoOps[Self <: Info] (val x: Self) extends AnyVal {
    
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
    def setMaxMessageSize(value: Double): Self = this.set("maxMessageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemory(value: Double): Self = this.set("memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessages(value: Double): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPow(value: Double): Self = this.set("minPow", value.asInstanceOf[js.Any])
  }
}
