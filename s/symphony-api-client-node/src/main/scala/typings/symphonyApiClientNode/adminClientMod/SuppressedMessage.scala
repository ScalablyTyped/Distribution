package typings.symphonyApiClientNode.adminClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuppressedMessage extends js.Object {
  
  var messageId: String = js.native
  
  var suppressed: Boolean = js.native
  
  var suppressionDate: Double = js.native
}
object SuppressedMessage {
  
  @scala.inline
  def apply(messageId: String, suppressed: Boolean, suppressionDate: Double): SuppressedMessage = {
    val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any], suppressed = suppressed.asInstanceOf[js.Any], suppressionDate = suppressionDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuppressedMessage]
  }
  
  @scala.inline
  implicit class SuppressedMessageOps[Self <: SuppressedMessage] (val x: Self) extends AnyVal {
    
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
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressed(value: Boolean): Self = this.set("suppressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressionDate(value: Double): Self = this.set("suppressionDate", value.asInstanceOf[js.Any])
  }
}
