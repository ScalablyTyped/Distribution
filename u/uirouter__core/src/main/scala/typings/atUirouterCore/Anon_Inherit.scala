package typings.atUirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Inherit extends js.Object {
  var inherit: js.UndefOr[Boolean] = js.undefined
  var matchingKeys: js.UndefOr[js.Any] = js.undefined
}

object Anon_Inherit {
  @scala.inline
  def apply(inherit: js.UndefOr[Boolean] = js.undefined, matchingKeys: js.Any = null): Anon_Inherit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit.asInstanceOf[js.Any])
    if (matchingKeys != null) __obj.updateDynamic("matchingKeys")(matchingKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Inherit]
  }
}

