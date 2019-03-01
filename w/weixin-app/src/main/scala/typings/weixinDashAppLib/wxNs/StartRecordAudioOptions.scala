package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 媒体-----录音
trait StartRecordAudioOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 录音成功后调用，返回录音文件的临时文件路径，res = {tempFilePath: '录音文件的临时路径'} */
  @JSName("success")
  var success_StartRecordAudioOptions: js.UndefOr[js.Function1[/* res */ TempFileResponse, scala.Unit]] = js.undefined
}

object StartRecordAudioOptions {
  @scala.inline
  def apply(
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[/* res */ TempFileResponse, scala.Unit] = null
  ): StartRecordAudioOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[StartRecordAudioOptions]
  }
}

