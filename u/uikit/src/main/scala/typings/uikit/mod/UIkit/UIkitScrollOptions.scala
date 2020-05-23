package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitScrollOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
}

object UIkitScrollOptions {
  @scala.inline
  def apply(duration: js.UndefOr[Double] = js.undefined, offset: js.UndefOr[Double] = js.undefined): UIkitScrollOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitScrollOptions]
  }
}

