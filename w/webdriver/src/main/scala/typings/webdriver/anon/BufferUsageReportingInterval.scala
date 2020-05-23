package typings.webdriver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferUsageReportingInterval extends js.Object {
  var bufferUsageReportingInterval: js.UndefOr[Boolean] = js.undefined
  var enableNetwork: js.UndefOr[Boolean] = js.undefined
  var enablePage: js.UndefOr[Boolean] = js.undefined
  var enableTimeline: js.UndefOr[Boolean] = js.undefined
  var tracingCategories: js.UndefOr[Boolean] = js.undefined
}

object BufferUsageReportingInterval {
  @scala.inline
  def apply(
    bufferUsageReportingInterval: js.UndefOr[Boolean] = js.undefined,
    enableNetwork: js.UndefOr[Boolean] = js.undefined,
    enablePage: js.UndefOr[Boolean] = js.undefined,
    enableTimeline: js.UndefOr[Boolean] = js.undefined,
    tracingCategories: js.UndefOr[Boolean] = js.undefined
  ): BufferUsageReportingInterval = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bufferUsageReportingInterval)) __obj.updateDynamic("bufferUsageReportingInterval")(bufferUsageReportingInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableNetwork)) __obj.updateDynamic("enableNetwork")(enableNetwork.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePage)) __obj.updateDynamic("enablePage")(enablePage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTimeline)) __obj.updateDynamic("enableTimeline")(enableTimeline.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tracingCategories)) __obj.updateDynamic("tracingCategories")(tracingCategories.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferUsageReportingInterval]
  }
}

