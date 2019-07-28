package typings.yandexDashMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Selected extends js.Object {
  var selected: js.UndefOr[Boolean] = js.undefined
}

object Anon_Selected {
  @scala.inline
  def apply(selected: js.UndefOr[Boolean] = js.undefined): Anon_Selected = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[Anon_Selected]
  }
}

