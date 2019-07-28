package typings.wegameDashApi.wxNs.typesNs

import typings.wegameDashApi.wegameDashApiStrings.jpg
import typings.wegameDashApi.wegameDashApiStrings.png
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
    destHeight: Int | Double = null,
    destWidth: Int | Double = null,
    fileType: jpg | png = null,
    height: Int | Double = null,
    quality: Int | Double = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): ToTempFileSyncParams = {
    val __obj = js.Dynamic.literal()
    if (destHeight != null) __obj.updateDynamic("destHeight")(destHeight.asInstanceOf[js.Any])
    if (destWidth != null) __obj.updateDynamic("destWidth")(destWidth.asInstanceOf[js.Any])
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToTempFileSyncParams]
  }
}

