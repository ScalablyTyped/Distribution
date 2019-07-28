package typings.whatwgDashStreams.whatwgDashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeOptions extends js.Object {
  var preventAbort: js.UndefOr[Boolean] = js.undefined
  var preventCancel: js.UndefOr[Boolean] = js.undefined
  var preventClose: js.UndefOr[Boolean] = js.undefined
}

object PipeOptions {
  @scala.inline
  def apply(
    preventAbort: js.UndefOr[Boolean] = js.undefined,
    preventCancel: js.UndefOr[Boolean] = js.undefined,
    preventClose: js.UndefOr[Boolean] = js.undefined
  ): PipeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preventAbort)) __obj.updateDynamic("preventAbort")(preventAbort)
    if (!js.isUndefined(preventCancel)) __obj.updateDynamic("preventCancel")(preventCancel)
    if (!js.isUndefined(preventClose)) __obj.updateDynamic("preventClose")(preventClose)
    __obj.asInstanceOf[PipeOptions]
  }
}

