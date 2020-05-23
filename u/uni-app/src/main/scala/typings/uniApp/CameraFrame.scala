package typings.uniApp

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraFrame extends js.Object {
  /**
    * 图像像素点数据，一维数组，每四项表示一个像素点的 rgba
    */
  var data: js.UndefOr[ArrayBuffer] = js.undefined
  /**
    * 图像数据矩形的高度
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * 图像数据矩形的宽度
    */
  var width: js.UndefOr[Double] = js.undefined
}

object CameraFrame {
  @scala.inline
  def apply(
    data: ArrayBuffer = null,
    height: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): CameraFrame = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraFrame]
  }
}

