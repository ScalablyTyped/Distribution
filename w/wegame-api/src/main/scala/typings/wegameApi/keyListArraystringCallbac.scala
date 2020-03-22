package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  keyList  :std.Array<string>} & wegame-api.wx.types.CallbacksWithType2<{  encryptedData  :string,   cloudID  :string}, {  errMsg  :string,   errCode  :number}> */
trait keyListArraystringCallbac extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ AnonErrCode, Unit]] = js.undefined
  /**
    * 要获取的 key 列表
    */
  var keyList: js.Array[String]
  var success: js.UndefOr[js.Function1[/* res */ AnonCloudID, Unit]] = js.undefined
}

object keyListArraystringCallbac {
  @scala.inline
  def apply(
    keyList: js.Array[String],
    complete: () => Unit = null,
    fail: /* res */ AnonErrCode => Unit = null,
    success: /* res */ AnonCloudID => Unit = null
  ): keyListArraystringCallbac = {
    val __obj = js.Dynamic.literal(keyList = keyList.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[keyListArraystringCallbac]
  }
}

