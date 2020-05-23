package typings.vue.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchOptions extends js.Object {
  var deep: js.UndefOr[Boolean] = js.undefined
  var immediate: js.UndefOr[Boolean] = js.undefined
}

object WatchOptions {
  @scala.inline
  def apply(deep: js.UndefOr[Boolean] = js.undefined, immediate: js.UndefOr[Boolean] = js.undefined): WatchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchOptions]
  }
}

