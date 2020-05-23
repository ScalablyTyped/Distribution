package typings.wegameApi.wx.types

import typings.wegameApi.wegameApiStrings.jpg
import typings.wegameApi.wegameApiStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToTempFileSyncParams extends js.Object {
  /**
    * 目标文件的高度，会将截取的部分拉伸或压缩至该数值
    */
  var destHeight: js.UndefOr[Double] = js.undefined
  /**
    * 目标文件的宽度，会将截取的部分拉伸或压缩至该数值
    */
  var destWidth: js.UndefOr[Double] = js.undefined
  /**
    * 目标文件的类型
    */
  var fileType: js.UndefOr[jpg | png] = js.undefined
  /**
    * 截取 canvas 的高度
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * jpg图片的质量，仅当 fileType 为 jpg 时有效。取值范围为 0.0（最低）- 1.0（最高），不含 0。不在范围内时当作 1.0
    */
  var quality: js.UndefOr[Double] = js.undefined
  /**
    * 截取 canvas 的宽度
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * 截取 canvas 的左上角横坐标
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * 截取 canvas 的左上角纵坐标
    */
  var y: js.UndefOr[Double] = js.undefined
}

object ToTempFileSyncParams {
  @scala.inline
  def apply(
    destHeight: js.UndefOr[Double] = js.undefined,
    destWidth: js.UndefOr[Double] = js.undefined,
    fileType: jpg | png = null,
    height: js.UndefOr[Double] = js.undefined,
    quality: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): ToTempFileSyncParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(destHeight)) __obj.updateDynamic("destHeight")(destHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(destWidth)) __obj.updateDynamic("destWidth")(destWidth.get.asInstanceOf[js.Any])
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToTempFileSyncParams]
  }
}

