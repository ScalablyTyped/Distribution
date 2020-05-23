package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasGetImageDataRes extends js.Object {
  /**
    * 图像像素点数据，一维数组，每四项表示一个像素点的rgba
    */
  var data: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * 回调信息
    */
  var errMsg: js.UndefOr[String] = js.undefined
  /**
    * 图像数据矩形的高度
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * 图像数据矩形的宽度
    */
  var width: js.UndefOr[Double] = js.undefined
}

object CanvasGetImageDataRes {
  @scala.inline
  def apply(
    data: js.Array[_] = null,
    errMsg: String = null,
    height: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): CanvasGetImageDataRes = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasGetImageDataRes]
  }
}

