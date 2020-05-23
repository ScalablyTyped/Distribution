package typings.uifabricUtilities.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxWait extends js.Object {
  var leading: js.UndefOr[Boolean] = js.undefined
  var maxWait: js.UndefOr[Double] = js.undefined
  var trailing: js.UndefOr[Boolean] = js.undefined
}

object MaxWait {
  @scala.inline
  def apply(
    leading: js.UndefOr[Boolean] = js.undefined,
    maxWait: js.UndefOr[Double] = js.undefined,
    trailing: js.UndefOr[Boolean] = js.undefined
  ): MaxWait = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leading)) __obj.updateDynamic("leading")(leading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWait)) __obj.updateDynamic("maxWait")(maxWait.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trailing)) __obj.updateDynamic("trailing")(trailing.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxWait]
  }
}

