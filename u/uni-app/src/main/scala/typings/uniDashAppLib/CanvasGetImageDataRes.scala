package typings
package uniDashAppLib

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
  var errMsg: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 图像数据矩形的高度
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * 图像数据矩形的宽度
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object CanvasGetImageDataRes {
  @scala.inline
  def apply(
    data: js.Array[_] = null,
    errMsg: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): CanvasGetImageDataRes = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasGetImageDataRes]
  }
}

