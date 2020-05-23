package typings.yandexMaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selected extends js.Object {
  var selected: js.UndefOr[Boolean] = js.undefined
}

object Selected {
  @scala.inline
  def apply(selected: js.UndefOr[Boolean] = js.undefined): Selected = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selected]
  }
}

