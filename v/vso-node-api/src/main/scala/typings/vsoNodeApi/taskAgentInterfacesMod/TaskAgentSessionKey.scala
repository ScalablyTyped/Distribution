package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentSessionKey extends js.Object {
  /**
    * Gets or sets a value indicating whether or not the key value is encrypted. If this value is true, the property should be decrypted using the RSA key exchanged with the server during registration.
    */
  var encrypted: Boolean
  /**
    * Gets or sets the symmetric key value.
    */
  var value: js.Array[Double]
}

object TaskAgentSessionKey {
  @scala.inline
  def apply(encrypted: Boolean, value: js.Array[Double]): TaskAgentSessionKey = {
    val __obj = js.Dynamic.literal(encrypted = encrypted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentSessionKey]
  }
}

