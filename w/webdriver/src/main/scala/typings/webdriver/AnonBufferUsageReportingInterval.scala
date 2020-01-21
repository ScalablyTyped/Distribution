package typings.webdriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferUsageReportingInterval extends js.Object {
  var bufferUsageReportingInterval: js.UndefOr[Boolean] = js.undefined
  var enableNetwork: js.UndefOr[Boolean] = js.undefined
  var enablePage: js.UndefOr[Boolean] = js.undefined
  var enableTimeline: js.UndefOr[Boolean] = js.undefined
  var tracingCategories: js.UndefOr[Boolean] = js.undefined
}

object AnonBufferUsageReportingInterval {
  @scala.inline
  def apply(
    bufferUsageReportingInterval: js.UndefOr[Boolean] = js.undefined,
    enableNetwork: js.UndefOr[Boolean] = js.undefined,
    enablePage: js.UndefOr[Boolean] = js.undefined,
    enableTimeline: js.UndefOr[Boolean] = js.undefined,
    tracingCategories: js.UndefOr[Boolean] = js.undefined
  ): AnonBufferUsageReportingInterval = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bufferUsageReportingInterval)) __obj.updateDynamic("bufferUsageReportingInterval")(bufferUsageReportingInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(enableNetwork)) __obj.updateDynamic("enableNetwork")(enableNetwork.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePage)) __obj.updateDynamic("enablePage")(enablePage.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTimeline)) __obj.updateDynamic("enableTimeline")(enableTimeline.asInstanceOf[js.Any])
    if (!js.isUndefined(tracingCategories)) __obj.updateDynamic("tracingCategories")(tracingCategories.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBufferUsageReportingInterval]
  }
}

