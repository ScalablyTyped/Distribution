package typings.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressEventInit extends EventInit {
  var lengthComputable: js.UndefOr[Boolean] = js.undefined
  var loaded: js.UndefOr[Double] = js.undefined
  var total: js.UndefOr[Double] = js.undefined
}

object ProgressEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[Boolean] = js.undefined,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    lengthComputable: js.UndefOr[Boolean] = js.undefined,
    loaded: Int | Double = null,
    total: Int | Double = null
  ): ProgressEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(lengthComputable)) __obj.updateDynamic("lengthComputable")(lengthComputable.asInstanceOf[js.Any])
    if (loaded != null) __obj.updateDynamic("loaded")(loaded.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressEventInit]
  }
}

