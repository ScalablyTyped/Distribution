package typings.xstate.esInterpreterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpawnOptions extends js.Object {
  var autoForward: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var sync: js.UndefOr[Boolean] = js.undefined
}

object SpawnOptions {
  @scala.inline
  def apply(
    autoForward: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    sync: js.UndefOr[Boolean] = js.undefined
  ): SpawnOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoForward)) __obj.updateDynamic("autoForward")(autoForward.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpawnOptions]
  }
}

