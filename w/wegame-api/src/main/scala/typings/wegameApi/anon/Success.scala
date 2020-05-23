package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Success extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 要删除掉 key 列表
    */
  var keyList: js.Array[String]
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Success {
  @scala.inline
  def apply(
    keyList: js.Array[String],
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: () => Unit = null
  ): Success = {
    val __obj = js.Dynamic.literal(keyList = keyList.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[Success]
  }
}

