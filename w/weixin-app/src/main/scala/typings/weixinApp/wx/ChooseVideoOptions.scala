package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 媒体-----视频
trait ChooseVideoOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 前置或者后置摄像头，默认为前后都有，即：['front', 'back'] */
  var camera: js.UndefOr[CameraDevice] = js.undefined
  /** 是否压缩所选的视频源文件，默认值为true，需要压缩 */
  var compressed: js.UndefOr[Boolean] = js.undefined
  /** 拍摄视频最长拍摄时间，单位秒。最长支持60秒 */
  var maxDuration: js.UndefOr[Double] = js.undefined
  /** album 从相册选视频，camera 使用相机拍摄，默认为：['album', 'camera'] */
  var sourceType: js.UndefOr[js.Array[VideoSourceType]] = js.undefined
  /** 接口调用成功，返回视频文件的临时文件路径，详见返回参数说明 */
  @JSName("success")
  var success_ChooseVideoOptions: js.UndefOr[js.Function1[/* res */ VideoData, Unit]] = js.undefined
}

object ChooseVideoOptions {
  @scala.inline
  def apply(
    camera: CameraDevice = null,
    complete: /* res */ js.Any => Unit = null,
    compressed: js.UndefOr[Boolean] = js.undefined,
    fail: js.Any => Unit = null,
    maxDuration: Int | Double = null,
    sourceType: js.Array[VideoSourceType] = null,
    success: /* res */ VideoData => Unit = null
  ): ChooseVideoOptions = {
    val __obj = js.Dynamic.literal()
    if (camera != null) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (!js.isUndefined(compressed)) __obj.updateDynamic("compressed")(compressed.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (maxDuration != null) __obj.updateDynamic("maxDuration")(maxDuration.asInstanceOf[js.Any])
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ChooseVideoOptions]
  }
}

