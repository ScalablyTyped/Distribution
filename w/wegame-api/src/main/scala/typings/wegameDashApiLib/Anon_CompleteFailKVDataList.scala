package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompleteFailKVDataList extends js.Object {
  /**
    * 要修改的 KV 数据列表
    */
  var KVDataList: js.Array[KVData]
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object Anon_CompleteFailKVDataList {
  @scala.inline
  def apply(
    KVDataList: js.Array[KVData],
    complete: js.Function0[scala.Unit] = null,
    fail: js.Function0[scala.Unit] = null,
    success: js.Function0[scala.Unit] = null
  ): Anon_CompleteFailKVDataList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("KVDataList")(KVDataList)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_CompleteFailKVDataList]
  }
}

