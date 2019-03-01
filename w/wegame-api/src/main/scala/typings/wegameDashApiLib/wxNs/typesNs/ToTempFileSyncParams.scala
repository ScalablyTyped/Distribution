package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToTempFileSyncParams extends js.Object {
  /**
    * 目标文件的高度，会将截取的部分拉伸或压缩至该数值
    */
  var destHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * 目标文件的宽度，会将截取的部分拉伸或压缩至该数值
    */
  var destWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * 目标文件的类型
    */
  var fileType: js.UndefOr[
    wegameDashApiLib.wegameDashApiLibStrings.jpg | wegameDashApiLib.wegameDashApiLibStrings.png
  ] = js.undefined
  /**
    * 截取 canvas 的高度
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * jpg图片的质量，仅当 fileType 为 jpg 时有效。取值范围为 0.0（最低）- 1.0（最高），不含 0。不在范围内时当作 1.0
    */
  var quality: js.UndefOr[scala.Double] = js.undefined
  /**
    * 截取 canvas 的宽度
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
    * 截取 canvas 的左上角横坐标
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * 截取 canvas 的左上角纵坐标
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object ToTempFileSyncParams {
  @scala.inline
  def apply(
    destHeight: scala.Int | scala.Double = null,
    destWidth: scala.Int | scala.Double = null,
    fileType: wegameDashApiLib.wegameDashApiLibStrings.jpg | wegameDashApiLib.wegameDashApiLibStrings.png = null,
    height: scala.Int | scala.Double = null,
    quality: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
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

