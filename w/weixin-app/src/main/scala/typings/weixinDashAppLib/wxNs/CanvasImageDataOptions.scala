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
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    success: js.Any => scala.Unit = null
  ): CanvasImageDataOptions = {
    val __obj = js.Dynamic.literal(canvasId = canvasId, height = height, width = width, x = x, y = y)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[CanvasImageDataOptions]
  }
}

