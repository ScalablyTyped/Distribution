package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadVoiceConfig extends WxBaseRequestConfig {
  var isShowProgressTips: js.UndefOr[scala.Double] = js.undefined
  var localId: java.lang.String
  @JSName("success")
  def success_MUploadVoiceConfig(res: js.Any): scala.Unit
}

object UploadVoiceConfig {
  @scala.inline
  def apply(
    localId: java.lang.String,
    success: js.Any => scala.Unit,
    cancel: () => scala.Unit = null,
    complete: /* res */ js.UndefOr[js.Any] => scala.Unit = null,
    fail: /* error */ js.UndefOr[js.Any] => scala.Unit = null,
    isShowProgressTips: scala.Int | scala.Double = null
  ): UploadVoiceConfig = {
    val __obj = js.Dynamic.literal(localId = localId, success = js.Any.fromFunction1(success))
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (isShowProgressTips != null) __obj.updateDynamic("isShowProgressTips")(isShowProgressTips.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadVoiceConfig]
  }
}

