package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentSessionKey extends js.Object {
  /**
    * Gets or sets a value indicating whether or not the key value is encrypted. If this value is true, the property should be decrypted using the RSA key exchanged with the server during registration.
    */
  var encrypted: scala.Boolean
  /**
    * Gets or sets the symmetric key value.
    */
  var value: js.Array[scala.Double]
}

object TaskAgentSessionKey {
  @scala.inline
  def apply(encrypted: scala.Boolean, value: js.Array[scala.Double]): TaskAgentSessionKey = {
    val __obj = js.Dynamic.literal(encrypted = encrypted, value = value)
  
    __obj.asInstanceOf[TaskAgentSessionKey]
  }
}

