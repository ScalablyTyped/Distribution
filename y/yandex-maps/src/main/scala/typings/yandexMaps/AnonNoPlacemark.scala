package typings.yandexMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNoPlacemark extends js.Object {
  var noPlacemark: js.UndefOr[Boolean] = js.undefined
}

object AnonNoPlacemark {
  @scala.inline
  def apply(noPlacemark: js.UndefOr[Boolean] = js.undefined): AnonNoPlacemark = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noPlacemark)) __obj.updateDynamic("noPlacemark")(noPlacemark.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNoPlacemark]
  }
}

