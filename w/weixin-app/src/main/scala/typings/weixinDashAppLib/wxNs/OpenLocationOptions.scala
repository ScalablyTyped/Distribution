package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 位置-----查看位置
trait OpenLocationOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 地址的详细说明 */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /** 纬度，范围为-90~90，负数表示南纬 */
  var latitude: scala.Double
  /** 经度，范围为-180~180，负数表示西经 */
  var longitude: scala.Double
  /** 位置名 */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** 缩放比例，范围1~28，默认为28 */
  var scale: js.UndefOr[scala.Double] = js.undefined
}

object OpenLocationOptions {
  @scala.inline
  def apply(
    latitude: scala.Double,
    longitude: scala.Double,
    address: java.lang.String = null,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    name: java.lang.String = null,
    scale: scala.Int | scala.Double = null,
    success: js.Any => scala.Unit = null
  ): OpenLocationOptions = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude)
    if (address != null) __obj.updateDynamic("address")(address)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (name != null) __obj.updateDynamic("name")(name)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[OpenLocationOptions]
  }
}

