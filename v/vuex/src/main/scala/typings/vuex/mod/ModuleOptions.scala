package typings.vuex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleOptions extends js.Object {
  var preserveState: js.UndefOr[Boolean] = js.undefined
}

object ModuleOptions {
  @scala.inline
  def apply(preserveState: js.UndefOr[Boolean] = js.undefined): ModuleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preserveState)) __obj.updateDynamic("preserveState")(preserveState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleOptions]
  }
}

