package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompleteFailKeyListSuccess extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 要删除掉 key 列表
    */
  var keyList: js.Array[java.lang.String]
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object Anon_CompleteFailKeyListSuccess {
  @scala.inline
  def apply(
    keyList: js.Array[java.lang.String],
    complete: js.Function0[scala.Unit] = null,
    fail: js.Function0[scala.Unit] = null,
    success: js.Function0[scala.Unit] = null
  ): Anon_CompleteFailKeyListSuccess = {
    val __obj = js.Dynamic.literal(keyList = keyList)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_CompleteFailKeyListSuccess]
  }
}

