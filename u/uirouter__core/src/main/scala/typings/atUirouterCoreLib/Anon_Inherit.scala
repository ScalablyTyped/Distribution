package typings
package atUirouterCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Inherit extends js.Object {
  var inherit: js.UndefOr[scala.Boolean] = js.undefined
  var matchingKeys: js.UndefOr[js.Any] = js.undefined
}

object Anon_Inherit {
  @scala.inline
  def apply(inherit: js.UndefOr[scala.Boolean] = js.undefined, matchingKeys: js.Any = null): Anon_Inherit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit)
    if (matchingKeys != null) __obj.updateDynamic("matchingKeys")(matchingKeys)
    __obj.asInstanceOf[Anon_Inherit]
  }
}

