package typings
package xstateLib.esInterpreterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpawnOptions extends js.Object {
  var autoForward: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var sync: js.UndefOr[scala.Boolean] = js.undefined
}

object SpawnOptions {
  @scala.inline
  def apply(
    autoForward: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    sync: js.UndefOr[scala.Boolean] = js.undefined
  ): SpawnOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoForward)) __obj.updateDynamic("autoForward")(autoForward)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    __obj.asInstanceOf[SpawnOptions]
  }
}

