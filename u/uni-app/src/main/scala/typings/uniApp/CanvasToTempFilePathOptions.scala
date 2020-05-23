package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasToTempFilePathOptions extends js.Object {
  /**
    * 画布标识，传入 <canvas/> 的 canvas-id
    */
  var canvasId: js.UndefOr[String] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 输出图片高度（默认为 height * 屏幕像素密度）
    */
  var destHeight: js.UndefOr[Double] = js.undefined
  /**
    * 输出图片宽度（默认为 width * 屏幕像素密度）
    */
  var destWidth: js.UndefOr[Double] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 目标文件的类型，默认为 'png'
    */
  var fileType: js.UndefOr[String] = js.undefined
  /**
    * 画布高度（默认为canvas高度-y）
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * 图片的质量，取值范围为 (0, 1]，不在范围内时当作1.0处理
    */
  var quality: js.UndefOr[Double] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ CanvasToTempFilePathRes, Unit]] = js.undefined
  /**
    * 画布宽度（默认为canvas宽度-x）
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * 画布x轴起点（默认0）
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * 画布y轴起点（默认0）
    */
  var y: js.UndefOr[Double] = js.undefined
}

object CanvasToTempFilePathOptions {
  @scala.inline
  def apply(
    canvasId: String = null,
    complete: () => Unit = null,
    destHeight: js.UndefOr[Double] = js.undefined,
    destWidth: js.UndefOr[Double] = js.undefined,
    fail: () => Unit = null,
    fileType: String = null,
    height: js.UndefOr[Double] = js.undefined,
    quality: js.UndefOr[Double] = js.undefined,
    success: /* result */ CanvasToTempFilePathRes => Unit = null,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): CanvasToTempFilePathOptions = {
    val __obj = js.Dynamic.literal()
    if (canvasId != null) __obj.updateDynamic("canvasId")(canvasId.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (!js.isUndefined(destHeight)) __obj.updateDynamic("destHeight")(destHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(destWidth)) __obj.updateDynamic("destWidth")(destWidth.get.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasToTempFilePathOptions]
  }
}

