package typings.yandexMoneySdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Available extends js.Object {
  var available: Double
  var blocked: js.UndefOr[Double] = js.undefined
  var debt: js.UndefOr[Double] = js.undefined
  var deposition_pending: js.UndefOr[Double] = js.undefined
  var hold: js.UndefOr[Double] = js.undefined
  var total: Double
}

object Available {
  @scala.inline
  def apply(
    available: Double,
    total: Double,
    blocked: js.UndefOr[Double] = js.undefined,
    debt: js.UndefOr[Double] = js.undefined,
    deposition_pending: js.UndefOr[Double] = js.undefined,
    hold: js.UndefOr[Double] = js.undefined
  ): Available = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    if (!js.isUndefined(blocked)) __obj.updateDynamic("blocked")(blocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debt)) __obj.updateDynamic("debt")(debt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deposition_pending)) __obj.updateDynamic("deposition_pending")(deposition_pending.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hold)) __obj.updateDynamic("hold")(hold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Available]
  }
}

