package typings.wxJsSdkDt.wx

import typings.wxJsSdkDt.anon.LocalId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownLoadImageConfig extends WxBaseRequestConfig {
  var isShowProgressTips: js.UndefOr[Double] = js.undefined
  /**
    * serverId: 需要下载的图片的服务器端ID，由 uploadImage 接口获得
    */
  var serverId: String
  /**
    * var localId = res.localId;  返回图片下载后的本地 ID
    */
  @JSName("success")
  var success_DownLoadImageConfig: js.UndefOr[js.Function1[/* res */ LocalId, Unit]] = js.undefined
}

object DownLoadImageConfig {
  @scala.inline
  def apply(
    serverId: String,
    cancel: () => Unit = null,
    complete: /* res */ js.UndefOr[js.Any] => Unit = null,
    fail: /* error */ js.UndefOr[js.Any] => Unit = null,
    isShowProgressTips: js.UndefOr[Double] = js.undefined,
    success: /* res */ LocalId => Unit = null
  ): DownLoadImageConfig = {
    val __obj = js.Dynamic.literal(serverId = serverId.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (!js.isUndefined(isShowProgressTips)) __obj.updateDynamic("isShowProgressTips")(isShowProgressTips.get.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[DownLoadImageConfig]
  }
}

