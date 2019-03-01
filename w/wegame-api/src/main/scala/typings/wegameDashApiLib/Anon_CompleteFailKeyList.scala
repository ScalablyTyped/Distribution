package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompleteFailKeyList extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 要拉取的 key 列表
    */
  var keyList: js.Array[java.lang.String]
  var success: js.UndefOr[js.Function1[/* res */ Anon_KVDataList, scala.Unit]] = js.undefined
}

object Anon_CompleteFailKeyList {
  @scala.inline
  def apply(
    keyList: js.Array[java.lang.String],
    complete: js.Function0[scala.Unit] = null,
    fail: js.Function0[scala.Unit] = null,
    success: js.Function1[/* res */ Anon_KVDataList, scala.Unit] = null
  ): Anon_CompleteFailKeyList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("keyList")(keyList)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_CompleteFailKeyList]
  }
}

