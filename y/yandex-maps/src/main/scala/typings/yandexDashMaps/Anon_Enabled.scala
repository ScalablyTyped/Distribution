package typings.yandexDashMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enabled extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
}

object Anon_Enabled {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined): Anon_Enabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[Anon_Enabled]
  }
}

