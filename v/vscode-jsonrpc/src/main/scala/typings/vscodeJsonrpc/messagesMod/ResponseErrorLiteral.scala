package typings.vscodeJsonrpc.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseErrorLiteral[D] extends js.Object {
  /**
    * A number indicating the error type that occured.
    */
  var code: Double = js.native
  /**
    * A Primitive or Structured value that contains additional
    * information about the error. Can be omitted.
    */
  var data: js.UndefOr[D] = js.native
  /**
    * A string providing a short decription of the error.
    */
  var message: String = js.native
}

object ResponseErrorLiteral {
  @scala.inline
  def apply[D](code: Double, message: String): ResponseErrorLiteral[D] = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseErrorLiteral[D]]
  }
  @scala.inline
  implicit class ResponseErrorLiteralOps[Self <: ResponseErrorLiteral[_], D] (val x: Self with ResponseErrorLiteral[D]) extends AnyVal {
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: D): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
  
}

