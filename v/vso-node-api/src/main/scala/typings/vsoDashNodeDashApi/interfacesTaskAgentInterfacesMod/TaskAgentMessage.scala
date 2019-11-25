package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentMessage extends js.Object {
  /**
    * Gets or sets the body of the message. If the IV property is provided the body will need to be decrypted using the TaskAgentSession.EncryptionKey value in addition to the IV.
    */
  var body: String
  /**
    * Gets or sets the intialization vector used to encrypt this message.
    */
  var iV: js.Array[Double]
  /**
    * Gets or sets the message identifier.
    */
  var messageId: Double
  /**
    * Gets or sets the message type, describing the data contract found in TaskAgentMessage.Body.
    */
  var messageType: String
}

object TaskAgentMessage {
  @scala.inline
  def apply(body: String, iV: js.Array[Double], messageId: Double, messageType: String): TaskAgentMessage = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], iV = iV.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TaskAgentMessage]
  }
}

