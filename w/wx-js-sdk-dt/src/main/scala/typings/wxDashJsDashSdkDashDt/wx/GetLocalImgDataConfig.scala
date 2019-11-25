package typings.wxDashJsDashSdkDashDt.wx

import typings.wxDashJsDashSdkDashDt.Anon_LocalData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLocalImgDataConfig extends WxBaseRequestConfig {
  /**
    * 图片的 localID
    */
  var localId: String
  /**
    * 成功后的回调, localData是图片的base64数据，可以用img标签显示
    */
  @JSName("success")
  def success_MGetLocalImgDataConfig(res: Anon_LocalData): Unit
}

object GetLocalImgDataConfig {
  @scala.inline
  def apply(
    localId: String,
    success: Anon_LocalData => Unit,
    cancel: () => Unit = null,
    complete: /* res */ js.UndefOr[js.Any] => Unit = null,
    fail: /* error */ js.UndefOr[js.Any] => Unit = null
  ): GetLocalImgDataConfig = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[GetLocalImgDataConfig]
  }
}

