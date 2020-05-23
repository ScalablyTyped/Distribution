package typings.wonderJs.anon

import typings.wonderJs.escreensizeMod.EScreenSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasId extends js.Object {
  var canvasId: js.UndefOr[Null] = js.undefined
  var contextConfig: js.UndefOr[Options] = js.undefined
  var isTest: js.UndefOr[Boolean] = js.undefined
  var screenSize: js.UndefOr[EScreenSize] = js.undefined
  var useDevicePixelRatio: js.UndefOr[Boolean] = js.undefined
}

object CanvasId {
  @scala.inline
  def apply(
    contextConfig: Options = null,
    isTest: js.UndefOr[Boolean] = js.undefined,
    screenSize: EScreenSize = null,
    useDevicePixelRatio: js.UndefOr[Boolean] = js.undefined
  ): CanvasId = {
    val __obj = js.Dynamic.literal()
    if (contextConfig != null) __obj.updateDynamic("contextConfig")(contextConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(isTest)) __obj.updateDynamic("isTest")(isTest.get.asInstanceOf[js.Any])
    if (screenSize != null) __obj.updateDynamic("screenSize")(screenSize.asInstanceOf[js.Any])
    if (!js.isUndefined(useDevicePixelRatio)) __obj.updateDynamic("useDevicePixelRatio")(useDevicePixelRatio.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasId]
  }
}

