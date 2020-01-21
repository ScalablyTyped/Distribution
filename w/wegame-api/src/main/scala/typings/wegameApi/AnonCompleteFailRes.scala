package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompleteFailRes extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ AnonResult, Unit]] = js.undefined
  /**
    * 今天已经玩游戏的时间，单位：秒
    */
  var todayPlayedTime: Double
}

object AnonCompleteFailRes {
  @scala.inline
  def apply(
    todayPlayedTime: Double,
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: /* res */ AnonResult => Unit = null
  ): AnonCompleteFailRes = {
    val __obj = js.Dynamic.literal(todayPlayedTime = todayPlayedTime.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[AnonCompleteFailRes]
  }
}

