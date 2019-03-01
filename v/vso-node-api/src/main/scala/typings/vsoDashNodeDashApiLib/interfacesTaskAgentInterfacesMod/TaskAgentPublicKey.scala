package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentPublicKey extends js.Object {
  /**
    * Gets or sets the exponent for the public key.
    */
  var exponent: js.Array[scala.Double]
  /**
    * Gets or sets the modulus for the public key.
    */
  var modulus: js.Array[scala.Double]
}

object TaskAgentPublicKey {
  @scala.inline
  def apply(exponent: js.Array[scala.Double], modulus: js.Array[scala.Double]): TaskAgentPublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exponent")(exponent)
    __obj.updateDynamic("modulus")(modulus)
    __obj.asInstanceOf[TaskAgentPublicKey]
  }
}

