package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadVoiceConfig extends WxBaseRequestConfig {
  /**
    * 默认为1，显示进度提示
    */
  var isShowProgressTips: js.UndefOr[scala.Double] = js.undefined
  /**
    * 需要下载的音频的服务器端 ID，由 uploadVoice 接口获得
    */
  var serverId: java.lang.String
  /**
    * 下载成功回调
    */
  @JSName("success")
  def success_MDownloadVoiceConfig(res: js.Any): scala.Unit
}

object DownloadVoiceConfig {
  @scala.inline
  def apply(
    serverId: java.lang.String,
    success: js.Function1[js.Any, scala.Unit],
    cancel: js.Function0[scala.Unit] = null,
    complete: js.Function1[/* res */ js.UndefOr[js.Any], scala.Unit] = null,
    fail: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit] = null,
    isShowProgressTips: scala.Int | scala.Double = null
  ): DownloadVoiceConfig = {
    val __obj = js.Dynamic.literal(serverId = serverId, success = success)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (isShowProgressTips != null) __obj.updateDynamic("isShowProgressTips")(isShowProgressTips.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadVoiceConfig]
  }
}

