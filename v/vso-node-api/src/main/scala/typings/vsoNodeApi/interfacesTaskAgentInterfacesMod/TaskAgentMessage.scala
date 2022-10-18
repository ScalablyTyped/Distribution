package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskAgentMessage extends StObject {
  
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
  
  inline def apply(body: String, iV: js.Array[Double], messageId: Double, messageType: String): TaskAgentMessage = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], iV = iV.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentMessage]
  }
  
  extension [Self <: TaskAgentMessage](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setIV(value: js.Array[Double]): Self = StObject.set(x, "iV", value.asInstanceOf[js.Any])
    
    inline def setIVVarargs(value: Double*): Self = StObject.set(x, "iV", js.Array(value*))
    
    inline def setMessageId(value: Double): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setMessageType(value: String): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
  }
}
