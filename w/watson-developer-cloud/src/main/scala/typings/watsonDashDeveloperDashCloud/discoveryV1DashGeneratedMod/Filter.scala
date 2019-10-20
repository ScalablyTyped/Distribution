package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Filter. */
trait Filter extends js.Object {
  /** The match the aggregated results queried for. */
  var `match`: js.UndefOr[String] = js.undefined
}

object Filter {
  @scala.inline
  def apply(`match`: String = null): Filter = {
    val __obj = js.Dynamic.literal()
    if (`match` != null) __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[Filter]
  }
}

