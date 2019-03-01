package typings
package vegaDashTypingsLib.typesSpecEncodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThetaProperty extends js.Object {
  var theta: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
}

object ThetaProperty {
  @scala.inline
  def apply(theta: ProductionRule[NumericValueRef] = null): ThetaProperty = {
    val __obj = js.Dynamic.literal()
    if (theta != null) __obj.updateDynamic("theta")(theta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThetaProperty]
  }
}

