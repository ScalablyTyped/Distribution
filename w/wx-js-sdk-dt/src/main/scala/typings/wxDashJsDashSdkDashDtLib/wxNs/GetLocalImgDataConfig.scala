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
    success: js.Function1[wxDashJsDashSdkDashDtLib.Anon_LocalData, scala.Unit],
    cancel: js.Function0[scala.Unit] = null,
    complete: js.Function1[/* res */ js.UndefOr[js.Any], scala.Unit] = null,
    fail: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit] = null
  ): GetLocalImgDataConfig = {
    val __obj = js.Dynamic.literal(localId = localId, success = success)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[GetLocalImgDataConfig]
  }
}

