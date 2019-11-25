package typings.superagent.superagentMod

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
    percent: Int | Double = null,
    total: Int | Double = null
  ): ProgressEvent = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressEvent]
  }
}

