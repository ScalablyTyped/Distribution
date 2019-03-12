package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetShareInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  /** shareTicket */
  var shareTicket: java.lang.String
  @JSName("success")
  def success_MGetShareInfoOptions(res: weixinDashAppLib.Anon_EncryptedData): scala.Unit
}

object GetShareInfoOptions {
  @scala.inline
  def apply(
    shareTicket: java.lang.String,
    success: weixinDashAppLib.Anon_EncryptedData => scala.Unit,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null
  ): GetShareInfoOptions = {
    val __obj = js.Dynamic.literal(shareTicket = shareTicket, success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[GetShareInfoOptions]
  }
}

