package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLocationConfig extends WxBaseRequestConfig {
  /**
    * 默认为 wgs84 的 gps 坐标，如果要返回直接给 openLocation 用的火星坐标，可传入'gcj02'
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  @JSName("success")
  def success_MGetLocationConfig(res: Location): scala.Unit
}

object GetLocationConfig {
  @scala.inline
  def apply(
    success: js.Function1[Location, scala.Unit],
    cancel: js.Function0[scala.Unit] = null,
    complete: js.Function1[/* res */ js.UndefOr[js.Any], scala.Unit] = null,
    fail: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit] = null,
    `type`: java.lang.String = null
  ): GetLocationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("success")(success)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GetLocationConfig]
  }
}

