package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskAgentMessage extends js.Object {
  
  /**
    * Gets or sets the body of the message. If the IV property is provided the body will need to be decrypted using the TaskAgentSession.EncryptionKey value in addition to the IV.
    */
  var body: String = js.native
  
  /**
    * Gets or sets the intialization vector used to encrypt this message.
    */
  var iV: js.Array[Double] = js.native
  
  /**
    * Gets or sets the message identifier.
    */
  var messageId: Double = js.native
  
  /**
    * Gets or sets the message type, describing the data contract found in TaskAgentMessage.Body.
    */
  var messageType: String = js.native
}
object TaskAgentMessage {
  
  @scala.inline
  def apply(body: String, iV: js.Array[Double], messageId: Double, messageType: String): TaskAgentMessage = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], iV = iV.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentMessage]
  }
  
  @scala.inline
  implicit class TaskAgentMessageOps[Self <: TaskAgentMessage] (val x: Self) extends AnyVal {
    
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIVVarargs(value: Double*): Self = this.set("iV", js.Array(value :_*))
    
    @scala.inline
    def setIV(value: js.Array[Double]): Self = this.set("iV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageId(value: Double): Self = this.set("messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageType(value: String): Self = this.set("messageType", value.asInstanceOf[js.Any])
  }
}
