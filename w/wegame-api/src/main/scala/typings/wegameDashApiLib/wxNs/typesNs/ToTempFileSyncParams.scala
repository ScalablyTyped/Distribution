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

