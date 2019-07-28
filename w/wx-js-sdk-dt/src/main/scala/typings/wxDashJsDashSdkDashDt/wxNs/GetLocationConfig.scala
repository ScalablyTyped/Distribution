package typings.wxDashJsDashSdkDashDt.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLocationConfig extends WxBaseRequestConfig {
  /**
    * 默认为 wgs84 的 gps 坐标，如果要返回直接给 openLocation 用的火星坐标，可传入'gcj02'
    */
  var `type`: js.UndefOr[String] = js.undefined
  @JSName("success")
  def success_MGetLocationConfig(res: Location): Unit
}

object GetLocationConfig {
  @scala.inline
  def apply(
    success: Location => Unit,
    cancel: () => Unit = null,
    complete: /* res */ js.UndefOr[js.Any] => Unit = null,
    fail: /* error */ js.UndefOr[js.Any] => Unit = null,
    `type`: String = null
  ): GetLocationConfig = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GetLocationConfig]
  }
}

