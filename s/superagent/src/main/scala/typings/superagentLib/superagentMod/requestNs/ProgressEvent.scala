package typings
package superagentLib.superagentMod.requestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressEvent extends js.Object {
  var direction: superagentLib.superagentLibStrings.download | superagentLib.superagentLibStrings.upload
  var loaded: scala.Double
  var percent: js.UndefOr[scala.Double] = js.undefined
  var total: js.UndefOr[scala.Double] = js.undefined
}

object ProgressEvent {
  @scala.inline
  def apply(
    direction: superagentLib.superagentLibStrings.download | superagentLib.superagentLibStrings.upload,
    loaded: scala.Double,
    percent: scala.Int | scala.Double = null,
    total: scala.Int | scala.Double = null
  ): ProgressEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.updateDynamic("loaded")(loaded)
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressEvent]
  }
}

