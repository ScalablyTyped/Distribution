package typings.wegameApi.anon

import typings.wegameApi.wegameApiStrings.gcj02
import typings.wegameApi.wegameApiStrings.wgs84
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Altitude extends js.Object {
  /**
    * 传入 true 会返回高度信息，由于获取高度需要较高精确度，会减慢接口返回速度    >= 1.6.0
    */
  var altitude: js.UndefOr[Boolean] = js.undefined
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ Accuracy, Unit]] = js.undefined
  /**
    * wgs84 返回 gps 坐标，gcj02 返回可用于 wx.openLocation 的坐标
    */
  var `type`: js.UndefOr[wgs84 | gcj02] = js.undefined
}

object Altitude {
  @scala.inline
  def apply(
    altitude: js.UndefOr[Boolean] = js.undefined,
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: /* res */ Accuracy => Unit = null,
    `type`: wgs84 | gcj02 = null
  ): Altitude = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude.get.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Altitude]
  }
}

