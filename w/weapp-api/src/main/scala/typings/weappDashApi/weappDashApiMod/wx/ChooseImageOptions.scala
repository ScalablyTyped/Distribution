package typings.weappDashApi.weappDashApiMod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseImageOptions extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.undefined
  /** 最多可以选择的图片张数，默认9 */
  var count: js.UndefOr[Double] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.undefined
  /** original 原图，compressed 压缩图，默认二者都有 */
  var sizeType: js.UndefOr[js.Array[ImageSizeType]] = js.undefined
  /** album 从相册选图，camera 使用相机，默认二者都有 */
  var sourceType: js.UndefOr[js.Array[ImageSourceType]] = js.undefined
  /** 成功则返回图片的本地文件路径列表 tempFilePaths */
  def success(res: TempFilesData): Unit
}

object ChooseImageOptions {
  @scala.inline
  def apply(
    success: TempFilesData => Unit,
    complete: /* res */ js.Any => Unit = null,
    count: Int | Double = null,
    fail: /* res */ js.Any => Unit = null,
    sizeType: js.Array[ImageSizeType] = null,
    sourceType: js.Array[ImageSourceType] = null
  ): ChooseImageOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (sizeType != null) __obj.updateDynamic("sizeType")(sizeType)
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType)
    __obj.asInstanceOf[ChooseImageOptions]
  }
}

