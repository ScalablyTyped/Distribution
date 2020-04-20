package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentPublicKey extends js.Object {
  /**
    * Gets or sets the exponent for the public key.
    */
  var exponent: js.Array[Double]
  /**
    * Gets or sets the modulus for the public key.
    */
  var modulus: js.Array[Double]
}

object TaskAgentPublicKey {
  @scala.inline
  def apply(exponent: js.Array[Double], modulus: js.Array[Double]): TaskAgentPublicKey = {
    val __obj = js.Dynamic.literal(exponent = exponent.asInstanceOf[js.Any], modulus = modulus.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentPublicKey]
  }
}

