package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShareTicket extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 要拉取的 key 列表
    */
  var keyList: js.Array[String]
  /**
    * 群分享对应的 shareTicket
    */
  var shareTicket: String
  var success: js.UndefOr[js.Function1[/* res */ Anon2, Unit]] = js.undefined
}

object AnonShareTicket {
  @scala.inline
  def apply(
    keyList: js.Array[String],
    shareTicket: String,
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: /* res */ Anon2 => Unit = null
  ): AnonShareTicket = {
    val __obj = js.Dynamic.literal(keyList = keyList.asInstanceOf[js.Any], shareTicket = shareTicket.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[AnonShareTicket]
  }
}

