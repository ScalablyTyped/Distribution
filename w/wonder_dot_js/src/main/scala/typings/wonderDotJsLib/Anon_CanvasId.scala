package typings
package wonderDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanvasId extends js.Object {
  var canvasId: js.UndefOr[scala.Null] = js.undefined
  var contextConfig: js.UndefOr[Anon_Options] = js.undefined
  var isTest: js.UndefOr[scala.Boolean] = js.undefined
  var screenSize: js.UndefOr[wonderDotJsLib.distEs2015DeviceEScreenSizeMod.EScreenSize] = js.undefined
  var useDevicePixelRatio: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_CanvasId {
  @scala.inline
  def apply(
    canvasId: scala.Null = null,
    contextConfig: Anon_Options = null,
    isTest: js.UndefOr[scala.Boolean] = js.undefined,
    screenSize: wonderDotJsLib.distEs2015DeviceEScreenSizeMod.EScreenSize = null,
    useDevicePixelRatio: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CanvasId = {
    val __obj = js.Dynamic.literal()
    if (canvasId != null) __obj.updateDynamic("canvasId")(canvasId)
    if (contextConfig != null) __obj.updateDynamic("contextConfig")(contextConfig)
    if (!js.isUndefined(isTest)) __obj.updateDynamic("isTest")(isTest)
    if (screenSize != null) __obj.updateDynamic("screenSize")(screenSize)
    if (!js.isUndefined(useDevicePixelRatio)) __obj.updateDynamic("useDevicePixelRatio")(useDevicePixelRatio)
    __obj.asInstanceOf[Anon_CanvasId]
  }
}

