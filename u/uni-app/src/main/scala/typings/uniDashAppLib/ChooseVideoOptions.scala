package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseVideoOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 是否压缩所选的视频源文件，默认值为true，需要压缩
    */
  var compressed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 拍摄视频最长拍摄时间，单位秒。最长支持 60 秒
    */
  var maxDuration: js.UndefOr[scala.Double] = js.undefined
  /**
    * album 从相册选视频，camera 使用相机拍摄，默认为：['album', 'camera']
    */
  var sourceType: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
  /**
    * 接口调用成功，返回视频文件的临时文件路径，详见返回参数说明
    */
  var success: js.UndefOr[js.Function1[/* result */ ChooseVideoSuccess, scala.Unit]] = js.undefined
}

object ChooseVideoOptions {
  @scala.inline
  def apply(
    complete: () => scala.Unit = null,
    compressed: js.UndefOr[scala.Boolean] = js.undefined,
    fail: () => scala.Unit = null,
    maxDuration: scala.Int | scala.Double = null,
    sourceType: java.lang.String | js.Array[_] = null,
    success: /* result */ ChooseVideoSuccess => scala.Unit = null
  ): ChooseVideoOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (!js.isUndefined(compressed)) __obj.updateDynamic("compressed")(compressed)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (maxDuration != null) __obj.updateDynamic("maxDuration")(maxDuration.asInstanceOf[js.Any])
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ChooseVideoOptions]
  }
}

