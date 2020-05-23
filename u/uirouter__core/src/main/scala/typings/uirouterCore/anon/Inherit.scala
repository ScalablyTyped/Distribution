package typings.uirouterCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inherit extends js.Object {
  var inherit: js.UndefOr[Boolean] = js.undefined
  var matchingKeys: js.UndefOr[js.Any] = js.undefined
}

object Inherit {
  @scala.inline
  def apply(inherit: js.UndefOr[Boolean] = js.undefined, matchingKeys: js.Any = null): Inherit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit.get.asInstanceOf[js.Any])
    if (matchingKeys != null) __obj.updateDynamic("matchingKeys")(matchingKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inherit]
  }
}

