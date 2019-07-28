package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompressImageOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function1[/* result */ CompressImageSuccessData, Unit]] = js.undefined
  /**
    * 压缩质量，范围0～100，数值越小，质量越低，压缩率越高（仅对jpg有效）
    */
  var quality: js.UndefOr[Double] = js.undefined
  /**
    * 图片路径，图片的路径，可以是相对路径、临时文件路径、存储文件路径
    */
  var src: js.UndefOr[String] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object CompressImageOptions {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    fail: /* result */ CompressImageSuccessData => Unit = null,
    quality: Int | Double = null,
    src: String = null,
    success: () => Unit = null
  ): CompressImageOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[CompressImageOptions]
  }
}

