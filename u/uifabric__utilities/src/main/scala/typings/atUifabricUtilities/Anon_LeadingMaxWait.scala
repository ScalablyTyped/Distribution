package typings.atUifabricUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LeadingMaxWait extends js.Object {
  var leading: js.UndefOr[Boolean] = js.undefined
  var maxWait: js.UndefOr[Double] = js.undefined
  var trailing: js.UndefOr[Boolean] = js.undefined
}

object Anon_LeadingMaxWait {
  @scala.inline
  def apply(
    leading: js.UndefOr[Boolean] = js.undefined,
    maxWait: Int | Double = null,
    trailing: js.UndefOr[Boolean] = js.undefined
  ): Anon_LeadingMaxWait = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leading)) __obj.updateDynamic("leading")(leading)
    if (maxWait != null) __obj.updateDynamic("maxWait")(maxWait.asInstanceOf[js.Any])
    if (!js.isUndefined(trailing)) __obj.updateDynamic("trailing")(trailing)
    __obj.asInstanceOf[Anon_LeadingMaxWait]
  }
}

