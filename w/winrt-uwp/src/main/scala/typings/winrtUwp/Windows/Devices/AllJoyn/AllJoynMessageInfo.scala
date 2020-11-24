package typings.winrtUwp.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Exposes information about the sender of a message being processed. */
@js.native
trait AllJoynMessageInfo extends js.Object {
  
  /** The unique bus name of the message sender. */
  var senderUniqueName: String = js.native
}
object AllJoynMessageInfo {
  
  @scala.inline
  def apply(senderUniqueName: String): AllJoynMessageInfo = {
    val __obj = js.Dynamic.literal(senderUniqueName = senderUniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynMessageInfo]
  }
  
  @scala.inline
  implicit class AllJoynMessageInfoOps[Self <: AllJoynMessageInfo] (val x: Self) extends AnyVal {
    
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
    def setSenderUniqueName(value: String): Self = this.set("senderUniqueName", value.asInstanceOf[js.Any])
  }
}
