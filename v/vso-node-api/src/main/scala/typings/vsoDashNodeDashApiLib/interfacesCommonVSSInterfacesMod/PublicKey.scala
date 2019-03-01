package typings
package vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKey extends js.Object {
  /**
    * Gets or sets the exponent for the public key.
    */
  var exponent: js.Array[scala.Double]
  /**
    * Gets or sets the modulus for the public key.
    */
  var modulus: js.Array[scala.Double]
}

object PublicKey {
  @scala.inline
  def apply(exponent: js.Array[scala.Double], modulus: js.Array[scala.Double]): PublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exponent")(exponent)
    __obj.updateDynamic("modulus")(modulus)
    __obj.asInstanceOf[PublicKey]
  }
}

