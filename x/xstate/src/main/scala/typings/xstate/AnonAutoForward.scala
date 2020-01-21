package typings.xstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoForward extends js.Object {
  var autoForward: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var sync: js.UndefOr[Boolean] = js.undefined
}

object AnonAutoForward {
  @scala.inline
  def apply(
    autoForward: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    sync: js.UndefOr[Boolean] = js.undefined
  ): AnonAutoForward = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoForward)) __obj.updateDynamic("autoForward")(autoForward.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoForward]
  }
}

