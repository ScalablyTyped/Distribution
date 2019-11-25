package typings.yandexDashMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NoPlacemark extends js.Object {
  var noPlacemark: js.UndefOr[Boolean] = js.undefined
}

object Anon_NoPlacemark {
  @scala.inline
  def apply(noPlacemark: js.UndefOr[Boolean] = js.undefined): Anon_NoPlacemark = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noPlacemark)) __obj.updateDynamic("noPlacemark")(noPlacemark.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NoPlacemark]
  }
}

