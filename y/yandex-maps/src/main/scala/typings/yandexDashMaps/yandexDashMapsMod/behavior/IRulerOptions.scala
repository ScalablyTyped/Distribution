package typings.yandexDashMaps.yandexDashMapsMod.behavior

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRulerOptions extends js.Object {
  var balloonAutoPan: js.UndefOr[Boolean] = js.undefined
}

object IRulerOptions {
  @scala.inline
  def apply(balloonAutoPan: js.UndefOr[Boolean] = js.undefined): IRulerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(balloonAutoPan)) __obj.updateDynamic("balloonAutoPan")(balloonAutoPan.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRulerOptions]
  }
}

