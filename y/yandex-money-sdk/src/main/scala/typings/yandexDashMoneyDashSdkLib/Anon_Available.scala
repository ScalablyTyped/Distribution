package typings
package yandexDashMoneyDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Available extends js.Object {
  var available: scala.Double
  var blocked: js.UndefOr[scala.Double] = js.undefined
  var debt: js.UndefOr[scala.Double] = js.undefined
  var deposition_pending: js.UndefOr[scala.Double] = js.undefined
  var hold: js.UndefOr[scala.Double] = js.undefined
  var total: scala.Double
}

object Anon_Available {
  @scala.inline
  def apply(
    available: scala.Double,
    total: scala.Double,
    blocked: scala.Int | scala.Double = null,
    debt: scala.Int | scala.Double = null,
    deposition_pending: scala.Int | scala.Double = null,
    hold: scala.Int | scala.Double = null
  ): Anon_Available = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("available")(available)
    __obj.updateDynamic("total")(total)
    if (blocked != null) __obj.updateDynamic("blocked")(blocked.asInstanceOf[js.Any])
    if (debt != null) __obj.updateDynamic("debt")(debt.asInstanceOf[js.Any])
    if (deposition_pending != null) __obj.updateDynamic("deposition_pending")(deposition_pending.asInstanceOf[js.Any])
    if (hold != null) __obj.updateDynamic("hold")(hold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Available]
  }
}

