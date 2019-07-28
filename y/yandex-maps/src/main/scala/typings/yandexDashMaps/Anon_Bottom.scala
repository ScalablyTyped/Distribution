package typings.yandexDashMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  var bottom: js.UndefOr[Double | String] = js.undefined
  var left: js.UndefOr[Double | String] = js.undefined
  var right: js.UndefOr[Double | String] = js.undefined
  var top: js.UndefOr[Double | String] = js.undefined
}

object Anon_Bottom {
  @scala.inline
  def apply(
    bottom: Double | String = null,
    left: Double | String = null,
    right: Double | String = null,
    top: Double | String = null
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bottom]
  }
}

