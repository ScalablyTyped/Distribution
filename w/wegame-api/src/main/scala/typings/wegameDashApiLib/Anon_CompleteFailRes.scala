package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompleteFailRes extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ Anon_Result, scala.Unit]] = js.undefined
  /**
    * 今天已经玩游戏的时间，单位：秒
    */
  var todayPlayedTime: scala.Double
}

object Anon_CompleteFailRes {
  @scala.inline
  def apply(
    todayPlayedTime: scala.Double,
    complete: js.Function0[scala.Unit] = null,
    fail: js.Function0[scala.Unit] = null,
    success: js.Function1[/* res */ Anon_Result, scala.Unit] = null
  ): Anon_CompleteFailRes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("todayPlayedTime")(todayPlayedTime)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_CompleteFailRes]
  }
}

