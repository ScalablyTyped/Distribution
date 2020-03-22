package typings.uifabricUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxWait extends js.Object {
  var leading: js.UndefOr[Boolean] = js.undefined
  var maxWait: js.UndefOr[Double] = js.undefined
  var trailing: js.UndefOr[Boolean] = js.undefined
}

object AnonMaxWait {
  @scala.inline
  def apply(
    leading: js.UndefOr[Boolean] = js.undefined,
    maxWait: Int | Double = null,
    trailing: js.UndefOr[Boolean] = js.undefined
  ): AnonMaxWait = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leading)) __obj.updateDynamic("leading")(leading.asInstanceOf[js.Any])
    if (maxWait != null) __obj.updateDynamic("maxWait")(maxWait.asInstanceOf[js.Any])
    if (!js.isUndefined(trailing)) __obj.updateDynamic("trailing")(trailing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxWait]
  }
}

