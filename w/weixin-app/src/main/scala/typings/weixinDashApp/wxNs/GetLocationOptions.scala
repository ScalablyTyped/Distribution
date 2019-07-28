package typings.weixinDashApp.wxNs

import typings.weixinDashApp.weixinDashAppStrings.gcj02
import typings.weixinDashApp.weixinDashAppStrings.wgs84
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLocationOptions
  extends BaseOptions[js.Any, js.Any] {
  var altitude: js.UndefOr[Boolean] = js.undefined
  /** 默认为 wgs84 返回 gps 坐标，gcj02 返回可用于wx.openLocation的坐标 */
  var `type`: js.UndefOr[wgs84 | gcj02] = js.undefined
   // 传入 true 会返回高度信息，由于获取高度需要较高精确度，会减慢接口返回速度
  /** 接口调用成功的回调函数，返回内容详见返回参数说明。 */
  @JSName("success")
  def success_MGetLocationOptions(res: LocationData): Unit
}

object GetLocationOptions {
  @scala.inline
  def apply(
    success: LocationData => Unit,
    altitude: js.UndefOr[Boolean] = js.undefined,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    `type`: wgs84 | gcj02 = null
  ): GetLocationOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLocationOptions]
  }
}

