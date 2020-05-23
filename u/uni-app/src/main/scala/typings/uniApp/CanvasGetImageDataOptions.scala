package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasGetImageDataOptions extends js.Object {
  /**
    * 画布标识，传入 <canvas/> 的 canvas-id
    */
  var canvasId: js.UndefOr[String] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 将要被提取的图像数据矩形区域的高度
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ CanvasGetImageDataRes, Unit]] = js.undefined
  /**
    * 将要被提取的图像数据矩形区域的宽度
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * 将要被提取的图像数据矩形区域的左上角 x 坐标
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * 将要被提取的图像数据矩形区域的左上角 y 坐标
    */
  var y: js.UndefOr[Double] = js.undefined
}

object CanvasGetImageDataOptions {
  @scala.inline
  def apply(
    canvasId: String = null,
    complete: () => Unit = null,
    fail: () => Unit = null,
    height: js.UndefOr[Double] = js.undefined,
    success: /* result */ CanvasGetImageDataRes => Unit = null,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): CanvasGetImageDataOptions = {
    val __obj = js.Dynamic.literal()
    if (canvasId != null) __obj.updateDynamic("canvasId")(canvasId.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasGetImageDataOptions]
  }
}

