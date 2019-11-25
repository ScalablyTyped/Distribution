package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompleteFailKeyListSuccess extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 要删除掉 key 列表
    */
  var keyList: js.Array[String]
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Anon_CompleteFailKeyListSuccess {
  @scala.inline
  def apply(
    keyList: js.Array[String],
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: () => Unit = null
  ): Anon_CompleteFailKeyListSuccess = {
    val __obj = js.Dynamic.literal(keyList = keyList.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[Anon_CompleteFailKeyListSuccess]
  }
}

