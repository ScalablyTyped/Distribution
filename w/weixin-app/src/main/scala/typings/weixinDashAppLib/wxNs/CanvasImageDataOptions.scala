package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasImageDataOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 画布标识，传入 <canvas /> 的 canvas-id  */
  var canvasId: java.lang.String
  /** 将要被提取的图像数据矩形区域的高度 */
  var height: scala.Double
  /** 将要被提取的图像数据矩形区域的宽度 */
  var width: scala.Double
  /** 将要被提取的图像数据矩形区域的左上角 x 坐标 */
  var x: scala.Double
  /** 将要被提取的图像数据矩形区域的左上角 y 坐标 */
  var y: scala.Double
}

object CanvasImageDataOptions {
  @scala.inline
  def apply(
    canvasId: java.lang.String,
    height: scala.Double,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): CanvasImageDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canvasId")(canvasId)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[CanvasImageDataOptions]
  }
}

