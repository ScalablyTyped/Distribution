package typings.victory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonXBoolean extends js.Object {
  var x: js.UndefOr[Boolean] = js.undefined
  var y: js.UndefOr[Boolean] = js.undefined
}

object AnonXBoolean {
  @scala.inline
  def apply(x: js.UndefOr[Boolean] = js.undefined, y: js.UndefOr[Boolean] = js.undefined): AnonXBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXBoolean]
  }
}

