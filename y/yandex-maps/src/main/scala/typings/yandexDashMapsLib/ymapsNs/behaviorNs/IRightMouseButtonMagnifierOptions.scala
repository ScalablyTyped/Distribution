package typings
package yandexDashMapsLib.ymapsNs.behaviorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRightMouseButtonMagnifierOptions extends js.Object {
  var actionCursor: js.UndefOr[java.lang.String] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
}

object IRightMouseButtonMagnifierOptions {
  @scala.inline
  def apply(actionCursor: java.lang.String = null, duration: scala.Int | scala.Double = null): IRightMouseButtonMagnifierOptions = {
    val __obj = js.Dynamic.literal()
    if (actionCursor != null) __obj.updateDynamic("actionCursor")(actionCursor)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRightMouseButtonMagnifierOptions]
  }
}

