package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentMessage extends js.Object {
  /**
    * Gets or sets the body of the message. If the IV property is provided the body will need to be decrypted using the TaskAgentSession.EncryptionKey value in addition to the IV.
    */
  var body: java.lang.String
  /**
    * Gets or sets the intialization vector used to encrypt this message.
    */
  var iV: js.Array[scala.Double]
  /**
    * Gets or sets the message identifier.
    */
  var messageId: scala.Double
  /**
    * Gets or sets the message type, describing the data contract found in TaskAgentMessage.Body.
    */
  var messageType: java.lang.String
}

