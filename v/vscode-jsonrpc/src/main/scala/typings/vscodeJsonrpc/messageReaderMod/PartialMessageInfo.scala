package typings.vscodeJsonrpc.messageReaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartialMessageInfo extends js.Object {
  
  val messageToken: Double = js.native
  
  val waitingTime: Double = js.native
}
object PartialMessageInfo {
  
  @scala.inline
  def apply(messageToken: Double, waitingTime: Double): PartialMessageInfo = {
    val __obj = js.Dynamic.literal(messageToken = messageToken.asInstanceOf[js.Any], waitingTime = waitingTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMessageInfo]
  }
  
  @scala.inline
  implicit class PartialMessageInfoOps[Self <: PartialMessageInfo] (val x: Self) extends AnyVal {
    
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
    def setMessageToken(value: Double): Self = this.set("messageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitingTime(value: Double): Self = this.set("waitingTime", value.asInstanceOf[js.Any])
  }
}
