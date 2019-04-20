package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompleteFailKeyListRes extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 要拉取的 key 列表
    */
  var keyList: js.Array[java.lang.String]
  /**
    * 群分享对应的 shareTicket
    */
  var shareTicket: java.lang.String
  var success: js.UndefOr[js.Function1[/* res */ Anon_DataReadonlyArrayUserGameData, scala.Unit]] = js.undefined
}

object Anon_CompleteFailKeyListRes {
  @scala.inline
  def apply(
    keyList: js.Array[java.lang.String],
    shareTicket: java.lang.String,
    complete: () => scala.Unit = null,
    fail: () => scala.Unit = null,
    success: /* res */ Anon_DataReadonlyArrayUserGameData => scala.Unit = null
  ): Anon_CompleteFailKeyListRes = {
    val __obj = js.Dynamic.literal(keyList = keyList, shareTicket = shareTicket)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[Anon_CompleteFailKeyListRes]
  }
}

