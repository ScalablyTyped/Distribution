package typings.wonderDotJs

import typings.wonderDotJs.distEs2015DeviceEScreenSizeMod.EScreenSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanvasId extends js.Object {
  var canvasId: js.UndefOr[Null] = js.undefined
  var contextConfig: js.UndefOr[Anon_Options] = js.undefined
  var isTest: js.UndefOr[Boolean] = js.undefined
  var screenSize: js.UndefOr[EScreenSize] = js.undefined
  var useDevicePixelRatio: js.UndefOr[Boolean] = js.undefined
}

object Anon_CanvasId {
  @scala.inline
  def apply(
    canvasId: Null = null,
    contextConfig: Anon_Options = null,
    isTest: js.UndefOr[Boolean] = js.undefined,
    screenSize: EScreenSize = null,
    useDevicePixelRatio: js.UndefOr[Boolean] = js.undefined
  ): Anon_CanvasId = {
    val __obj = js.Dynamic.literal()
    if (canvasId != null) __obj.updateDynamic("canvasId")(canvasId.asInstanceOf[js.Any])
    if (contextConfig != null) __obj.updateDynamic("contextConfig")(contextConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(isTest)) __obj.updateDynamic("isTest")(isTest.asInstanceOf[js.Any])
    if (screenSize != null) __obj.updateDynamic("screenSize")(screenSize.asInstanceOf[js.Any])
    if (!js.isUndefined(useDevicePixelRatio)) __obj.updateDynamic("useDevicePixelRatio")(useDevicePixelRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CanvasId]
  }
}

