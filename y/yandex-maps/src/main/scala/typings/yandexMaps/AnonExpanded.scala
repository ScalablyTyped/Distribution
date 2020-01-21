package typings.yandexMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpanded extends js.Object {
  var expanded: js.UndefOr[Boolean] = js.undefined
}

object AnonExpanded {
  @scala.inline
  def apply(expanded: js.UndefOr[Boolean] = js.undefined): AnonExpanded = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpanded]
  }
}

