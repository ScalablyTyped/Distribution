package typings.wxDashJsDashSdkDashDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadVoiceConfig extends WxBaseRequestConfig {
  var isShowProgressTips: js.UndefOr[Double] = js.undefined
  var localId: String
  @JSName("success")
  def success_MUploadVoiceConfig(res: js.Any): Unit
}

object UploadVoiceConfig {
  @scala.inline
  def apply(
    localId: String,
    success: js.Any => Unit,
    cancel: () => Unit = null,
    complete: /* res */ js.UndefOr[js.Any] => Unit = null,
    fail: /* error */ js.UndefOr[js.Any] => Unit = null,
    isShowProgressTips: Int | Double = null
  ): UploadVoiceConfig = {
    val __obj = js.Dynamic.literal(localId = localId, success = js.Any.fromFunction1(success))
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (isShowProgressTips != null) __obj.updateDynamic("isShowProgressTips")(isShowProgressTips.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadVoiceConfig]
  }
}

