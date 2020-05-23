package typings.superagent.mod

import typings.superagent.superagentStrings.download
import typings.superagent.superagentStrings.upload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressEvent extends js.Object {
  var direction: download | upload
  var loaded: Double
  var percent: js.UndefOr[Double] = js.undefined
  var total: js.UndefOr[Double] = js.undefined
}

object ProgressEvent {
  @scala.inline
  def apply(
    direction: download | upload,
    loaded: Double,
    percent: js.UndefOr[Double] = js.undefined,
    total: js.UndefOr[Double] = js.undefined
  ): ProgressEvent = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any])
    if (!js.isUndefined(percent)) __obj.updateDynamic("percent")(percent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressEvent]
  }
}

