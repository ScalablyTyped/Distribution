package typings
package threeLib.threeDashCanvasrendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasRendererParameters extends js.Object {
  var alpha: js.UndefOr[scala.Boolean] = js.undefined
  var canvas: js.UndefOr[stdLib.HTMLCanvasElement] = js.undefined
  var devicePixelRatio: js.UndefOr[scala.Double] = js.undefined
}

object CanvasRendererParameters {
  @scala.inline
  def apply(
    alpha: js.UndefOr[scala.Boolean] = js.undefined,
    canvas: stdLib.HTMLCanvasElement = null,
    devicePixelRatio: scala.Int | scala.Double = null
  ): CanvasRendererParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha)
    if (canvas != null) __obj.updateDynamic("canvas")(canvas)
    if (devicePixelRatio != null) __obj.updateDynamic("devicePixelRatio")(devicePixelRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasRendererParameters]
  }
}

