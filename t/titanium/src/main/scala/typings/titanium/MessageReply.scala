package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reply message received from watch app.
  */
@js.native
trait MessageReply extends js.Object {
  /**
    * Error code. Returns 0 if `success` is `true`.
    */
  var code: js.UndefOr[Double] = js.native
  /**
    * Error message, if any returned.
    */
  var error: js.UndefOr[java.lang.String] = js.native
  /**
    * Reply message from watchapp.
    */
  var message: js.UndefOr[js.Any] = js.native
  /**
    * Indicates if the operation succeeded.
    */
  var success: js.UndefOr[Boolean] = js.native
}

object MessageReply {
  @scala.inline
  def apply(): MessageReply = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageReply]
  }
  @scala.inline
  implicit class MessageReplyOps[Self <: MessageReply] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setError(value: java.lang.String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setMessage(value: js.Any): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

