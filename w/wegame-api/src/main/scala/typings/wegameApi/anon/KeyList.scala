package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyList extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 要拉取的 key 列表
    */
  var keyList: js.Array[String]
  var success: js.UndefOr[js.Function1[/* res */ KVDataList, Unit]] = js.undefined
}

object KeyList {
  @scala.inline
  def apply(
    keyList: js.Array[String],
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: /* res */ KVDataList => Unit = null
  ): KeyList = {
    val __obj = js.Dynamic.literal(keyList = keyList.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[KeyList]
  }
}

