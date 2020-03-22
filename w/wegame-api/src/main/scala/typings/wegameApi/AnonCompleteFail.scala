package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompleteFail extends js.Object {
  /**
    * 要修改的 KV 数据列表
    */
  var KVDataList: js.Array[KVData]
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AnonCompleteFail {
  @scala.inline
  def apply(
    KVDataList: js.Array[KVData],
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: () => Unit = null
  ): AnonCompleteFail = {
    val __obj = js.Dynamic.literal(KVDataList = KVDataList.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[AnonCompleteFail]
  }
}

