package typings.uirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInheritBoolean extends js.Object {
  var inherit: js.UndefOr[Boolean] = js.undefined
}

object AnonInheritBoolean {
  @scala.inline
  def apply(inherit: js.UndefOr[Boolean] = js.undefined): AnonInheritBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInheritBoolean]
  }
}

