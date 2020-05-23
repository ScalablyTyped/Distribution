package typings.weixinApp.wx

import typings.weixinApp.weixinAppStrings.gcj02
import typings.weixinApp.weixinAppStrings.wgs84
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLocationOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 传入 true 会返回高度信息，由于获取高度需要较高精确度，会减慢接口返回速度 */
  var altitude: js.UndefOr[Boolean] = js.undefined
  /** 高精度定位超时时间(ms)，指定时间内返回最高精度，该值3000ms以上高精度定位才有效果 */
  var highAccuracyExpireTime: js.UndefOr[Double] = js.undefined
  /** 开启高精度定位 */
  var isHighAccuracy: js.UndefOr[Boolean] = js.undefined
  /** 默认为 wgs84 返回 gps 坐标，gcj02 返回可用于wx.openLocation的坐标 */
  var `type`: js.UndefOr[wgs84 | gcj02] = js.undefined
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
    highAccuracyExpireTime: js.UndefOr[Double] = js.undefined,
    isHighAccuracy: js.UndefOr[Boolean] = js.undefined,
    `type`: wgs84 | gcj02 = null
  ): GetLocationOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude.get.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (!js.isUndefined(highAccuracyExpireTime)) __obj.updateDynamic("highAccuracyExpireTime")(highAccuracyExpireTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isHighAccuracy)) __obj.updateDynamic("isHighAccuracy")(isHighAccuracy.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLocationOptions]
  }
}

