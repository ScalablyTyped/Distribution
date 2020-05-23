package typings.uirouterCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InheritBoolean extends js.Object {
  var inherit: js.UndefOr[Boolean] = js.undefined
}

object InheritBoolean {
  @scala.inline
  def apply(inherit: js.UndefOr[Boolean] = js.undefined): InheritBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InheritBoolean]
  }
}

