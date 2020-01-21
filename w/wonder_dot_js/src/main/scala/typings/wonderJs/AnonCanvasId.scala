package typings.wonderJs

import typings.wonderJs.escreensizeMod.EScreenSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCanvasId extends js.Object {
  var canvasId: js.UndefOr[Null] = js.undefined
  var contextConfig: js.UndefOr[AnonOptions] = js.undefined
  var isTest: js.UndefOr[Boolean] = js.undefined
  var screenSize: js.UndefOr[EScreenSize] = js.undefined
  var useDevicePixelRatio: js.UndefOr[Boolean] = js.undefined
}

object AnonCanvasId {
  @scala.inline
  def apply(
    canvasId: js.UndefOr[scala.Nothing] = js.undefined,
    contextConfig: AnonOptions = null,
    isTest: js.UndefOr[Boolean] = js.undefined,
    screenSize: EScreenSize = null,
    useDevicePixelRatio: js.UndefOr[Boolean] = js.undefined
  ): AnonCanvasId = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canvasId)) __obj.updateDynamic("canvasId")(canvasId.asInstanceOf[js.Any])
    if (contextConfig != null) __obj.updateDynamic("contextConfig")(contextConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(isTest)) __obj.updateDynamic("isTest")(isTest.asInstanceOf[js.Any])
    if (screenSize != null) __obj.updateDynamic("screenSize")(screenSize.asInstanceOf[js.Any])
    if (!js.isUndefined(useDevicePixelRatio)) __obj.updateDynamic("useDevicePixelRatio")(useDevicePixelRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCanvasId]
  }
}

