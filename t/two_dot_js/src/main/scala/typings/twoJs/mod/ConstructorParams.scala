package typings.twoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorParams extends js.Object {
  var autostart: js.UndefOr[Boolean] = js.undefined
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var ratio: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[Types] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ConstructorParams {
  @scala.inline
  def apply(
    autostart: js.UndefOr[Boolean] = js.undefined,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    ratio: js.UndefOr[Double] = js.undefined,
    `type`: Types = null,
    width: js.UndefOr[Double] = js.undefined
  ): ConstructorParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autostart)) __obj.updateDynamic("autostart")(autostart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ratio)) __obj.updateDynamic("ratio")(ratio.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorParams]
  }
}

