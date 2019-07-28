package typings.twoDotJs.twoDotJsMod

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
    height: Int | Double = null,
    ratio: Int | Double = null,
    `type`: Types = null,
    width: Int | Double = null
  ): ConstructorParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autostart)) __obj.updateDynamic("autostart")(autostart)
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorParams]
  }
}

