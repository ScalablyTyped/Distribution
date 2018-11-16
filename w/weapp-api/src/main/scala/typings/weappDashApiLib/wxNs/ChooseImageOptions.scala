package typings
package weappDashApiLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChooseImageOptions extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.undefined
  /** 最多可以选择的图片张数，默认9 */
  var count: js.UndefOr[scala.Double] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.undefined
  /** original 原图，compressed 压缩图，默认二者都有 */
  var sizeType: js.UndefOr[js.Array[ImageSizeType]] = js.undefined
  /** album 从相册选图，camera 使用相机，默认二者都有 */
  var sourceType: js.UndefOr[js.Array[ImageSourceType]] = js.undefined
  /** 成功则返回图片的本地文件路径列表 tempFilePaths */
  def success(res: TempFilesData): scala.Unit
}

