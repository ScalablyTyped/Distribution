package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeRunDataOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_WeRunDataOptions: js.UndefOr[js.Function1[/* res */ weixinDashAppLib.Anon_EncryptedData, scala.Unit]] = js.undefined
}

object WeRunDataOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    success: /* res */ weixinDashAppLib.Anon_EncryptedData => scala.Unit = null
  ): WeRunDataOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[WeRunDataOptions]
  }
}

