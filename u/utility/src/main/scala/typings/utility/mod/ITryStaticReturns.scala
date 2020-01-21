package typings.utility.mod

import typings.std.Error
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
  var error: js.UndefOr[Error] = js.undefined
  var value: js.Any
}

object ITryStaticReturns {
  @scala.inline
  def apply(value: js.Any, error: Error = null): ITryStaticReturns = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITryStaticReturns]
  }
}

