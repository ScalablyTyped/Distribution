package typings.xstate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoForward extends js.Object {
  var autoForward: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var sync: js.UndefOr[Boolean] = js.undefined
}

object AutoForward {
  @scala.inline
  def apply(
    autoForward: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    sync: js.UndefOr[Boolean] = js.undefined
  ): AutoForward = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoForward)) __obj.updateDynamic("autoForward")(autoForward.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoForward]
  }
}

