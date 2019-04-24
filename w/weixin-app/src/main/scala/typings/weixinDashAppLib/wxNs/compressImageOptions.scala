package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait compressImageOptions
  extends BaseOptions[js.Any, js.Any] {
   // 图片路径，图片的路径，可以是相对路径、临时文件路径、存储文件路径
  var quality: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * 图片的路径，可以是相对路径，临时文件路径，存储文件路径，网络图片路径
  		 */
  var src: java.lang.String
   // 默认值为80,压缩质量，范围0～100，数值越小，质量越低，压缩率越高（仅对jpg有效）。
  @JSName("success")
  def success_McompressImageOptions(tempFilePath: java.lang.String): scala.Unit
}

object compressImageOptions {
  @scala.inline
  def apply(
    src: java.lang.String,
    success: java.lang.String => scala.Unit,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    quality: scala.Int | scala.Double = null
  ): compressImageOptions = {
    val __obj = js.Dynamic.literal(src = src, success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[compressImageOptions]
  }
}

