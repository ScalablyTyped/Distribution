package typings.testingbotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestLabData extends js.Object {
  var `test[cron]`: js.UndefOr[String] = js.undefined
  var `test[enabled]`: js.UndefOr[Boolean] = js.undefined
  var `test[name]`: js.UndefOr[String] = js.undefined
  var `test[url]`: js.UndefOr[String] = js.undefined
}

object TestLabData {
  @scala.inline
  def apply(
    `test[cron]`: String = null,
    `test[enabled]`: js.UndefOr[Boolean] = js.undefined,
    `test[name]`: String = null,
    `test[url]`: String = null
  ): TestLabData = {
    val __obj = js.Dynamic.literal()
    if (`test[cron]` != null) __obj.updateDynamic("test[cron]")(`test[cron]`.asInstanceOf[js.Any])
    if (!js.isUndefined(`test[enabled]`)) __obj.updateDynamic("test[enabled]")(`test[enabled]`.asInstanceOf[js.Any])
    if (`test[name]` != null) __obj.updateDynamic("test[name]")(`test[name]`.asInstanceOf[js.Any])
    if (`test[url]` != null) __obj.updateDynamic("test[url]")(`test[url]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestLabData]
  }
}

