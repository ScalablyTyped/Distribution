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
    success: js.Function1[js.Any, scala.Unit],
    cancel: js.Function0[scala.Unit] = null,
    complete: js.Function1[/* res */ js.UndefOr[js.Any], scala.Unit] = null,
    fail: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit] = null,
    isShowProgressTips: scala.Int | scala.Double = null
  ): UploadVoiceConfig = {
    val __obj = js.Dynamic.literal(localId = localId, success = success)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (isShowProgressTips != null) __obj.updateDynamic("isShowProgressTips")(isShowProgressTips.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadVoiceConfig]
  }
}

