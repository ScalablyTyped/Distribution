package typings
package utilityLib.utilityMod.utilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * -----------------0_0---------------------------
  * @description Defines For Optimize Methods
  * @see https://github.com/node-modules/utility#argumentstoarray
  * -----------------0^0------------------------
  */
trait ITryStaticReturns extends js.Object {
  var error: js.UndefOr[stdLib.Error]
  var value: js.Any
}

object ITryStaticReturns {
  @scala.inline
  def apply(value: js.Any, error: stdLib.Error = null): ITryStaticReturns = {
    val __obj = js.Dynamic.literal(value = value)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[ITryStaticReturns]
  }
}

