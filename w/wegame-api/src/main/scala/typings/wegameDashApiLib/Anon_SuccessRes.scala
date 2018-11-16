package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_SuccessRes extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ Anon_Result, scala.Unit]] = js.undefined
  /**
           * 今天已经玩游戏的时间，单位：秒
           */
  var todayPlayedTime: scala.Double
}

