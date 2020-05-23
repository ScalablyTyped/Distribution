package typings.webrtcAdapter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBrowserDetails extends js.Object {
  var browser: String
  var supportsUnifiedPlan: js.UndefOr[Boolean] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object IBrowserDetails {
  @scala.inline
  def apply(
    browser: String,
    supportsUnifiedPlan: js.UndefOr[Boolean] = js.undefined,
    version: js.UndefOr[Double] = js.undefined
  ): IBrowserDetails = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsUnifiedPlan)) __obj.updateDynamic("supportsUnifiedPlan")(supportsUnifiedPlan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBrowserDetails]
  }
}

