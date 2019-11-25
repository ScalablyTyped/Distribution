package typings.weixinDashApp.wx

import typings.weixinDashApp.Anon_EncryptedData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetShareInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  /** shareTicket */
  var shareTicket: String
  @JSName("success")
  def success_MGetShareInfoOptions(res: Anon_EncryptedData): Unit
}

object GetShareInfoOptions {
  @scala.inline
  def apply(
    shareTicket: String,
    success: Anon_EncryptedData => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null
  ): GetShareInfoOptions = {
    val __obj = js.Dynamic.literal(shareTicket = shareTicket.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[GetShareInfoOptions]
  }
}

