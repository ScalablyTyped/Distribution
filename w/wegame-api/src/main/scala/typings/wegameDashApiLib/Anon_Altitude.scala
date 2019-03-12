package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Altitude extends js.Object {
  /**
    * 传入 true 会返回高度信息，由于获取高度需要较高精确度，会减慢接口返回速度	>= 1.6.0
    */
  var altitude: js.UndefOr[scala.Boolean] = js.undefined
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ Anon_Accuracy, scala.Unit]] = js.undefined
  /**
    * wgs84 返回 gps 坐标，gcj02 返回可用于 wx.openLocation 的坐标
    */
  var `type`: js.UndefOr[
    wegameDashApiLib.wegameDashApiLibStrings.wgs84 | wegameDashApiLib.wegameDashApiLibStrings.gcj02
  ] = js.undefined
}

object Anon_Altitude {
  @scala.inline
  def apply(
    altitude: js.UndefOr[scala.Boolean] = js.undefined,
    complete: () => scala.Unit = null,
    fail: () => scala.Unit = null,
    success: /* res */ Anon_Accuracy => scala.Unit = null,
    `type`: wegameDashApiLib.wegameDashApiLibStrings.wgs84 | wegameDashApiLib.wegameDashApiLibStrings.gcj02 = null
  ): Anon_Altitude = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Altitude]
  }
}

