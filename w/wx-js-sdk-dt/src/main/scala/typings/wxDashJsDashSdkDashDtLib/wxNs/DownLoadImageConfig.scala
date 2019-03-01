package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownLoadImageConfig extends WxBaseRequestConfig {
  var isShowProgressTips: js.UndefOr[scala.Double] = js.undefined
  /**
    * serverId: 需要下载的图片的服务器端ID，由 uploadImage 接口获得
    */
  var serverId: java.lang.String
  /**
    * var localId = res.localId;  返回图片下载后的本地 ID
    */
  @JSName("success")
  var success_DownLoadImageConfig: js.UndefOr[js.Function1[/* res */ wxDashJsDashSdkDashDtLib.Anon_LocalId, scala.Unit]] = js.undefined
}

object DownLoadImageConfig {
  @scala.inline
  def apply(
    serverId: java.lang.String,
    cancel: js.Function0[scala.Unit] = null,
    complete: js.Function1[/* res */ js.UndefOr[js.Any], scala.Unit] = null,
    fail: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit] = null,
    isShowProgressTips: scala.Int | scala.Double = null,
    success: js.Function1[/* res */ wxDashJsDashSdkDashDtLib.Anon_LocalId, scala.Unit] = null
  ): DownLoadImageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("serverId")(serverId)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (isShowProgressTips != null) __obj.updateDynamic("isShowProgressTips")(isShowProgressTips.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[DownLoadImageConfig]
  }
}

