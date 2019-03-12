package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLocalImgDataConfig extends WxBaseRequestConfig {
  /**
    * 图片的 localID
    */
  var localId: java.lang.String
  /**
    * 成功后的回调, localData是图片的base64数据，可以用img标签显示
    */
  @JSName("success")
  def success_MGetLocalImgDataConfig(res: wxDashJsDashSdkDashDtLib.Anon_LocalData): scala.Unit
}

object GetLocalImgDataConfig {
  @scala.inline
  def apply(
    localId: java.lang.String,
    success: wxDashJsDashSdkDashDtLib.Anon_LocalData => scala.Unit,
    cancel: () => scala.Unit = null,
    complete: /* res */ js.UndefOr[js.Any] => scala.Unit = null,
    fail: /* error */ js.UndefOr[js.Any] => scala.Unit = null
  ): GetLocalImgDataConfig = {
    val __obj = js.Dynamic.literal(localId = localId, success = js.Any.fromFunction1(success))
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[GetLocalImgDataConfig]
  }
}

