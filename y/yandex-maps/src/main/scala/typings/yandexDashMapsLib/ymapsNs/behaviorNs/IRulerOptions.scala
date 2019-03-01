package typings
package yandexDashMapsLib.ymapsNs.behaviorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRulerOptions extends js.Object {
  var balloonAutoPan: js.UndefOr[scala.Boolean] = js.undefined
}

object IRulerOptions {
  @scala.inline
  def apply(balloonAutoPan: js.UndefOr[scala.Boolean] = js.undefined): IRulerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(balloonAutoPan)) __obj.updateDynamic("balloonAutoPan")(balloonAutoPan)
    __obj.asInstanceOf[IRulerOptions]
  }
}

