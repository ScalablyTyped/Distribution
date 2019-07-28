package typings.webdriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferUsageReportingInterval extends js.Object {
  var bufferUsageReportingInterval: js.UndefOr[Boolean] = js.undefined
  var enableNetwork: js.UndefOr[Boolean] = js.undefined
  var enablePage: js.UndefOr[Boolean] = js.undefined
  var enableTimeline: js.UndefOr[Boolean] = js.undefined
  var tracingCategories: js.UndefOr[Boolean] = js.undefined
}

object Anon_BufferUsageReportingInterval {
  @scala.inline
  def apply(
    bufferUsageReportingInterval: js.UndefOr[Boolean] = js.undefined,
    enableNetwork: js.UndefOr[Boolean] = js.undefined,
    enablePage: js.UndefOr[Boolean] = js.undefined,
    enableTimeline: js.UndefOr[Boolean] = js.undefined,
    tracingCategories: js.UndefOr[Boolean] = js.undefined
  ): Anon_BufferUsageReportingInterval = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bufferUsageReportingInterval)) __obj.updateDynamic("bufferUsageReportingInterval")(bufferUsageReportingInterval)
    if (!js.isUndefined(enableNetwork)) __obj.updateDynamic("enableNetwork")(enableNetwork)
    if (!js.isUndefined(enablePage)) __obj.updateDynamic("enablePage")(enablePage)
    if (!js.isUndefined(enableTimeline)) __obj.updateDynamic("enableTimeline")(enableTimeline)
    if (!js.isUndefined(tracingCategories)) __obj.updateDynamic("tracingCategories")(tracingCategories)
    __obj.asInstanceOf[Anon_BufferUsageReportingInterval]
  }
}

