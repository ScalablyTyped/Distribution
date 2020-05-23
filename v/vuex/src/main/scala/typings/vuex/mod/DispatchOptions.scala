package typings.vuex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DispatchOptions extends js.Object {
  var root: js.UndefOr[Boolean] = js.undefined
}

object DispatchOptions {
  @scala.inline
  def apply(root: js.UndefOr[Boolean] = js.undefined): DispatchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatchOptions]
  }
}

