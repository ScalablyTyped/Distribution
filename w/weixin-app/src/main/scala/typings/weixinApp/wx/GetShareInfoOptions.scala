package typings.weixinApp.wx

import typings.weixinApp.anon.EncryptedData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetShareInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  /** shareTicket */
  var shareTicket: String = js.native
  @JSName("success")
  def success_MGetShareInfoOptions(res: EncryptedData): Unit = js.native
}

object GetShareInfoOptions {
  @scala.inline
  def apply(shareTicket: String, success: EncryptedData => Unit): GetShareInfoOptions = {
    val __obj = js.Dynamic.literal(shareTicket = shareTicket.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetShareInfoOptions]
  }
  @scala.inline
  implicit class GetShareInfoOptionsOps[Self <: GetShareInfoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setShareTicket(value: String): Self = this.set("shareTicket", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: EncryptedData => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
  
}

