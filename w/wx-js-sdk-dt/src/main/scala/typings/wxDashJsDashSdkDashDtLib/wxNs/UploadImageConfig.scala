package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadImageConfig extends WxBaseRequestConfig {
  /**
    * 默认为1，显示进度提示
    */
  var isShowProgressTips: js.UndefOr[scala.Double] = js.undefined
  /**
    * 要上传的图片的本地 ID，由 chooseImage 接口获得
    */
  var localId: java.lang.String
  /**
    * res: var serverId = res.serverId;  返回图片的服务器端 ID
    */
  @JSName("success")
  def success_MUploadImageConfig(res: js.Any): scala.Unit
}

object UploadImageConfig {
  @scala.inline
  def apply(
    localId: java.lang.String,
    success: js.Any => scala.Unit,
    cancel: () => scala.Unit = null,
    complete: /* res */ js.UndefOr[js.Any] => scala.Unit = null,
    fail: /* error */ js.UndefOr[js.Any] => scala.Unit = null,
    isShowProgressTips: scala.Int | scala.Double = null
  ): UploadImageConfig = {
    val __obj = js.Dynamic.literal(localId = localId, success = js.Any.fromFunction1(success))
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (isShowProgressTips != null) __obj.updateDynamic("isShowProgressTips")(isShowProgressTips.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadImageConfig]
  }
}

